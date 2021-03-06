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

import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.RegistrationDate;

/**
 * The Class ChapterHistoryImpl.
 */
public class ChapterHistoryImpl extends BaseSchemaEntity implements ChapterHistory {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The registration date. */
    protected RegistrationDateImpl registrationDate;
    
    /** The online date. */
    protected OnlineDateImpl onlineDate;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHistory#getRegistrationDate()
     */
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHistory#setRegistrationDate(com.springer.api.schema.RegistrationDate)
     */
    public void setRegistrationDate(RegistrationDate value) {
        registrationDate = ((RegistrationDateImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHistory#getOnlineDate()
     */
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ChapterHistory#setOnlineDate(com.springer.api.schema.OnlineDate)
     */
    public void setOnlineDate(OnlineDate value) {
        onlineDate = ((OnlineDateImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("RegistrationDate")) {
                RegistrationDateImpl node = new RegistrationDateImpl();
                node.init(parser);
                setRegistrationDate(node);
            } else if (name.equals("OnlineDate")) {
                OnlineDateImpl node = new OnlineDateImpl();
                node.init(parser);
                setOnlineDate(node);
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
