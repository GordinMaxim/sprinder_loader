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

import com.springer.api.schema.Contact;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorName;

/**
 * The Class EditorImpl.
 */
public class EditorImpl extends BaseSchemaEntity implements Editor {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The editor name. */
    protected EditorNameImpl editorName;
    
    /** The contact. */
    protected ContactImpl contact;
    
    /** The affiliation ids. */
    protected String affiliationIDS;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#getEditorName()
     */
    public EditorName getEditorName() {
        return editorName;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#setEditorName(com.springer.api.schema.EditorName)
     */
    public void setEditorName(EditorName value) {
        editorName = ((EditorNameImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#getContact()
     */
    public Contact getContact() {
        return contact;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#setContact(com.springer.api.schema.Contact)
     */
    public void setContact(Contact value) {
        contact = ((ContactImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#getAffiliationIDS()
     */
    public String getAffiliationIDS() {
        return affiliationIDS;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Editor#setAffiliationIDS(java.lang.String)
     */
    public void setAffiliationIDS(String value) {
        affiliationIDS = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAffiliationIDS(XppUtils.getAttributeValueFromNode(parser, "AffiliationIDS"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("EditorName")) {
                EditorNameImpl node = new EditorNameImpl();
                node.init(parser);
                setEditorName(node);
            } else if (name.equals("Contact")) {
                ContactImpl node = new ContactImpl();
                node.init(parser);
                setContact(node);
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
