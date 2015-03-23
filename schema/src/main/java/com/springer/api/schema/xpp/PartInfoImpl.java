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

import com.springer.api.schema.PartContext;
import com.springer.api.schema.PartInfo;

/**
 * The Class PartInfoImpl.
 */
public class PartInfoImpl extends BaseSchemaEntity implements PartInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The part id. */
    protected Long partID;
    
    /** The part number. */
    protected String partNumber;
    
    /** The part sequence number. */
    protected Long partSequenceNumber;
    
    /** The part title. */
    protected String partTitle;
    
    /** The part chapter count. */
    protected Long partChapterCount;
    
    /** The part context. */
    protected PartContextImpl partContext;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartID()
     */
    public Long getPartID() {
        return partID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartID(java.lang.Long)
     */
    public void setPartID(Long value) {
        partID = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartNumber()
     */
    public String getPartNumber() {
        return partNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartNumber(java.lang.String)
     */
    public void setPartNumber(String value) {
        partNumber = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartSequenceNumber()
     */
    public Long getPartSequenceNumber() {
        return partSequenceNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartSequenceNumber(java.lang.Long)
     */
    public void setPartSequenceNumber(Long value) {
        partSequenceNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartTitle()
     */
    public String getPartTitle() {
        return partTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartTitle(java.lang.String)
     */
    public void setPartTitle(String value) {
        partTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartChapterCount()
     */
    public Long getPartChapterCount() {
        return partChapterCount;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartChapterCount(java.lang.Long)
     */
    public void setPartChapterCount(Long value) {
        partChapterCount = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getPartContext()
     */
    public PartContext getPartContext() {
        return partContext;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setPartContext(com.springer.api.schema.PartContext)
     */
    public void setPartContext(PartContext value) {
        partContext = ((PartContextImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PartInfo#setTocLevels(java.lang.Long)
     */
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PartID")) {
                setPartID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartNumber")) {
                setPartNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartSequenceNumber")) {
                setPartSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartTitle")) {
                setPartTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartChapterCount")) {
                setPartChapterCount(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartContext")) {
                PartContextImpl node = new PartContextImpl();
                node.init(parser);
                setPartContext(node);
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
