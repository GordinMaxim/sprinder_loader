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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Article;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.Body;
import com.springer.api.schema.BodyRef;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleInfo",
    "articleHeader",
    "body",
    "bodyReves",
    "articleBackmatter"
})
@XmlRootElement(name = "Article")
public class ArticleImpl
    implements Serializable, Article
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleInfo", required = true, type = ArticleInfoImpl.class)
    protected ArticleInfoImpl articleInfo;
    @XmlElement(name = "ArticleHeader", required = true, type = ArticleHeaderImpl.class)
    protected ArticleHeaderImpl articleHeader;
    @XmlElement(name = "Body", type = BodyImpl.class)
    protected BodyImpl body;
    @XmlElement(name = "BodyRef", required = true, type = BodyRefImpl.class)
    protected List<BodyRef> bodyReves;
    @XmlElement(name = "ArticleBackmatter", required = true, type = ArticleBackmatterImpl.class)
    protected ArticleBackmatterImpl articleBackmatter;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;

    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(ArticleInfo value) {
        this.articleInfo = ((ArticleInfoImpl) value);
    }

    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }

    public void setArticleHeader(ArticleHeader value) {
        this.articleHeader = ((ArticleHeaderImpl) value);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body value) {
        this.body = ((BodyImpl) value);
    }

    public List<BodyRef> getBodyReves() {
        if (bodyReves == null) {
            bodyReves = new ArrayList<BodyRef>();
        }
        return this.bodyReves;
    }

    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }

    public void setArticleBackmatter(ArticleBackmatter value) {
        this.articleBackmatter = ((ArticleBackmatterImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
