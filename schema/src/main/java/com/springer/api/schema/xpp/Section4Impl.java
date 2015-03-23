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
 * The Class Section4Impl.
 */
public class Section4Impl extends BaseSchemaEntity implements Section4 {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The figures. */
    protected List<Figure> figures;
    
    /** The paras. */
    protected List<Para> paras;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section4#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section4#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section4#getFigures()
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
     * @see com.springer.api.schema.Section4#getParas()
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
     * @see com.springer.api.schema.Section4#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Section4#setID(java.lang.String)
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
