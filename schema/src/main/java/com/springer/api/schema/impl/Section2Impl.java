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
import com.springer.api.schema.Figure;
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section2;
import com.springer.api.schema.Section3;
import com.springer.api.schema.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "figures",
    "paras",
    "tables",
    "section3S",
    "formalParas"
})
@XmlRootElement(name = "Section2")
public class Section2Impl
    implements Serializable, Section2
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Figure", required = true, type = FigureImpl.class)
    protected List<Figure> figures;
    @XmlElement(name = "Para", required = true, type = ParaImpl.class)
    protected List<Para> paras;
    @XmlElement(name = "Table", required = true, type = TableImpl.class)
    protected List<Table> tables;
    @XmlElement(name = "Section3", type = Section3Impl.class)
    protected List<Section3> section3S;
    @XmlElement(name = "FormalPara", type = FormalParaImpl.class)
    protected List<FormalPara> formalParas;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }

    public List<Para> getParas() {
        if (paras == null) {
            paras = new ArrayList<Para>();
        }
        return this.paras;
    }

    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }

    public List<Section3> getSection3s() {
        if (section3S == null) {
            section3S = new ArrayList<Section3>();
        }
        return this.section3S;
    }

    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
