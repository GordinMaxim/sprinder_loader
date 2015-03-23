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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.CoverDate;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.PrintDate;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlineDate",
    "printDate",
    "coverDate",
    "pricelistYear"
})
@XmlRootElement(name = "IssueHistory")
public class IssueHistoryImpl
    implements Serializable, IssueHistory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OnlineDate", type = OnlineDateImpl.class)
    protected OnlineDateImpl onlineDate;
    @XmlElement(name = "PrintDate", required = true, type = PrintDateImpl.class)
    protected PrintDateImpl printDate;
    @XmlElement(name = "CoverDate", type = CoverDateImpl.class)
    protected CoverDateImpl coverDate;
    @XmlElement(name = "PricelistYear", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long pricelistYear;

    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = ((OnlineDateImpl) value);
    }

    public PrintDate getPrintDate() {
        return printDate;
    }

    public void setPrintDate(PrintDate value) {
        this.printDate = ((PrintDateImpl) value);
    }

    public CoverDate getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(CoverDate value) {
        this.coverDate = ((CoverDateImpl) value);
    }

    public Long getPricelistYear() {
        return pricelistYear;
    }

    public void setPricelistYear(Long value) {
        this.pricelistYear = value;
    }

}
