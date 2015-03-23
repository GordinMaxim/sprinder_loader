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

import com.springer.app.meta.Info;


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
 *         &lt;element ref="{}PublisherInfo"/>
 *         &lt;element ref="{}Journal"/>
 *         &lt;element ref="{}Series"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Info"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Publisher {


    /**
     * Gets the value of the publisherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherInfo }
     *     
     */
    PublisherInfo getPublisherInfo();

    /**
     * Sets the value of the publisherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherInfo }
     *     
     */
    void setPublisherInfo(PublisherInfo value);

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link Journal }
     *     
     */
    Journal getJournal();

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journal }
     *     
     */
    void setJournal(Journal value);

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link Series }
     *     
     */
    Series getSeries();

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link Series }
     *     
     */
    void setSeries(Series value);

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    Info getInfo();

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    void setInfo(Info value);

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
