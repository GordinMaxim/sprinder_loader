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

import com.springer.api.schema.PrintDate;

/**
 * The Class PrintDateImpl.
 */
public class PrintDateImpl extends BaseSchemaEntity implements PrintDate {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The year. */
    protected String year;
    
    /** The month. */
    protected String month;
    
    /** The day. */
    protected String day;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#getYear()
     */
    public String getYear() {
        return year;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#setYear(java.lang.String)
     */
    public void setYear(String value) {
        year = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#getMonth()
     */
    public String getMonth() {
        return month;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#setMonth(java.lang.String)
     */
    public void setMonth(String value) {
        month = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#getDay()
     */
    public String getDay() {
        return day;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.PrintDate#setDay(java.lang.String)
     */
    public void setDay(String value) {
        day = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Month")) {
                setMonth(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Day")) {
                setDay(XppUtils.getElementValueFromNode(parser));
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
