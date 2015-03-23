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
import com.springer.api.schema.*;

/**
 * The Class Section2Impl.
 */
public class Section2Impl extends BaseSchemaEntity implements Section2 {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The figures. */
    protected List<Figure> figures;
    
    /** The paras. */
    protected List<Para> paras;
    
    /** The tables. */
    protected List<Table> tables;
    
    /** The section3 s. */
    protected List<Section3> section3S;
    
    /** The formal paras. */
    protected List<FormalPara> formalParas;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getFigures()
     */
    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }
    
    /**
     * Sets the figures.
     * 
     * @param value the new figures
     */
    public void setFigures(List<Figure> value) {
        this.figures = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getParas()
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
     * @see com.springer.api.schema.Section2#getTables()
     */
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    
    /**
     * Sets the tables.
     * 
     * @param value the new tables
     */
    public void setTables(List<Table> value) {
        this.tables = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getSection3s()
     */
    public List<Section3> getSection3s() {
        if (section3S == null) {
            section3S = new ArrayList<Section3>();
        }
        return this.section3S;
    }
    
    /**
     * Sets the section3s.
     * 
     * @param value the new section3s
     */
    public void setSection3s(List<Section3> value) {
        this.section3S = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getFormalParas()
     */
    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }
    
    /**
     * Sets the formal paras.
     * 
     * @param value the new formal paras
     */
    public void setFormalParas(List<FormalPara> value) {
        this.formalParas = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section2#setID(java.lang.String)
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
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigures().add(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getParas().add(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
            } else if (name.equals("Section3")) {
                Section3Impl node = new Section3Impl();
                node.init(parser);
                getSection3s().add(node);
            } else if (name.equals("FormalPara")) {
                FormalParaImpl node = new FormalParaImpl();
                node.init(parser);
                getFormalParas().add(node);
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
