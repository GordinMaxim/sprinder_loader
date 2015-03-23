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

import com.springer.api.schema.Colspec;

/**
 * The Class ColspecImpl.
 */
public class ColspecImpl extends BaseSchemaEntity implements Colspec {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The colname. */
    protected String colname;
    
    /** The colnum. */
    protected Long colnum;
    
    /** The align. */
    protected String align;
    
    /** The _char. */
    protected String _char;    
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#getAlign()
     */
    public String getAlign() {
        return align;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#setAlign(java.lang.String)
     */
    public void setAlign(String value) {
        this.align = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#getColname()
     */
    public String getColname() {
        return colname;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#setColname(java.lang.String)
     */
    public void setColname(String value) {
        colname = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#getColnum()
     */
    public Long getColnum() {
        return colnum;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#setColnum(java.lang.Long)
     */
    public void setColnum(Long value) {
        colnum = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#getChar()
     */
    public String getChar() {
        return _char;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Colspec#setChar(java.lang.String)
     */
    public void setChar(String value) {
        this._char = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setColname(XppUtils.getAttributeValueFromNode(parser, "colname"));
        setColnum(XppUtils.getAttributeValueAsLongFromNode(parser, "colnum"));
        setAlign(XppUtils.getAttributeValueFromNode(parser, "align"));
        setChar(XppUtils.getAttributeValueFromNode(parser, "char"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            LOG.warning("Found tag that we don't recognize: " + name);
            XppUtils.skipSubTree(parser);
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
