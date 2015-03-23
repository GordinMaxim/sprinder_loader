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

import com.springer.api.schema.Journal;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.PublisherInfo;
import com.springer.api.schema.Series;
import com.springer.app.meta.Info;
import com.springer.app.meta.xpp.InfoImpl;

/**
 * The Class PublisherImpl.
 */
public class PublisherImpl extends BaseSchemaEntity implements Publisher {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The publisher info. */
    protected PublisherInfoImpl publisherInfo;
    
    /** The journal. */
    protected JournalImpl journal;
    
    /** The info. */
    protected InfoImpl info;
    
    /** The lang. */
    protected String lang;
    
    /** The series. */
    protected SeriesImpl series;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#getPublisherInfo()
     */
    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#setPublisherInfo(com.springer.api.schema.PublisherInfo)
     */
    public void setPublisherInfo(PublisherInfo value) {
        publisherInfo = ((PublisherInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#getJournal()
     */
    public Journal getJournal() {
        return journal;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#setJournal(com.springer.api.schema.Journal)
     */
    public void setJournal(Journal value) {
        journal = ((JournalImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#getInfo()
     */
    public Info getInfo() {
        return info;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#setInfo(com.springer.app.meta.Info)
     */
    public void setInfo(Info value) {
        info = ((InfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#getLang()
     */
    public String getLang() {
        return lang;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#setLang(java.lang.String)
     */
    public void setLang(String value) {
        lang = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#getSeries()
     */
    public Series getSeries() {
        return series;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Publisher#setSeries(com.springer.api.schema.Series)
     */
    public void setSeries(Series value) {
        this.series = ((SeriesImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setLang(XppUtils.getAttributeValueFromNode(parser, "lang"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PublisherInfo")) {
                PublisherInfoImpl node = new PublisherInfoImpl();
                node.init(parser);
                setPublisherInfo(node);
            } else if (name.equals("Journal")) {
                JournalImpl node = new JournalImpl();
                node.init(parser);
                setJournal(node);
            } else if (name.equals("Series")) {
            	SeriesImpl node = new SeriesImpl();
                node.init(parser);
                setSeries(node);
            } else if (name.equals("meta:Info")) {
            	InfoImpl node = new InfoImpl();
            	node.init(parser);
                setInfo(node);
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
