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

import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.KeywordGroup;

/**
 * The Class ChapterHeaderImpl.
 */
public class ChapterHeaderImpl extends BaseSchemaEntity implements ChapterHeader {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The author group. */
    protected AuthorGroupImpl authorGroup;
    
    /** The _abstract. */
    protected AbstractImpl _abstract;
    
    /** The keyword group. */
    protected KeywordGroupImpl keywordGroup;
    
    /** The article notes. */
    protected List<ArticleNote> articleNotes;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#getAuthorGroup()
     */
    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#setAuthorGroup(com.springer.api.schema.AuthorGroup)
     */
    public void setAuthorGroup(AuthorGroup value) {
        authorGroup = ((AuthorGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#getAbstract()
     */
    public Abstract getAbstract() {
        return _abstract;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#setAbstract(com.springer.api.schema.Abstract)
     */
    public void setAbstract(Abstract value) {
        _abstract = ((AbstractImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#getKeywordGroup()
     */
    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#setKeywordGroup(com.springer.api.schema.KeywordGroup)
     */
    public void setKeywordGroup(KeywordGroup value) {
        keywordGroup = ((KeywordGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHeader#getArticleNotes()
     */
    public List<ArticleNote> getArticleNotes() {
        if (articleNotes == null) {
            articleNotes = new ArrayList<ArticleNote>();
        }
        return this.articleNotes;
    }
    
    /**
     * Sets the article notes.
     * 
     * @param value the new article notes
     */
    public void setArticleNotes(List<ArticleNote> value) {
        this.articleNotes = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("AuthorGroup")) {
                AuthorGroupImpl node = new AuthorGroupImpl();
                node.init(parser);
                setAuthorGroup(node);
            } else if (name.equals("Abstract")) {
                AbstractImpl node = new AbstractImpl();
                node.init(parser);
                setAbstract(node);
            } else if (name.equals("KeywordGroup")) {
                KeywordGroupImpl node = new KeywordGroupImpl();
                node.init(parser);
                setKeywordGroup(node);
            } else if (name.equals("ArticleNote")) {
                ArticleNoteImpl node = new ArticleNoteImpl();
                node.init(parser);
                getArticleNotes().add(node);
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
