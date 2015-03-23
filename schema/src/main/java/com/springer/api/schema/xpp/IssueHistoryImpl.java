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

import com.springer.api.schema.CoverDate;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.PrintDate;

/**
 * The Class IssueHistoryImpl.
 */
public class IssueHistoryImpl extends BaseSchemaEntity implements IssueHistory {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The online date. */
    protected OnlineDateImpl onlineDate;
    
    /** The print date. */
    protected PrintDateImpl printDate;
    
    /** The cover date. */
    protected CoverDateImpl coverDate;
    
    /** The pricelist year. */
    protected Long pricelistYear;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#getOnlineDate()
     */
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#setOnlineDate(com.springer.api.schema.OnlineDate)
     */
    public void setOnlineDate(OnlineDate value) {
        onlineDate = ((OnlineDateImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#getPrintDate()
     */
    public PrintDate getPrintDate() {
        return printDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#setPrintDate(com.springer.api.schema.PrintDate)
     */
    public void setPrintDate(PrintDate value) {
        printDate = ((PrintDateImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#getCoverDate()
     */
    public CoverDate getCoverDate() {
        return coverDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#setCoverDate(com.springer.api.schema.CoverDate)
     */
    public void setCoverDate(CoverDate value) {
        coverDate = ((CoverDateImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#getPricelistYear()
     */
    public Long getPricelistYear() {
        return pricelistYear;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.IssueHistory#setPricelistYear(java.lang.Long)
     */
    public void setPricelistYear(Long value) {
        pricelistYear = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("OnlineDate")) {
                OnlineDateImpl node = new OnlineDateImpl();
                node.init(parser);
                setOnlineDate(node);
            } else if (name.equals("PrintDate")) {
                PrintDateImpl node = new PrintDateImpl();
                node.init(parser);
                setPrintDate(node);
            } else if (name.equals("CoverDate")) {
                CoverDateImpl node = new CoverDateImpl();
                node.init(parser);
                setCoverDate(node);
            } else if (name.equals("PricelistYear")) {
                setPricelistYear(XppUtils.getElementValueAsLongFromNode(parser));
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
