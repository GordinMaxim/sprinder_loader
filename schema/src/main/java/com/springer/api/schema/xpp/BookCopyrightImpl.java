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

import com.springer.api.schema.BookCopyright;

/**
 * The Class BookCopyrightImpl.
 */
public class BookCopyrightImpl extends BaseSchemaEntity implements BookCopyright {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The copyright holder name. */
    protected String copyrightHolderName;
    
    /** The copyright year. */
    protected Long copyrightYear;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookCopyright#getCopyrightHolderName()
     */
    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookCopyright#setCopyrightHolderName(java.lang.String)
     */
    public void setCopyrightHolderName(String value) {
        copyrightHolderName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookCopyright#getCopyrightYear()
     */
    public Long getCopyrightYear() {
        return copyrightYear;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookCopyright#setCopyrightYear(java.lang.Long)
     */
    public void setCopyrightYear(Long value) {
        copyrightYear = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CopyrightHolderName")) {
                setCopyrightHolderName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("CopyrightYear")) {
                setCopyrightYear(XppUtils.getElementValueAsLongFromNode(parser));
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
