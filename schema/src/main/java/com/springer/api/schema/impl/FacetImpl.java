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
import com.springer.api.schema.Facet;
import com.springer.api.schema.FacetName;
import com.springer.api.schema.FacetValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facetValues"
})
@XmlRootElement(name = "facet")
public class FacetImpl
    implements Serializable, Facet
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "facet-value", required = true, type = FacetValueImpl.class)
    protected List<FacetValue> facetValues;
    @XmlAttribute(required = true)
    protected FacetName name;

    public List<FacetValue> getFacetValues() {
        if (facetValues == null) {
            facetValues = new ArrayList<FacetValue>();
        }
        return this.facetValues;
    }

    public FacetName getName() {
        return name;
    }

    public void setName(FacetName value) {
        this.name = value;
    }

}
