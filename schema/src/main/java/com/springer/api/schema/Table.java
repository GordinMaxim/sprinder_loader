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
 *         &lt;element ref="{}Table" minOccurs="0"/>
 *         &lt;element ref="{}Caption" minOccurs="0"/>
 *         &lt;element ref="{}tgroup" minOccurs="0"/>
 *         &lt;element ref="{}tfooter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Float" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Table {


    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    Table getTable();

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    void setTable(Table value);

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    Caption getCaption();

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    void setCaption(Caption value);

    /**
     * Gets the value of the tgroup property.
     * 
     * @return
     *     possible object is
     *     {@link Tgroup }
     *     
     */
    Tgroup getTgroup();

    /**
     * Sets the value of the tgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tgroup }
     *     
     */
    void setTgroup(Tgroup value);

    /**
     * Gets the value of the tfooter property.
     * 
     * @return
     *     possible object is
     *     {@link Tfooter }
     *     
     */
    Tfooter getTfooter();

    /**
     * Sets the value of the tfooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfooter }
     *     
     */
    void setTfooter(Tfooter value);

    /**
     * Gets the value of the float property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFloat();

    /**
     * Sets the value of the float property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFloat(String value);

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
