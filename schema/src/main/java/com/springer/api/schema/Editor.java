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
 *         &lt;element ref="{}EditorName"/>
 *         &lt;element ref="{}Contact" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AffiliationIDS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Editor {


    /**
     * Gets the value of the editorName property.
     * 
     * @return
     *     possible object is
     *     {@link EditorName }
     *     
     */
    EditorName getEditorName();

    /**
     * Sets the value of the editorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorName }
     *     
     */
    void setEditorName(EditorName value);

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    Contact getContact();

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    void setContact(Contact value);

    /**
     * Gets the value of the affiliationIDS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAffiliationIDS();

    /**
     * Sets the value of the affiliationIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAffiliationIDS(String value);

}
