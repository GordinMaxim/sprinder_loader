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
 *         &lt;element ref="{}query"/>
 *         &lt;element ref="{}apiKey" minOccurs="0"/>
 *         &lt;element ref="{}result"/>
 *         &lt;element ref="{}records"/>
 *         &lt;element ref="{}facets"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Response {


    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getQuery();

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setQuery(String value);

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getApiKey();

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setApiKey(String value);

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    Result getResult();

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    void setResult(Result value);

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link Records }
     *     
     */
    Records getRecords();

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link Records }
     *     
     */
    void setRecords(Records value);

    /**
     * Gets the value of the facets property.
     * 
     * @return
     *     possible object is
     *     {@link Facets }
     *     
     */
    Facets getFacets();

    /**
     * Sets the value of the facets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facets }
     *     
     */
    void setFacets(Facets value);

}
