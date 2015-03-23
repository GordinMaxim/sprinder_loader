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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.ChapterContext;
import com.springer.api.schema.ChapterCopyright;
import com.springer.api.schema.ChapterGrants;
import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.ChapterInfo;
import com.springer.api.schema.ChapterTitle;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chapterID",
    "chapterDOI",
    "chapterSequenceNumber",
    "chapterTitle",
    "chapterFirstPage",
    "chapterLastPage",
    "chapterCopyright",
    "chapterHistory",
    "chapterGrants",
    "chapterContext"
})
@XmlRootElement(name = "ChapterInfo")
public class ChapterInfoImpl
    implements Serializable, ChapterInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ChapterID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long chapterID;
    @XmlElement(name = "ChapterDOI", required = true)
    protected String chapterDOI;
    @XmlElement(name = "ChapterSequenceNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long chapterSequenceNumber;
    @XmlElement(name = "ChapterTitle", required = true, type = ChapterTitleImpl.class)
    protected ChapterTitleImpl chapterTitle;
    @XmlElement(name = "ChapterFirstPage", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long chapterFirstPage;
    @XmlElement(name = "ChapterLastPage", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long chapterLastPage;
    @XmlElement(name = "ChapterCopyright", required = true, type = ChapterCopyrightImpl.class)
    protected ChapterCopyrightImpl chapterCopyright;
    @XmlElement(name = "ChapterHistory", required = true, type = ChapterHistoryImpl.class)
    protected ChapterHistoryImpl chapterHistory;
    @XmlElement(name = "ChapterGrants", required = true, type = ChapterGrantsImpl.class)
    protected ChapterGrantsImpl chapterGrants;
    @XmlElement(name = "ChapterContext", required = true, type = ChapterContextImpl.class)
    protected ChapterContextImpl chapterContext;
    @XmlAttribute(name = "ChapterType", required = true)
    protected String chapterType;
    @XmlAttribute(name = "ContainsESM", required = true)
    protected String containsESM;
    @XmlAttribute(name = "Language", required = true)
    protected String language;
    @XmlAttribute(name = "NumberingDepth")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long numberingDepth;
    @XmlAttribute(name = "NumberingStyle", required = true)
    protected String numberingStyle;
    @XmlAttribute(name = "OutputMedium", required = true)
    protected String outputMedium;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;

    public Long getChapterID() {
        return chapterID;
    }

    public void setChapterID(Long value) {
        this.chapterID = value;
    }

    public String getChapterDOI() {
        return chapterDOI;
    }

    public void setChapterDOI(String value) {
        this.chapterDOI = value;
    }

    public Long getChapterSequenceNumber() {
        return chapterSequenceNumber;
    }

    public void setChapterSequenceNumber(Long value) {
        this.chapterSequenceNumber = value;
    }

    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(ChapterTitle value) {
        this.chapterTitle = ((ChapterTitleImpl) value);
    }

    public Long getChapterFirstPage() {
        return chapterFirstPage;
    }

    public void setChapterFirstPage(Long value) {
        this.chapterFirstPage = value;
    }

    public Long getChapterLastPage() {
        return chapterLastPage;
    }

    public void setChapterLastPage(Long value) {
        this.chapterLastPage = value;
    }

    public ChapterCopyright getChapterCopyright() {
        return chapterCopyright;
    }

    public void setChapterCopyright(ChapterCopyright value) {
        this.chapterCopyright = ((ChapterCopyrightImpl) value);
    }

    public ChapterHistory getChapterHistory() {
        return chapterHistory;
    }

    public void setChapterHistory(ChapterHistory value) {
        this.chapterHistory = ((ChapterHistoryImpl) value);
    }

    public ChapterGrants getChapterGrants() {
        return chapterGrants;
    }

    public void setChapterGrants(ChapterGrants value) {
        this.chapterGrants = ((ChapterGrantsImpl) value);
    }

    public ChapterContext getChapterContext() {
        return chapterContext;
    }

    public void setChapterContext(ChapterContext value) {
        this.chapterContext = ((ChapterContextImpl) value);
    }

    public String getChapterType() {
        return chapterType;
    }

    public void setChapterType(String value) {
        this.chapterType = value;
    }

    public String getContainsESM() {
        return containsESM;
    }

    public void setContainsESM(String value) {
        this.containsESM = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public Long getNumberingDepth() {
        return numberingDepth;
    }

    public void setNumberingDepth(Long value) {
        this.numberingDepth = value;
    }

    public String getNumberingStyle() {
        return numberingStyle;
    }

    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
