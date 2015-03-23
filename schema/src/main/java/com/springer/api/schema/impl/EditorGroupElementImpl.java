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
import com.springer.api.schema.Affiliation;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorGroupElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "editors",
    "affiliations"
})
@XmlRootElement(name = "EditorGroupElement")
public class EditorGroupElementImpl
    implements Serializable, EditorGroupElement
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Editor", required = true, type = EditorImpl.class)
    protected List<Editor> editors;
    @XmlElement(name = "Affiliation", type = AffiliationImpl.class)
    protected List<Affiliation> affiliations;

    public List<Editor> getEditors() {
        if (editors == null) {
            editors = new ArrayList<Editor>();
        }
        return this.editors;
    }

    public List<Affiliation> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<Affiliation>();
        }
        return this.affiliations;
    }

}
