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
import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "articleNote",
    "keywordGroup"
})
@XmlRootElement(name = "ArticleHeader")
public class ArticleHeaderImpl
    implements Serializable, ArticleHeader
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorGroup", required = true, type = AuthorGroupImpl.class)
    protected AuthorGroupImpl authorGroup;
    @XmlElement(name = "Abstract", required = true, type = AbstractImpl.class)
    protected AbstractImpl _abstract;
    @XmlElement(name = "ArticleNote", type = ArticleNoteImpl.class)
    protected ArticleNoteImpl articleNote;
    @XmlElement(name = "KeywordGroup", type = KeywordGroupImpl.class)
    protected KeywordGroupImpl keywordGroup;

    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(AuthorGroup value) {
        this.authorGroup = ((AuthorGroupImpl) value);
    }

    public Abstract getAbstract() {
        return _abstract;
    }

    public void setAbstract(Abstract value) {
        this._abstract = ((AbstractImpl) value);
    }

    public ArticleNote getArticleNote() {
        return articleNote;
    }

    public void setArticleNote(ArticleNote value) {
        this.articleNote = ((ArticleNoteImpl) value);
    }

    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }

    public void setKeywordGroup(KeywordGroup value) {
        this.keywordGroup = ((KeywordGroupImpl) value);
    }

}
