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
 *         &lt;element ref="{}Caption"/>
 *         &lt;element ref="{}Table" maxOccurs="unbounded"/>
 *         &lt;element ref="{}APPId" maxOccurs="unbounded"/>
 *         &lt;element ref="{}File" maxOccurs="unbounded"/>
 *         &lt;element ref="{}FullText" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Location" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ArticleTitle" maxOccurs="unbounded"/>
 *         &lt;element ref="{}DOI" maxOccurs="unbounded"/>
 *         &lt;element ref="{}IssueId" maxOccurs="unbounded"/>
 *         &lt;element ref="{}JournalId" maxOccurs="unbounded"/>
 *         &lt;element ref="{}PubDate" maxOccurs="unbounded"/>
 *         &lt;element ref="{}SourceTitle" maxOccurs="unbounded"/>
 *         &lt;element ref="{}SourceType" maxOccurs="unbounded"/>
 *         &lt;element ref="{}VolumeId" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Authors" minOccurs="0"/>
 *         &lt;element ref="{}Institutions" minOccurs="0"/>
 *         &lt;element ref="{}ChapterId" minOccurs="0"/>
 *         &lt;element ref="{}BookTitleId" minOccurs="0"/>
 *         &lt;element ref="{}BookDOI" minOccurs="0"/>
 *         &lt;element ref="{}ISXN"/>
 *         &lt;element ref="{}SubjectCollection"/>
 *         &lt;element ref="{}Subjects"/>
 *         &lt;element ref="{}CopyrightHolder" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Keywords" maxOccurs="unbounded"/>
 *         &lt;element ref="{}OpenAccess" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ImageType"/>
 *         &lt;element ref="{}ArticleURI" minOccurs="0"/>
 *         &lt;element ref="{}Provider"/>
 *         &lt;element ref="{}DateLoaded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Image {


    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    Caption getCaption();

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    void setCaption(Caption value);

    /**
     * Gets the value of the tables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * 
     * 
     */
    List<Table> getTables();

    /**
     * Gets the value of the appIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPPIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getAPPIds();

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link File }
     * 
     * 
     */
    List<File> getFiles();

    /**
     * Gets the value of the fullTexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullTexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullText }
     * 
     * 
     */
    List<FullText> getFullTexts();

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getLocations();

    /**
     * Gets the value of the articleTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleTitle }
     * 
     * 
     */
    List<ArticleTitle> getArticleTitles();

    /**
     * Gets the value of the dois property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dois property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getDOIS();

    /**
     * Gets the value of the issueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getIssueIds();

    /**
     * Gets the value of the journalIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getJournalIds();

    /**
     * Gets the value of the pubDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getPubDates();

    /**
     * Gets the value of the sourceTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getSourceTitles();

    /**
     * Gets the value of the sourceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getSourceTypes();

    /**
     * Gets the value of the volumeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<Long> getVolumeIds();

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
     * Gets the value of the chapterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterId();

    /**
     * Sets the value of the chapterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterId(Long value);

    /**
     * Gets the value of the bookTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookTitleId();

    /**
     * Sets the value of the bookTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookTitleId(Long value);

    /**
     * Gets the value of the bookDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookDOI();

    /**
     * Sets the value of the bookDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookDOI(String value);

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link ISXN }
     *     
     */
    ISXN getISXN();

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISXN }
     *     
     */
    void setISXN(ISXN value);

    /**
     * Gets the value of the subjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectCollection }
     *     
     */
    SubjectCollection getSubjectCollection();

    /**
     * Sets the value of the subjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectCollection }
     *     
     */
    void setSubjectCollection(SubjectCollection value);

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    Subjects getSubjects();

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    void setSubjects(Subjects value);

    /**
     * Gets the value of the copyrightHolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightHolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getCopyrightHolders();

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keywords }
     * 
     * 
     */
    List<Keywords> getKeywords();

    /**
     * Gets the value of the openAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    List<Boolean> getOpenAccesses();

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getImageType();

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setImageType(String value);

    /**
     * Gets the value of the articleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleURI();

    /**
     * Sets the value of the articleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleURI(String value);

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getProvider();

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setProvider(String value);

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLanguage();

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLanguage(String value);

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLang();

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLang(String value);

}
