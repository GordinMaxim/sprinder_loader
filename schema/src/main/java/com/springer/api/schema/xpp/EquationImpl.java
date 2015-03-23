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

import com.springer.api.schema.Equation;
import com.springer.api.schema.EquationSource;
import com.springer.api.schema.MediaObject;

/**
 * The Class EquationImpl.
 */
public class EquationImpl extends BaseSchemaEntity implements Equation {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The equation number. */
    protected String equationNumber;
    
    /** The media object. */
    protected MediaObjectImpl mediaObject;
    
    /** The equation source. */
    protected EquationSourceImpl equationSource;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#getEquationNumber()
     */
    public String getEquationNumber() {
        return equationNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#setEquationNumber(java.lang.Long)
     */
    public void setEquationNumber(String value) {
        equationNumber = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#getMediaObject()
     */
    public MediaObject getMediaObject() {
        return mediaObject;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#setMediaObject(com.springer.api.schema.MediaObject)
     */
    public void setMediaObject(MediaObject value) {
        mediaObject = ((MediaObjectImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#getEquationSource()
     */
    public EquationSource getEquationSource() {
        return equationSource;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#setEquationSource(com.springer.api.schema.EquationSource)
     */
    public void setEquationSource(EquationSource value) {
        equationSource = ((EquationSourceImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Equation#setID(java.lang.String)
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
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("EquationNumber")) {
                setEquationNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                setMediaObject(node);
            } else if (name.equals("EquationSource")) {
                EquationSourceImpl node = new EquationSourceImpl();
                node.init(parser);
                setEquationSource(node);
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
