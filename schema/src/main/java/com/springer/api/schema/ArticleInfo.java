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
 *         &lt;element ref="{}ArticleID"/>
 *         &lt;element ref="{}ArticleDOI"/>
 *         &lt;element ref="{}ArticleSequenceNumber"/>
 *         &lt;element ref="{}ArticleTitle"/>
 *         &lt;element ref="{}ArticleSubTitle" minOccurs="0"/>
 *         &lt;element ref="{}ArticleCategory" minOccurs="0"/>
 *         &lt;element ref="{}ArticleFirstPage"/>
 *         &lt;element ref="{}ArticleLastPage"/>
 *         &lt;element ref="{}ArticleHistory"/>
 *         &lt;element ref="{}ArticleEditorialResponsibility" minOccurs="0"/>
 *         &lt;element ref="{}ArticleCopyright"/>
 *         &lt;element ref="{}ArticleGrants"/>
 *         &lt;element ref="{}ArticleContext" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ArticleCitation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArticleType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContainsESM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleInfo {


    /**
     * Gets the value of the articleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleID();

    /**
     * Sets the value of the articleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleID(String value);

    /**
     * Gets the value of the articleDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleDOI();

    /**
     * Sets the value of the articleDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleDOI(String value);

    /**
     * Gets the value of the articleSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleSequenceNumber();

    /**
     * Sets the value of the articleSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleSequenceNumber(String value);

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
     * Gets the value of the articleSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleSubTitle }
     *     
     */
    ArticleSubTitle getArticleSubTitle();

    /**
     * Sets the value of the articleSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleSubTitle }
     *     
     */
    void setArticleSubTitle(ArticleSubTitle value);

    /**
     * Gets the value of the articleCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleCategory();

    /**
     * Sets the value of the articleCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleCategory(String value);

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
     * Gets the value of the articleLastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleLastPage();

    /**
     * Sets the value of the articleLastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleLastPage(String value);

    /**
     * Gets the value of the articleHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleHistory }
     *     
     */
    ArticleHistory getArticleHistory();

    /**
     * Sets the value of the articleHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleHistory }
     *     
     */
    void setArticleHistory(ArticleHistory value);

    /**
     * Gets the value of the articleEditorialResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleEditorialResponsibility();

    /**
     * Sets the value of the articleEditorialResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleEditorialResponsibility(String value);

    /**
     * Gets the value of the articleCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleCopyright }
     *     
     */
    ArticleCopyright getArticleCopyright();

    /**
     * Sets the value of the articleCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleCopyright }
     *     
     */
    void setArticleCopyright(ArticleCopyright value);

    /**
     * Gets the value of the articleGrants property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleGrants }
     *     
     */
    ArticleGrants getArticleGrants();

    /**
     * Sets the value of the articleGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleGrants }
     *     
     */
    void setArticleGrants(ArticleGrants value);

    /**
     * Gets the value of the articleContext property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleContext }
     *     
     */
    ArticleContext getArticleContext();

    /**
     * Sets the value of the articleContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleContext }
     *     
     */
    void setArticleContext(ArticleContext value);

    /**
     * Gets the value of the articleCitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleCitation();

    /**
     * Sets the value of the articleCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleCitation(String value);

    /**
     * Gets the value of the articleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleType();

    /**
     * Sets the value of the articleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleType(String value);

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
