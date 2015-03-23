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
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Affiliation;
import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgDivision",
    "orgName",
    "orgAddress"
})
@XmlRootElement(name = "Affiliation")
public class AffiliationImpl
    implements Serializable, Affiliation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OrgDivision")
    protected String orgDivision;
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    @XmlElement(name = "OrgAddress", required = true, type = OrgAddressImpl.class)
    protected OrgAddressImpl orgAddress;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public String getOrgDivision() {
        return orgDivision;
    }

    public void setOrgDivision(String value) {
        this.orgDivision = value;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String value) {
        this.orgName = value;
    }

    public OrgAddress getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(OrgAddress value) {
        this.orgAddress = ((OrgAddressImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
