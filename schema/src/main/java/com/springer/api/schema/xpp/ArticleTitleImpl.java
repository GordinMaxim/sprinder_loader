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

import com.springer.api.schema.ArticleTitle;

/**
 * The Class ArticleTitleImpl.
 */
public class ArticleTitleImpl extends BaseSchemaEntity implements ArticleTitle {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The language. */
    protected String language;
    
    /** The content. */
    protected List<Object> content;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleTitle#getContent()
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleTitle#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleTitle#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleTitle#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleTitle#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
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
                } else if (name.equals("InlineEquation")) {
                	InlineEquationImpl node = new InlineEquationImpl();
                    node.init(parser);
                    getContent().add(node);
                } else if (name.equals("em")) {
                	EmphasisImpl node = new EmphasisImpl();
                	node.getContent().add(XppUtils.getElementValueFromNode(parser));
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
