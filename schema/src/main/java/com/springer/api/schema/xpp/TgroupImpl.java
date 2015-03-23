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

import com.springer.api.schema.Colspec;
import com.springer.api.schema.Tbody;
import com.springer.api.schema.Tgroup;
import com.springer.api.schema.Thead;

/**
 * The Class TgroupImpl.
 */
public class TgroupImpl extends BaseSchemaEntity implements Tgroup {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The colspecs. */
    protected List<Colspec> colspecs;
    
    /** The thead. */
    protected TheadImpl thead;
    
    /** The tbody. */
    protected TbodyImpl tbody;
    
    /** The align. */
    protected String align;
    
    /** The cols. */
    protected Long cols;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#getColspecs()
     */
    public List<Colspec> getColspecs() {
        if (colspecs == null) {
            colspecs = new ArrayList<Colspec>();
        }
        return this.colspecs;
    }
    
    /**
     * Sets the colspecs.
     * 
     * @param value the new colspecs
     */
    public void setColspecs(List<Colspec> value) {
        this.colspecs = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#getThead()
     */
    public Thead getThead() {
        return thead;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#setThead(com.springer.api.schema.Thead)
     */
    public void setThead(Thead value) {
        thead = ((TheadImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#getTbody()
     */
    public Tbody getTbody() {
        return tbody;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#setTbody(com.springer.api.schema.Tbody)
     */
    public void setTbody(Tbody value) {
        tbody = ((TbodyImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#getAlign()
     */
    public String getAlign() {
        return align;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#setAlign(java.lang.String)
     */
    public void setAlign(String value) {
        align = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#getCols()
     */
    public Long getCols() {
        return cols;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Tgroup#setCols(java.lang.Long)
     */
    public void setCols(Long value) {
        cols = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAlign(XppUtils.getAttributeValueFromNode(parser, "align"));
        setCols(XppUtils.getAttributeValueAsLongFromNode(parser, "cols"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("colspec")) {
                ColspecImpl node = new ColspecImpl();
                node.init(parser);
                getColspecs().add(node);
            } else if (name.equals("thead")) {
                TheadImpl node = new TheadImpl();
                node.init(parser);
                setThead(node);
            } else if (name.equals("tbody")) {
                TbodyImpl node = new TbodyImpl();
                node.init(parser);
                setTbody(node);
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
