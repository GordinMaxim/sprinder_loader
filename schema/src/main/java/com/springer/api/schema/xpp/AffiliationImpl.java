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

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.OrgAddress;

/**
 * The Class AffiliationImpl.
 */
public class AffiliationImpl extends BaseSchemaEntity implements Affiliation {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The org division. */
    protected String orgDivision;
    
    /** The org name. */
    protected String orgName;
    
    /** The org address. */
    protected OrgAddressImpl orgAddress;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#getOrgDivision()
     */
    public String getOrgDivision() {
        return orgDivision;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#setOrgDivision(java.lang.String)
     */
    public void setOrgDivision(String value) {
        orgDivision = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#getOrgName()
     */
    public String getOrgName() {
        return orgName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#setOrgName(java.lang.String)
     */
    public void setOrgName(String value) {
        orgName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#getOrgAddress()
     */
    public OrgAddress getOrgAddress() {
        return orgAddress;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#setOrgAddress(com.springer.api.schema.OrgAddress)
     */
    public void setOrgAddress(OrgAddress value) {
        orgAddress = ((OrgAddressImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Affiliation#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("OrgDivision")) {
                setOrgDivision(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("OrgName")) {
                setOrgName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("OrgAddress")) {
                OrgAddressImpl node = new OrgAddressImpl();
                node.init(parser);
                setOrgAddress(node);
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
