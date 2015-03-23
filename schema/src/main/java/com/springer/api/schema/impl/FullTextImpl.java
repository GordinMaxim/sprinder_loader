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

import com.springer.api.schema.P;

import com.springer.api.schema.FullText;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ps"
})
@XmlRootElement(name = "FullText")
public class FullTextImpl
    implements Serializable, FullText
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "p", type = PImpl.class)
    protected List<P> ps;

    public List<P> getPS() {
        if (ps == null) {
            ps = new ArrayList<P>();
        }
        return this.ps;
    }

}
