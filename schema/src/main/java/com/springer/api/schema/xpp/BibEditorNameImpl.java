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

import com.springer.api.schema.BibEditorName;

/**
 * The Class BibEditorNameImpl.
 */
public class BibEditorNameImpl extends BaseSchemaEntity implements BibEditorName {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The initials. */
    protected String initials;
    
    /** The family name. */
    protected String familyName;
    
    /** The particle. */
    protected String particle;
    
    /** The suffix. */
    protected String suffix;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#getSuffix()
     */
    public String getSuffix() {
        return suffix;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#setSuffix(java.lang.String)
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#getInitials()
     */
    public String getInitials() {
        return initials;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#setInitials(java.lang.String)
     */
    public void setInitials(String value) {
        initials = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#getFamilyName()
     */
    public String getFamilyName() {
        return familyName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#setFamilyName(java.lang.String)
     */
    public void setFamilyName(String value) {
        familyName = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#getParticle()
     */
    public String getParticle() {
        return particle;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BibEditorName#setParticle(java.lang.String)
     */
    public void setParticle(String value) {
        particle = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Initials")) {
                setInitials(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FamilyName")) {
                setFamilyName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Particle")) {
                setParticle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Suffix")) {
                setSuffix(XppUtils.getElementValueFromNode(parser));
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
