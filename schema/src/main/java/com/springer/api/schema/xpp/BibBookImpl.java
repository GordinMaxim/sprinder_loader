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
 * The Class BibBookImpl.
 */
public class BibBookImpl extends BaseSchemaEntity implements BibBook {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The institutional author name. */
    protected String institutionalAuthorName;
    
    /** The bib author names. */
    protected List<BibAuthorName> bibAuthorNames;
    
    /** The bib editor name. */
    protected BibEditorNameImpl bibEditorName;
    
    /** The eds. */
    protected EdsImpl eds;
    
    /** The year. */
    protected String year;
    
    /** The book title. */
    protected BookTitleImpl bookTitle;
    
    /** The number in series. */
    protected String numberInSeries;
    
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
    
    /** The occurrences. */
    protected List<Occurrence> occurrences;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getInstitutionalAuthorName()
     */
    public String getInstitutionalAuthorName() {
        return institutionalAuthorName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setInstitutionalAuthorName(java.lang.String)
     */
    public void setInstitutionalAuthorName(String value) {
        institutionalAuthorName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getBibAuthorNames()
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
     * @see com.springer.api.schema.BibBook#getBibEditorName()
     */
    public BibEditorName getBibEditorName() {
        return bibEditorName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setBibEditorName(com.springer.api.schema.BibEditorName)
     */
    public void setBibEditorName(BibEditorName value) {
        bibEditorName = ((BibEditorNameImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getEds()
     */
    public Eds getEds() {
        return eds;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setEds(com.springer.api.schema.Eds)
     */
    public void setEds(Eds value) {
        eds = ((EdsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getYear()
     */
    public String getYear() {
        return year;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setYear(java.lang.String)
     */
    public void setYear(String value) {
        year = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getBookTitle()
     */
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setBookTitle(com.springer.api.schema.BookTitle)
     */
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getNumberInSeries()
     */
    public String getNumberInSeries() {
        return numberInSeries;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setNumberInSeries(java.lang.String)
     */
    public void setNumberInSeries(String value) {
        numberInSeries = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getEditionNumber()
     */
    public Long getEditionNumber() {
        return editionNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setEditionNumber(java.lang.Long)
     */
    public void setEditionNumber(Long value) {
        editionNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getSeriesTitle()
     */
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setSeriesTitle(com.springer.api.schema.SeriesTitle)
     */
    public void setSeriesTitle(SeriesTitle value) {
        seriesTitle = ((SeriesTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getPublisherName()
     */
    public String getPublisherName() {
        return publisherName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setPublisherName(java.lang.String)
     */
    public void setPublisherName(String value) {
        publisherName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getPublisherLocation()
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setPublisherLocation(java.lang.String)
     */
    public void setPublisherLocation(String value) {
        publisherLocation = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getBibComments()
     */
    public BibComments getBibComments() {
        return bibComments;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#setBibComments(com.springer.api.schema.BibComments)
     */
    public void setBibComments(BibComments value) {
        bibComments = ((BibCommentsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibBook#getOccurrences()
     */
    public List<Occurrence> getOccurrences() {
        if (occurrences == null) {
            occurrences = new ArrayList<Occurrence>();
        }
        return this.occurrences;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("InstitutionalAuthorName")) {
                setInstitutionalAuthorName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorNames().add(node);
            } else if (name.equals("BibEditorName")) {
                BibEditorNameImpl node = new BibEditorNameImpl();
                node.init(parser);
                setBibEditorName(node);
            } else if (name.equals("Eds")) {
                EdsImpl node = new EdsImpl();
                node.init(parser);
                setEds(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else if (name.equals("NumberInSeries")) {
                setNumberInSeries(XppUtils.getElementValueFromNode(parser));
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
            } else if (name.equals("Occurrence")) {
                OccurrenceImpl node = new OccurrenceImpl();
                node.init(parser);
                getOccurrences().add(node);
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
