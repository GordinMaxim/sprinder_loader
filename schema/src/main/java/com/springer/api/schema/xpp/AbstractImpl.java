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

import com.springer.api.schema.Abstract;
import com.springer.api.schema.AbstractSection;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;

/**
 * The Class AbstractImpl.
 */
public class AbstractImpl extends BaseSchemaEntity implements Abstract {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The para. */
    protected ParaImpl para;
    
    /** The abstract sections. */
    protected List<AbstractSection> abstractSections;
    
    /** The id. */
    protected String id;
    
    /** The language. */
    protected String language;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getPara()
     */
    public Para getPara() {
        return para;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#setPara(com.springer.api.schema.Para)
     */
    public void setPara(Para value) {
        para = ((ParaImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getAbstractSections()
     */
    public List<AbstractSection> getAbstractSections() {
        if (abstractSections == null) {
            abstractSections = new ArrayList<AbstractSection>();
        }
        return this.abstractSections;
    }
    
    /**
     * Sets the abstract sections.
     * 
     * @param value the new abstract sections
     */
    public void setAbstractSections(List<AbstractSection> value) {
        this.abstractSections = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Abstract#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                setPara(node);
            } else if (name.equals("AbstractSection")) {
                AbstractSectionImpl node = new AbstractSectionImpl();
                node.init(parser);
                getAbstractSections().add(node);
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
