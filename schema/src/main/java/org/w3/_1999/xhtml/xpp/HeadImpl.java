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
package org.w3._1999.xhtml.xpp;
import java.io.IOException;

import org.w3._1999.xhtml.Head;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import org.prismstandard.namespaces.pam._2.Article;
import org.prismstandard.namespaces.pam._2.xpp.ArticleImpl;
import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;

/**
 * The Class HeadImpl.
 */
public class HeadImpl extends BaseSchemaEntity implements Head {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article. */
    protected ArticleImpl article;
    
    /* (non-Javadoc)
     * @see org.w3._1999.xhtml.Head#getArticle()
     */
    public Article getArticle() {
        return article;
    }
    
    /* (non-Javadoc)
     * @see org.w3._1999.xhtml.Head#setArticle(org.prismstandard.namespaces.pam._2.Article)
     */
    public void setArticle(Article value) {
        article = ((ArticleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("pam:article")) {
            	ArticleImpl node = new ArticleImpl();
            	node.init(parser);
                setArticle(node);
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
