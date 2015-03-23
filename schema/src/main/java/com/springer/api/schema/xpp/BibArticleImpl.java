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
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibComments;
import com.springer.api.schema.NoArticleTitle;
import com.springer.api.schema.Occurrence;

/**
 * The Class BibArticleImpl.
 */
public class BibArticleImpl extends BaseSchemaEntity implements BibArticle {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The bib author names. */
    protected List<BibAuthorName> bibAuthorNames;
    
    /** The etal. */
    protected String etal;
    
    /** The bib comments. */
    protected BibCommentsImpl bibComments;
    
    /** The year. */
    protected String year;
    
    /** The article title. */
    protected ArticleTitleImpl articleTitle;
    
    /** The journal title. */
    protected String journalTitle;
    
    /** The volume id. */
    protected String volumeID;
    
    /** The issue id. */
    protected String issueID;
    
    /** The first page. */
    protected String firstPage;
    
    /** The last page. */
    protected String lastPage;
    
    /** The occurrences. */
    protected List<Occurrence> occurrences;
    
    /** The no article title. */
    protected NoArticleTitleImpl noArticleTitle;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getBibAuthorNames()
     */
    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }
    
    /**
     * Sets the bib author names.
     * 
     * @param value the new bib author names
     */
    public void setBibAuthorNames(List<BibAuthorName> value) {
        this.bibAuthorNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getEtal()
     */
    public String getEtal() {
        return etal;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setEtal(java.lang.String)
     */
    public void setEtal(String value) {
        etal = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getBibComments()
     */
    public BibComments getBibComments() {
        return bibComments;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setBibComments(com.springer.api.schema.BibComments)
     */
    public void setBibComments(BibComments value) {
        bibComments = ((BibCommentsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getYear()
     */
    public String getYear() {
        return year;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setYear(java.lang.String)
     */
    public void setYear(String value) {
        year = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getArticleTitle()
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getNoArticleTitle()
     */
    public NoArticleTitle getNoArticleTitle() {
        return noArticleTitle;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setNoArticleTitle(com.springer.api.schema.NoArticleTitle)
     */
    public void setNoArticleTitle(NoArticleTitle value) {
        this.noArticleTitle = ((NoArticleTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setArticleTitle(com.springer.api.schema.ArticleTitle)
     */
    public void setArticleTitle(ArticleTitle value) {
        articleTitle = ((ArticleTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getJournalTitle()
     */
    public String getJournalTitle() {
        return journalTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setJournalTitle(java.lang.String)
     */
    public void setJournalTitle(String value) {
        journalTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getVolumeID()
     */
    public String getVolumeID() {
        return volumeID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setVolumeID(java.lang.String)
     */
    public void setVolumeID(String value) {
        volumeID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getIssueID()
     */
    public String getIssueID() {
        return issueID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setIssueID(java.lang.String)
     */
    public void setIssueID(String value) {
        issueID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getFirstPage()
     */
    public String getFirstPage() {
        return firstPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setFirstPage(java.lang.String)
     */
    public void setFirstPage(String value) {
        firstPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getLastPage()
     */
    public String getLastPage() {
        return lastPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#setLastPage(java.lang.String)
     */
    public void setLastPage(String value) {
        lastPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibArticle#getOccurrences()
     */
    public List<Occurrence> getOccurrences() {
        if (occurrences == null) {
            occurrences = new ArrayList<Occurrence>();
        }
        return this.occurrences;
    }
    
    /**
     * Sets the occurrences.
     * 
     * @param value the new occurrences
     */
    public void setOccurrences(List<Occurrence> value) {
        this.occurrences = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorNames().add(node);
            } else if (name.equals("Etal")) {
                setEtal(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibComments")) {
                BibCommentsImpl node = new BibCommentsImpl();
                node.init(parser);
                setBibComments(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                setArticleTitle(node);
            } else if (name.equals("NoArticleTitle")) {
            	NoArticleTitleImpl node = new NoArticleTitleImpl();
                node.init(parser);
                setNoArticleTitle(node);
            } else if (name.equals("JournalTitle")) {
                setJournalTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeID")) {
                setVolumeID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueID")) {
                setIssueID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FirstPage")) {
                setFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("LastPage")) {
                setLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Occurrence")) {
                OccurrenceImpl node = new OccurrenceImpl();
                node.init(parser);
                getOccurrences().add(node);
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
