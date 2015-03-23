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

import com.springer.api.schema.Images;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.Result;

/**
 * The Class ResultImpl.
 */
public class ResultImpl extends BaseSchemaEntity implements Result {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The publisher. */
    protected PublisherImpl publisher;
    
    /** The images. */
    protected ImagesImpl images;
    
    /** The total. */
    protected Long total;
    
    /** The start. */
    protected Long start;
    
    /** The page length. */
    protected Long pageLength;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#getPublisher()
     */
    public Publisher getPublisher() {
        return publisher;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#setPublisher(com.springer.api.schema.Publisher)
     */
    public void setPublisher(Publisher value) {
        publisher = ((PublisherImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#getImages()
     */
    public Images getImages() {
        return images;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#setImages(com.springer.api.schema.Images)
     */
    public void setImages(Images value) {
        images = ((ImagesImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#getTotal()
     */
    public Long getTotal() {
        return total;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#setTotal(java.lang.Long)
     */
    public void setTotal(Long value) {
        total = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#getStart()
     */
    public Long getStart() {
        return start;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#setStart(java.lang.Long)
     */
    public void setStart(Long value) {
        start = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#getPageLength()
     */
    public Long getPageLength() {
        return pageLength;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Result#setPageLength(java.lang.Long)
     */
    public void setPageLength(Long value) {
        pageLength = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Publisher")) {
                PublisherImpl node = new PublisherImpl();
                node.init(parser);
                setPublisher(node);
            } else if (name.equals("Images")) {
                ImagesImpl node = new ImagesImpl();
                node.init(parser);
                setImages(node);
            } else if (name.equals("total")) {
                setTotal(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("start")) {
                setStart(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("pageLength")) {
                setPageLength(XppUtils.getElementValueAsLongFromNode(parser));
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
