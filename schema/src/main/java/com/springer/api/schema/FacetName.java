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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facet-name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="facet-name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="subject"/>
 *     &lt;enumeration value="keyword"/>
 *     &lt;enumeration value="pub"/>
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="country"/>
 *     &lt;enumeration value="imagetype"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "facet-name")
@XmlEnum
public enum FacetName {

    @XmlEnumValue("subject")
    SUBJECT("subject"),
    @XmlEnumValue("keyword")
    KEYWORD("keyword"),
    @XmlEnumValue("pub")
    PUB("pub"),
    @XmlEnumValue("year")
    YEAR("year"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("imagetype")
    IMAGETYPE("imagetype");
    private final String value;

    FacetName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacetName fromValue(String v) {
        for (FacetName c: FacetName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
