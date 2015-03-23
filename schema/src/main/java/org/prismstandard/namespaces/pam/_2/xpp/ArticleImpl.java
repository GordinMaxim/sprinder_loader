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
package org.prismstandard.namespaces.pam._2.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.prismstandard.namespaces.pam._2.Article;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;

/**
 * The Class ArticleImpl.
 */
public class ArticleImpl extends BaseSchemaEntity implements Article {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The identifier. */
    protected String identifier;
    
    /** The title. */
    protected String title;
    
    /** The creators. */
    protected List<String> creators;
    
    /** The publication name. */
    protected String publicationName;
    
    /** The isbn. */
    protected String isbn;
    
    /** The issn. */
    protected String issn;
    
    /** The doi. */
    protected String doi;
    
    /** The publisher. */
    protected String publisher;
    
    /** The publication date. */
    protected String publicationDate;
    
    /** The volume. */
    protected String volume;
    
    /** The number. */
    protected String number;
    
    /** The starting page. */
    protected String startingPage;
    
    /** The url. */
    protected String url;
    
    /** The copyright. */
    protected String copyright;
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getIdentifier()
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setIdentifier(java.lang.String)
     */
    public void setIdentifier(String value) {
        identifier = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getTitle()
     */
    public String getTitle() {
        return title;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setTitle(java.lang.String)
     */
    public void setTitle(String value) {
        title = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getCreators()
     */
    public List<String> getCreators() {
        if (creators == null) {
            creators = new ArrayList<String>();
        }
        return this.creators;
    }
    
    /**
     * Sets the creators.
     * 
     * @param value the new creators
     */
    public void setCreators(List<String> value) {
        this.creators = value;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getPublicationName()
     */
    public String getPublicationName() {
        return publicationName;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setPublicationName(java.lang.String)
     */
    public void setPublicationName(String value) {
        publicationName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getIsbn()
     */
    public String getIsbn() {
        return isbn;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setIsbn(java.lang.String)
     */
    public void setIsbn(String value) {
        isbn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getIssn()
     */
    public String getIssn() {
        return issn;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setIssn(java.lang.String)
     */
    public void setIssn(String value) {
        issn = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getDoi()
     */
    public String getDoi() {
        return doi;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setDoi(java.lang.String)
     */
    public void setDoi(String value) {
        doi = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getPublisher()
     */
    public String getPublisher() {
        return publisher;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setPublisher(java.lang.String)
     */
    public void setPublisher(String value) {
        publisher = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getPublicationDate()
     */
    public String getPublicationDate() {
        return publicationDate;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setPublicationDate(java.lang.String)
     */
    public void setPublicationDate(String value) {
        publicationDate = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getVolume()
     */
    public String getVolume() {
        return volume;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setVolume(java.lang.String)
     */
    public void setVolume(String value) {
        volume = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getNumber()
     */
    public String getNumber() {
        return number;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setNumber(java.lang.String)
     */
    public void setNumber(String value) {
        number = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getStartingPage()
     */
    public String getStartingPage() {
        return startingPage;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setStartingPage(java.lang.String)
     */
    public void setStartingPage(String value) {
        startingPage = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getUrl()
     */
    public String getUrl() {
        return url;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setUrl(java.lang.String)
     */
    public void setUrl(String value) {
        url = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#getCopyright()
     */
    public String getCopyright() {
        return copyright;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Article#setCopyright(java.lang.String)
     */
    public void setCopyright(String value) {
        copyright = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("dc:identifier")) {
                setIdentifier(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("dc:title")) {
                setTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("dc:creator")) {
                getCreators().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:publicationName")) {
                setPublicationName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:isbn")) {
                setIsbn(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:issn")) {
                setIssn(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:doi")) {
                setDoi(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("dc:publisher")) {
                setPublisher(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:publicationDate")) {
                setPublicationDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:volume")) {
                setVolume(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:number")) {
                setNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:startingPage")) {
                setStartingPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:url")) {
                setUrl(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("prism:copyright")) {
                setCopyright(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
