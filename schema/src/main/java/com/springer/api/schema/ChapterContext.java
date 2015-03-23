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
 *         &lt;element ref="{}PartID" minOccurs="0"/>
 *         &lt;element ref="{}BookID"/>
 *         &lt;element ref="{}BookTitle"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ChapterContext
    extends SeriesID
{


    /**
     * Gets the value of the partID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPartID();

    /**
     * Sets the value of the partID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartID(Long value);

    /**
     * Gets the value of the bookID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookID();

    /**
     * Sets the value of the bookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookID(String value);

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

}
