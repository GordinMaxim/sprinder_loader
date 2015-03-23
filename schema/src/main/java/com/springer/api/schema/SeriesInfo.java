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

package com.springer.api.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}SeriesID">
 *       &lt;sequence>
 *         &lt;element ref="{}SeriesPrintISSN" minOccurs="0"/>
 *         &lt;element ref="{}SeriesElectronicISSN" minOccurs="0"/>
 *         &lt;element ref="{}SeriesTitle"/>
 *         &lt;element ref="{}SeriesAbbreviatedTitle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeriesType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface SeriesInfo
    extends SeriesID
{


    /**
     * Gets the value of the seriesPrintISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesPrintISSN();

    /**
     * Sets the value of the seriesPrintISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesPrintISSN(String value);

    /**
     * Gets the value of the seriesElectronicISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesElectronicISSN();

    /**
     * Sets the value of the seriesElectronicISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesElectronicISSN(String value);

    /**
     * Gets the value of the seriesTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesTitle }
     *     
     */
    SeriesTitle getSeriesTitle();

    /**
     * Sets the value of the seriesTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesTitle }
     *     
     */
    void setSeriesTitle(SeriesTitle value);

    /**
     * Gets the value of the seriesAbbreviatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesAbbreviatedTitle();

    /**
     * Sets the value of the seriesAbbreviatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesAbbreviatedTitle(String value);

    /**
     * Gets the value of the seriesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesType();

    /**
     * Sets the value of the seriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesType(String value);

    /**
     * Gets the value of the tocLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTocLevels();

    /**
     * Sets the value of the tocLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTocLevels(Long value);

}
