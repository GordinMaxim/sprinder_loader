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
import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postbox",
    "street",
    "city",
    "postcode",
    "state",
    "country"
})
@XmlRootElement(name = "OrgAddress")
public class OrgAddressImpl
    implements Serializable, OrgAddress
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Postbox")
    protected String postbox;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Postcode", required = true)
    protected String postcode;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Country")
    protected String country;

    public String getPostbox() {
        return postbox;
    }

    public void setPostbox(String value) {
        this.postbox = value;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String value) {
        this.postcode = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

}
