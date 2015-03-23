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

import com.springer.api.schema.IssueCopyright;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.IssueInfo;
import com.springer.api.schema.IssueTitle;

/**
 * The Class IssueInfoImpl.
 */
public class IssueInfoImpl extends BaseSchemaEntity implements IssueInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The issue id start. */
    protected String issueIDStart;
    
    /** The issue id end. */
    protected String issueIDEnd;
    
    /** The issue title. */
    protected IssueTitleImpl issueTitle;
    
    /** The issue article count. */
    protected String issueArticleCount;
    
    /** The issue history. */
    protected IssueHistoryImpl issueHistory;
    
    /** The issue copyright. */
    protected IssueCopyrightImpl issueCopyright;
    
    /** The issue type. */
    protected String issueType;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueIDStart()
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueIDStart(java.lang.String)
     */
    public void setIssueIDStart(String value) {
        issueIDStart = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueIDEnd()
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueIDEnd(java.lang.String)
     */
    public void setIssueIDEnd(String value) {
        issueIDEnd = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueTitle()
     */
    public IssueTitle getIssueTitle() {
        return issueTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueTitle(com.springer.api.schema.IssueTitle)
     */
    public void setIssueTitle(IssueTitle value) {
        issueTitle = ((IssueTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueArticleCount()
     */
    public String getIssueArticleCount() {
        return issueArticleCount;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueArticleCount(java.lang.String)
     */
    public void setIssueArticleCount(String value) {
        issueArticleCount = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueHistory()
     */
    public IssueHistory getIssueHistory() {
        return issueHistory;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueHistory(com.springer.api.schema.IssueHistory)
     */
    public void setIssueHistory(IssueHistory value) {
        issueHistory = ((IssueHistoryImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueCopyright()
     */
    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueCopyright(com.springer.api.schema.IssueCopyright)
     */
    public void setIssueCopyright(IssueCopyright value) {
        issueCopyright = ((IssueCopyrightImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getIssueType()
     */
    public String getIssueType() {
        return issueType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setIssueType(java.lang.String)
     */
    public void setIssueType(String value) {
        issueType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueInfo#setTocLevels(java.lang.Long)
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
        setIssueType(XppUtils.getAttributeValueFromNode(parser, "IssueType"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("IssueIDStart")) {
                setIssueIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDEnd")) {
                setIssueIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueTitle")) {
                IssueTitleImpl node = new IssueTitleImpl();
                node.init(parser);
                setIssueTitle(node);
            } else if (name.equals("IssueArticleCount")) {
                setIssueArticleCount(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueHistory")) {
                IssueHistoryImpl node = new IssueHistoryImpl();
                node.init(parser);
                setIssueHistory(node);
            } else if (name.equals("IssueCopyright")) {
                IssueCopyrightImpl node = new IssueCopyrightImpl();
                node.init(parser);
                setIssueCopyright(node);
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
