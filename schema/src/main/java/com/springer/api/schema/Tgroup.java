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
 *         &lt;element ref="{}colspec" maxOccurs="unbounded"/>
 *         &lt;element ref="{}thead"/>
 *         &lt;element ref="{}tbody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="align" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cols" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Tgroup {


    /**
     * Gets the value of the colspecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colspecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColspecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colspec }
     * 
     * 
     */
    List<Colspec> getColspecs();

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    Thead getThead();

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    void setThead(Thead value);

    /**
     * Gets the value of the tbody property.
     * 
     * @return
     *     possible object is
     *     {@link Tbody }
     *     
     */
    Tbody getTbody();

    /**
     * Sets the value of the tbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tbody }
     *     
     */
    void setTbody(Tbody value);

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlign();

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlign(String value);

    /**
     * Gets the value of the cols property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCols();

    /**
     * Sets the value of the cols property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCols(Long value);

}
