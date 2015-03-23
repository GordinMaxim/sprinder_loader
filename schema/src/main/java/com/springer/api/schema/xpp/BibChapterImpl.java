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
import com.springer.api.schema.*;

/**
 * The Class BibChapterImpl.
 */
public class BibChapterImpl extends BaseSchemaEntity implements BibChapter {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The bib author names. */
    protected List<BibAuthorName> bibAuthorNames;
    
    /** The year. */
    protected String year;
    
    /** The chapter title. */
    protected ChapterTitleImpl chapterTitle;
    
    /** The bib editor names. */
    protected List<BibEditorName> bibEditorNames;
    
    /** The eds. */
    protected EdsImpl eds;
    
    /** The book title. */
    protected BookTitleImpl bookTitle;
    
    /** The conf event name. */
    protected String confEventName;
    
    /** The conf event location. */
    protected String confEventLocation;
    
    /** The conf event date. */
    protected String confEventDate;
    
    /** The edition number. */
    protected Long editionNumber;
    
    /** The series title. */
    protected SeriesTitleImpl seriesTitle;
    
    /** The publisher name. */
    protected String publisherName;
    
    /** The publisher location. */
    protected String publisherLocation;
    
    /** The bib comments. */
    protected BibCommentsImpl bibComments;
    
    /** The number in series. */
    protected String numberInSeries;
    
    /** The first page. */
    protected String firstPage;
    
    /** The last page. */
    protected String lastPage;
    
    /** The occurrence. */
    protected OccurrenceImpl occurrence;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getBibAuthorNames()
     */
    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }
    
    /**
     * Sets the bib author names.
     * 
     * @param value the new bib author names
     */
    public void setBibAuthorNames(List<BibAuthorName> value) {
        this.bibAuthorNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getYear()
     */
    public String getYear() {
        return year;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setYear(java.lang.String)
     */
    public void setYear(String value) {
        year = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getChapterTitle()
     */
    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setChapterTitle(com.springer.api.schema.ChapterTitle)
     */
    public void setChapterTitle(ChapterTitle value) {
        chapterTitle = ((ChapterTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getBibEditorNames()
     */
    public List<BibEditorName> getBibEditorNames() {
        if (bibEditorNames == null) {
            bibEditorNames = new ArrayList<BibEditorName>();
        }
        return this.bibEditorNames;
    }
    
    /**
     * Sets the bib editor names.
     * 
     * @param value the new bib editor names
     */
    public void setBibEditorNames(List<BibEditorName> value) {
        this.bibEditorNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getEds()
     */
    public Eds getEds() {
        return eds;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setEds(com.springer.api.schema.Eds)
     */
    public void setEds(Eds value) {
        eds = ((EdsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getBookTitle()
     */
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setBookTitle(com.springer.api.schema.BookTitle)
     */
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getConfEventName()
     */
    public String getConfEventName() {
        return confEventName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setConfEventName(java.lang.String)
     */
    public void setConfEventName(String value) {
        confEventName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getConfEventLocation()
     */
    public String getConfEventLocation() {
        return confEventLocation;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setConfEventLocation(java.lang.String)
     */
    public void setConfEventLocation(String value) {
        confEventLocation = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getConfEventDate()
     */
    public String getConfEventDate() {
        return confEventDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setConfEventDate(java.lang.String)
     */
    public void setConfEventDate(String value) {
        confEventDate = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getEditionNumber()
     */
    public Long getEditionNumber() {
        return editionNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setEditionNumber(java.lang.Long)
     */
    public void setEditionNumber(Long value) {
        editionNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getSeriesTitle()
     */
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setSeriesTitle(com.springer.api.schema.SeriesTitle)
     */
    public void setSeriesTitle(SeriesTitle value) {
        seriesTitle = ((SeriesTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getPublisherName()
     */
    public String getPublisherName() {
        return publisherName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setPublisherName(java.lang.String)
     */
    public void setPublisherName(String value) {
        publisherName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getPublisherLocation()
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setPublisherLocation(java.lang.String)
     */
    public void setPublisherLocation(String value) {
        publisherLocation = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getBibComments()
     */
    public BibComments getBibComments() {
        return bibComments;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setBibComments(com.springer.api.schema.BibComments)
     */
    public void setBibComments(BibComments value) {
        bibComments = ((BibCommentsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getNumberInSeries()
     */
    public String getNumberInSeries() {
        return numberInSeries;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setNumberInSeries(java.lang.String)
     */
    public void setNumberInSeries(String value) {
        numberInSeries = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getFirstPage()
     */
    public String getFirstPage() {
        return firstPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setFirstPage(java.lang.String)
     */
    public void setFirstPage(String value) {
        firstPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getLastPage()
     */
    public String getLastPage() {
        return lastPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setLastPage(java.lang.String)
     */
    public void setLastPage(String value) {
        lastPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#getOccurrence()
     */
    public Occurrence getOccurrence() {
        return occurrence;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibChapter#setOccurrence(com.springer.api.schema.Occurrence)
     */
    public void setOccurrence(Occurrence value) {
        occurrence = ((OccurrenceImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorNames().add(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ChapterTitle")) {
                ChapterTitleImpl node = new ChapterTitleImpl();
                node.init(parser);
                setChapterTitle(node);
            } else if (name.equals("BibEditorName")) {
                BibEditorNameImpl node = new BibEditorNameImpl();
                node.init(parser);
                getBibEditorNames().add(node);
            } else if (name.equals("Eds")) {
                EdsImpl node = new EdsImpl();
                node.init(parser);
                setEds(node);
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else if (name.equals("ConfEventName")) {
                setConfEventName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ConfEventLocation")) {
                setConfEventLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ConfEventDate")) {
                setConfEventDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("EditionNumber")) {
                setEditionNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("SeriesTitle")) {
                SeriesTitleImpl node = new SeriesTitleImpl();
                node.init(parser);
                setSeriesTitle(node);
            } else if (name.equals("PublisherName")) {
                setPublisherName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherLocation")) {
                setPublisherLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibComments")) {
                BibCommentsImpl node = new BibCommentsImpl();
                node.init(parser);
                setBibComments(node);
            } else if (name.equals("NumberInSeries")) {
                setNumberInSeries(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FirstPage")) {
                setFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("LastPage")) {
                setLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Occurrence")) {
                OccurrenceImpl node = new OccurrenceImpl();
                node.init(parser);
                setOccurrence(node);
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
