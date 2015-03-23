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

import com.springer.api.schema.BookSubject;

/**
 * The Class BookSubjectImpl.
 */
public class BookSubjectImpl extends BaseSchemaEntity implements BookSubject {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The content. */
    protected String content;
    
    /** The code. */
    protected String code;
    
    /** The priority. */
    protected Long priority;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#getContent()
     */
    public String getContent() {
        return content;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#setContent(java.lang.String)
     */
    public void setContent(String value) {
        content = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#getCode()
     */
    public String getCode() {
        return code;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#setCode(java.lang.String)
     */
    public void setCode(String value) {
        code = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#getPriority()
     */
    public Long getPriority() {
        return priority;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#setPriority(java.lang.Long)
     */
    public void setPriority(Long value) {
        priority = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubject#setType(java.lang.String)
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
        setCode(XppUtils.getAttributeValueFromNode(parser, "Code"));
        setPriority(XppUtils.getAttributeValueAsLongFromNode(parser, "Priority"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        setContent(XppUtils.getElementValueFromNode(parser));
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
