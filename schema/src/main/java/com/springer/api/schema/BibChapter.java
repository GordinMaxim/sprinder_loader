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
 *         &lt;element ref="{}BibAuthorName" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}ChapterTitle"/>
 *         &lt;element ref="{}BibEditorName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Eds" minOccurs="0"/>
 *         &lt;element ref="{}BookTitle"/>
 *         &lt;element ref="{}ConfEventName" minOccurs="0"/>
 *         &lt;element ref="{}ConfEventLocation" minOccurs="0"/>
 *         &lt;element ref="{}ConfEventDate" minOccurs="0"/>
 *         &lt;element ref="{}EditionNumber"/>
 *         &lt;element ref="{}SeriesTitle"/>
 *         &lt;element ref="{}PublisherName"/>
 *         &lt;element ref="{}PublisherLocation"/>
 *         &lt;element ref="{}BibComments" minOccurs="0"/>
 *         &lt;element ref="{}NumberInSeries" minOccurs="0"/>
 *         &lt;element ref="{}FirstPage" minOccurs="0"/>
 *         &lt;element ref="{}LastPage" minOccurs="0"/>
 *         &lt;element ref="{}Occurrence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BibChapter {


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
     * Gets the value of the chapterTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterTitle }
     *     
     */
    ChapterTitle getChapterTitle();

    /**
     * Sets the value of the chapterTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterTitle }
     *     
     */
    void setChapterTitle(ChapterTitle value);

    /**
     * Gets the value of the bibEditorNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibEditorNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibEditorNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibEditorName }
     * 
     * 
     */
    List<BibEditorName> getBibEditorNames();

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
     * Gets the value of the confEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getConfEventName();

    /**
     * Sets the value of the confEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setConfEventName(String value);

    /**
     * Gets the value of the confEventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getConfEventLocation();

    /**
     * Sets the value of the confEventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setConfEventLocation(String value);

    /**
     * Gets the value of the confEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getConfEventDate();

    /**
     * Sets the value of the confEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setConfEventDate(String value);

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
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFirstPage();

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFirstPage(String value);

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLastPage();

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLastPage(String value);

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Occurrence }
     *     
     */
    Occurrence getOccurrence();

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Occurrence }
     *     
     */
    void setOccurrence(Occurrence value);

}
