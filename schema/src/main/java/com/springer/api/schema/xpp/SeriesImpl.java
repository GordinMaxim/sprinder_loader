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
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Series;
import com.springer.api.schema.SeriesInfo;

/**
 * The Class SeriesImpl.
 */
public class SeriesImpl extends BaseSchemaEntity implements Series {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The series info. */
    protected SeriesInfoImpl seriesInfo;
    
    /** The series header. */
    protected EditorGroupImpl seriesHeader;
    
    /** The book. */
    protected BookImpl book;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#getSeriesInfo()
     */
    public SeriesInfo getSeriesInfo() {
        return seriesInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#setSeriesInfo(com.springer.api.schema.SeriesInfo)
     */
    public void setSeriesInfo(SeriesInfo value) {
        seriesInfo = ((SeriesInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#getSeriesHeader()
     */
    public EditorGroup getSeriesHeader() {
        return seriesHeader;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#setSeriesHeader(com.springer.api.schema.EditorGroup)
     */
    public void setSeriesHeader(EditorGroup value) {
        seriesHeader = ((EditorGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#getBook()
     */
    public Book getBook() {
        return book;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Series#setBook(com.springer.api.schema.Book)
     */
    public void setBook(Book value) {
        book = ((BookImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesInfo")) {
                SeriesInfoImpl node = new SeriesInfoImpl();
                node.init(parser);
                setSeriesInfo(node);
            } else if (name.equals("SeriesHeader")) {
                EditorGroupImpl node = new EditorGroupImpl();
                node.init(parser);
                setSeriesHeader(node);
            } else if (name.equals("Book")) {
                BookImpl node = new BookImpl();
                node.init(parser);
                setBook(node);
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
