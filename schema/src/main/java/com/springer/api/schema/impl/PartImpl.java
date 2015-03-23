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
import com.springer.api.schema.Chapter;
import com.springer.api.schema.Part;
import com.springer.api.schema.PartInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partInfo",
    "chapter"
})
@XmlRootElement(name = "Part")
public class PartImpl
    implements Serializable, Part
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PartInfo", required = true, type = PartInfoImpl.class)
    protected PartInfoImpl partInfo;
    @XmlElement(name = "Chapter", required = true, type = ChapterImpl.class)
    protected ChapterImpl chapter;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public PartInfo getPartInfo() {
        return partInfo;
    }

    public void setPartInfo(PartInfo value) {
        this.partInfo = ((PartInfoImpl) value);
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter value) {
        this.chapter = ((ChapterImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
