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

package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "tables",
    "appIds",
    "files",
    "fullTexts",
    "locations",
    "articleTitles",
    "dois",
    "issueIds",
    "journalIds",
    "pubDates",
    "sourceTitles",
    "sourceTypes",
    "volumeIds",
    "authors",
    "institutions",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolders",
    "keywords",
    "openAccesses",
    "imageType",
    "articleURI",
    "provider",
    "dateLoaded"
})
@XmlRootElement(name = "Image")
public class ImageImpl
    implements Serializable, Image
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Caption", required = true, type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(name = "Table", required = true, type = TableImpl.class)
    protected List<Table> tables;
    @XmlElement(name = "APPId", required = true)
    protected List<String> appIds;
    @XmlElement(name = "File", required = true, type = FileImpl.class)
    protected List<File> files;
    @XmlElement(name = "FullText", required = true, type = FullTextImpl.class)
    protected List<FullText> fullTexts;
    @XmlElement(name = "Location", required = true)
    protected List<String> locations;
    @XmlElement(name = "ArticleTitle", required = true, type = ArticleTitleImpl.class)
    protected List<ArticleTitle> articleTitles;
    @XmlElement(name = "DOI", required = true)
    protected List<String> dois;
    @XmlElement(name = "IssueId", required = true)
    protected List<String> issueIds;
    @XmlElement(name = "JournalId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> journalIds;
    @XmlElement(name = "PubDate", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> pubDates;
    @XmlElement(name = "SourceTitle", required = true)
    protected List<String> sourceTitles;
    @XmlElement(name = "SourceType", required = true)
    protected List<String> sourceTypes;
    @XmlElement(name = "VolumeId", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected List<Long> volumeIds;
    @XmlElement(name = "Authors", type = AuthorsImpl.class)
    protected AuthorsImpl authors;
    @XmlElement(name = "Institutions", type = InstitutionsImpl.class)
    protected InstitutionsImpl institutions;
    @XmlElement(name = "ChapterId", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long chapterId;
    @XmlElement(name = "BookTitleId", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long bookTitleId;
    @XmlElement(name = "BookDOI")
    protected String bookDOI;
    @XmlElement(name = "ISXN", required = true, type = ISXNImpl.class)
    protected ISXNImpl isxn;
    @XmlElement(name = "SubjectCollection", required = true, type = SubjectCollectionImpl.class)
    protected SubjectCollectionImpl subjectCollection;
    @XmlElement(name = "Subjects", required = true, type = SubjectsImpl.class)
    protected SubjectsImpl subjects;
    @XmlElement(name = "CopyrightHolder", required = true)
    protected List<String> copyrightHolders;
    @XmlElement(name = "Keywords", required = true, type = KeywordsImpl.class)
    protected List<Keywords> keywords;
    @XmlElement(name = "OpenAccess", type = Boolean.class)
    protected List<Boolean> openAccesses;
    @XmlElement(name = "ImageType", required = true)
    protected String imageType;
    @XmlElement(name = "ArticleURI")
    protected String articleURI;
    @XmlElement(name = "Provider", required = true)
    protected String provider;
    @XmlElement(name = "DateLoaded", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dateLoaded;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute
    protected String language;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String lang;

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }

    public List<String> getAPPIds() {
        if (appIds == null) {
            appIds = new ArrayList<String>();
        }
        return this.appIds;
    }

    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<File>();
        }
        return this.files;
    }

    public List<FullText> getFullTexts() {
        if (fullTexts == null) {
            fullTexts = new ArrayList<FullText>();
        }
        return this.fullTexts;
    }

    public List<String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<String>();
        }
        return this.locations;
    }

    public List<ArticleTitle> getArticleTitles() {
        if (articleTitles == null) {
            articleTitles = new ArrayList<ArticleTitle>();
        }
        return this.articleTitles;
    }

    public List<String> getDOIS() {
        if (dois == null) {
            dois = new ArrayList<String>();
        }
        return this.dois;
    }

    public List<String> getIssueIds() {
        if (issueIds == null) {
            issueIds = new ArrayList<String>();
        }
        return this.issueIds;
    }

    public List<String> getJournalIds() {
        if (journalIds == null) {
            journalIds = new ArrayList<String>();
        }
        return this.journalIds;
    }

    public List<String> getPubDates() {
        if (pubDates == null) {
            pubDates = new ArrayList<String>();
        }
        return this.pubDates;
    }

    public List<String> getSourceTitles() {
        if (sourceTitles == null) {
            sourceTitles = new ArrayList<String>();
        }
        return this.sourceTitles;
    }

    public List<String> getSourceTypes() {
        if (sourceTypes == null) {
            sourceTypes = new ArrayList<String>();
        }
        return this.sourceTypes;
    }

    public List<Long> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new ArrayList<Long>();
        }
        return this.volumeIds;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors value) {
        this.authors = ((AuthorsImpl) value);
    }

    public Institutions getInstitutions() {
        return institutions;
    }

    public void setInstitutions(Institutions value) {
        this.institutions = ((InstitutionsImpl) value);
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long value) {
        this.chapterId = value;
    }

    public Long getBookTitleId() {
        return bookTitleId;
    }

    public void setBookTitleId(Long value) {
        this.bookTitleId = value;
    }

    public String getBookDOI() {
        return bookDOI;
    }

    public void setBookDOI(String value) {
        this.bookDOI = value;
    }

    public ISXN getISXN() {
        return isxn;
    }

    public void setISXN(ISXN value) {
        this.isxn = ((ISXNImpl) value);
    }

    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(SubjectCollection value) {
        this.subjectCollection = ((SubjectCollectionImpl) value);
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects value) {
        this.subjects = ((SubjectsImpl) value);
    }

    public List<String> getCopyrightHolders() {
        if (copyrightHolders == null) {
            copyrightHolders = new ArrayList<String>();
        }
        return this.copyrightHolders;
    }

    public List<Keywords> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return this.keywords;
    }

    public List<Boolean> getOpenAccesses() {
        if (openAccesses == null) {
            openAccesses = new ArrayList<Boolean>();
        }
        return this.openAccesses;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String value) {
        this.imageType = value;
    }

    public String getArticleURI() {
        return articleURI;
    }

    public void setArticleURI(String value) {
        this.articleURI = value;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public Date getDateLoaded() {
        return dateLoaded;
    }

    public void setDateLoaded(Date value) {
        this.dateLoaded = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

}
