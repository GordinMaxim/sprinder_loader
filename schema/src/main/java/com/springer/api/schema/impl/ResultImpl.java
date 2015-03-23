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
import com.springer.api.schema.Images;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.Result;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisher",
    "images",
    "total",
    "start",
    "pageLength"
})
@XmlRootElement(name = "result")
public class ResultImpl
    implements Serializable, Result
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Publisher", required = true, type = PublisherImpl.class)
    protected PublisherImpl publisher;
    @XmlElement(name = "Images", required = true, type = ImagesImpl.class)
    protected ImagesImpl images;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long total;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long start;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long pageLength;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher value) {
        this.publisher = ((PublisherImpl) value);
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images value) {
        this.images = ((ImagesImpl) value);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long value) {
        this.start = value;
    }

    public Long getPageLength() {
        return pageLength;
    }

    public void setPageLength(Long value) {
        this.pageLength = value;
    }

}
