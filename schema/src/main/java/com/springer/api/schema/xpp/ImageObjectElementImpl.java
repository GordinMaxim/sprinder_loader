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

import com.springer.api.schema.ImageObjectElement;

/**
 * The Class ImageObjectElementImpl.
 */
public class ImageObjectElementImpl extends BaseSchemaEntity implements ImageObjectElement {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The color. */
    protected String color;
    
    /** The file ref. */
    protected String fileRef;
    
    /** The format. */
    protected String format;
    
    /** The rendition. */
    protected String rendition;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#getColor()
     */
    public String getColor() {
        return color;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#setColor(java.lang.String)
     */
    public void setColor(String value) {
        color = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#getFileRef()
     */
    public String getFileRef() {
        return fileRef;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#setFileRef(java.lang.String)
     */
    public void setFileRef(String value) {
        fileRef = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#getFormat()
     */
    public String getFormat() {
        return format;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#setFormat(java.lang.String)
     */
    public void setFormat(String value) {
        format = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#getRendition()
     */
    public String getRendition() {
        return rendition;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#setRendition(java.lang.String)
     */
    public void setRendition(String value) {
        rendition = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObjectElement#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setColor(XppUtils.getAttributeValueFromNode(parser, "Color"));
        setFileRef(XppUtils.getAttributeValueFromNode(parser, "FileRef"));
        setFormat(XppUtils.getAttributeValueFromNode(parser, "Format"));
        setRendition(XppUtils.getAttributeValueFromNode(parser, "Rendition"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
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
