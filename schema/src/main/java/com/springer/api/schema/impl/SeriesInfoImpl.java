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
import com.springer.api.schema.SeriesInfo;
import com.springer.api.schema.SeriesTitle;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesPrintISSN",
    "seriesElectronicISSN",
    "seriesTitle",
    "seriesAbbreviatedTitle"
})
@XmlRootElement(name = "SeriesInfo")
public class SeriesInfoImpl
    extends SeriesIDImpl
    implements Serializable, SeriesInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SeriesPrintISSN")
    protected String seriesPrintISSN;
    @XmlElement(name = "SeriesElectronicISSN")
    protected String seriesElectronicISSN;
    @XmlElement(name = "SeriesTitle", required = true, type = SeriesTitleImpl.class)
    protected SeriesTitleImpl seriesTitle;
    @XmlElement(name = "SeriesAbbreviatedTitle")
    protected String seriesAbbreviatedTitle;
    @XmlAttribute(name = "SeriesType", required = true)
    protected String seriesType;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;

    public String getSeriesPrintISSN() {
        return seriesPrintISSN;
    }

    public void setSeriesPrintISSN(String value) {
        this.seriesPrintISSN = value;
    }

    public String getSeriesElectronicISSN() {
        return seriesElectronicISSN;
    }

    public void setSeriesElectronicISSN(String value) {
        this.seriesElectronicISSN = value;
    }

    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(SeriesTitle value) {
        this.seriesTitle = ((SeriesTitleImpl) value);
    }

    public String getSeriesAbbreviatedTitle() {
        return seriesAbbreviatedTitle;
    }

    public void setSeriesAbbreviatedTitle(String value) {
        this.seriesAbbreviatedTitle = value;
    }

    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String value) {
        this.seriesType = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
