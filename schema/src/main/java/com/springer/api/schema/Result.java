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
 *         &lt;element ref="{}Publisher"/>
 *         &lt;element ref="{}Images"/>
 *         &lt;element ref="{}total"/>
 *         &lt;element ref="{}start"/>
 *         &lt;element ref="{}pageLength"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Result {


    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link Publisher }
     *     
     */
    Publisher getPublisher();

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publisher }
     *     
     */
    void setPublisher(Publisher value);

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    Images getImages();

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    void setImages(Images value);

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTotal();

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTotal(Long value);

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getStart();

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStart(Long value);

    /**
     * Gets the value of the pageLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPageLength();

    /**
     * Sets the value of the pageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPageLength(Long value);

}
