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

import com.springer.api.schema.Contact;

/**
 * The Class ContactImpl.
 */
public class ContactImpl extends BaseSchemaEntity implements Contact {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The phone. */
    protected String phone;
    
    /** The fax. */
    protected String fax;
    
    /** The email. */
    protected String email;
    
    /** The url. */
    protected String url;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#getURL()
     */
    public String getURL() {
        return url;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#setURL(java.lang.String)
     */
    public void setURL(String value) {
        this.url = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#getPhone()
     */
    public String getPhone() {
        return phone;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#setPhone(java.lang.String)
     */
    public void setPhone(String value) {
        phone = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#getFax()
     */
    public String getFax() {
        return fax;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#setFax(java.lang.String)
     */
    public void setFax(String value) {
        fax = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#getEmail()
     */
    public String getEmail() {
        return email;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Contact#setEmail(java.lang.String)
     */
    public void setEmail(String value) {
        email = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Phone")) {
                setPhone(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Fax")) {
                setFax(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Email")) {
                setEmail(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("URL")) {
                setURL(XppUtils.getElementValueFromNode(parser));
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
