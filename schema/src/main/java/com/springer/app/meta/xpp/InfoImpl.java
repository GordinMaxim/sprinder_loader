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
package com.springer.app.meta.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Authors;
import com.springer.app.meta.Info;
import com.springer.app.meta.Institutions;
import com.springer.app.meta.SubjectGroup;
import com.springer.app.meta.Title;

/**
 * The Class InfoImpl.
 */
public class InfoImpl extends BaseSchemaEntity implements Info {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The date loaded. */
    protected Date dateLoaded;
    
    /** The authors. */
    protected AuthorsImpl authors;
    
    /** The institutions. */
    protected InstitutionsImpl institutions;
    
    /** The date. */
    protected String date;
    
    /** The type. */
    protected String type;
    
    /** The doi. */
    protected String doi;
    
    /** The title. */
    protected TitleImpl title;
    
    /** The isxn. */
    protected String isxn;
    
    /** The journals. */
    protected List<String> journals;
    
    /** The pub names. */
    protected List<String> pubNames;
    
    /** The article first page. */
    protected String articleFirstPage;
    
    /** The publication. */
    protected String publication;
    
    /** The publication type. */
    protected String publicationType;
    
    /** The subject group. */
    protected SubjectGroupImpl subjectGroup;
    
    /** The volume id. */
    protected Long volumeId;
    
    /** The issue id. */
    protected Long issueId;
    
    /** The book. */
    protected String book;
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getDateLoaded()
     */
    public Date getDateLoaded() {
        return dateLoaded;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setDateLoaded(java.util.Date)
     */
    public void setDateLoaded(Date value) {
        dateLoaded = ((Date) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getAuthors()
     */
    public Authors getAuthors() {
        return authors;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setAuthors(com.springer.app.meta.Authors)
     */
    public void setAuthors(Authors value) {
        authors = ((AuthorsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getInstitutions()
     */
    public Institutions getInstitutions() {
        return institutions;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setInstitutions(com.springer.app.meta.Institutions)
     */
    public void setInstitutions(Institutions value) {
        institutions = ((InstitutionsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getDate()
     */
    public String getDate() {
        return date;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setDate(java.lang.String)
     */
    public void setDate(String value) {
        date = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getDOI()
     */
    public String getDOI() {
        return doi;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setDOI(java.lang.String)
     */
    public void setDOI(String value) {
        doi = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getTitle()
     */
    public Title getTitle() {
        return title;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setTitle(com.springer.app.meta.Title)
     */
    public void setTitle(Title value) {
        title = ((TitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getISXN()
     */
    public String getISXN() {
        return isxn;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setISXN(java.lang.String)
     */
    public void setISXN(String value) {
        isxn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getVolumeId()
     */
    public Long getVolumeId() {
        return volumeId;
    }

    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setVolumeId(java.lang.Long)
     */
    public void setVolumeId(Long value) {
        this.volumeId = value;
    }

    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getIssueId()
     */
    public Long getIssueId() {
        return issueId;
    }

    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setIssueId(java.lang.Long)
     */
    public void setIssueId(Long value) {
        this.issueId = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getBook()
     */
    public String getBook() {
        return book;
    }

    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setBook(java.lang.String)
     */
    public void setBook(String value) {
        this.book = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getJournals()
     */
    public List<String> getJournals() {
        if (journals == null) {
            journals = new ArrayList<String>();
        }
        return this.journals;
    }
    
    /**
     * Sets the journals.
     * 
     * @param value the new journals
     */
    public void setJournals(List<String> value) {
        this.journals = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getPubNames()
     */
    public List<String> getPubNames() {
        if (pubNames == null) {
            pubNames = new ArrayList<String>();
        }
        return this.pubNames;
    }
    
    /**
     * Sets the pub names.
     * 
     * @param value the new pub names
     */
    public void setPubNames(List<String> value) {
        this.pubNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getArticleFirstPage()
     */
    public String getArticleFirstPage() {
        return articleFirstPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setArticleFirstPage(java.lang.String)
     */
    public void setArticleFirstPage(String value) {
        articleFirstPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getPublication()
     */
    public String getPublication() {
        return publication;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setPublication(java.lang.String)
     */
    public void setPublication(String value) {
        publication = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getPublicationType()
     */
    public String getPublicationType() {
        return publicationType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setPublicationType(java.lang.String)
     */
    public void setPublicationType(String value) {
        publicationType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#getSubjectGroup()
     */
    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.app.meta.Info#setSubjectGroup(com.springer.app.meta.SubjectGroup)
     */
    public void setSubjectGroup(SubjectGroup value) {
        subjectGroup = ((SubjectGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("meta:DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueAsDateFromNode(parser));
            } else if (name.equals("meta:Authors")) {
                AuthorsImpl node = new AuthorsImpl();
                node.init(parser);
                setAuthors(node);
            } else if (name.equals("meta:Institutions")) {
                InstitutionsImpl node = new InstitutionsImpl();
                node.init(parser);
                setInstitutions(node);
            } else if (name.equals("meta:Date")) {
                setDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:Type")) {
                setType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:DOI")) {
                setDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:Title")) {
                TitleImpl node = new TitleImpl();
                node.init(parser);
                setTitle(node);
            } else if (name.equals("meta:ISXN")) {
                setISXN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:Journal")) {
                getJournals().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:PubName")) {
                getPubNames().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:ArticleFirstPage")) {
                setArticleFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:Publication")) {
                setPublication(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:PublicationType")) {
                setPublicationType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:VolumeId")) {
                setVolumeId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("meta:IssueId")) {
                setIssueId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("meta:Book")) {
                setBook(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("meta:SubjectGroup")) {
                SubjectGroupImpl node = new SubjectGroupImpl();
                node.init(parser);
                setSubjectGroup(node);
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
