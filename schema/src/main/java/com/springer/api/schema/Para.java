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
import javax.xml.bind.JAXBElement;


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
 *         &lt;element ref="{}CitationRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Emphasis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExternalRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Figure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InlineMediaObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MediaObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Superscript" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Table" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BlockQuote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DefinitionList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Equation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Footnote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InlineEquation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InternalRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OrderedList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Subscript" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}UnorderedList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Para {


    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineEquation }
     * {@link Equation }
     * {@link CitationRef }
     * {@link BlockQuote }
     * {@link Subscript }
     * {@link Footnote }
     * {@link JAXBElement }{@code <}{@link ImageObject }{@code >}
     * {@link Table }
     * {@link UnorderedList }
     * {@link ExternalRef }
     * {@link String }
     * {@link Figure }
     * {@link Emphasis }
     * {@link MediaObject }
     * {@link DefinitionList }
     * {@link Superscript }
     * {@link OrderedList }
     * {@link InternalRef }
     * 
     * 
     */
    List<Object> getContent();

}
