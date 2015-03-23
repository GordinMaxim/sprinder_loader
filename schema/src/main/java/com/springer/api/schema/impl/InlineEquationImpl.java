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
import com.springer.api.schema.EquationSource;
import com.springer.api.schema.ImageObject;
import com.springer.api.schema.InlineEquation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inlineMediaObject",
    "equationSource"
})
@XmlRootElement(name = "InlineEquation")
public class InlineEquationImpl implements Serializable, InlineEquation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "InlineMediaObject", required = true, type = ImageObjectImpl.class)
    protected ImageObjectImpl inlineMediaObject;
    @XmlElement(name = "EquationSource", required = true, type = EquationSourceImpl.class)
    protected EquationSourceImpl equationSource;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }

    public void setInlineMediaObject(ImageObject value) {
        this.inlineMediaObject = ((ImageObjectImpl) value);
    }

    public EquationSource getEquationSource() {
        return equationSource;
    }

    public void setEquationSource(EquationSource value) {
        this.equationSource = ((EquationSourceImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
