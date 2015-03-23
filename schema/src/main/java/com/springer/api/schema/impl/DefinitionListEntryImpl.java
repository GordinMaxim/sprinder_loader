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
import com.springer.api.schema.DefinitionListEntry;
import com.springer.api.schema.Description;
import com.springer.api.schema.Term;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "term",
    "description"
})
@XmlRootElement(name = "DefinitionListEntry")
public class DefinitionListEntryImpl
    implements Serializable, DefinitionListEntry
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Term", required = true, type = TermImpl.class)
    protected TermImpl term;
    @XmlElement(name = "Description", required = true, type = DescriptionImpl.class)
    protected DescriptionImpl description;

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term value) {
        this.term = ((TermImpl) value);
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description value) {
        this.description = ((DescriptionImpl) value);
    }

}
