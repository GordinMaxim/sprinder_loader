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

import com.springer.api.schema.Caption;
import com.springer.api.schema.Figure;
import com.springer.api.schema.MediaObject;

/**
 * The Class FigureImpl.
 */
public class FigureImpl extends BaseSchemaEntity implements Figure {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The caption. */
    protected CaptionImpl caption;
    
    /** The media object. */
    protected MediaObjectImpl mediaObject;
    
    /** The category. */
    protected String category;
    
    /** The _float. */
    protected String _float;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#getCaption()
     */
    public Caption getCaption() {
        return caption;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#setCaption(com.springer.api.schema.Caption)
     */
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#getMediaObject()
     */
    public MediaObject getMediaObject() {
        return mediaObject;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#setMediaObject(com.springer.api.schema.MediaObject)
     */
    public void setMediaObject(MediaObject value) {
        mediaObject = ((MediaObjectImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#getCategory()
     */
    public String getCategory() {
        return category;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#setCategory(java.lang.String)
     */
    public void setCategory(String value) {
        category = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#getFloat()
     */
    public String getFloat() {
        return _float;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#setFloat(java.lang.String)
     */
    public void setFloat(String value) {
        _float = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Figure#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setCategory(XppUtils.getAttributeValueFromNode(parser, "Category"));
        setFloat(XppUtils.getAttributeValueFromNode(parser, "Float"));
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                setMediaObject(node);
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
