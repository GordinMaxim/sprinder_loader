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

import com.springer.api.schema.ArticleContext;

/**
 * The Class ArticleContextImpl.
 */
public class ArticleContextImpl extends BaseSchemaEntity implements ArticleContext {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal id. */
    protected String journalID;
    
    /** The volume id start. */
    protected String volumeIDStart;
    
    /** The volume id end. */
    protected String volumeIDEnd;
    
    /** The issue id start. */
    protected String issueIDStart;
    
    /** The issue id end. */
    protected String issueIDEnd;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#getJournalID()
     */
    public String getJournalID() {
        return journalID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#setJournalID(java.lang.String)
     */
    public void setJournalID(String value) {
        journalID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#getVolumeIDStart()
     */
    public String getVolumeIDStart() {
        return volumeIDStart;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#setVolumeIDStart(java.lang.String)
     */
    public void setVolumeIDStart(String value) {
        volumeIDStart = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#getVolumeIDEnd()
     */
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#setVolumeIDEnd(java.lang.String)
     */
    public void setVolumeIDEnd(String value) {
        volumeIDEnd = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#getIssueIDStart()
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#setIssueIDStart(java.lang.String)
     */
    public void setIssueIDStart(String value) {
        issueIDStart = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#getIssueIDEnd()
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleContext#setIssueIDEnd(java.lang.String)
     */
    public void setIssueIDEnd(String value) {
        issueIDEnd = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalID")) {
                setJournalID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDStart")) {
                setVolumeIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDEnd")) {
                setVolumeIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDStart")) {
                setIssueIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDEnd")) {
                setIssueIDEnd(XppUtils.getElementValueFromNode(parser));
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
