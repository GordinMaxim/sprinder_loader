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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PartID"/>
 *         &lt;element ref="{}PartNumber" minOccurs="0"/>
 *         &lt;element ref="{}PartSequenceNumber"/>
 *         &lt;element ref="{}PartTitle"/>
 *         &lt;element ref="{}PartChapterCount"/>
 *         &lt;element ref="{}PartContext"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PartInfo {


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
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPartNumber();

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartNumber(String value);

    /**
     * Gets the value of the partSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPartSequenceNumber();

    /**
     * Sets the value of the partSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartSequenceNumber(Long value);

    /**
     * Gets the value of the partTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPartTitle();

    /**
     * Sets the value of the partTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartTitle(String value);

    /**
     * Gets the value of the partChapterCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPartChapterCount();

    /**
     * Sets the value of the partChapterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartChapterCount(Long value);

    /**
     * Gets the value of the partContext property.
     * 
     * @return
     *     possible object is
     *     {@link PartContext }
     *     
     */
    PartContext getPartContext();

    /**
     * Sets the value of the partContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartContext }
     *     
     */
    void setPartContext(PartContext value);

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
