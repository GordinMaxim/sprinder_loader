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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibChapter;
import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Citation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationNumber",
    "bibArticle",
    "bibBook",
    "bibChapter",
    "bibUnstructured"
})
@XmlRootElement(name = "Citation")
public class CitationImpl
    implements Serializable, Citation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationNumber", required = true)
    protected String citationNumber;
    @XmlElement(name = "BibArticle", type = BibArticleImpl.class)
    protected BibArticleImpl bibArticle;
    @XmlElement(name = "BibBook", type = BibBookImpl.class)
    protected BibBookImpl bibBook;
    @XmlElement(name = "BibChapter", type = BibChapterImpl.class)
    protected BibChapterImpl bibChapter;
    @XmlElement(name = "BibUnstructured", type = BibUnstructuredImpl.class)
    protected BibUnstructuredImpl bibUnstructured;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public String getCitationNumber() {
        return citationNumber;
    }

    public void setCitationNumber(String value) {
        this.citationNumber = value;
    }

    public BibArticle getBibArticle() {
        return bibArticle;
    }

    public void setBibArticle(BibArticle value) {
        this.bibArticle = ((BibArticleImpl) value);
    }

    public BibBook getBibBook() {
        return bibBook;
    }

    public void setBibBook(BibBook value) {
        this.bibBook = ((BibBookImpl) value);
    }

    public BibChapter getBibChapter() {
        return bibChapter;
    }

    public void setBibChapter(BibChapter value) {
        this.bibChapter = ((BibChapterImpl) value);
    }

    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }

    public void setBibUnstructured(BibUnstructured value) {
        this.bibUnstructured = ((BibUnstructuredImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
