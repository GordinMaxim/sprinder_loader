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
import com.springer.api.schema.Article;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Issue;
import com.springer.api.schema.IssueInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueInfo",
    "issueHeader",
    "article"
})
@XmlRootElement(name = "Issue")
public class IssueImpl
    implements Serializable, Issue
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "IssueInfo", required = true, type = IssueInfoImpl.class)
    protected IssueInfoImpl issueInfo;
    @XmlElement(name = "IssueHeader", type = EditorGroupImpl.class)
    protected EditorGroupImpl issueHeader;
    @XmlElement(name = "Article", required = true, type = ArticleImpl.class)
    protected ArticleImpl article;
    @XmlAttribute(name = "IssueType", required = true)
    protected String issueType;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;

    public IssueInfo getIssueInfo() {
        return issueInfo;
    }

    public void setIssueInfo(IssueInfo value) {
        this.issueInfo = ((IssueInfoImpl) value);
    }

    public EditorGroup getIssueHeader() {
        return issueHeader;
    }

    public void setIssueHeader(EditorGroup value) {
        this.issueHeader = ((EditorGroupImpl) value);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article value) {
        this.article = ((ArticleImpl) value);
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String value) {
        this.issueType = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
