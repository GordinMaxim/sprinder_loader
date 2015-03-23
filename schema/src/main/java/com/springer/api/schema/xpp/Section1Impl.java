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
import com.springer.api.schema.Section1;
import com.springer.api.schema.Section2;
import com.springer.api.schema.Table;

/**
 * The Class Section1Impl.
 */
public class Section1Impl extends BaseSchemaEntity implements Section1 {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The tables. */
    protected List<Table> tables;
    
    /** The paras. */
    protected List<Para> paras;
    
    /** The section2 s. */
    protected List<Section2> section2S;
    
    /** The formal paras. */
    protected List<FormalPara> formalParas;
    
    /** The figures. */
    protected List<Figure> figures;    
    
    /** The id. */
    protected String id;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getTable()
     */
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getFigures()
     */
    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getParas()
     */
    public List<Para> getParas() {
        if (paras == null) {
            paras = new ArrayList<Para>();
        }
        return this.paras;
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
     * @see com.springer.api.schema.Section1#getSection2s()
     */
    public List<Section2> getSection2s() {
        if (section2S == null) {
            section2S = new ArrayList<Section2>();
        }
        return this.section2S;
    }
    
    /**
     * Sets the section2s.
     * 
     * @param value the new section2s
     */
    public void setSection2s(List<Section2> value) {
        this.section2S = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#getFormalParas()
     */
    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section1#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
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
            } else if (name.equals("Section2")) {
                Section2Impl node = new Section2Impl();
                node.init(parser);
                getSection2s().add(node);
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
