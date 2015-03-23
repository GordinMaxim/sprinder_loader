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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.Bibliography;
import com.springer.api.schema.ChapterBackmatter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleNote",
    "bibliography"
})
@XmlRootElement(name = "ChapterBackmatter")
public class ChapterBackmatterImpl
    implements Serializable, ChapterBackmatter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleNote", type = ArticleNoteImpl.class)
    protected ArticleNoteImpl articleNote;
    @XmlElement(name = "Bibliography", required = true, type = BibliographyImpl.class)
    protected BibliographyImpl bibliography;

    public ArticleNote getArticleNote() {
        return articleNote;
    }

    public void setArticleNote(ArticleNote value) {
        this.articleNote = ((ArticleNoteImpl) value);
    }

    public Bibliography getBibliography() {
        return bibliography;
    }

    public void setBibliography(Bibliography value) {
        this.bibliography = ((BibliographyImpl) value);
    }

}
