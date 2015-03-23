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
 *         &lt;element ref="{}AuthorGroup"/>
 *         &lt;element ref="{}Abstract"/>
 *         &lt;element ref="{}ArticleNote" minOccurs="0"/>
 *         &lt;element ref="{}KeywordGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleHeader {


    /**
     * Gets the value of the authorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorGroup }
     *     
     */
    AuthorGroup getAuthorGroup();

    /**
     * Sets the value of the authorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorGroup }
     *     
     */
    void setAuthorGroup(AuthorGroup value);

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    Abstract getAbstract();

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    void setAbstract(Abstract value);

    /**
     * Gets the value of the articleNote property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleNote }
     *     
     */
    ArticleNote getArticleNote();

    /**
     * Sets the value of the articleNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleNote }
     *     
     */
    void setArticleNote(ArticleNote value);

    /**
     * Gets the value of the keywordGroup property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordGroup }
     *     
     */
    KeywordGroup getKeywordGroup();

    /**
     * Sets the value of the keywordGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordGroup }
     *     
     */
    void setKeywordGroup(KeywordGroup value);

}
