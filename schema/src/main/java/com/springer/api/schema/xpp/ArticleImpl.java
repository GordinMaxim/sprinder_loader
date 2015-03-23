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
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Article;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.Body;
import com.springer.api.schema.BodyRef;

/**
 * The Class ArticleImpl.
 */
public class ArticleImpl extends BaseSchemaEntity implements Article {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article info. */
    protected ArticleInfoImpl articleInfo;
    
    /** The article header. */
    protected ArticleHeaderImpl articleHeader;
    
    /** The body. */
    protected BodyImpl body;
    
    /** The body reves. */
    protected List<BodyRef> bodyReves;
    
    /** The article backmatter. */
    protected ArticleBackmatterImpl articleBackmatter;
    
    /** The id. */
    protected String id;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getArticleInfo()
     */
    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setArticleInfo(com.springer.api.schema.ArticleInfo)
     */
    public void setArticleInfo(ArticleInfo value) {
        articleInfo = ((ArticleInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getArticleHeader()
     */
    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setArticleHeader(com.springer.api.schema.ArticleHeader)
     */
    public void setArticleHeader(ArticleHeader value) {
        articleHeader = ((ArticleHeaderImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getBody()
     */
    public Body getBody() {
        return body;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setBody(com.springer.api.schema.Body)
     */
    public void setBody(Body value) {
        body = ((BodyImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getBodyReves()
     */
    public List<BodyRef> getBodyReves() {
        if (bodyReves == null) {
            bodyReves = new ArrayList<BodyRef>();
        }
        return this.bodyReves;
    }
    
    /**
     * Sets the body reves.
     * 
     * @param value the new body reves
     */
    public void setBodyReves(List<BodyRef> value) {
        this.bodyReves = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getArticleBackmatter()
     */
    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setArticleBackmatter(com.springer.api.schema.ArticleBackmatter)
     */
    public void setArticleBackmatter(ArticleBackmatter value) {
        articleBackmatter = ((ArticleBackmatterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Article#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleInfo")) {
                ArticleInfoImpl node = new ArticleInfoImpl();
                node.init(parser);
                setArticleInfo(node);
            } else if (name.equals("ArticleHeader")) {
                ArticleHeaderImpl node = new ArticleHeaderImpl();
                node.init(parser);
                setArticleHeader(node);
            } else if (name.equals("Body")) {
                BodyImpl node = new BodyImpl();
                node.init(parser);
                setBody(node);
            } else if (name.equals("BodyRef")) {
                BodyRefImpl node = new BodyRefImpl();
                node.init(parser);
                getBodyReves().add(node);
            } else if (name.equals("ArticleBackmatter")) {
                ArticleBackmatterImpl node = new ArticleBackmatterImpl();
                node.init(parser);
                setArticleBackmatter(node);
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
