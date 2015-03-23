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

import java.util.Date;
import java.util.List;


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
 *         &lt;element ref="{http://www.springer.com/app/meta}DateLoaded" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Authors"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Institutions"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Date"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Type"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}DOI"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Title"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}ISXN"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}VolumeId" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}IssueId" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Journal" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}PubName" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}ArticleFirstPage" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Book" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Publication"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}PublicationType"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}SubjectGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Info {


    /**
     * Gets the value of the dateLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Date getDateLoaded();

    /**
     * Sets the value of the dateLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDateLoaded(Date value);

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    Authors getAuthors();

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    void setAuthors(Authors value);

    /**
     * Gets the value of the institutions property.
     * 
     * @return
     *     possible object is
     *     {@link Institutions }
     *     
     */
    Institutions getInstitutions();

    /**
     * Sets the value of the institutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Institutions }
     *     
     */
    void setInstitutions(Institutions value);

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDate(String value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setType(String value);

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDOI();

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDOI(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    Title getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    void setTitle(Title value);

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getISXN();

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setISXN(String value);

    /**
     * Gets the value of the volumeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getVolumeId();

    /**
     * Sets the value of the volumeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeId(Long value);

    /**
     * Gets the value of the issueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getIssueId();

    /**
     * Sets the value of the issueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueId(Long value);

    /**
     * Gets the value of the journals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getJournals();

    /**
     * Gets the value of the pubNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getPubNames();

    /**
     * Gets the value of the articleFirstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleFirstPage();

    /**
     * Sets the value of the articleFirstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleFirstPage(String value);

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBook();

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBook(String value);

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublication();

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublication(String value);

    /**
     * Gets the value of the publicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublicationType();

    /**
     * Sets the value of the publicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublicationType(String value);

    /**
     * Gets the value of the subjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectGroup }
     *     
     */
    SubjectGroup getSubjectGroup();

    /**
     * Sets the value of the subjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectGroup }
     *     
     */
    void setSubjectGroup(SubjectGroup value);

}
