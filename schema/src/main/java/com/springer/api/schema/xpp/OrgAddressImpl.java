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

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.OrgAddress;

/**
 * The Class OrgAddressImpl.
 */
public class OrgAddressImpl extends BaseSchemaEntity implements OrgAddress {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The postbox. */
    protected String postbox;
    
    /** The street. */
    protected String street;
    
    /** The city. */
    protected String city;
    
    /** The postcode. */
    protected String postcode;
    
    /** The state. */
    protected String state;
    
    /** The country. */
    protected String country;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getPostbox()
     */
    public String getPostbox() {
        return postbox;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setPostbox(java.lang.String)
     */
    public void setPostbox(String value) {
        postbox = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getStreet()
     */
    public String getStreet() {
        return street;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setStreet(java.lang.String)
     */
    public void setStreet(String value) {
        street = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getCity()
     */
    public String getCity() {
        return city;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setCity(java.lang.String)
     */
    public void setCity(String value) {
        city = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getPostcode()
     */
    public String getPostcode() {
        return postcode;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setPostcode(java.lang.String)
     */
    public void setPostcode(String value) {
        postcode = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getState()
     */
    public String getState() {
        return state;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setState(java.lang.String)
     */
    public void setState(String value) {
        state = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#getCountry()
     */
    public String getCountry() {
        return country;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.OrgAddress#setCountry(java.lang.String)
     */
    public void setCountry(String value) {
        country = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Postbox")) {
                setPostbox(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Street")) {
                setStreet(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("City")) {
                setCity(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Postcode")) {
                setPostcode(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("State")) {
                setState(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Country")) {
                setCountry(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
