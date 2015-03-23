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

import com.springer.api.schema.Figure;
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section3;
import com.springer.api.schema.Section4;
import com.springer.api.schema.Table;

/**
 * The Class Section3Impl.
 */
public class Section3Impl extends BaseSchemaEntity implements Section3 {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The section4 s. */
    protected List<Section4> section4S;
    
    /** The paras. */
    protected List<Para> paras;
    
    /** The formal paras. */
    protected List<FormalPara> formalParas;
    
    /** The figures. */
    protected List<Figure> figures;
    
    /** The tables. */
    protected List<Table> tables;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getSection4s()
     */
    public List<Section4> getSection4s() {
        if (section4S == null) {
            section4S = new ArrayList<Section4>();
        }
        return this.section4S;
    }
    
    /**
     * Sets the section4s.
     * 
     * @param value the new section4s
     */
    public void setSection4s(List<Section4> value) {
        this.section4S = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getParas()
     */
    public List<Para> getParas() {
        if (paras == null) {
            paras = new ArrayList<Para>();
        }
        return this.paras;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getFormalParas()
     */
    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }
    
    /**
     * Sets the paras.
     * 
     * @param value the new paras
     */
    public void setParas(List<Para> value) {
        this.paras = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getFigures()
     */
    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getTables()
     */
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section3#setID(java.lang.String)
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
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Section4")) {
                Section4Impl node = new Section4Impl();
                node.init(parser);
                getSection4s().add(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getParas().add(node);
            } else if (name.equals("FormalPara")) {
            	FormalParaImpl node = new FormalParaImpl();
                node.init(parser);
                getFormalParas().add(node);
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigures().add(node);
            } else if (name.equals("Table")) {
            	TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
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
