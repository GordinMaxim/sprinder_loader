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

import com.springer.api.schema.EquationSource;
import com.springer.api.schema.ImageObject;
import com.springer.api.schema.InlineEquation;

/**
 * The Class InlineEquationImpl.
 */
public class InlineEquationImpl extends BaseSchemaEntity implements InlineEquation {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The inline media object. */
    protected ImageObjectImpl inlineMediaObject;
    
    /** The equation source. */
    protected EquationSourceImpl equationSource;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#getInlineMediaObject()
     */
    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#setInlineMediaObject(com.springer.api.schema.ImageObject)
     */
    public void setInlineMediaObject(ImageObject value) {
        inlineMediaObject = ((ImageObjectImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#getEquationSource()
     */
    public EquationSource getEquationSource() {
        return equationSource;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#setEquationSource(com.springer.api.schema.EquationSource)
     */
    public void setEquationSource(EquationSource value) {
        equationSource = ((EquationSourceImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.InlineEquation#setID(java.lang.String)
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
            if (name.equals("InlineMediaObject")) {
                ImageObjectImpl node = new ImageObjectImpl();
                node.init(parser);
                setInlineMediaObject(node);
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
