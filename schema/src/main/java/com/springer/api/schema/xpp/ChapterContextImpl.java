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

import com.springer.api.schema.BookTitle;
import com.springer.api.schema.ChapterContext;

/**
 * The Class ChapterContextImpl.
 */
public class ChapterContextImpl extends SeriesIDImpl implements ChapterContext {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The book id. */
    protected String bookID;
    
    /** The book title. */
    protected BookTitleImpl bookTitle;
    
    /** The part id. */
    protected Long partID;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#getPartID()
     */
    public Long getPartID() {
        return partID;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#setPartID(java.lang.Long)
     */
    public void setPartID(Long value) {
        this.partID = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#getBookID()
     */
    public String getBookID() {
        return bookID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#setBookID(java.lang.String)
     */
    public void setBookID(String value) {
        bookID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#getBookTitle()
     */
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterContext#setBookTitle(com.springer.api.schema.BookTitle)
     */
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.SeriesIDImpl#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesID")) {
                setSeriesID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookID")) {
                setBookID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartID")) {
                setPartID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.SeriesIDImpl#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
