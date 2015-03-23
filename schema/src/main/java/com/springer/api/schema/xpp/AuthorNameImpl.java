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

import com.springer.api.schema.AuthorName;

/**
 * The Class AuthorNameImpl.
 */
public class AuthorNameImpl extends BaseSchemaEntity implements AuthorName {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The given names. */
    protected List<String> givenNames;
    
    /** The particle. */
    protected String particle;
    
    /** The family name. */
    protected String familyName;
    
    /** The display order. */
    protected String displayOrder;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#getGivenNames()
     */
    public List<String> getGivenNames() {
        if (givenNames == null) {
            givenNames = new ArrayList<String>();
        }
        return this.givenNames;
    }
    
    /**
     * Sets the given names.
     * 
     * @param value the new given names
     */
    public void setGivenNames(List<String> value) {
        this.givenNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#getParticle()
     */
    public String getParticle() {
        return particle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#setParticle(java.lang.String)
     */
    public void setParticle(String value) {
        particle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#getFamilyName()
     */
    public String getFamilyName() {
        return familyName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#setFamilyName(java.lang.String)
     */
    public void setFamilyName(String value) {
        familyName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#getDisplayOrder()
     */
    public String getDisplayOrder() {
        return displayOrder;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.AuthorName#setDisplayOrder(java.lang.String)
     */
    public void setDisplayOrder(String value) {
        displayOrder = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setDisplayOrder(XppUtils.getAttributeValueFromNode(parser, "DisplayOrder"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("GivenName")) {
                getGivenNames().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Particle")) {
                setParticle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FamilyName")) {
                setFamilyName(XppUtils.getElementValueFromNode(parser));
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
