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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Record;
import com.springer.api.schema.Records;
import com.springer.api.schema.Result;
import org.prismstandard.namespaces.pam._2.Message;
import org.prismstandard.namespaces.pam._2.impl.MessageImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "results",
    "messages",
    "records"
})
@XmlRootElement(name = "records")
public class RecordsImpl
    implements Serializable, Records
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "result", required = true, type = ResultImpl.class)
    protected List<Result> results;
    @XmlElement(name = "message", namespace = "http://prismstandard.org/namespaces/pam/2.0/", required = true, type = MessageImpl.class)
    protected List<Message> messages;
    @XmlElement(name = "record", required = true, type = RecordImpl.class)
    protected List<Record> records;

    public List<Result> getResults() {
        if (results == null) {
            results = new ArrayList<Result>();
        }
        return this.results;
    }

    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
    }

    public List<Record> getRecords() {
        if (records == null) {
            records = new ArrayList<Record>();
        }
        return this.records;
    }

}
