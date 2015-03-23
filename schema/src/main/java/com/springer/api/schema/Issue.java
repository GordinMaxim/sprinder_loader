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
 *         &lt;element ref="{}IssueInfo"/>
 *         &lt;element ref="{}IssueHeader" minOccurs="0"/>
 *         &lt;element ref="{}Article"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IssueType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Issue {


    /**
     * Gets the value of the issueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssueInfo }
     *     
     */
    IssueInfo getIssueInfo();

    /**
     * Sets the value of the issueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueInfo }
     *     
     */
    void setIssueInfo(IssueInfo value);

    /**
     * Gets the value of the issueHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EditorGroup }
     *     
     */
    EditorGroup getIssueHeader();

    /**
     * Sets the value of the issueHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorGroup }
     *     
     */
    void setIssueHeader(EditorGroup value);

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    Article getArticle();

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    void setArticle(Article value);

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueType();

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueType(String value);

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

}
