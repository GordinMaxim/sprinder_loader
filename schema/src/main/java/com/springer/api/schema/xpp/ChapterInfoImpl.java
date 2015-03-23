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

import com.springer.api.schema.ChapterContext;
import com.springer.api.schema.ChapterCopyright;
import com.springer.api.schema.ChapterGrants;
import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.ChapterInfo;
import com.springer.api.schema.ChapterTitle;

/**
 * The Class ChapterInfoImpl.
 */
public class ChapterInfoImpl extends BaseSchemaEntity implements ChapterInfo {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The chapter id. */
    protected Long chapterID;
    
    /** The chapter doi. */
    protected String chapterDOI;
    
    /** The chapter sequence number. */
    protected Long chapterSequenceNumber;
    
    /** The chapter title. */
    protected ChapterTitleImpl chapterTitle;
    
    /** The chapter first page. */
    protected Long chapterFirstPage;
    
    /** The chapter last page. */
    protected Long chapterLastPage;
    
    /** The chapter copyright. */
    protected ChapterCopyrightImpl chapterCopyright;
    
    /** The chapter history. */
    protected ChapterHistoryImpl chapterHistory;
    
    /** The chapter grants. */
    protected ChapterGrantsImpl chapterGrants;
    
    /** The chapter context. */
    protected ChapterContextImpl chapterContext;
    
    /** The chapter type. */
    protected String chapterType;
    
    /** The contains esm. */
    protected String containsESM;
    
    /** The language. */
    protected String language;
    
    /** The numbering depth. */
    protected Long numberingDepth;
    
    /** The numbering style. */
    protected String numberingStyle;
    
    /** The output medium. */
    protected String outputMedium;
    
    /** The toc levels. */
    protected Long tocLevels;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterID()
     */
    public Long getChapterID() {
        return chapterID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterID(java.lang.Long)
     */
    public void setChapterID(Long value) {
        chapterID = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterDOI()
     */
    public String getChapterDOI() {
        return chapterDOI;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterDOI(java.lang.String)
     */
    public void setChapterDOI(String value) {
        chapterDOI = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterSequenceNumber()
     */
    public Long getChapterSequenceNumber() {
        return chapterSequenceNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterSequenceNumber(java.lang.Long)
     */
    public void setChapterSequenceNumber(Long value) {
        chapterSequenceNumber = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterTitle()
     */
    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterTitle(com.springer.api.schema.ChapterTitle)
     */
    public void setChapterTitle(ChapterTitle value) {
        chapterTitle = ((ChapterTitleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterFirstPage()
     */
    public Long getChapterFirstPage() {
        return chapterFirstPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterFirstPage(java.lang.Long)
     */
    public void setChapterFirstPage(Long value) {
        chapterFirstPage = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterLastPage()
     */
    public Long getChapterLastPage() {
        return chapterLastPage;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterLastPage(java.lang.Long)
     */
    public void setChapterLastPage(Long value) {
        chapterLastPage = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterCopyright()
     */
    public ChapterCopyright getChapterCopyright() {
        return chapterCopyright;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterCopyright(com.springer.api.schema.ChapterCopyright)
     */
    public void setChapterCopyright(ChapterCopyright value) {
        chapterCopyright = ((ChapterCopyrightImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterHistory()
     */
    public ChapterHistory getChapterHistory() {
        return chapterHistory;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterHistory(com.springer.api.schema.ChapterHistory)
     */
    public void setChapterHistory(ChapterHistory value) {
        chapterHistory = ((ChapterHistoryImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterGrants()
     */
    public ChapterGrants getChapterGrants() {
        return chapterGrants;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterGrants(com.springer.api.schema.ChapterGrants)
     */
    public void setChapterGrants(ChapterGrants value) {
        chapterGrants = ((ChapterGrantsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterContext()
     */
    public ChapterContext getChapterContext() {
        return chapterContext;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterContext(com.springer.api.schema.ChapterContext)
     */
    public void setChapterContext(ChapterContext value) {
        chapterContext = ((ChapterContextImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getChapterType()
     */
    public String getChapterType() {
        return chapterType;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setChapterType(java.lang.String)
     */
    public void setChapterType(String value) {
        chapterType = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getContainsESM()
     */
    public String getContainsESM() {
        return containsESM;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setContainsESM(java.lang.String)
     */
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setLanguage(java.lang.String)
     */
    public void setLanguage(String value) {
        language = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getNumberingDepth()
     */
    public Long getNumberingDepth() {
        return numberingDepth;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setNumberingDepth(java.lang.Long)
     */
    public void setNumberingDepth(Long value) {
        numberingDepth = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getNumberingStyle()
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setNumberingStyle(java.lang.String)
     */
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#getTocLevels()
     */
    public Long getTocLevels() {
        return tocLevels;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterInfo#setTocLevels(java.lang.Long)
     */
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setChapterType(XppUtils.getAttributeValueFromNode(parser, "ChapterType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setNumberingDepth(XppUtils.getAttributeValueAsLongFromNode(parser, "NumberingDepth"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ChapterID")) {
                setChapterID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterDOI")) {
                setChapterDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ChapterSequenceNumber")) {
                setChapterSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterTitle")) {
                ChapterTitleImpl node = new ChapterTitleImpl();
                node.init(parser);
                setChapterTitle(node);
            } else if (name.equals("ChapterFirstPage")) {
                setChapterFirstPage(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterLastPage")) {
                setChapterLastPage(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterCopyright")) {
                ChapterCopyrightImpl node = new ChapterCopyrightImpl();
                node.init(parser);
                setChapterCopyright(node);
            } else if (name.equals("ChapterHistory")) {
                ChapterHistoryImpl node = new ChapterHistoryImpl();
                node.init(parser);
                setChapterHistory(node);
            } else if (name.equals("ChapterGrants")) {
                ChapterGrantsImpl node = new ChapterGrantsImpl();
                node.init(parser);
                setChapterGrants(node);
            } else if (name.equals("ChapterContext")) {
                ChapterContextImpl node = new ChapterContextImpl();
                node.init(parser);
                setChapterContext(node);
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
