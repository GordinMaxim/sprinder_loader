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

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.Bibliography;
import com.springer.api.schema.ChapterBackmatter;

/**
 * The Class ChapterBackmatterImpl.
 */
public class ChapterBackmatterImpl extends BaseSchemaEntity implements ChapterBackmatter {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article note. */
    protected ArticleNoteImpl articleNote;
    
    /** The bibliography. */
    protected BibliographyImpl bibliography;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterBackmatter#getArticleNote()
     */
    public ArticleNote getArticleNote() {
        return articleNote;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterBackmatter#setArticleNote(com.springer.api.schema.ArticleNote)
     */
    public void setArticleNote(ArticleNote value) {
        articleNote = ((ArticleNoteImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterBackmatter#getBibliography()
     */
    public Bibliography getBibliography() {
        return bibliography;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterBackmatter#setBibliography(com.springer.api.schema.Bibliography)
     */
    public void setBibliography(Bibliography value) {
        bibliography = ((BibliographyImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleNote")) {
                ArticleNoteImpl node = new ArticleNoteImpl();
                node.init(parser);
                setArticleNote(node);
            } else if (name.equals("Bibliography")) {
                BibliographyImpl node = new BibliographyImpl();
                node.init(parser);
                setBibliography(node);
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
