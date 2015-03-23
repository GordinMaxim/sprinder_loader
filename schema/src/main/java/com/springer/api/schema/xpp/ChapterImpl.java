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

import com.springer.api.schema.BodyRef;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.ChapterBackmatter;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.ChapterInfo;

/**
 * The Class ChapterImpl.
 */
public class ChapterImpl extends BaseSchemaEntity implements Chapter {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The chapter info. */
    protected ChapterInfoImpl chapterInfo;
    
    /** The chapter header. */
    protected ChapterHeaderImpl chapterHeader;
    
    /** The body ref. */
    protected BodyRefImpl bodyRef;
    
    /** The chapter backmatter. */
    protected ChapterBackmatterImpl chapterBackmatter;
    
    /** The id. */
    protected String id;
    
    /** The language. */
    protected String language;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getChapterInfo()
     */
    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setChapterInfo(com.springer.api.schema.ChapterInfo)
     */
    public void setChapterInfo(ChapterInfo value) {
        chapterInfo = ((ChapterInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getChapterHeader()
     */
    public ChapterHeader getChapterHeader() {
        return chapterHeader;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setChapterHeader(com.springer.api.schema.ChapterHeader)
     */
    public void setChapterHeader(ChapterHeader value) {
        chapterHeader = ((ChapterHeaderImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getBodyRef()
     */
    public BodyRef getBodyRef() {
        return bodyRef;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setBodyRef(com.springer.api.schema.BodyRef)
     */
    public void setBodyRef(BodyRef value) {
        bodyRef = ((BodyRefImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getChapterBackmatter()
     */
    public ChapterBackmatter getChapterBackmatter() {
        return chapterBackmatter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setChapterBackmatter(com.springer.api.schema.ChapterBackmatter)
     */
    public void setChapterBackmatter(ChapterBackmatter value) {
        chapterBackmatter = ((ChapterBackmatterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Chapter#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ChapterInfo")) {
                ChapterInfoImpl node = new ChapterInfoImpl();
                node.init(parser);
                setChapterInfo(node);
            } else if (name.equals("ChapterHeader")) {
                ChapterHeaderImpl node = new ChapterHeaderImpl();
                node.init(parser);
                setChapterHeader(node);
            } else if (name.equals("BodyRef")) {
                BodyRefImpl node = new BodyRefImpl();
                node.init(parser);
                setBodyRef(node);
            } else if (name.equals("ChapterBackmatter")) {
                ChapterBackmatterImpl node = new ChapterBackmatterImpl();
                node.init(parser);
                setChapterBackmatter(node);
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
