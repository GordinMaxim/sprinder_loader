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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.ArticleCopyright;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "copyrightHolderName",
    "copyrightYear"
})
@XmlRootElement(name = "ArticleCopyright")
public class ArticleCopyrightImpl
    implements Serializable, ArticleCopyright
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CopyrightHolderName", required = true)
    protected String copyrightHolderName;
    @XmlElement(name = "CopyrightYear", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long copyrightYear;

    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    public Long getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(Long value) {
        this.copyrightYear = value;
    }

}
