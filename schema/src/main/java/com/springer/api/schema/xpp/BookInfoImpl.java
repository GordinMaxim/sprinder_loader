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

import com.springer.api.schema.BookCopyright;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.SeriesID;

/**
 * The Class BookInfoImpl.
 */
public class BookInfoImpl extends BaseSchemaEntity implements BookInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The book id. */
    protected String bookID;
    
    /** The book title. */
    protected BookTitleImpl bookTitle;
    
    /** The book sub title. */
    protected String bookSubTitle;
    
    /** The book volume number. */
    protected Long bookVolumeNumber;
    
    /** The book sequence number. */
    protected Long bookSequenceNumber;
    
    /** The book doi. */
    protected String bookDOI;
    
    /** The book title id. */
    protected Long bookTitleID;
    
    /** The book print isbn. */
    protected String bookPrintISBN;
    
    /** The book electronic isbn. */
    protected String bookElectronicISBN;
    
    /** The book chapter count. */
    protected Long bookChapterCount;
    
    /** The book copyright. */
    protected BookCopyrightImpl bookCopyright;
    
    /** The book subject group. */
    protected BookSubjectGroupImpl bookSubjectGroup;
    
    /** The book context. */
    protected SeriesIDImpl bookContext;
    
    /** The book product type. */
    protected String bookProductType;
    
    /** The contains esm. */
    protected String containsESM;
    
    /** The language. */
    protected String language;
    
    /** The media type. */
    protected String mediaType;
    
    /** The numbering style. */
    protected String numberingStyle;
    
    /** The numbering depth. */
    protected Long numberingDepth;
    
    /** The output medium. */
    protected String outputMedium;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookID()
     */
    public String getBookID() {
        return bookID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookID(java.lang.String)
     */
    public void setBookID(String value) {
        bookID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookTitle()
     */
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookTitle(com.springer.api.schema.BookTitle)
     */
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookSubTitle()
     */
    public String getBookSubTitle() {
        return bookSubTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookSubTitle(java.lang.String)
     */
    public void setBookSubTitle(String value) {
        bookSubTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookVolumeNumber()
     */
    public Long getBookVolumeNumber() {
        return bookVolumeNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookVolumeNumber(java.lang.Long)
     */
    public void setBookVolumeNumber(Long value) {
        bookVolumeNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookSequenceNumber()
     */
    public Long getBookSequenceNumber() {
        return bookSequenceNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookSequenceNumber(java.lang.Long)
     */
    public void setBookSequenceNumber(Long value) {
        bookSequenceNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookDOI()
     */
    public String getBookDOI() {
        return bookDOI;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookDOI(java.lang.String)
     */
    public void setBookDOI(String value) {
        bookDOI = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookTitleID()
     */
    public Long getBookTitleID() {
        return bookTitleID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookTitleID(java.lang.Long)
     */
    public void setBookTitleID(Long value) {
        bookTitleID = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookPrintISBN()
     */
    public String getBookPrintISBN() {
        return bookPrintISBN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookPrintISBN(java.lang.String)
     */
    public void setBookPrintISBN(String value) {
        bookPrintISBN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookElectronicISBN()
     */
    public String getBookElectronicISBN() {
        return bookElectronicISBN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookElectronicISBN(java.lang.String)
     */
    public void setBookElectronicISBN(String value) {
        bookElectronicISBN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookChapterCount()
     */
    public Long getBookChapterCount() {
        return bookChapterCount;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookChapterCount(java.lang.Long)
     */
    public void setBookChapterCount(Long value) {
        bookChapterCount = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookCopyright()
     */
    public BookCopyright getBookCopyright() {
        return bookCopyright;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookCopyright(com.springer.api.schema.BookCopyright)
     */
    public void setBookCopyright(BookCopyright value) {
        bookCopyright = ((BookCopyrightImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookSubjectGroup()
     */
    public BookSubjectGroup getBookSubjectGroup() {
        return bookSubjectGroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookSubjectGroup(com.springer.api.schema.BookSubjectGroup)
     */
    public void setBookSubjectGroup(BookSubjectGroup value) {
        bookSubjectGroup = ((BookSubjectGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookContext()
     */
    public SeriesID getBookContext() {
        return bookContext;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookContext(com.springer.api.schema.SeriesID)
     */
    public void setBookContext(SeriesID value) {
        bookContext = ((SeriesIDImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getBookProductType()
     */
    public String getBookProductType() {
        return bookProductType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setBookProductType(java.lang.String)
     */
    public void setBookProductType(String value) {
        bookProductType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getContainsESM()
     */
    public String getContainsESM() {
        return containsESM;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setContainsESM(java.lang.String)
     */
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getMediaType()
     */
    public String getMediaType() {
        return mediaType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setMediaType(java.lang.String)
     */
    public void setMediaType(String value) {
        mediaType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getNumberingStyle()
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setNumberingStyle(java.lang.String)
     */
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getNumberingDepth()
     */
    public Long getNumberingDepth() {
        return numberingDepth;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setNumberingDepth(java.lang.Long)
     */
    public void setNumberingDepth(Long value) {
        numberingDepth = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookInfo#setTocLevels(java.lang.Long)
     */
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setBookProductType(XppUtils.getAttributeValueFromNode(parser, "BookProductType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setMediaType(XppUtils.getAttributeValueFromNode(parser, "MediaType"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setNumberingDepth(XppUtils.getAttributeValueAsLongFromNode(parser, "NumberingDepth"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookID")) {
                setBookID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else if (name.equals("BookSubTitle")) {
                setBookSubTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookVolumeNumber")) {
                setBookVolumeNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookSequenceNumber")) {
                setBookSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitleID")) {
                setBookTitleID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookPrintISBN")) {
                setBookPrintISBN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookElectronicISBN")) {
                setBookElectronicISBN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookChapterCount")) {
                setBookChapterCount(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookCopyright")) {
                BookCopyrightImpl node = new BookCopyrightImpl();
                node.init(parser);
                setBookCopyright(node);
            } else if (name.equals("BookSubjectGroup")) {
                BookSubjectGroupImpl node = new BookSubjectGroupImpl();
                node.init(parser);
                setBookSubjectGroup(node);
            } else if (name.equals("BookContext")) {
                SeriesIDImpl node = new SeriesIDImpl();
                node.init(parser);
                setBookContext(node);
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
