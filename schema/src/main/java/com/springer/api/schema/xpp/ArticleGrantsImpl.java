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

import com.springer.api.schema.AbstractGrant;
import com.springer.api.schema.ArticleGrants;
import com.springer.api.schema.BibliographyGrant;
import com.springer.api.schema.BodyHTMLGrant;
import com.springer.api.schema.BodyPDFGrant;
import com.springer.api.schema.ESMGrant;
import com.springer.api.schema.MetadataGrant;

/**
 * The Class ArticleGrantsImpl.
 */
public class ArticleGrantsImpl extends BaseSchemaEntity implements ArticleGrants {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The metadata grant. */
    protected MetadataGrantImpl metadataGrant;
    
    /** The abstract grant. */
    protected AbstractGrantImpl abstractGrant;
    
    /** The body pdf grant. */
    protected BodyPDFGrantImpl bodyPDFGrant;
    
    /** The body html grant. */
    protected BodyHTMLGrantImpl bodyHTMLGrant;
    
    /** The bibliography grant. */
    protected BibliographyGrantImpl bibliographyGrant;
    
    /** The esm grant. */
    protected ESMGrantImpl esmGrant;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getMetadataGrant()
     */
    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setMetadataGrant(com.springer.api.schema.MetadataGrant)
     */
    public void setMetadataGrant(MetadataGrant value) {
        metadataGrant = ((MetadataGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getAbstractGrant()
     */
    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setAbstractGrant(com.springer.api.schema.AbstractGrant)
     */
    public void setAbstractGrant(AbstractGrant value) {
        abstractGrant = ((AbstractGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getBodyPDFGrant()
     */
    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setBodyPDFGrant(com.springer.api.schema.BodyPDFGrant)
     */
    public void setBodyPDFGrant(BodyPDFGrant value) {
        bodyPDFGrant = ((BodyPDFGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getBodyHTMLGrant()
     */
    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setBodyHTMLGrant(com.springer.api.schema.BodyHTMLGrant)
     */
    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        bodyHTMLGrant = ((BodyHTMLGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getBibliographyGrant()
     */
    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setBibliographyGrant(com.springer.api.schema.BibliographyGrant)
     */
    public void setBibliographyGrant(BibliographyGrant value) {
        bibliographyGrant = ((BibliographyGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getESMGrant()
     */
    public ESMGrant getESMGrant() {
        return esmGrant;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setESMGrant(com.springer.api.schema.ESMGrant)
     */
    public void setESMGrant(ESMGrant value) {
        esmGrant = ((ESMGrantImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleGrants#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("MetadataGrant")) {
                MetadataGrantImpl node = new MetadataGrantImpl();
                node.init(parser);
                setMetadataGrant(node);
            } else if (name.equals("AbstractGrant")) {
                AbstractGrantImpl node = new AbstractGrantImpl();
                node.init(parser);
                setAbstractGrant(node);
            } else if (name.equals("BodyPDFGrant")) {
                BodyPDFGrantImpl node = new BodyPDFGrantImpl();
                node.init(parser);
                setBodyPDFGrant(node);
            } else if (name.equals("BodyHTMLGrant")) {
                BodyHTMLGrantImpl node = new BodyHTMLGrantImpl();
                node.init(parser);
                setBodyHTMLGrant(node);
            } else if (name.equals("BibliographyGrant")) {
                BibliographyGrantImpl node = new BibliographyGrantImpl();
                node.init(parser);
                setBibliographyGrant(node);
            } else if (name.equals("ESMGrant")) {
                ESMGrantImpl node = new ESMGrantImpl();
                node.init(parser);
                setESMGrant(node);
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
