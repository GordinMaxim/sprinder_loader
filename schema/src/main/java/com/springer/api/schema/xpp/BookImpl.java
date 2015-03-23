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

import com.springer.api.schema.Book;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Part;

/**
 * The Class BookImpl.
 */
public class BookImpl extends BaseSchemaEntity implements Book {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The book info. */
    protected BookInfoImpl bookInfo;
    
    /** The book header. */
    protected EditorGroupImpl bookHeader;
    
    /** The chapter. */
    protected ChapterImpl chapter;
    
    /** The language. */
    protected String language;
    
    /** The output medium. */
    protected String outputMedium;
    
    /** The part. */
    protected PartImpl part;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getPart()
     */
    public Part getPart() {
        return part;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setPart(com.springer.api.schema.Part)
     */
    public void setPart(Part value) {
        this.part = ((PartImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getBookInfo()
     */
    public BookInfo getBookInfo() {
        return bookInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setBookInfo(com.springer.api.schema.BookInfo)
     */
    public void setBookInfo(BookInfo value) {
        bookInfo = ((BookInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getBookHeader()
     */
    public EditorGroup getBookHeader() {
        return bookHeader;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setBookHeader(com.springer.api.schema.EditorGroup)
     */
    public void setBookHeader(EditorGroup value) {
        bookHeader = ((EditorGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getChapter()
     */
    public Chapter getChapter() {
        return chapter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setChapter(com.springer.api.schema.Chapter)
     */
    public void setChapter(Chapter value) {
        chapter = ((ChapterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Book#setOutputMedium(java.lang.String)
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
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookInfo")) {
                BookInfoImpl node = new BookInfoImpl();
                node.init(parser);
                setBookInfo(node);
            } else if (name.equals("BookHeader")) {
                EditorGroupImpl node = new EditorGroupImpl();
                node.init(parser);
                setBookHeader(node);
            } else if (name.equals("Chapter")) {
                ChapterImpl node = new ChapterImpl();
                node.init(parser);
                setChapter(node);
            } else if (name.equals("Part")) {
            	PartImpl node = new PartImpl();
                node.init(parser);
                setPart(node);
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
