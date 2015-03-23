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
package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibChapter;
import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Citation;

/**
 * The Class CitationImpl.
 */
public class CitationImpl extends BaseSchemaEntity implements Citation {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The citation number. */
    protected String citationNumber;
    
    /** The bib article. */
    protected BibArticleImpl bibArticle;
    
    /** The bib book. */
    protected BibBookImpl bibBook;
    
    /** The bib chapter. */
    protected BibChapterImpl bibChapter;
    
    /** The bib unstructured. */
    protected BibUnstructuredImpl bibUnstructured;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getCitationNumber()
     */
    public String getCitationNumber() {
        return citationNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setCitationNumber(java.lang.String)
     */
    public void setCitationNumber(String value) {
        citationNumber = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getBibArticle()
     */
    public BibArticle getBibArticle() {
        return bibArticle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setBibArticle(com.springer.api.schema.BibArticle)
     */
    public void setBibArticle(BibArticle value) {
        bibArticle = ((BibArticleImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getBibBook()
     */
    public BibBook getBibBook() {
        return bibBook;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setBibBook(com.springer.api.schema.BibBook)
     */
    public void setBibBook(BibBook value) {
        bibBook = ((BibBookImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getBibChapter()
     */
    public BibChapter getBibChapter() {
        return bibChapter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setBibChapter(com.springer.api.schema.BibChapter)
     */
    public void setBibChapter(BibChapter value) {
        bibChapter = ((BibChapterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getBibUnstructured()
     */
    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setBibUnstructured(com.springer.api.schema.BibUnstructured)
     */
    public void setBibUnstructured(BibUnstructured value) {
        bibUnstructured = ((BibUnstructuredImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Citation#setID(java.lang.String)
     */
    public void setID(String value) {
        id = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CitationNumber")) {
                setCitationNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibArticle")) {
                BibArticleImpl node = new BibArticleImpl();
                node.init(parser);
                setBibArticle(node);
            } else if (name.equals("BibBook")) {
                BibBookImpl node = new BibBookImpl();
                node.init(parser);
                setBibBook(node);
            } else if (name.equals("BibChapter")) {
                BibChapterImpl node = new BibChapterImpl();
                node.init(parser);
                setBibChapter(node);
            } else if (name.equals("BibUnstructured")) {
                BibUnstructuredImpl node = new BibUnstructuredImpl();
                node.init(parser);
                setBibUnstructured(node);
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
