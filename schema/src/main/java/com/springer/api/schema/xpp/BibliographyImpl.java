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
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Bibliography;
import com.springer.api.schema.Citation;
import com.springer.api.schema.Heading;

/**
 * The Class BibliographyImpl.
 */
public class BibliographyImpl extends BaseSchemaEntity implements Bibliography {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The citations. */
    protected List<Citation> citations;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Bibliography#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Bibliography#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Bibliography#getCitations()
     */
    public List<Citation> getCitations() {
        if (citations == null) {
            citations = new ArrayList<Citation>();
        }
        return this.citations;
    }
    
    /**
     * Sets the citations.
     * 
     * @param value the new citations
     */
    public void setCitations(List<Citation> value) {
        this.citations = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Bibliography#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Bibliography#setID(java.lang.String)
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
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Citation")) {
                CitationImpl node = new CitationImpl();
                node.init(parser);
                getCitations().add(node);
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
