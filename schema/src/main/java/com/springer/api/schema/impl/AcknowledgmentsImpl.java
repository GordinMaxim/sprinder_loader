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
import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.SimplePara;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "simplePara",
    "formalPara"
})
@XmlRootElement(name = "Acknowledgments")
public class AcknowledgmentsImpl
    implements Serializable, Acknowledgments
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "SimplePara", type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;
    @XmlElement(name = "FormalPara", type = FormalParaImpl.class)
    protected FormalParaImpl formalPara;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

    public FormalPara getFormalPara() {
        return formalPara;
    }

    public void setFormalPara(FormalPara value) {
        this.formalPara = ((FormalParaImpl) value);
    }

}
