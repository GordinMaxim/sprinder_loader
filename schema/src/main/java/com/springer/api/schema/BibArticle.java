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
 *         &lt;element ref="{}BibAuthorName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Etal" minOccurs="0"/>
 *         &lt;element ref="{}BibComments" minOccurs="0"/>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}ArticleTitle"/>
 *         &lt;element ref="{}NoArticleTitle"/>
 *         &lt;element ref="{}JournalTitle"/>
 *         &lt;element ref="{}VolumeID"/>
 *         &lt;element ref="{}IssueID" minOccurs="0"/>
 *         &lt;element ref="{}FirstPage"/>
 *         &lt;element ref="{}LastPage"/>
 *         &lt;element ref="{}Occurrence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BibArticle {


    /**
     * Gets the value of the bibAuthorNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibAuthorNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibAuthorNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibAuthorName }
     * 
     * 
     */
    List<BibAuthorName> getBibAuthorNames();

    /**
     * Gets the value of the etal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getEtal();

    /**
     * Sets the value of the etal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEtal(String value);

    /**
     * Gets the value of the bibComments property.
     * 
     * @return
     *     possible object is
     *     {@link BibComments }
     *     
     */
    BibComments getBibComments();

    /**
     * Sets the value of the bibComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibComments }
     *     
     */
    void setBibComments(BibComments value);

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getYear();

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setYear(String value);

    /**
     * Gets the value of the articleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleTitle }
     *     
     */
    ArticleTitle getArticleTitle();

    /**
     * Sets the value of the articleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleTitle }
     *     
     */
    void setArticleTitle(ArticleTitle value);

    /**
     * Gets the value of the noArticleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link NoArticleTitle }
     *     
     */
    NoArticleTitle getNoArticleTitle();

    /**
     * Sets the value of the noArticleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoArticleTitle }
     *     
     */
    void setNoArticleTitle(NoArticleTitle value);

    /**
     * Gets the value of the journalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalTitle();

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalTitle(String value);

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVolumeID();

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeID(String value);

    /**
     * Gets the value of the issueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueID();

    /**
     * Sets the value of the issueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueID(String value);

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFirstPage();

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFirstPage(String value);

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLastPage();

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLastPage(String value);

    /**
     * Gets the value of the occurrences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Occurrence }
     * 
     * 
     */
    List<Occurrence> getOccurrences();

}
