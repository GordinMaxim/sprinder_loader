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
 *         &lt;element ref="{}ArticleInfo"/>
 *         &lt;element ref="{}ArticleHeader"/>
 *         &lt;element ref="{}Body" minOccurs="0"/>
 *         &lt;element ref="{}BodyRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ArticleBackmatter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Article {


    /**
     * Gets the value of the articleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleInfo }
     *     
     */
    ArticleInfo getArticleInfo();

    /**
     * Sets the value of the articleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleInfo }
     *     
     */
    void setArticleInfo(ArticleInfo value);

    /**
     * Gets the value of the articleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleHeader }
     *     
     */
    ArticleHeader getArticleHeader();

    /**
     * Sets the value of the articleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleHeader }
     *     
     */
    void setArticleHeader(ArticleHeader value);

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    Body getBody();

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    void setBody(Body value);

    /**
     * Gets the value of the bodyReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyRef }
     * 
     * 
     */
    List<BodyRef> getBodyReves();

    /**
     * Gets the value of the articleBackmatter property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleBackmatter }
     *     
     */
    ArticleBackmatter getArticleBackmatter();

    /**
     * Sets the value of the articleBackmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleBackmatter }
     *     
     */
    void setArticleBackmatter(ArticleBackmatter value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

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
