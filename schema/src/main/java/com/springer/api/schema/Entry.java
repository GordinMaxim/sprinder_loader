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
 *         &lt;element ref="{}SimplePara" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="align" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="morerows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nameend" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namest" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Entry {


    /**
     * Gets the value of the simplePara property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePara }
     *     
     */
    SimplePara getSimplePara();

    /**
     * Sets the value of the simplePara property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePara }
     *     
     */
    void setSimplePara(SimplePara value);

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
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getChar();

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChar(String value);

    /**
     * Gets the value of the colname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getColname();

    /**
     * Sets the value of the colname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setColname(String value);

    /**
     * Gets the value of the morerows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getMorerows();

    /**
     * Sets the value of the morerows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMorerows(Long value);

    /**
     * Gets the value of the nameend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNameend();

    /**
     * Sets the value of the nameend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNameend(String value);

    /**
     * Gets the value of the namest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNamest();

    /**
     * Sets the value of the namest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNamest(String value);

}
