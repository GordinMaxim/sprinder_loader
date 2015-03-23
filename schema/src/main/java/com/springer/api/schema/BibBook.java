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

import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}InstitutionalAuthorName"/>
 *         &lt;element ref="{}BibAuthorName" maxOccurs="unbounded"/>
 *         &lt;element ref="{}BibEditorName"/>
 *         &lt;element ref="{}Eds"/>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}BookTitle"/>
 *         &lt;element ref="{}NumberInSeries" minOccurs="0"/>
 *         &lt;element ref="{}EditionNumber"/>
 *         &lt;element ref="{}SeriesTitle" minOccurs="0"/>
 *         &lt;element ref="{}PublisherName"/>
 *         &lt;element ref="{}PublisherLocation"/>
 *         &lt;element ref="{}BibComments"/>
 *         &lt;element ref="{}Occurrence" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BibBook {


    /**
     * Gets the value of the institutionalAuthorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getInstitutionalAuthorName();

    /**
     * Sets the value of the institutionalAuthorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setInstitutionalAuthorName(String value);

    /**
     * Gets the value of the bibAuthorNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibAuthorNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibAuthorNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibAuthorName }
     * 
     * 
     */
    List<BibAuthorName> getBibAuthorNames();

    /**
     * Gets the value of the bibEditorName property.
     * 
     * @return
     *     possible object is
     *     {@link BibEditorName }
     *     
     */
    BibEditorName getBibEditorName();

    /**
     * Sets the value of the bibEditorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibEditorName }
     *     
     */
    void setBibEditorName(BibEditorName value);

    /**
     * Gets the value of the eds property.
     * 
     * @return
     *     possible object is
     *     {@link Eds }
     *     
     */
    Eds getEds();

    /**
     * Sets the value of the eds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eds }
     *     
     */
    void setEds(Eds value);

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getYear();

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setYear(String value);

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link BookTitle }
     *     
     */
    BookTitle getBookTitle();

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTitle }
     *     
     */
    void setBookTitle(BookTitle value);

    /**
     * Gets the value of the numberInSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNumberInSeries();

    /**
     * Sets the value of the numberInSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumberInSeries(String value);

    /**
     * Gets the value of the editionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getEditionNumber();

    /**
     * Sets the value of the editionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEditionNumber(Long value);

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
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherName();

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherName(String value);

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherLocation();

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherLocation(String value);

    /**
     * Gets the value of the bibComments property.
     * 
     * @return
     *     possible object is
     *     {@link BibComments }
     *     
     */
    BibComments getBibComments();

    /**
     * Sets the value of the bibComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibComments }
     *     
     */
    void setBibComments(BibComments value);

    /**
     * Gets the value of the occurrences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Occurrence }
     * 
     * 
     */
    List<Occurrence> getOccurrences();

}
