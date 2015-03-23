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

import com.springer.api.schema.SeriesInfo;
import com.springer.api.schema.SeriesTitle;

/**
 * The Class SeriesInfoImpl.
 */
public class SeriesInfoImpl extends SeriesIDImpl implements SeriesInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The series print issn. */
    protected String seriesPrintISSN;
    
    /** The series electronic issn. */
    protected String seriesElectronicISSN;
    
    /** The series title. */
    protected SeriesTitleImpl seriesTitle;
    
    /** The series abbreviated title. */
    protected String seriesAbbreviatedTitle;
    
    /** The series type. */
    protected String seriesType;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getSeriesPrintISSN()
     */
    public String getSeriesPrintISSN() {
        return seriesPrintISSN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setSeriesPrintISSN(java.lang.String)
     */
    public void setSeriesPrintISSN(String value) {
        seriesPrintISSN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getSeriesElectronicISSN()
     */
    public String getSeriesElectronicISSN() {
        return seriesElectronicISSN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setSeriesElectronicISSN(java.lang.String)
     */
    public void setSeriesElectronicISSN(String value) {
        seriesElectronicISSN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getSeriesTitle()
     */
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setSeriesTitle(com.springer.api.schema.SeriesTitle)
     */
    public void setSeriesTitle(SeriesTitle value) {
        seriesTitle = ((SeriesTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getSeriesAbbreviatedTitle()
     */
    public String getSeriesAbbreviatedTitle() {
        return seriesAbbreviatedTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setSeriesAbbreviatedTitle(java.lang.String)
     */
    public void setSeriesAbbreviatedTitle(String value) {
        seriesAbbreviatedTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getSeriesType()
     */
    public String getSeriesType() {
        return seriesType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setSeriesType(java.lang.String)
     */
    public void setSeriesType(String value) {
        seriesType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.SeriesInfo#setTocLevels(java.lang.Long)
     */
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.SeriesIDImpl#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setSeriesType(XppUtils.getAttributeValueFromNode(parser, "SeriesType"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesID")) {
                setSeriesID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("SeriesPrintISSN")) {
                setSeriesPrintISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SeriesElectronicISSN")) {
                setSeriesElectronicISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SeriesTitle")) {
                SeriesTitleImpl node = new SeriesTitleImpl();
                node.init(parser);
                setSeriesTitle(node);
            } else if (name.equals("SeriesAbbreviatedTitle")) {
                setSeriesAbbreviatedTitle(XppUtils.getElementValueFromNode(parser));
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
