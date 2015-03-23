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

import com.springer.api.schema.Entry;
import com.springer.api.schema.SimplePara;

/**
 * The Class EntryImpl.
 */
public class EntryImpl extends BaseSchemaEntity implements Entry {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The simple para. */
    protected SimpleParaImpl simplePara;
    
    /** The align. */
    protected String align;
    
    /** The colname. */
    protected String colname;
    
    /** The morerows. */
    protected Long morerows;
    
    /** The nameend. */
    protected String nameend;
    
    /** The namest. */
    protected String namest;
    
    /** The _char. */
    protected String _char;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getChar()
     */
    public String getChar() {
        return _char;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setChar(java.lang.String)
     */
    public void setChar(String value) {
        this._char = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getSimplePara()
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setSimplePara(com.springer.api.schema.SimplePara)
     */
    public void setSimplePara(SimplePara value) {
        simplePara = ((SimpleParaImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getAlign()
     */
    public String getAlign() {
        return align;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setAlign(java.lang.String)
     */
    public void setAlign(String value) {
        align = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getColname()
     */
    public String getColname() {
        return colname;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setColname(java.lang.String)
     */
    public void setColname(String value) {
        colname = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getMorerows()
     */
    public Long getMorerows() {
        return morerows;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setMorerows(java.lang.Long)
     */
    public void setMorerows(Long value) {
        morerows = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getNameend()
     */
    public String getNameend() {
        return nameend;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setNameend(java.lang.String)
     */
    public void setNameend(String value) {
        nameend = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#getNamest()
     */
    public String getNamest() {
        return namest;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Entry#setNamest(java.lang.String)
     */
    public void setNamest(String value) {
        namest = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAlign(XppUtils.getAttributeValueFromNode(parser, "align"));
        setColname(XppUtils.getAttributeValueFromNode(parser, "colname"));
        setMorerows(XppUtils.getAttributeValueAsLongFromNode(parser, "morerows"));
        setNameend(XppUtils.getAttributeValueFromNode(parser, "nameend"));
        setNamest(XppUtils.getAttributeValueFromNode(parser, "namest"));
        setChar(XppUtils.getAttributeValueFromNode(parser, "char"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                setSimplePara(node);
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
