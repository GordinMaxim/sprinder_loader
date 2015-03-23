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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.AuthorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "givenNames",
    "particle",
    "familyName"
})
@XmlRootElement(name = "AuthorName")
public class AuthorNameImpl
    implements Serializable, AuthorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "GivenName", required = true)
    protected List<String> givenNames;
    @XmlElement(name = "Particle")
    protected String particle;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlAttribute(name = "DisplayOrder", required = true)
    protected String displayOrder;

    public List<String> getGivenNames() {
        if (givenNames == null) {
            givenNames = new ArrayList<String>();
        }
        return this.givenNames;
    }

    public String getParticle() {
        return particle;
    }

    public void setParticle(String value) {
        this.particle = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String value) {
        this.displayOrder = value;
    }

}
