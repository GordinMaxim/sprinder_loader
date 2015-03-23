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

import com.springer.api.schema.Chapter;
import com.springer.api.schema.Part;
import com.springer.api.schema.PartInfo;

/**
 * The Class PartImpl.
 */
public class PartImpl extends BaseSchemaEntity implements Part {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The part info. */
    protected PartInfoImpl partInfo;
    
    /** The chapter. */
    protected ChapterImpl chapter;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#getPartInfo()
     */
    public PartInfo getPartInfo() {
        return partInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#setPartInfo(com.springer.api.schema.PartInfo)
     */
    public void setPartInfo(PartInfo value) {
        partInfo = ((PartInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#getChapter()
     */
    public Chapter getChapter() {
        return chapter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#setChapter(com.springer.api.schema.Chapter)
     */
    public void setChapter(Chapter value) {
        chapter = ((ChapterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Part#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PartInfo")) {
                PartInfoImpl node = new PartInfoImpl();
                node.init(parser);
                setPartInfo(node);
            } else if (name.equals("Chapter")) {
                ChapterImpl node = new ChapterImpl();
                node.init(parser);
                setChapter(node);
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
