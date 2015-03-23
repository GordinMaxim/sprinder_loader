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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.Colspec;
import com.springer.api.schema.Tbody;
import com.springer.api.schema.Tgroup;
import com.springer.api.schema.Thead;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colspecs",
    "thead",
    "tbody"
})
@XmlRootElement(name = "tgroup")
public class TgroupImpl
    implements Serializable, Tgroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "colspec", required = true, type = ColspecImpl.class)
    protected List<Colspec> colspecs;
    @XmlElement(required = true, type = TheadImpl.class)
    protected TheadImpl thead;
    @XmlElement(required = true, type = TbodyImpl.class)
    protected TbodyImpl tbody;
    @XmlAttribute
    protected String align;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long cols;

    public List<Colspec> getColspecs() {
        if (colspecs == null) {
            colspecs = new ArrayList<Colspec>();
        }
        return this.colspecs;
    }

    public Thead getThead() {
        return thead;
    }

    public void setThead(Thead value) {
        this.thead = ((TheadImpl) value);
    }

    public Tbody getTbody() {
        return tbody;
    }

    public void setTbody(Tbody value) {
        this.tbody = ((TbodyImpl) value);
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public Long getCols() {
        return cols;
    }

    public void setCols(Long value) {
        this.cols = value;
    }

}
