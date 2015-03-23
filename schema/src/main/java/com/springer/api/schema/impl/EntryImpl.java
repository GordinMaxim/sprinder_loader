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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.Entry;
import com.springer.api.schema.SimplePara;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "entry")
public class EntryImpl
    implements Serializable, Entry
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;
    @XmlAttribute
    protected String align;
    @XmlAttribute(name = "char")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String _char;
    @XmlAttribute
    protected String colname;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long morerows;
    @XmlAttribute
    protected String nameend;
    @XmlAttribute
    protected String namest;

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public String getChar() {
        return _char;
    }

    public void setChar(String value) {
        this._char = value;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String value) {
        this.colname = value;
    }

    public Long getMorerows() {
        return morerows;
    }

    public void setMorerows(Long value) {
        this.morerows = value;
    }

    public String getNameend() {
        return nameend;
    }

    public void setNameend(String value) {
        this.nameend = value;
    }

    public String getNamest() {
        return namest;
    }

    public void setNamest(String value) {
        this.namest = value;
    }

}
