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

import com.springer.api.schema.Journal;
import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalOnlineFirst;
import com.springer.api.schema.Volume;

/**
 * The Class JournalImpl.
 */
public class JournalImpl extends BaseSchemaEntity implements Journal {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal info. */
    protected JournalInfoImpl journalInfo;
    
    /** The journal online first. */
    protected JournalOnlineFirstImpl journalOnlineFirst;
    
    /** The volume. */
    protected VolumeImpl volume;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#getJournalInfo()
     */
    public JournalInfo getJournalInfo() {
        return journalInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#setJournalInfo(com.springer.api.schema.JournalInfo)
     */
    public void setJournalInfo(JournalInfo value) {
        journalInfo = ((JournalInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#getJournalOnlineFirst()
     */
    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#setJournalOnlineFirst(com.springer.api.schema.JournalOnlineFirst)
     */
    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        journalOnlineFirst = ((JournalOnlineFirstImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#getVolume()
     */
    public Volume getVolume() {
        return volume;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#setVolume(com.springer.api.schema.Volume)
     */
    public void setVolume(Volume value) {
        volume = ((VolumeImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Journal#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalInfo")) {
                JournalInfoImpl node = new JournalInfoImpl();
                node.init(parser);
                setJournalInfo(node);
            } else if (name.equals("JournalOnlineFirst")) {
                JournalOnlineFirstImpl node = new JournalOnlineFirstImpl();
                node.init(parser);
                setJournalOnlineFirst(node);
            } else if (name.equals("Volume")) {
                VolumeImpl node = new VolumeImpl();
                node.init(parser);
                setVolume(node);
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
