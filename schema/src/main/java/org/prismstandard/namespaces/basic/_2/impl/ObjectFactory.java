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

package org.prismstandard.namespaces.basic._2.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prismstandard.namespaces.basic._2.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PublicationName_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "publicationName");
    private final static QName _Url_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "url");
    private final static QName _PublicationDate_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "publicationDate");
    private final static QName _StartingPage_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "startingPage");
    private final static QName _Number_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "number");
    private final static QName _Copyright_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "copyright");
    private final static QName _Isbn_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "isbn");
    private final static QName _Issn_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "issn");
    private final static QName _Volume_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "volume");
    private final static QName _Doi_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "doi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prismstandard.namespaces.basic._2.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "publicationName")
    public JAXBElement<String> createPublicationName(String value) {
        return new JAXBElement<String>(_PublicationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "publicationDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublicationDate(String value) {
        return new JAXBElement<String>(_PublicationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "startingPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStartingPage(String value) {
        return new JAXBElement<String>(_StartingPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "number")
    public JAXBElement<String> createNumber(String value) {
        return new JAXBElement<String>(_Number_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "isbn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsbn(String value) {
        return new JAXBElement<String>(_Isbn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "issn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIssn(String value) {
        return new JAXBElement<String>(_Issn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "volume")
    public JAXBElement<String> createVolume(String value) {
        return new JAXBElement<String>(_Volume_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "doi")
    public JAXBElement<String> createDoi(String value) {
        return new JAXBElement<String>(_Doi_QNAME, String.class, null, value);
    }

}
