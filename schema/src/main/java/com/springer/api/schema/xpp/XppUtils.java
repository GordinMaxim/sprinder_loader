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
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/**
 * The Class XppUtils.
 */
public class XppUtils {
	
	/** The DAT e_ format. */
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat();
	
	/**
	 * Sets the date format.
	 * 
	 * @param format the new date format
	 */
	public static void setDateFormat(SimpleDateFormat format) {
		DATE_FORMAT = format;
	}

    /**
     * Sets the element value to node.
     * 
     * @param serializer the serializer
     * @param elementName the element name
     * @param elementValue the element value
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void setElementValueToNode(XmlSerializer serializer, String elementName, Object elementValue) throws IOException {
    	if (elementValue != null) {
    		serializer.startTag(null, elementName).text(elementValue.toString()).endTag(null, elementName);
    	}
    }

    /**
     * Sets the element value.
     * 
     * @param serializer the serializer
     * @param elementValue the element value
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void setElementValue(XmlSerializer serializer, Object elementValue) throws IOException {
    	if (elementValue != null) {
    		serializer.text(elementValue.toString());
    	}
    }
    
    /**
     * Sets the attribute value to node.
     * 
     * @param serializer the serializer
     * @param attributeName the attribute name
     * @param attributeValue the attribute value
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void setAttributeValueToNode(XmlSerializer serializer, String attributeName, Object attributeValue) throws IOException {
    	if (attributeValue != null) {
    		serializer.attribute(null, attributeName, String.valueOf(attributeValue));
    	}
    }
    
    /**
     * Gets the element value from node.
     * 
     * @param node the node
     * 
     * @return the element value from node
     * 
     * @throws XmlPullParserException the xml pull parser exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static String getElementValueFromNode(XmlPullParser node) throws XmlPullParserException, IOException {
    	return node.nextText();
    }

    /**
     * Gets the element value as long from node.
     * 
     * @param node the node
     * 
     * @return the element value as long from node
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws XmlPullParserException the xml pull parser exception
     */
    public static Long getElementValueAsLongFromNode(XmlPullParser node) throws IOException, XmlPullParserException {
    	String value = node.nextText();
    	if (isNullOrEmpty(value)) {
    		return null;
    	} else {
            return Long.valueOf(value);
    	}
    }
    
    /**
     * Gets the element value as date from node.
     * 
     * @param node the node
     * 
     * @return the element value as date from node
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws XmlPullParserException the xml pull parser exception
     */
    public static Date getElementValueAsDateFromNode(XmlPullParser node) throws IOException, XmlPullParserException {
    	String value = node.nextText();
    	if (isNullOrEmpty(value)) {
    		return null;
    	} else {
            try {
				return DATE_FORMAT.parse(value);
			} catch (ParseException e) {
				return null;
			}
    	}
    }

    /**
     * Gets the attribute value from node.
     * 
     * @param node the node
     * @param attributeName the attribute name
     * 
     * @return the attribute value from node
     */
    public static String getAttributeValueFromNode(XmlPullParser node, String attributeName) {
        return node.getAttributeValue(null, attributeName);
    }

    /**
     * Gets the attribute value as long from node.
     * 
     * @param node the node
     * @param attributeName the attribute name
     * 
     * @return the attribute value as long from node
     */
    public static Long getAttributeValueAsLongFromNode(XmlPullParser node, String attributeName) {
    	String attribute = node.getAttributeValue(null, attributeName);
    	if (isNullOrEmpty(attribute)) {
    		return null;
    	} else {
    		return Long.valueOf(attribute);
    	}
    }
    
    /**
     * Skip sub tree.
     * 
     * @param parser the parser
     * 
     * @throws XmlPullParserException the xml pull parser exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void skipSubTree(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, null, null);
        int level = 1;
        while (level > 0) {
            int eventType = parser.next();
            if (eventType == XmlPullParser.END_TAG) {
                --level;
            } else if (eventType == XmlPullParser.START_TAG) {
                ++level;
            }
        }
    }
    
	/**
	 * Checks if is null or empty.
	 * 
	 * @param string the string
	 * 
	 * @return true, if is null or empty
	 */
    private static boolean isNullOrEmpty(String string) {
    	return (string == null || string.length() == 0);
    }
}
