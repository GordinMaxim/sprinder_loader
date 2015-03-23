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
import com.springer.api.schema.ArticleCopyright;
import com.springer.api.schema.ArticleGrants;
import com.springer.api.schema.ArticleHistory;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.ArticleSubTitle;
import com.springer.api.schema.ArticleTitle;

/**
 * The Class ArticleInfoImpl.
 */
public class ArticleInfoImpl extends BaseSchemaEntity implements ArticleInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article id. */
    protected String articleID;
    
    /** The article doi. */
    protected String articleDOI;
    
    /** The article sequence number. */
    protected String articleSequenceNumber;
    
    /** The article title. */
    protected ArticleTitleImpl articleTitle;
    
    /** The article sub title. */
    protected ArticleSubTitleImpl articleSubTitle;
    
    /** The article category. */
    protected String articleCategory;
    
    /** The article first page. */
    protected String articleFirstPage;
    
    /** The article last page. */
    protected String articleLastPage;
    
    /** The article history. */
    protected ArticleHistoryImpl articleHistory;
    
    /** The article editorial responsibility. */
    protected String articleEditorialResponsibility;
    
    /** The article copyright. */
    protected ArticleCopyrightImpl articleCopyright;
    
    /** The article grants. */
    protected ArticleGrantsImpl articleGrants;
    
    /** The article context. */
    protected ArticleContextImpl articleContext;
    
    /** The article citation. */
    protected String articleCitation;
    
    /** The article type. */
    protected String articleType;
    
    /** The contains esm. */
    protected String containsESM;
    
    /** The language. */
    protected String language;
    
    /** The numbering style. */
    protected String numberingStyle;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleID()
     */
    public String getArticleID() {
        return articleID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleID(java.lang.String)
     */
    public void setArticleID(String value) {
        articleID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleDOI()
     */
    public String getArticleDOI() {
        return articleDOI;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleDOI(java.lang.String)
     */
    public void setArticleDOI(String value) {
        articleDOI = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleSequenceNumber()
     */
    public String getArticleSequenceNumber() {
        return articleSequenceNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleSequenceNumber(java.lang.String)
     */
    public void setArticleSequenceNumber(String value) {
        articleSequenceNumber = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleTitle()
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleTitle(com.springer.api.schema.ArticleTitle)
     */
    public void setArticleTitle(ArticleTitle value) {
        articleTitle = ((ArticleTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleSubTitle()
     */
    public ArticleSubTitle getArticleSubTitle() {
        return articleSubTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleSubTitle(com.springer.api.schema.ArticleSubTitle)
     */
    public void setArticleSubTitle(ArticleSubTitle value) {
        articleSubTitle = ((ArticleSubTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleCategory()
     */
    public String getArticleCategory() {
        return articleCategory;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleCategory(java.lang.String)
     */
    public void setArticleCategory(String value) {
        articleCategory = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleFirstPage()
     */
    public String getArticleFirstPage() {
        return articleFirstPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleFirstPage(java.lang.String)
     */
    public void setArticleFirstPage(String value) {
        articleFirstPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleLastPage()
     */
    public String getArticleLastPage() {
        return articleLastPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleLastPage(java.lang.String)
     */
    public void setArticleLastPage(String value) {
        articleLastPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleHistory()
     */
    public ArticleHistory getArticleHistory() {
        return articleHistory;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleHistory(com.springer.api.schema.ArticleHistory)
     */
    public void setArticleHistory(ArticleHistory value) {
        articleHistory = ((ArticleHistoryImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleEditorialResponsibility()
     */
    public String getArticleEditorialResponsibility() {
        return articleEditorialResponsibility;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleEditorialResponsibility(java.lang.String)
     */
    public void setArticleEditorialResponsibility(String value) {
        articleEditorialResponsibility = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleCopyright()
     */
    public ArticleCopyright getArticleCopyright() {
        return articleCopyright;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleCopyright(com.springer.api.schema.ArticleCopyright)
     */
    public void setArticleCopyright(ArticleCopyright value) {
        articleCopyright = ((ArticleCopyrightImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleGrants()
     */
    public ArticleGrants getArticleGrants() {
        return articleGrants;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleGrants(com.springer.api.schema.ArticleGrants)
     */
    public void setArticleGrants(ArticleGrants value) {
        articleGrants = ((ArticleGrantsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleContext()
     */
    public ArticleContext getArticleContext() {
        return articleContext;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleContext(com.springer.api.schema.ArticleContext)
     */
    public void setArticleContext(ArticleContext value) {
        articleContext = ((ArticleContextImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleCitation()
     */
    public String getArticleCitation() {
        return articleCitation;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleCitation(java.lang.String)
     */
    public void setArticleCitation(String value) {
        articleCitation = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getArticleType()
     */
    public String getArticleType() {
        return articleType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setArticleType(java.lang.String)
     */
    public void setArticleType(String value) {
        articleType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getContainsESM()
     */
    public String getContainsESM() {
        return containsESM;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setContainsESM(java.lang.String)
     */
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getNumberingStyle()
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setNumberingStyle(java.lang.String)
     */
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleInfo#setTocLevels(java.lang.Long)
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
        setArticleCitation(XppUtils.getAttributeValueFromNode(parser, "ArticleCitation"));
        setArticleType(XppUtils.getAttributeValueFromNode(parser, "ArticleType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleID")) {
                setArticleID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleDOI")) {
                setArticleDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleSequenceNumber")) {
                setArticleSequenceNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                setArticleTitle(node);
            } else if (name.equals("ArticleSubTitle")) {
                ArticleSubTitleImpl node = new ArticleSubTitleImpl();
                node.init(parser);
                setArticleSubTitle(node);
            } else if (name.equals("ArticleCategory")) {
                setArticleCategory(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleFirstPage")) {
                setArticleFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleLastPage")) {
                setArticleLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleHistory")) {
                ArticleHistoryImpl node = new ArticleHistoryImpl();
                node.init(parser);
                setArticleHistory(node);
            } else if (name.equals("ArticleEditorialResponsibility")) {
                setArticleEditorialResponsibility(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleCopyright")) {
                ArticleCopyrightImpl node = new ArticleCopyrightImpl();
                node.init(parser);
                setArticleCopyright(node);
            } else if (name.equals("ArticleGrants")) {
                ArticleGrantsImpl node = new ArticleGrantsImpl();
                node.init(parser);
                setArticleGrants(node);
            } else if (name.equals("ArticleContext")) {
                ArticleContextImpl node = new ArticleContextImpl();
                node.init(parser);
                setArticleContext(node);
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
