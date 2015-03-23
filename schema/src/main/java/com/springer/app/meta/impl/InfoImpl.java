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

package com.springer.app.meta.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.app.meta.Authors;
import com.springer.app.meta.Info;
import com.springer.app.meta.Institutions;
import com.springer.app.meta.SubjectGroup;
import com.springer.app.meta.Title;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateLoaded",
    "authors",
    "institutions",
    "date",
    "type",
    "doi",
    "title",
    "isxn",
    "volumeId",
    "issueId",
    "journals",
    "pubNames",
    "articleFirstPage",
    "book",
    "publication",
    "publicationType",
    "subjectGroup"
})
@XmlRootElement(name = "Info")
public class InfoImpl
    implements Serializable, Info
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DateLoaded", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dateLoaded;
    @XmlElement(name = "Authors", required = true, type = AuthorsImpl.class)
    protected AuthorsImpl authors;
    @XmlElement(name = "Institutions", required = true, type = InstitutionsImpl.class)
    protected InstitutionsImpl institutions;
    @XmlElement(name = "Date", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String date;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlElement(name = "DOI", required = true)
    protected String doi;
    @XmlElement(name = "Title", required = true, type = TitleImpl.class)
    protected TitleImpl title;
    @XmlElement(name = "ISXN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String isxn;
    @XmlElement(name = "VolumeId", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long volumeId;
    @XmlElement(name = "IssueId", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long issueId;
    @XmlElement(name = "Journal", required = true)
    protected List<String> journals;
    @XmlElement(name = "PubName", required = true)
    protected List<String> pubNames;
    @XmlElement(name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String articleFirstPage;
    @XmlElement(name = "Book")
    protected String book;
    @XmlElement(name = "Publication", required = true)
    protected String publication;
    @XmlElement(name = "PublicationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String publicationType;
    @XmlElement(name = "SubjectGroup", required = true, type = SubjectGroupImpl.class)
    protected SubjectGroupImpl subjectGroup;

    public Date getDateLoaded() {
        return dateLoaded;
    }

    public void setDateLoaded(Date value) {
        this.dateLoaded = value;
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

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getDOI() {
        return doi;
    }

    public void setDOI(String value) {
        this.doi = value;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title value) {
        this.title = ((TitleImpl) value);
    }

    public String getISXN() {
        return isxn;
    }

    public void setISXN(String value) {
        this.isxn = value;
    }

    public Long getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Long value) {
        this.volumeId = value;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long value) {
        this.issueId = value;
    }

    public List<String> getJournals() {
        if (journals == null) {
            journals = new ArrayList<String>();
        }
        return this.journals;
    }

    public List<String> getPubNames() {
        if (pubNames == null) {
            pubNames = new ArrayList<String>();
        }
        return this.pubNames;
    }

    public String getArticleFirstPage() {
        return articleFirstPage;
    }

    public void setArticleFirstPage(String value) {
        this.articleFirstPage = value;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String value) {
        this.book = value;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String value) {
        this.publication = value;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String value) {
        this.publicationType = value;
    }

    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }

    public void setSubjectGroup(SubjectGroup value) {
        this.subjectGroup = ((SubjectGroupImpl) value);
    }

}
