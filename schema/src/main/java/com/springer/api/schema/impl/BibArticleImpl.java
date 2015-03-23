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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibComments;
import com.springer.api.schema.NoArticleTitle;
import com.springer.api.schema.Occurrence;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorNames",
    "etal",
    "bibComments",
    "year",
    "articleTitle",
    "noArticleTitle",
    "journalTitle",
    "volumeID",
    "issueID",
    "firstPage",
    "lastPage",
    "occurrences"
})
@XmlRootElement(name = "BibArticle")
public class BibArticleImpl
    implements Serializable, BibArticle
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName", type = BibAuthorNameImpl.class)
    protected List<BibAuthorName> bibAuthorNames;
    @XmlElement(name = "Etal")
    protected String etal;
    @XmlElement(name = "BibComments", type = BibCommentsImpl.class)
    protected BibCommentsImpl bibComments;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "ArticleTitle", required = true, type = ArticleTitleImpl.class)
    protected ArticleTitleImpl articleTitle;
    @XmlElement(name = "NoArticleTitle", required = true, type = NoArticleTitleImpl.class)
    protected NoArticleTitleImpl noArticleTitle;
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    @XmlElement(name = "VolumeID", required = true)
    protected String volumeID;
    @XmlElement(name = "IssueID")
    protected String issueID;
    @XmlElement(name = "FirstPage", required = true)
    protected String firstPage;
    @XmlElement(name = "LastPage", required = true)
    protected String lastPage;
    @XmlElement(name = "Occurrence", type = OccurrenceImpl.class)
    protected List<Occurrence> occurrences;

    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }

    public String getEtal() {
        return etal;
    }

    public void setEtal(String value) {
        this.etal = value;
    }

    public BibComments getBibComments() {
        return bibComments;
    }

    public void setBibComments(BibComments value) {
        this.bibComments = ((BibCommentsImpl) value);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String value) {
        this.year = value;
    }

    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = ((ArticleTitleImpl) value);
    }

    public NoArticleTitle getNoArticleTitle() {
        return noArticleTitle;
    }

    public void setNoArticleTitle(NoArticleTitle value) {
        this.noArticleTitle = ((NoArticleTitleImpl) value);
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(String value) {
        this.volumeID = value;
    }

    public String getIssueID() {
        return issueID;
    }

    public void setIssueID(String value) {
        this.issueID = value;
    }

    public String getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    public String getLastPage() {
        return lastPage;
    }

    public void setLastPage(String value) {
        this.lastPage = value;
    }

    public List<Occurrence> getOccurrences() {
        if (occurrences == null) {
            occurrences = new ArrayList<Occurrence>();
        }
        return this.occurrences;
    }

}
