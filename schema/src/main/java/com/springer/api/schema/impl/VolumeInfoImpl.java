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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.VolumeInfo;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeIDStart",
    "volumeIDEnd",
    "volumeIssueCount"
})
@XmlRootElement(name = "VolumeInfo")
public class VolumeInfoImpl
    implements Serializable, VolumeInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    @XmlElement(name = "VolumeIssueCount", required = true)
    protected String volumeIssueCount;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;
    @XmlAttribute(name = "VolumeType", required = true)
    protected String volumeType;

    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }

    public void setVolumeIssueCount(String value) {
        this.volumeIssueCount = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String value) {
        this.volumeType = value;
    }

}
