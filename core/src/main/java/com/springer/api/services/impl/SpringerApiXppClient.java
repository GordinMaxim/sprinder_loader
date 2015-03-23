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
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Response;
import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.ResponseImpl;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.api.services.SpringerApiClient;
import com.springer.api.services.SpringerApiException;
import com.springer.api.services.constant.ApplicationConstants;
import com.springer.api.services.constant.ParameterNames;
import com.springer.api.services.constant.SpringerApiUrls;
import com.springer.api.services.constant.SpringerApiUrls.SpringerApiUrlBuilder;

/**
 * The Class SpringerApiXppClient.
 */
public class SpringerApiXppClient extends SpringerApiGateway implements SpringerApiClient {
	
	/** The Constant XPP_CLASSES_MAP. */
	private static final Map<Class<?>, Class<? extends BaseSchemaEntity>> XPP_CLASSES_MAP = new HashMap<Class<?>, Class<? extends BaseSchemaEntity>>();
	
	static {
		XPP_CLASSES_MAP.put(Response.class, ResponseImpl.class);
		XppUtils.setDateFormat(new SimpleDateFormat(ApplicationConstants.DATE_FORMAT));
	}
	

    /** The api key. */
    private String apiKey;

    /**
     * Instantiates a new springer api xpp client.
     * 
     * @param apiKey the api key
     */
    public SpringerApiXppClient(String apiKey) {
    	this.apiKey = apiKey;
    }

    /**
     * Unmarshall object.
     * 
     * @param clazz the clazz
     * @param xmlContent the xml content
     * 
     * @return the t
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent) {
        try {
        	XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
        	parser.setInput(xmlContent, ApplicationConstants.CONTENT_ENCODING);
        	
        	if (parser.getEventType() == XmlPullParser.START_DOCUMENT) {
        		parser.nextTag();
        	}

        	BaseSchemaEntity entity = getSchemaEntityByClass(clazz);
        	
        	entity.init(parser);

            return (T) entity;
        } catch (Exception e) {
            throw new SpringerApiException(e);
        }
    }

    /**
     * Marshall object.
     * 
     * @param element the element
     * 
     * @return the string
     */
    protected String marshallObject(Object element) {
    	if (element instanceof String) {
    		return (String) element;
    	} else if (element instanceof BaseSchemaEntity) {
    		try {
    			StringWriter writer = new StringWriter();
				XmlSerializer serializer = XmlPullParserFactory.newInstance().newSerializer();
				serializer.setOutput(writer);
				((BaseSchemaEntity) element).toXml(serializer);
				serializer.flush();
				return writer.toString();
			} catch (Exception e) {
	    		throw new SpringerApiException("Unkown element encountered:" + element, e);
			}
    	} else {
    		throw new SpringerApiException("Unkown element encountered:" + element);
    	}
    }

    
    /**
     * Gets the schema entity by class.
     * 
     * @param clazz the clazz
     * 
     * @return the schema entity by class
     */
    private BaseSchemaEntity getSchemaEntityByClass(Class<?> clazz) {
    	if (XPP_CLASSES_MAP.containsKey(clazz)) {
    		Class<? extends BaseSchemaEntity> implClass = XPP_CLASSES_MAP.get(clazz);
    		try {
				return implClass.newInstance();
			} catch (Exception e) {
	    		throw new SpringerApiException("Could not instantiate class: " + implClass.getName(), e);
			}
    	} else {
    		throw new SpringerApiException("Unknown class encountered in response: " + clazz.getName());
    	}
	}
    
	/**
	 * Creates the springer api url builder.
	 * 
	 * @param urlFormat the url format
	 * @param format the format
	 * 
	 * @return the springer api url builder
	 */
	protected SpringerApiUrlBuilder createSpringerApiUrlBuilder(String urlFormat, String format) {
		return new SpringerApiUrlBuilder(urlFormat, format);
	}

	/* (non-Javadoc)
	 * @see com.springer.api.services.SpringerApiClient#images(java.lang.String)
	 */
	@Override
	public Response images(String query) {
		SpringerApiUrlBuilder builder = createSpringerApiUrlBuilder(SpringerApiUrls.IMAGES_URL, "xml");
		String apiUrl = builder.withParameter(ParameterNames.API_KEY, apiKey).withParameter(ParameterNames.QUERY, query).buildUrl();
		return unmarshallObject(Response.class, callApiGet(apiUrl));
	}

	/* (non-Javadoc)
	 * @see com.springer.api.services.SpringerApiClient#metadata(java.lang.String)
	 */
	@Override
	public Response metadata(String query) {
		SpringerApiUrlBuilder builder = createSpringerApiUrlBuilder(SpringerApiUrls.METADATA_URL, "pam");
		String apiUrl = builder.withParameter(ParameterNames.API_KEY, apiKey).withParameter(ParameterNames.QUERY, query).buildUrl();
		return unmarshallObject(Response.class, callApiGet(apiUrl));
	}

	/* (non-Javadoc)
	 * @see com.springer.api.services.SpringerApiClient#openAccess(java.lang.String)
	 */
	@Override
	public Response openAccess(String query) {
		SpringerApiUrlBuilder builder = createSpringerApiUrlBuilder(SpringerApiUrls.OPEN_ACCESS_URL, "app");
		String apiUrl = builder.withParameter(ParameterNames.API_KEY, apiKey).withParameter(ParameterNames.QUERY, query).buildUrl();
		return unmarshallObject(Response.class, callApiGet(apiUrl));
	}
}
