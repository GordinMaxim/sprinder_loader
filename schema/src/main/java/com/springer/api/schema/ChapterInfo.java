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
 *         &lt;element ref="{}ChapterID"/>
 *         &lt;element ref="{}ChapterDOI"/>
 *         &lt;element ref="{}ChapterSequenceNumber"/>
 *         &lt;element ref="{}ChapterTitle"/>
 *         &lt;element ref="{}ChapterFirstPage"/>
 *         &lt;element ref="{}ChapterLastPage"/>
 *         &lt;element ref="{}ChapterCopyright"/>
 *         &lt;element ref="{}ChapterHistory"/>
 *         &lt;element ref="{}ChapterGrants"/>
 *         &lt;element ref="{}ChapterContext"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChapterType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContainsESM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberingDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NumberingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutputMedium" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ChapterInfo {


    /**
     * Gets the value of the chapterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterID();

    /**
     * Sets the value of the chapterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterID(Long value);

    /**
     * Gets the value of the chapterDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getChapterDOI();

    /**
     * Sets the value of the chapterDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterDOI(String value);

    /**
     * Gets the value of the chapterSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterSequenceNumber();

    /**
     * Sets the value of the chapterSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterSequenceNumber(Long value);

    /**
     * Gets the value of the chapterTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterTitle }
     *     
     */
    ChapterTitle getChapterTitle();

    /**
     * Sets the value of the chapterTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterTitle }
     *     
     */
    void setChapterTitle(ChapterTitle value);

    /**
     * Gets the value of the chapterFirstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterFirstPage();

    /**
     * Sets the value of the chapterFirstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterFirstPage(Long value);

    /**
     * Gets the value of the chapterLastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterLastPage();

    /**
     * Sets the value of the chapterLastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterLastPage(Long value);

    /**
     * Gets the value of the chapterCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterCopyright }
     *     
     */
    ChapterCopyright getChapterCopyright();

    /**
     * Sets the value of the chapterCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterCopyright }
     *     
     */
    void setChapterCopyright(ChapterCopyright value);

    /**
     * Gets the value of the chapterHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterHistory }
     *     
     */
    ChapterHistory getChapterHistory();

    /**
     * Sets the value of the chapterHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterHistory }
     *     
     */
    void setChapterHistory(ChapterHistory value);

    /**
     * Gets the value of the chapterGrants property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterGrants }
     *     
     */
    ChapterGrants getChapterGrants();

    /**
     * Sets the value of the chapterGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterGrants }
     *     
     */
    void setChapterGrants(ChapterGrants value);

    /**
     * Gets the value of the chapterContext property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterContext }
     *     
     */
    ChapterContext getChapterContext();

    /**
     * Sets the value of the chapterContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterContext }
     *     
     */
    void setChapterContext(ChapterContext value);

    /**
     * Gets the value of the chapterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getChapterType();

    /**
     * Sets the value of the chapterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterType(String value);

    /**
     * Gets the value of the containsESM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContainsESM();

    /**
     * Sets the value of the containsESM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContainsESM(String value);

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
     * Gets the value of the numberingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getNumberingDepth();

    /**
     * Sets the value of the numberingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumberingDepth(Long value);

    /**
     * Gets the value of the numberingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNumberingStyle();

    /**
     * Sets the value of the numberingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumberingStyle(String value);

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
