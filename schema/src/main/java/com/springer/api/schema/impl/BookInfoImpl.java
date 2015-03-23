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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.BookCopyright;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.SeriesID;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookID",
    "bookTitle",
    "bookSubTitle",
    "bookVolumeNumber",
    "bookSequenceNumber",
    "bookDOI",
    "bookTitleID",
    "bookPrintISBN",
    "bookElectronicISBN",
    "bookChapterCount",
    "bookCopyright",
    "bookSubjectGroup",
    "bookContext"
})
@XmlRootElement(name = "BookInfo")
public class BookInfoImpl
    implements Serializable, BookInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BookID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookID;
    @XmlElement(name = "BookTitle", required = true, type = BookTitleImpl.class)
    protected BookTitleImpl bookTitle;
    @XmlElement(name = "BookSubTitle", required = true)
    protected String bookSubTitle;
    @XmlElement(name = "BookVolumeNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long bookVolumeNumber;
    @XmlElement(name = "BookSequenceNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long bookSequenceNumber;
    @XmlElement(name = "BookDOI", required = true)
    protected String bookDOI;
    @XmlElement(name = "BookTitleID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long bookTitleID;
    @XmlElement(name = "BookPrintISBN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookPrintISBN;
    @XmlElement(name = "BookElectronicISBN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookElectronicISBN;
    @XmlElement(name = "BookChapterCount", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long bookChapterCount;
    @XmlElement(name = "BookCopyright", required = true, type = BookCopyrightImpl.class)
    protected BookCopyrightImpl bookCopyright;
    @XmlElement(name = "BookSubjectGroup", required = true, type = BookSubjectGroupImpl.class)
    protected BookSubjectGroupImpl bookSubjectGroup;
    @XmlElement(name = "BookContext", required = true, type = SeriesIDImpl.class)
    protected SeriesIDImpl bookContext;
    @XmlAttribute(name = "BookProductType", required = true)
    protected String bookProductType;
    @XmlAttribute(name = "ContainsESM", required = true)
    protected String containsESM;
    @XmlAttribute(name = "Language", required = true)
    protected String language;
    @XmlAttribute(name = "MediaType", required = true)
    protected String mediaType;
    @XmlAttribute(name = "NumberingStyle", required = true)
    protected String numberingStyle;
    @XmlAttribute(name = "NumberingDepth")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long numberingDepth;
    @XmlAttribute(name = "OutputMedium", required = true)
    protected String outputMedium;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String value) {
        this.bookID = value;
    }

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(BookTitle value) {
        this.bookTitle = ((BookTitleImpl) value);
    }

    public String getBookSubTitle() {
        return bookSubTitle;
    }

    public void setBookSubTitle(String value) {
        this.bookSubTitle = value;
    }

    public Long getBookVolumeNumber() {
        return bookVolumeNumber;
    }

    public void setBookVolumeNumber(Long value) {
        this.bookVolumeNumber = value;
    }

    public Long getBookSequenceNumber() {
        return bookSequenceNumber;
    }

    public void setBookSequenceNumber(Long value) {
        this.bookSequenceNumber = value;
    }

    public String getBookDOI() {
        return bookDOI;
    }

    public void setBookDOI(String value) {
        this.bookDOI = value;
    }

    public Long getBookTitleID() {
        return bookTitleID;
    }

    public void setBookTitleID(Long value) {
        this.bookTitleID = value;
    }

    public String getBookPrintISBN() {
        return bookPrintISBN;
    }

    public void setBookPrintISBN(String value) {
        this.bookPrintISBN = value;
    }

    public String getBookElectronicISBN() {
        return bookElectronicISBN;
    }

    public void setBookElectronicISBN(String value) {
        this.bookElectronicISBN = value;
    }

    public Long getBookChapterCount() {
        return bookChapterCount;
    }

    public void setBookChapterCount(Long value) {
        this.bookChapterCount = value;
    }

    public BookCopyright getBookCopyright() {
        return bookCopyright;
    }

    public void setBookCopyright(BookCopyright value) {
        this.bookCopyright = ((BookCopyrightImpl) value);
    }

    public BookSubjectGroup getBookSubjectGroup() {
        return bookSubjectGroup;
    }

    public void setBookSubjectGroup(BookSubjectGroup value) {
        this.bookSubjectGroup = ((BookSubjectGroupImpl) value);
    }

    public SeriesID getBookContext() {
        return bookContext;
    }

    public void setBookContext(SeriesID value) {
        this.bookContext = ((SeriesIDImpl) value);
    }

    public String getBookProductType() {
        return bookProductType;
    }

    public void setBookProductType(String value) {
        this.bookProductType = value;
    }

    public String getContainsESM() {
        return containsESM;
    }

    public void setContainsESM(String value) {
        this.containsESM = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String value) {
        this.mediaType = value;
    }

    public String getNumberingStyle() {
        return numberingStyle;
    }

    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

    public Long getNumberingDepth() {
        return numberingDepth;
    }

    public void setNumberingDepth(Long value) {
        this.numberingDepth = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
