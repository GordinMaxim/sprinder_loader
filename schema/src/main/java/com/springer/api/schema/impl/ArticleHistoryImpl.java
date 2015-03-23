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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Accepted;
import com.springer.api.schema.ArticleHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.Received;
import com.springer.api.schema.RegistrationDate;
import com.springer.api.schema.Revised;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationDate",
    "received",
    "revised",
    "accepted",
    "onlineDate"
})
@XmlRootElement(name = "ArticleHistory")
public class ArticleHistoryImpl
    implements Serializable, ArticleHistory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RegistrationDate", type = RegistrationDateImpl.class)
    protected RegistrationDateImpl registrationDate;
    @XmlElement(name = "Received", type = ReceivedImpl.class)
    protected ReceivedImpl received;
    @XmlElement(name = "Revised", type = RevisedImpl.class)
    protected RevisedImpl revised;
    @XmlElement(name = "Accepted", type = AcceptedImpl.class)
    protected AcceptedImpl accepted;
    @XmlElement(name = "OnlineDate", type = OnlineDateImpl.class)
    protected OnlineDateImpl onlineDate;

    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = ((RegistrationDateImpl) value);
    }

    public Received getReceived() {
        return received;
    }

    public void setReceived(Received value) {
        this.received = ((ReceivedImpl) value);
    }

    public Revised getRevised() {
        return revised;
    }

    public void setRevised(Revised value) {
        this.revised = ((RevisedImpl) value);
    }

    public Accepted getAccepted() {
        return accepted;
    }

    public void setAccepted(Accepted value) {
        this.accepted = ((AcceptedImpl) value);
    }

    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = ((OnlineDateImpl) value);
    }

}
