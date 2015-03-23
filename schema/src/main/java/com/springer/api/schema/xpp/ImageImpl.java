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
import java.util.Date;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.Authors;
import com.springer.api.schema.Caption;
import com.springer.api.schema.File;
import com.springer.api.schema.FullText;
import com.springer.api.schema.ISXN;
import com.springer.api.schema.Image;
import com.springer.api.schema.Institutions;
import com.springer.api.schema.Keywords;
import com.springer.api.schema.SubjectCollection;
import com.springer.api.schema.Subjects;
import com.springer.api.schema.Table;

/**
 * The Class ImageImpl.
 */
public class ImageImpl extends BaseSchemaEntity implements Image {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The caption. */
    protected CaptionImpl caption;
    
    /** The files. */
    protected List<File> files;
    
    /** The full texts. */
    protected List<FullText> fullTexts;
    
    /** The locations. */
    protected List<String> locations;
    
    /** The article titles. */
    protected List<ArticleTitle> articleTitles;
    
    /** The authors. */
    protected Authors authors;
    
    /** The dois. */
    protected List<String> dois;
    
    /** The institutions. */
    protected Institutions institutions;
    
    /** The issue ids. */
    protected List<String> issueIds;
    
    /** The journal ids. */
    protected List<String> journalIds;
    
    /** The pub dates. */
    protected List<String> pubDates;
    
    /** The source titles. */
    protected List<String> sourceTitles;
    
    /** The source types. */
    protected List<String> sourceTypes;
    
    /** The volume ids. */
    protected List<Long> volumeIds;
    
    /** The chapter id. */
    protected Long chapterId;
    
    /** The book title id. */
    protected Long bookTitleId;
    
    /** The book doi. */
    protected String bookDOI;
    
    /** The isxn. */
    protected ISXNImpl isxn;
    
    /** The subject collection. */
    protected SubjectCollectionImpl subjectCollection;
    
    /** The subjects. */
    protected SubjectsImpl subjects;
    
    /** The copyright holders. */
    protected List<String> copyrightHolders;
    
    /** The keywords. */
    protected List<Keywords> keywords;
    
    /** The open accesses. */
    protected List<Boolean> openAccesses;
    
    /** The image type. */
    protected String imageType;
    
    /** The article uri. */
    protected String articleURI;
    
    /** The provider. */
    protected String provider;
    
    /** The date loaded. */
    protected Date dateLoaded;
    
    /** The id. */
    protected String id;
    
    /** The language. */
    protected String language;
    
    /** The lang. */
    protected String lang;
    
    /** The app ids. */
    protected List<String> appIds;
    
    /** The tables. */
    protected List<Table> tables;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getAPPIds()
     */
    public List<String> getAPPIds() {
        if (appIds == null) {
        	appIds = new ArrayList<String>();
        }
        return this.appIds;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getCaption()
     */
    public Caption getCaption() {
        return caption;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setCaption(com.springer.api.schema.Caption)
     */
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getFiles()
     */
    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<File>();
        }
        return this.files;
    }
    
    /**
     * Sets the files.
     * 
     * @param value the new files
     */
    public void setFiles(List<File> value) {
        this.files = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getFullTexts()
     */
    public List<FullText> getFullTexts() {
        if (fullTexts == null) {
            fullTexts = new ArrayList<FullText>();
        }
        return this.fullTexts;
    }
    
    /**
     * Sets the full texts.
     * 
     * @param value the new full texts
     */
    public void setFullTexts(List<FullText> value) {
        this.fullTexts = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getLocations()
     */
    public List<String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<String>();
        }
        return this.locations;
    }
    
    /**
     * Sets the locations.
     * 
     * @param value the new locations
     */
    public void setLocations(List<String> value) {
        this.locations = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getTables()
     */
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getArticleTitles()
     */
    public List<ArticleTitle> getArticleTitles() {
        if (articleTitles == null) {
            articleTitles = new ArrayList<ArticleTitle>();
        }
        return this.articleTitles;
    }
    
    /**
     * Sets the article titles.
     * 
     * @param value the new article titles
     */
    public void setArticleTitles(List<ArticleTitle> value) {
        this.articleTitles = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getAuthors()
     */
    public Authors getAuthors() {
        return authors;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setAuthors(com.springer.api.schema.Authors)
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getDOIS()
     */
    public List<String> getDOIS() {
        if (dois == null) {
            dois = new ArrayList<String>();
        }
        return this.dois;
    }
    
    /**
     * Sets the dOIS.
     * 
     * @param value the new dOIS
     */
    public void setDOIS(List<String> value) {
        this.dois = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getInstitutions()
     */
    public Institutions getInstitutions() {
        return this.institutions;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setInstitutions(com.springer.api.schema.Institutions)
     */
    public void setInstitutions(Institutions value) {
        this.institutions = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getIssueIds()
     */
    public List<String> getIssueIds() {
        if (issueIds == null) {
            issueIds = new ArrayList<String>();
        }
        return this.issueIds;
    }
    
    /**
     * Sets the issue ids.
     * 
     * @param value the new issue ids
     */
    public void setIssueIds(List<String> value) {
        this.issueIds = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getJournalIds()
     */
    public List<String> getJournalIds() {
        if (journalIds == null) {
            journalIds = new ArrayList<String>();
        }
        return this.journalIds;
    }
    
    /**
     * Sets the journal ids.
     * 
     * @param value the new journal ids
     */
    public void setJournalIds(List<String> value) {
        this.journalIds = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getPubDates()
     */
    public List<String> getPubDates() {
        if (pubDates == null) {
            pubDates = new ArrayList<String>();
        }
        return this.pubDates;
    }
    
    /**
     * Sets the pub dates.
     * 
     * @param value the new pub dates
     */
    public void setPubDates(List<String> value) {
        this.pubDates = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getSourceTitles()
     */
    public List<String> getSourceTitles() {
        if (sourceTitles == null) {
            sourceTitles = new ArrayList<String>();
        }
        return this.sourceTitles;
    }
    
    /**
     * Sets the source titles.
     * 
     * @param value the new source titles
     */
    public void setSourceTitles(List<String> value) {
        this.sourceTitles = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getSourceTypes()
     */
    public List<String> getSourceTypes() {
        if (sourceTypes == null) {
            sourceTypes = new ArrayList<String>();
        }
        return this.sourceTypes;
    }
    
    /**
     * Sets the source types.
     * 
     * @param value the new source types
     */
    public void setSourceTypes(List<String> value) {
        this.sourceTypes = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getVolumeIds()
     */
    public List<Long> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new ArrayList<Long>();
        }
        return this.volumeIds;
    }
    
    /**
     * Sets the volume ids.
     * 
     * @param value the new volume ids
     */
    public void setVolumeIds(List<Long> value) {
        this.volumeIds = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getChapterId()
     */
    public Long getChapterId() {
        return chapterId;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setChapterId(java.lang.Long)
     */
    public void setChapterId(Long value) {
        chapterId = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getBookTitleId()
     */
    public Long getBookTitleId() {
        return bookTitleId;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setBookTitleId(java.lang.Long)
     */
    public void setBookTitleId(Long value) {
        bookTitleId = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getBookDOI()
     */
    public String getBookDOI() {
        return bookDOI;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setBookDOI(java.lang.String)
     */
    public void setBookDOI(String value) {
        bookDOI = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getISXN()
     */
    public ISXN getISXN() {
        return isxn;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setISXN(com.springer.api.schema.ISXN)
     */
    public void setISXN(ISXN value) {
        isxn = ((ISXNImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getSubjectCollection()
     */
    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setSubjectCollection(com.springer.api.schema.SubjectCollection)
     */
    public void setSubjectCollection(SubjectCollection value) {
        this.subjectCollection = ((SubjectCollectionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getSubjects()
     */
    public Subjects getSubjects() {
        return subjects;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setSubjects(com.springer.api.schema.Subjects)
     */
    public void setSubjects(Subjects value) {
        subjects = ((SubjectsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getCopyrightHolders()
     */
    public List<String> getCopyrightHolders() {
        if (copyrightHolders == null) {
            copyrightHolders = new ArrayList<String>();
        }
        return this.copyrightHolders;
    }
    
    /**
     * Sets the copyright holders.
     * 
     * @param value the new copyright holders
     */
    public void setCopyrightHolders(List<String> value) {
        this.copyrightHolders = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getKeywords()
     */
    public List<Keywords> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return this.keywords;
    }
    
    /**
     * Sets the keywords.
     * 
     * @param value the new keywords
     */
    public void setKeywords(List<Keywords> value) {
        this.keywords = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getOpenAccesses()
     */
    public List<Boolean> getOpenAccesses() {
        if (openAccesses == null) {
            openAccesses = new ArrayList<Boolean>();
        }
        return this.openAccesses;
    }
    
    /**
     * Sets the open accesses.
     * 
     * @param value the new open accesses
     */
    public void setOpenAccesses(List<Boolean> value) {
        this.openAccesses = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getImageType()
     */
    public String getImageType() {
        return imageType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setImageType(java.lang.String)
     */
    public void setImageType(String value) {
        imageType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getArticleURI()
     */
    public String getArticleURI() {
        return articleURI;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setArticleURI(java.lang.String)
     */
    public void setArticleURI(String value) {
        articleURI = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getProvider()
     */
    public String getProvider() {
        return provider;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setProvider(java.lang.String)
     */
    public void setProvider(String value) {
        provider = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getDateLoaded()
     */
    public Date getDateLoaded() {
        return dateLoaded;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setDateLoaded(java.util.Date)
     */
    public void setDateLoaded(Date value) {
        dateLoaded = ((Date) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getId()
     */
    public String getId() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setId(java.lang.String)
     */
    public void setId(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#getLang()
     */
    public String getLang() {
        return lang;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Image#setLang(java.lang.String)
     */
    public void setLang(String value) {
        lang = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setId(XppUtils.getAttributeValueFromNode(parser, "Id"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "language"));
        setLang(XppUtils.getAttributeValueFromNode(parser, "lang"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("File")) {
                FileImpl node = new FileImpl();
                node.init(parser);
                getFiles().add(node);
            } else if (name.equals("FullText")) {
                FullTextImpl node = new FullTextImpl();
                node.init(parser);
                getFullTexts().add(node);
            } else if (name.equals("Location")) {
                getLocations().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                getArticleTitles().add(node);
            } else if (name.equals("Authors")) {
                AuthorsImpl node = new AuthorsImpl();
                node.init(parser);
                setAuthors(node);
            } else if (name.equals("DOI")) {
                getDOIS().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Institutions")) {
                InstitutionsImpl node = new InstitutionsImpl();
                node.init(parser);
                setInstitutions(node);
            } else if (name.equals("IssueId")) {
                getIssueIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("APPId")) {
                getAPPIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalId")) {
                getJournalIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PubDate")) {
                getPubDates().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SourceTitle")) {
                getSourceTitles().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SourceType")) {
                getSourceTypes().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeId")) {
                getVolumeIds().add(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterId")) {
                setChapterId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitleId")) {
                setBookTitleId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ISXN")) {
                ISXNImpl node = new ISXNImpl();
                node.init(parser);
                setISXN(node);
            } else if (name.equals("SubjectCollection")) {
            	SubjectCollectionImpl node = new SubjectCollectionImpl();
            	node.init(parser);
                setSubjectCollection(node);
            } else if (name.equals("Subjects")) {
                SubjectsImpl node = new SubjectsImpl();
                node.init(parser);
                setSubjects(node);
            } else if (name.equals("CopyrightHolder")) {
                getCopyrightHolders().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Keywords")) {
                KeywordsImpl node = new KeywordsImpl();
                node.init(parser);
                getKeywords().add(node);
            } else if (name.equals("OpenAccess")) {
                getOpenAccesses().add(Boolean.valueOf(XppUtils.getElementValueFromNode(parser)));
            } else if (name.equals("ImageType")) {
                setImageType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleURI")) {
                setArticleURI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Provider")) {
                setProvider(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueAsDateFromNode(parser));
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
