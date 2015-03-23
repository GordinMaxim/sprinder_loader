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
 *         &lt;element ref="{}PartInfo"/>
 *         &lt;element ref="{}Chapter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Part {


    /**
     * Gets the value of the partInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartInfo }
     *     
     */
    PartInfo getPartInfo();

    /**
     * Sets the value of the partInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartInfo }
     *     
     */
    void setPartInfo(PartInfo value);

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link Chapter }
     *     
     */
    Chapter getChapter();

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chapter }
     *     
     */
    void setChapter(Chapter value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

}
