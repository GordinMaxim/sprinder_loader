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
import com.springer.api.schema.Caption;
import com.springer.api.schema.Figure;
import com.springer.api.schema.MediaObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "mediaObject"
})
@XmlRootElement(name = "Figure")
public class FigureImpl implements Serializable, Figure
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Caption", type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(name = "MediaObject", required = true, type = MediaObjectImpl.class)
    protected MediaObjectImpl mediaObject;
    @XmlAttribute(name = "Category", required = true)
    protected String category;
    @XmlAttribute(name = "Float", required = true)
    protected String _float;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public MediaObject getMediaObject() {
        return mediaObject;
    }

    public void setMediaObject(MediaObject value) {
        this.mediaObject = ((MediaObjectImpl) value);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String value) {
        this.category = value;
    }

    public String getFloat() {
        return _float;
    }

    public void setFloat(String value) {
        this._float = value;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
