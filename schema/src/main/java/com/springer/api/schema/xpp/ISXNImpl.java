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

import com.springer.api.schema.ISXN;

/**
 * The Class ISXNImpl.
 */
public class ISXNImpl extends BaseSchemaEntity implements ISXN {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    protected String value;
    
    /** The eisbn. */
    protected String eisbn;
    
    /** The isbn. */
    protected String isbn;
    
    /** The issn. */
    protected String issn;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#getValue()
     */
    public String getValue() {
        return value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#setValue(java.lang.String)
     */
    public void setValue(String value) {
        value = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#getEISBN()
     */
    public String getEISBN() {
        return eisbn;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#setEISBN(java.lang.String)
     */
    public void setEISBN(String value) {
        eisbn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#getISBN()
     */
    public String getISBN() {
        return isbn;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#setISBN(java.lang.String)
     */
    public void setISBN(String value) {
        isbn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#getISSN()
     */
    public String getISSN() {
        return issn;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ISXN#setISSN(java.lang.String)
     */
    public void setISSN(String value) {
        issn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setEISBN(XppUtils.getAttributeValueFromNode(parser, "EISBN"));
        setISBN(XppUtils.getAttributeValueFromNode(parser, "ISBN"));
        setISSN(XppUtils.getAttributeValueFromNode(parser, "ISSN"));
        setValue(XppUtils.getElementValueFromNode(parser));        
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
