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

import com.springer.api.schema.Article;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Issue;
import com.springer.api.schema.IssueInfo;

/**
 * The Class IssueImpl.
 */
public class IssueImpl extends BaseSchemaEntity implements Issue {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The issue info. */
    protected IssueInfoImpl issueInfo;
    
    /** The issue header. */
    protected EditorGroupImpl issueHeader;
    
    /** The article. */
    protected ArticleImpl article;
    
    /** The issue type. */
    protected String issueType;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#getIssueInfo()
     */
    public IssueInfo getIssueInfo() {
        return issueInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#setIssueInfo(com.springer.api.schema.IssueInfo)
     */
    public void setIssueInfo(IssueInfo value) {
        issueInfo = ((IssueInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#getIssueHeader()
     */
    public EditorGroup getIssueHeader() {
        return issueHeader;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#setIssueHeader(com.springer.api.schema.EditorGroup)
     */
    public void setIssueHeader(EditorGroup value) {
        issueHeader = ((EditorGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#getArticle()
     */
    public Article getArticle() {
        return article;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#setArticle(com.springer.api.schema.Article)
     */
    public void setArticle(Article value) {
        article = ((ArticleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#getIssueType()
     */
    public String getIssueType() {
        return issueType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#setIssueType(java.lang.String)
     */
    public void setIssueType(String value) {
        issueType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Issue#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setIssueType(XppUtils.getAttributeValueFromNode(parser, "IssueType"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("IssueInfo")) {
                IssueInfoImpl node = new IssueInfoImpl();
                node.init(parser);
                setIssueInfo(node);
            } else if (name.equals("IssueHeader")) {
                EditorGroupImpl node = new EditorGroupImpl();
                node.init(parser);
                setIssueHeader(node);
            } else if (name.equals("Article")) {
                ArticleImpl node = new ArticleImpl();
                node.init(parser);
                setArticle(node);
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
