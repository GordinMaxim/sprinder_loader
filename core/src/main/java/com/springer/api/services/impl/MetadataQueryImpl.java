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


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.springer.api.schema.json.Metadata;
import com.springer.api.services.MetadataQuery;
import com.springer.api.services.constant.SpringerApiUrls;

/**
 * The Class MetadataQueryImpl.
 */
public class MetadataQueryImpl extends BaseSpringerQuery<Metadata> implements
	MetadataQuery {

	/**
	 * Instantiates a new metadata query impl.
	 * 
	 * @param apiKey the api key
	 */
	public MetadataQueryImpl(String apiKey) {
		super(apiKey);
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.services.WorldBankQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createSpringerApiUrlBuilder(SpringerApiUrls.METADATA_URL);
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.services.impl.BaseWorldBankQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected Metadata unmarshall(JsonElement response) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(response, Metadata.class);
	}
}
