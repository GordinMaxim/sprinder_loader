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
 *         &lt;sequence>
 *           &lt;element ref="{}Initials"/>
 *           &lt;element ref="{}NoInitials"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}FamilyName"/>
 *         &lt;element ref="{}Particle" minOccurs="0"/>
 *         &lt;element ref="{}Suffix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BibAuthorName {


    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getInitials();

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setInitials(String value);

    /**
     * Gets the value of the noInitials property.
     * 
     * @return
     *     possible object is
     *     {@link NoInitials }
     *     
     */
    NoInitials getNoInitials();

    /**
     * Sets the value of the noInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInitials }
     *     
     */
    void setNoInitials(NoInitials value);

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFamilyName();

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFamilyName(String value);

    /**
     * Gets the value of the particle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getParticle();

    /**
     * Sets the value of the particle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setParticle(String value);

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSuffix();

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSuffix(String value);

}
