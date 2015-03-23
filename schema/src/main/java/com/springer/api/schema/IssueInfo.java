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
 *         &lt;element ref="{}IssueIDStart"/>
 *         &lt;element ref="{}IssueIDEnd"/>
 *         &lt;element ref="{}IssueTitle" minOccurs="0"/>
 *         &lt;element ref="{}IssueArticleCount"/>
 *         &lt;element ref="{}IssueHistory"/>
 *         &lt;element ref="{}IssueCopyright"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IssueType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface IssueInfo {


    /**
     * Gets the value of the issueIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueIDStart();

    /**
     * Sets the value of the issueIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueIDStart(String value);

    /**
     * Gets the value of the issueIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueIDEnd();

    /**
     * Sets the value of the issueIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueIDEnd(String value);

    /**
     * Gets the value of the issueTitle property.
     * 
     * @return
     *     possible object is
     *     {@link IssueTitle }
     *     
     */
    IssueTitle getIssueTitle();

    /**
     * Sets the value of the issueTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTitle }
     *     
     */
    void setIssueTitle(IssueTitle value);

    /**
     * Gets the value of the issueArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueArticleCount();

    /**
     * Sets the value of the issueArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueArticleCount(String value);

    /**
     * Gets the value of the issueHistory property.
     * 
     * @return
     *     possible object is
     *     {@link IssueHistory }
     *     
     */
    IssueHistory getIssueHistory();

    /**
     * Sets the value of the issueHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueHistory }
     *     
     */
    void setIssueHistory(IssueHistory value);

    /**
     * Gets the value of the issueCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link IssueCopyright }
     *     
     */
    IssueCopyright getIssueCopyright();

    /**
     * Sets the value of the issueCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueCopyright }
     *     
     */
    void setIssueCopyright(IssueCopyright value);

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
     * Gets the value of the tocLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTocLevels();

    /**
     * Sets the value of the tocLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTocLevels(Long value);

}
