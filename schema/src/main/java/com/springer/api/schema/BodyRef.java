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
 *       &lt;attribute name="FileRef" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PDFType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BodyRef {


    /**
     * Gets the value of the fileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFileRef();

    /**
     * Sets the value of the fileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFileRef(String value);

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOutputMedium();

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOutputMedium(String value);

    /**
     * Gets the value of the pdfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPDFType();

    /**
     * Sets the value of the pdfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPDFType(String value);

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTargetType();

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTargetType(String value);

}
