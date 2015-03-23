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

package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalSubjectGroup;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalID",
    "journalPrintISSN",
    "journalElectronicISSN",
    "journalSPIN",
    "journalTitle",
    "journalSubTitle",
    "journalAbbreviatedTitle",
    "journalSubjectGroup"
})
@XmlRootElement(name = "JournalInfo")
public class JournalInfoImpl
    implements Serializable, JournalInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    @XmlElement(name = "JournalPrintISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String journalPrintISSN;
    @XmlElement(name = "JournalElectronicISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String journalElectronicISSN;
    @XmlElement(name = "JournalSPIN", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long journalSPIN;
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    @XmlElement(name = "JournalSubTitle")
    protected String journalSubTitle;
    @XmlElement(name = "JournalAbbreviatedTitle", required = true)
    protected String journalAbbreviatedTitle;
    @XmlElement(name = "JournalSubjectGroup", required = true, type = JournalSubjectGroupImpl.class)
    protected JournalSubjectGroupImpl journalSubjectGroup;
    @XmlAttribute(name = "JournalProductType", required = true)
    protected String journalProductType;
    @XmlAttribute(name = "NumberingStyle", required = true)
    protected String numberingStyle;

    public String getJournalID() {
        return journalID;
    }

    public void setJournalID(String value) {
        this.journalID = value;
    }

    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }

    public void setJournalPrintISSN(String value) {
        this.journalPrintISSN = value;
    }

    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }

    public void setJournalElectronicISSN(String value) {
        this.journalElectronicISSN = value;
    }

    public Long getJournalSPIN() {
        return journalSPIN;
    }

    public void setJournalSPIN(Long value) {
        this.journalSPIN = value;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    public String getJournalSubTitle() {
        return journalSubTitle;
    }

    public void setJournalSubTitle(String value) {
        this.journalSubTitle = value;
    }

    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }

    public void setJournalAbbreviatedTitle(String value) {
        this.journalAbbreviatedTitle = value;
    }

    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }

    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        this.journalSubjectGroup = ((JournalSubjectGroupImpl) value);
    }

    public String getJournalProductType() {
        return journalProductType;
    }

    public void setJournalProductType(String value) {
        this.journalProductType = value;
    }

    public String getNumberingStyle() {
        return numberingStyle;
    }

    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

}
