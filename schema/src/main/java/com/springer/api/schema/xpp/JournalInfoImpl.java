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

import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalSubjectGroup;

/**
 * The Class JournalInfoImpl.
 */
public class JournalInfoImpl extends BaseSchemaEntity implements JournalInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal id. */
    protected String journalID;
    
    /** The journal print issn. */
    protected String journalPrintISSN;
    
    /** The journal electronic issn. */
    protected String journalElectronicISSN;
    
    /** The journal spin. */
    protected Long journalSPIN;
    
    /** The journal title. */
    protected String journalTitle;
    
    /** The journal sub title. */
    protected String journalSubTitle;
    
    /** The journal abbreviated title. */
    protected String journalAbbreviatedTitle;
    
    /** The journal subject group. */
    protected JournalSubjectGroupImpl journalSubjectGroup;
    
    /** The journal product type. */
    protected String journalProductType;
    
    /** The numbering style. */
    protected String numberingStyle;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalID()
     */
    public String getJournalID() {
        return journalID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalID(java.lang.String)
     */
    public void setJournalID(String value) {
        journalID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalPrintISSN()
     */
    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalPrintISSN(java.lang.String)
     */
    public void setJournalPrintISSN(String value) {
        journalPrintISSN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalElectronicISSN()
     */
    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalElectronicISSN(java.lang.String)
     */
    public void setJournalElectronicISSN(String value) {
        journalElectronicISSN = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalSPIN()
     */
    public Long getJournalSPIN() {
        return journalSPIN;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalSPIN(java.lang.Long)
     */
    public void setJournalSPIN(Long value) {
        journalSPIN = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalTitle()
     */
    public String getJournalTitle() {
        return journalTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalTitle(java.lang.String)
     */
    public void setJournalTitle(String value) {
        journalTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalSubTitle()
     */
    public String getJournalSubTitle() {
        return journalSubTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalSubTitle(java.lang.String)
     */
    public void setJournalSubTitle(String value) {
        journalSubTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalAbbreviatedTitle()
     */
    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalAbbreviatedTitle(java.lang.String)
     */
    public void setJournalAbbreviatedTitle(String value) {
        journalAbbreviatedTitle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalSubjectGroup()
     */
    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalSubjectGroup(com.springer.api.schema.JournalSubjectGroup)
     */
    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        journalSubjectGroup = ((JournalSubjectGroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getJournalProductType()
     */
    public String getJournalProductType() {
        return journalProductType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setJournalProductType(java.lang.String)
     */
    public void setJournalProductType(String value) {
        journalProductType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#getNumberingStyle()
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.JournalInfo#setNumberingStyle(java.lang.String)
     */
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setJournalProductType(XppUtils.getAttributeValueFromNode(parser, "JournalProductType"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalID")) {
                setJournalID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalPrintISSN")) {
                setJournalPrintISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalElectronicISSN")) {
                setJournalElectronicISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSPIN")) {
                setJournalSPIN(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("JournalTitle")) {
                setJournalTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSubTitle")) {
                setJournalSubTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalAbbreviatedTitle")) {
                setJournalAbbreviatedTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSubjectGroup")) {
                JournalSubjectGroupImpl node = new JournalSubjectGroupImpl();
                node.init(parser);
                setJournalSubjectGroup(node);
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
