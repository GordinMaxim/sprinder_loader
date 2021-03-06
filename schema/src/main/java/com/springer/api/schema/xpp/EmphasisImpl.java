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

import com.springer.api.schema.Emphasis;

/**
 * The Class EmphasisImpl.
 */
public class EmphasisImpl extends BaseSchemaEntity implements Emphasis {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The content. */
    protected List<Object> content;    
    
    /** The type. */
    protected String type;
    
    /** The font category. */
    protected String fontCategory;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Emphasis#getContent()
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Emphasis#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Emphasis#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Emphasis#getFontCategory()
     */
    public String getFontCategory() {
        return fontCategory;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Emphasis#setFontCategory(java.lang.String)
     */
    public void setFontCategory(String value) {
        this.fontCategory = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        setFontCategory(XppUtils.getAttributeValueFromNode(parser, "FontCategory"));
        int eventType = parser.next();
        while (eventType == XmlPullParser.START_TAG || eventType == XmlPullParser.TEXT) {
        	if (eventType == XmlPullParser.START_TAG) {
                String name = parser.getName();
                if (name.equals("Emphasis")) {
                    EmphasisImpl node = new EmphasisImpl();
                    node.init(parser);
                    getContent().add(node);
                } else if (name.equals("Superscript")) {
                    SuperscriptImpl node = new SuperscriptImpl();
                    node.init(parser);
                    getContent().add(node);
                } else if (name.equals("Subscript")) {
                	SubscriptImpl node = new SubscriptImpl();
                    node.init(parser);
                    getContent().add(node);
                } else {                // Consume something we don't understand.
                    LOG.warning("Found tag that we don't recognize: " + name);
                    XppUtils.skipSubTree(parser);
                }
        	} else {
        		getContent().add(parser.getText());
        	}
        	eventType = parser.next();
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
