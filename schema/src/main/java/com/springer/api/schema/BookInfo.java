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
 *         &lt;element ref="{}BookID"/>
 *         &lt;element ref="{}BookTitle"/>
 *         &lt;element ref="{}BookSubTitle"/>
 *         &lt;element ref="{}BookVolumeNumber"/>
 *         &lt;element ref="{}BookSequenceNumber"/>
 *         &lt;element ref="{}BookDOI"/>
 *         &lt;element ref="{}BookTitleID"/>
 *         &lt;element ref="{}BookPrintISBN"/>
 *         &lt;element ref="{}BookElectronicISBN"/>
 *         &lt;element ref="{}BookChapterCount"/>
 *         &lt;element ref="{}BookCopyright"/>
 *         &lt;element ref="{}BookSubjectGroup"/>
 *         &lt;element ref="{}BookContext"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookProductType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContainsESM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberingDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OutputMedium" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BookInfo {


    /**
     * Gets the value of the bookID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookID();

    /**
     * Sets the value of the bookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookID(String value);

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link BookTitle }
     *     
     */
    BookTitle getBookTitle();

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTitle }
     *     
     */
    void setBookTitle(BookTitle value);

    /**
     * Gets the value of the bookSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookSubTitle();

    /**
     * Sets the value of the bookSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookSubTitle(String value);

    /**
     * Gets the value of the bookVolumeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookVolumeNumber();

    /**
     * Sets the value of the bookVolumeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookVolumeNumber(Long value);

    /**
     * Gets the value of the bookSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookSequenceNumber();

    /**
     * Sets the value of the bookSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookSequenceNumber(Long value);

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
     * Gets the value of the bookTitleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookTitleID();

    /**
     * Sets the value of the bookTitleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookTitleID(Long value);

    /**
     * Gets the value of the bookPrintISBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookPrintISBN();

    /**
     * Sets the value of the bookPrintISBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookPrintISBN(String value);

    /**
     * Gets the value of the bookElectronicISBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookElectronicISBN();

    /**
     * Sets the value of the bookElectronicISBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookElectronicISBN(String value);

    /**
     * Gets the value of the bookChapterCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookChapterCount();

    /**
     * Sets the value of the bookChapterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookChapterCount(Long value);

    /**
     * Gets the value of the bookCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link BookCopyright }
     *     
     */
    BookCopyright getBookCopyright();

    /**
     * Sets the value of the bookCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookCopyright }
     *     
     */
    void setBookCopyright(BookCopyright value);

    /**
     * Gets the value of the bookSubjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BookSubjectGroup }
     *     
     */
    BookSubjectGroup getBookSubjectGroup();

    /**
     * Sets the value of the bookSubjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookSubjectGroup }
     *     
     */
    void setBookSubjectGroup(BookSubjectGroup value);

    /**
     * Gets the value of the bookContext property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesID }
     *     
     */
    SeriesID getBookContext();

    /**
     * Sets the value of the bookContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesID }
     *     
     */
    void setBookContext(SeriesID value);

    /**
     * Gets the value of the bookProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookProductType();

    /**
     * Sets the value of the bookProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookProductType(String value);

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
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getMediaType();

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMediaType(String value);

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
