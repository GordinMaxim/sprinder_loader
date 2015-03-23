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

import com.springer.api.schema.RefTarget;

/**
 * The Class RefTargetImpl.
 */
public class RefTargetImpl extends BaseSchemaEntity implements RefTarget {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The address. */
    protected String address;
    
    /** The target type. */
    protected String targetType;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.RefTarget#getAddress()
     */
    public String getAddress() {
        return address;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.RefTarget#setAddress(java.lang.String)
     */
    public void setAddress(String value) {
        address = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.RefTarget#getTargetType()
     */
    public String getTargetType() {
        return targetType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.RefTarget#setTargetType(java.lang.String)
     */
    public void setTargetType(String value) {
        targetType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAddress(XppUtils.getAttributeValueFromNode(parser, "Address"));
        setTargetType(XppUtils.getAttributeValueFromNode(parser, "TargetType"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            LOG.warning("Found tag that we don't recognize: " + name);
            XppUtils.skipSubTree(parser);
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
