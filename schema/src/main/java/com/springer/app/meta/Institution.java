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

package com.springer.app.meta;



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
 *         &lt;element ref="{http://www.springer.com/app/meta}OrgName"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}GeoOrg" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Institution {


    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOrgName();

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOrgName(String value);

    /**
     * Gets the value of the geoOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getGeoOrg();

    /**
     * Sets the value of the geoOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setGeoOrg(String value);

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCountry();

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCountry(String value);

    /**
     * Gets the value of the geo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getGeo();

    /**
     * Sets the value of the geo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setGeo(String value);

}
