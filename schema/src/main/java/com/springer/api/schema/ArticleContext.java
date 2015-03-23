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
 *         &lt;element ref="{}JournalID"/>
 *         &lt;element ref="{}VolumeIDStart"/>
 *         &lt;element ref="{}VolumeIDEnd"/>
 *         &lt;element ref="{}IssueIDStart"/>
 *         &lt;element ref="{}IssueIDEnd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleContext {


    /**
     * Gets the value of the journalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalID();

    /**
     * Sets the value of the journalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalID(String value);

    /**
     * Gets the value of the volumeIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVolumeIDStart();

    /**
     * Sets the value of the volumeIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeIDStart(String value);

    /**
     * Gets the value of the volumeIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVolumeIDEnd();

    /**
     * Sets the value of the volumeIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeIDEnd(String value);

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

}
