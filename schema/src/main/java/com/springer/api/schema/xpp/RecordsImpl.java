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
import java.util.ArrayList;
import java.util.List;

import org.prismstandard.namespaces.pam._2.Message;
import org.prismstandard.namespaces.pam._2.xpp.MessageImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Record;
import com.springer.api.schema.Records;
import com.springer.api.schema.Result;

/**
 * The Class RecordsImpl.
 */
public class RecordsImpl extends BaseSchemaEntity implements Records {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The results. */
    protected List<Result> results;
    
    /** The messages. */
    protected List<Message> messages;
    
    /** The records. */
    protected List<Record> records;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Records#getResults()
     */
    public List<Result> getResults() {
        if (results == null) {
            results = new ArrayList<Result>();
        }
        return this.results;
    }
    
    /**
     * Sets the results.
     * 
     * @param value the new results
     */
    public void setResults(List<Result> value) {
        this.results = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Records#getMessages()
     */
    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
    }
    
    /**
     * Sets the messages.
     * 
     * @param value the new messages
     */
    public void setMessages(List<Message> value) {
        this.messages = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Records#getRecords()
     */
    public List<Record> getRecords() {
        if (records == null) {
            records = new ArrayList<Record>();
        }
        return this.records;
    }
    
    /**
     * Sets the records.
     * 
     * @param value the new records
     */
    public void setRecords(List<Record> value) {
        this.records = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("result")) {
                ResultImpl node = new ResultImpl();
                node.init(parser);
                getResults().add(node);
            } else if (name.equals("pam:message")) {
                MessageImpl node = new MessageImpl();
                node.init(parser);
                getMessages().add(node);
            } else if (name.equals("record")) {
                RecordImpl node = new RecordImpl();
                node.init(parser);
                getRecords().add(node);
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
