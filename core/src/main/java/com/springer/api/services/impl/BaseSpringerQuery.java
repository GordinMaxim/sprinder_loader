/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.springer.api.services.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.springer.api.schema.common.Facet;
import com.springer.api.schema.common.PagedArrayList;
import com.springer.api.schema.common.PagedList;
import com.springer.api.schema.common.PagedArrayList.Cursor;
import com.springer.api.services.SpringerException;
import com.springer.api.services.SpringerQuery;
import com.springer.api.services.constant.ApplicationConstants;
import com.springer.api.services.constant.ParameterNames;
import com.springer.api.services.constant.SpringerApiUrls.SpringerApiUrlBuilder;

/**
 * The Class BaseSpringerQuery.
 */
public abstract class BaseSpringerQuery<E> extends SpringerApiGateway implements SpringerQuery<E> {
	
	/** The Constant UTF_8_CHAR_SET. */
	protected static final Charset UTF_8_CHAR_SET = Charset.forName(ApplicationConstants.CONTENT_ENCODING);
	
    /** The parser. */
    private final JsonParser parser = new JsonParser();
    
	/** The api url builder. */
	protected SpringerApiUrlBuilder apiUrlBuilder;
    
   	/** The api key. */
	   private String apiKey;
   	
	   /** The facets. */
	   private List<Facet> facets;
   	
	   /** The query. */
	   private String query;

	/**
	 * Instantiates a new base springer query.
	 * 
	 * @param apiKey the api key
	 */
	public BaseSpringerQuery(String apiKey) {
        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.apiKey = apiKey;
        reset();
	}
	
 	/**
	  * Gets the api key.
	  * 
	  * @return the api key
	  */
	 public String getApiKey(){
		return this.apiKey;
	}
	
	/**
	 * Sets the api key.
	 * 
	 * @param apiKey the new api key
	 */
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
 	
	 /**
 	 * Gets the facets.
 	 * 
 	 * @return the facets
 	 */
	 public List<Facet> getFacets(){
		return this.facets;
	}
	
	/**
	 * Sets the facets.
	 * 
	 * @param facets the new facets
	 */
	public void setFacets(List<Facet> facets){
		this.facets = facets;
	}
 	
	 /**
 	 * Gets the query.
 	 * 
 	 * @return the query
 	 */
	 public String getQuery(){
		return this.query;
	}
	
	/**
	 * Sets the query.
	 * 
	 * @param query the new query
	 */
	public void setQuery(String query){
		this.query = query;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<E> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiGet(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (response.isJsonObject()) {
        		JsonObject object = response.getAsJsonObject();
        		setApiKey(object.get("apiKey").getAsString());
        		setQuery(object.get("query").getAsString());
        		List<Cursor> cursors = getGsonBuilder().create().fromJson(object.get("result"), new TypeToken<List<Cursor>>() {}.getType());
        		PagedArrayList<E> responseList = new PagedArrayList<E>();;
        		if (!cursors.isEmpty()) {
            		responseList.setCursor(cursors.get(0));
        		}
        		JsonElement jsonElement = object.get("records");
        		if (jsonElement.isJsonArray()) {
        			JsonArray results = jsonElement.getAsJsonArray();
        			for (JsonElement result : results) {
        				E element = unmarshall(result);
        				responseList.add(element);
        			}
        		}
        		
        		jsonElement = object.get("facets");
        		
        		if (jsonElement != null) {
        			List<Facet> facets = getGsonBuilder().create().fromJson(jsonElement, new TypeToken<List<Facet>>() {}.getType());
					setFacets(facets);
        		}
        		
    			return responseList;
        	}
        	throw new SpringerException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new SpringerException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/* (non-Javadoc)
	 * @see org.worldbank.api.services.WorldBankQuery#singleResult()
	 */
	@Override
	public E singleResult() {
		List<E> list = list();
		return (list.isEmpty())? null : list.get(0);
	}
	
	/* (non-Javadoc)
	 * @see com.springer.api.services.SpringerQuery#withQuery(java.lang.String)
	 */
	@Override
	public SpringerQuery<E> withQuery(String query) {
		apiUrlBuilder.withParameter(ParameterNames.QUERY, query);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.springer.api.services.SpringerQuery#facets()
	 */
	public List<Facet> facets() {
		return facets;
	}
	
	/**
	 * Unmarshall.
	 * 
	 * @param response the response
	 * 
	 * @return the e
	 */
	protected abstract E unmarshall(JsonElement response);
	
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat(ApplicationConstants.DATE_FORMAT);
//		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//		builder.registerTypeAdapter(Issue.State.class, new JsonDeserializer<Issue.State>() {
//			@Override
//			public Issue.State deserialize(JsonElement arg0, Type arg1,
//					JsonDeserializationContext arg2) throws JsonParseException {
//				return Issue.State.fromValue(arg0.getAsString());
//			}
//		});
		return builder;
	}
    
	/**
	 * Unmarshall.
	 * 
	 * @param jsonContent the json content
	 * 
	 * @return the json object
	 */
	protected JsonObject unmarshall(InputStream jsonContent) {
        try {
        	JsonElement element = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (element.isJsonObject()) {
        		return element.getAsJsonObject();
        	} else {
        		throw new SpringerException("Unknown content found in response." + element);
        	}
        } catch (Exception e) {
            throw new SpringerException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/**
	 * Creates the springer api url builder.
	 * 
	 * @param urlFormat the url format
	 * 
	 * @return the springer api url builder
	 */
	protected SpringerApiUrlBuilder createSpringerApiUrlBuilder(String urlFormat) {
		SpringerApiUrlBuilder builder = new SpringerApiUrlBuilder(urlFormat);
		builder.withParameter(ParameterNames.API_KEY, apiKey);
		return builder;
	}
}
