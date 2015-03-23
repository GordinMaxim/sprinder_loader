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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ImageObjectElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ImageObjectElement")
public class ImageObjectElementImpl
    implements Serializable, ImageObjectElement
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "FileRef", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fileRef;
    @XmlAttribute(name = "Format", required = true)
    protected String format;
    @XmlAttribute(name = "Rendition", required = true)
    protected String rendition;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public String getFileRef() {
        return fileRef;
    }

    public void setFileRef(String value) {
        this.fileRef = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

    public String getRendition() {
        return rendition;
    }

    public void setRendition(String value) {
        this.rendition = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
