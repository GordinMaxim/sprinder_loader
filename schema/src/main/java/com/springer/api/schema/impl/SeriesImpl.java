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
import com.springer.api.schema.Book;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Series;
import com.springer.api.schema.SeriesInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesInfo",
    "seriesHeader",
    "book"
})
@XmlRootElement(name = "Series")
public class SeriesImpl
    implements Serializable, Series
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SeriesInfo", required = true, type = SeriesInfoImpl.class)
    protected SeriesInfoImpl seriesInfo;
    @XmlElement(name = "SeriesHeader", type = EditorGroupImpl.class)
    protected EditorGroupImpl seriesHeader;
    @XmlElement(name = "Book", required = true, type = BookImpl.class)
    protected BookImpl book;

    public SeriesInfo getSeriesInfo() {
        return seriesInfo;
    }

    public void setSeriesInfo(SeriesInfo value) {
        this.seriesInfo = ((SeriesInfoImpl) value);
    }

    public EditorGroup getSeriesHeader() {
        return seriesHeader;
    }

    public void setSeriesHeader(EditorGroup value) {
        this.seriesHeader = ((EditorGroupImpl) value);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book value) {
        this.book = ((BookImpl) value);
    }

}
