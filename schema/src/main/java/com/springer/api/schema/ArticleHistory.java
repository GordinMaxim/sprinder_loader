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
 *         &lt;element ref="{}RegistrationDate" minOccurs="0"/>
 *         &lt;element ref="{}Received" minOccurs="0"/>
 *         &lt;element ref="{}Revised" minOccurs="0"/>
 *         &lt;element ref="{}Accepted" minOccurs="0"/>
 *         &lt;element ref="{}OnlineDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleHistory {


    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDate }
     *     
     */
    RegistrationDate getRegistrationDate();

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDate }
     *     
     */
    void setRegistrationDate(RegistrationDate value);

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link Received }
     *     
     */
    Received getReceived();

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link Received }
     *     
     */
    void setReceived(Received value);

    /**
     * Gets the value of the revised property.
     * 
     * @return
     *     possible object is
     *     {@link Revised }
     *     
     */
    Revised getRevised();

    /**
     * Sets the value of the revised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revised }
     *     
     */
    void setRevised(Revised value);

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link Accepted }
     *     
     */
    Accepted getAccepted();

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accepted }
     *     
     */
    void setAccepted(Accepted value);

    /**
     * Gets the value of the onlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDate }
     *     
     */
    OnlineDate getOnlineDate();

    /**
     * Sets the value of the onlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDate }
     *     
     */
    void setOnlineDate(OnlineDate value);

}
