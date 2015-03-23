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
package com.springer.api.services.constant;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.springer.api.schema.common.ValueEnum;


/**
 * The Class SpringerApiUrls.
 */
public final class SpringerApiUrls {

    /** The Constant API_URLS_FILE. */
    public static final String API_URLS_FILE = "SpringerApiUrls.properties";

    /** The Constant logger. */
    private static final Logger logger = Logger.getLogger(SpringerApiUrls.class.getCanonicalName());
    
    /** The Constant springerApiUrls. */
    private static final Properties springerApiUrls = new Properties();

    static {
        try {
            springerApiUrls.load(SpringerApiUrls.class.getResourceAsStream(API_URLS_FILE));
        } catch (IOException e) {
        	logger.log(Level.SEVERE, "An error occurred while loading urls.", e);
        }
    }
    
    /** The Constant METADATA_URL. */
    public static final String METADATA_URL = springerApiUrls.getProperty("com.springer.api.services.metadata");
    
    /** The Constant IMAGES_URL. */
    public static final String IMAGES_URL = springerApiUrls.getProperty("com.springer.api.services.images");
    
    /** The Constant OPEN_ACCESS_URL. */
    public static final String OPEN_ACCESS_URL = springerApiUrls.getProperty("com.springer.api.services.openAccess");
    
    /**
     * Instantiates a new springer api urls.
     */
    private SpringerApiUrls() {}

    /**
     * The Class SpringerApiUrlBuilder.
     */
    public static class SpringerApiUrlBuilder {
        
        /** The Constant API_URLS_PLACEHOLDER_START. */
        private static final char API_URLS_PLACEHOLDER_START = '{';

        /** The Constant API_URLS_PLACEHOLDER_END. */
        private static final char API_URLS_PLACEHOLDER_END = '}';
        
    	/** The url format. */
	    private String urlFormat;
	    
    	/** The parameters map. */
	    private Map<String, String> parametersMap = new HashMap<String, String>();
    	
		/** The fields map. */
		private Map<String, String> fieldsMap = new HashMap<String, String>();
	    
    	/**
	     * Instantiates a new springer api url builder.
	     * 
	     * @param urlFormat the url format
	     */
	    public SpringerApiUrlBuilder(String urlFormat) {
	    	this(urlFormat, ApplicationConstants.DEFAULT_API_VERSION, ApplicationConstants.DEFAULT_FORMAT);
    	}
    	
    	/**
	     * Instantiates a new springer api url builder.
	     * 
	     * @param urlFormat the url format
	     * @param format the format
	     */
	    public SpringerApiUrlBuilder(String urlFormat, String format) {
	    	this(urlFormat, ApplicationConstants.DEFAULT_API_VERSION, format);
    	}
	    
    	/**
	     * Instantiates a new springer api url builder.
	     * 
	     * @param urlFormat the url format
	     * @param apiVersion the api version
	     * @param format the format
	     */
	    public SpringerApiUrlBuilder(String urlFormat, String apiVersion, String format) {
    		this.urlFormat = urlFormat;
    		fieldsMap.put(ParameterNames.FORMAT, format);
    	}
	    
    	/**
	     * With parameter.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the springer api url builder
	     */
	    public SpringerApiUrlBuilder withParameter(String name, String value) {
	    	if (value != null && value.length() > 0) {
	    		parametersMap.put(name, encodeUrl(value));
	    	}
    		
    		return this;
    	}
    	
    	/**
	     * With parameter enum.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the springer api url builder
	     */
	    public SpringerApiUrlBuilder withParameterEnum(String name, ValueEnum value) {
	    	withParameter(name, value.value());
    		
    		return this;
    	}
	    
    	/**
	     * With parameter enum set.
	     * 
	     * @param name the name
	     * @param enumSet the enum set
	     * @param separator the separator
	     * 
	     * @return the springer api url builder
	     */
	    public SpringerApiUrlBuilder withParameterEnumSet(String name, Set<? extends ValueEnum> enumSet, String separator) {
	    	StringBuilder builder = new StringBuilder();
	    	
	    	for (Iterator<? extends ValueEnum> iterator = enumSet.iterator(); iterator.hasNext();) {
	    		builder.append(encodeUrl(iterator.next().value()));
	    		if (iterator.hasNext()) {
	    			builder.append(separator);
	    		}
			}
	    	
	    	parametersMap.put(name, builder.toString());
	    	
    		return this;
    	}
	    
		/**
		 * With empty field.
		 * 
		 * @param name the name
		 * 
		 * @return the springer api url builder
		 */
		public SpringerApiUrlBuilder withEmptyField(String name) {
			fieldsMap.put(name, "");

			return this;
		}

		/**
		 * With field.
		 * 
		 * @param name the name
		 * @param value the value
		 * 
		 * @return the springer api url builder
		 */
		public SpringerApiUrlBuilder withField(String name, String value) {
			withField(name, value, false);

			return this;
		}

		/**
		 * With field.
		 * 
		 * @param name the name
		 * @param value the value
		 * @param escape the escape
		 * 
		 * @return the springer api url builder
		 */
		public SpringerApiUrlBuilder withField(String name, String value,
				boolean escape) {
			if (escape) {
				fieldsMap.put(name, encodeUrl(value));
			} else {
				fieldsMap.put(name, value);
			}

			return this;
		}

		/**
		 * With field enum.
		 * 
		 * @param name the name
		 * @param value the value
		 * 
		 * @return the springer api url builder
		 */
		public SpringerApiUrlBuilder withFieldEnum(String name, ValueEnum value) {
			if (value.value() == null || value.value().length() == 0) {
				fieldsMap.put(name, "");
			} else {
				fieldsMap.put(name, value.value());
			}

			return this;
		}
	    
    	
		/**
		 * Builds the url.
		 * 
		 * @return the string
		 */
		public String buildUrl() {
			StringBuilder urlBuilder = new StringBuilder();
			StringBuilder placeHolderBuilder = new StringBuilder();
			boolean placeHolderFlag = false;
			boolean firstParameter = true;
			for (int i = 0; i < urlFormat.length(); i++) {
				if (urlFormat.charAt(i) == API_URLS_PLACEHOLDER_START) {
					placeHolderBuilder = new StringBuilder();
					placeHolderFlag = true;
				} else if (placeHolderFlag
						&& urlFormat.charAt(i) == API_URLS_PLACEHOLDER_END) {
					String placeHolder = placeHolderBuilder.toString();
					if (fieldsMap.containsKey(placeHolder)) {
						urlBuilder.append(fieldsMap.get(placeHolder));
					} else if (parametersMap.containsKey(placeHolder)) {
						StringBuilder builder = new StringBuilder();
						if (firstParameter) {
							firstParameter = false;
						} else {
							builder.append("&");
						}
						builder.append(placeHolder);
						builder.append("=");
						builder.append(parametersMap.get(placeHolder));
						urlBuilder.append(builder.toString());
					} else {
						// we did not find a binding for the placeholder.
						// skip it.
						// urlBuilder.append(API_URLS_PLACEHOLDER_START);
						// urlBuilder.append(placeHolder);
						// urlBuilder.append(API_URLS_PLACEHOLDER_END);
					}
					placeHolderFlag = false;
				} else if (placeHolderFlag) {
					placeHolderBuilder.append(urlFormat.charAt(i));
				} else {
					urlBuilder.append(urlFormat.charAt(i));
				}
			}


			logger.log(Level.FINE, "URL generated: " + urlBuilder.toString());
			
			return urlBuilder.toString();
		}
    	
        /**
         * Encode url.
         * 
         * @param original the original
         * 
         * @return the string
         */
        private static String encodeUrl(String original) {
        	try {
    			return URLEncoder.encode(original, ApplicationConstants.CONTENT_ENCODING);
    		} catch (UnsupportedEncodingException e) {
    			// should never be here..
    			return original;
    		}
        }
    }
}
