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

import com.springer.api.schema.VolumeInfo;

/**
 * The Class VolumeInfoImpl.
 */
public class VolumeInfoImpl extends BaseSchemaEntity implements VolumeInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The volume id start. */
    protected String volumeIDStart;
    
    /** The volume id end. */
    protected String volumeIDEnd;
    
    /** The volume issue count. */
    protected String volumeIssueCount;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /** The volume type. */
    protected String volumeType;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#getVolumeIDStart()
     */
    public String getVolumeIDStart() {
        return volumeIDStart;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#setVolumeIDStart(java.lang.String)
     */
    public void setVolumeIDStart(String value) {
        volumeIDStart = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#getVolumeIDEnd()
     */
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#setVolumeIDEnd(java.lang.String)
     */
    public void setVolumeIDEnd(String value) {
        volumeIDEnd = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#getVolumeIssueCount()
     */
    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#setVolumeIssueCount(java.lang.String)
     */
    public void setVolumeIssueCount(String value) {
        volumeIssueCount = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#setTocLevels(java.lang.Long)
     */
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#getVolumeType()
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.VolumeInfo#setVolumeType(java.lang.String)
     */
    public void setVolumeType(String value) {
        volumeType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        setVolumeType(XppUtils.getAttributeValueFromNode(parser, "VolumeType"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("VolumeIDStart")) {
                setVolumeIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDEnd")) {
                setVolumeIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIssueCount")) {
                setVolumeIssueCount(XppUtils.getElementValueFromNode(parser));
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
