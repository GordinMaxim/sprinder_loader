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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.ChapterContext;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partID",
    "bookID",
    "bookTitle"
})
@XmlRootElement(name = "ChapterContext")
public class ChapterContextImpl
    extends SeriesIDImpl
    implements Serializable, ChapterContext
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PartID", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long partID;
    @XmlElement(name = "BookID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookID;
    @XmlElement(name = "BookTitle", required = true, type = BookTitleImpl.class)
    protected BookTitleImpl bookTitle;

    public Long getPartID() {
        return partID;
    }

    public void setPartID(Long value) {
        this.partID = value;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String value) {
        this.bookID = value;
    }

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(BookTitle value) {
        this.bookTitle = ((BookTitleImpl) value);
    }

}
