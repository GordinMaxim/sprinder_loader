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
 *         &lt;element ref="{}Acknowledgments" minOccurs="0"/>
 *         &lt;element ref="{}Appendix" minOccurs="0"/>
 *         &lt;element ref="{}Bibliography"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleBackmatter {


    /**
     * Gets the value of the acknowledgments property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgments }
     *     
     */
    Acknowledgments getAcknowledgments();

    /**
     * Sets the value of the acknowledgments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgments }
     *     
     */
    void setAcknowledgments(Acknowledgments value);

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link Appendix }
     *     
     */
    Appendix getAppendix();

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendix }
     *     
     */
    void setAppendix(Appendix value);

    /**
     * Gets the value of the bibliography property.
     * 
     * @return
     *     possible object is
     *     {@link Bibliography }
     *     
     */
    Bibliography getBibliography();

    /**
     * Sets the value of the bibliography property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibliography }
     *     
     */
    void setBibliography(Bibliography value);

}
