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

import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.Appendix;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.Bibliography;

/**
 * The Class ArticleBackmatterImpl.
 */
public class ArticleBackmatterImpl extends BaseSchemaEntity implements ArticleBackmatter {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The acknowledgments. */
    protected AcknowledgmentsImpl acknowledgments;
    
    /** The appendix. */
    protected AppendixImpl appendix;
    
    /** The bibliography. */
    protected BibliographyImpl bibliography;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#getAcknowledgments()
     */
    public Acknowledgments getAcknowledgments() {
        return acknowledgments;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#setAcknowledgments(com.springer.api.schema.Acknowledgments)
     */
    public void setAcknowledgments(Acknowledgments value) {
        acknowledgments = ((AcknowledgmentsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#getAppendix()
     */
    public Appendix getAppendix() {
        return appendix;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#setAppendix(com.springer.api.schema.Appendix)
     */
    public void setAppendix(Appendix value) {
        appendix = ((AppendixImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#getBibliography()
     */
    public Bibliography getBibliography() {
        return bibliography;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleBackmatter#setBibliography(com.springer.api.schema.Bibliography)
     */
    public void setBibliography(Bibliography value) {
        bibliography = ((BibliographyImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Acknowledgments")) {
                AcknowledgmentsImpl node = new AcknowledgmentsImpl();
                node.init(parser);
                setAcknowledgments(node);
            } else if (name.equals("Appendix")) {
                AppendixImpl node = new AppendixImpl();
                node.init(parser);
                setAppendix(node);
            } else if (name.equals("Bibliography")) {
                BibliographyImpl node = new BibliographyImpl();
                node.init(parser);
                setBibliography(node);
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
