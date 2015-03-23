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

import com.springer.api.schema.Author;
import com.springer.api.schema.AuthorName;
import com.springer.api.schema.Biography;
import com.springer.api.schema.Contact;

/**
 * The Class AuthorImpl.
 */
public class AuthorImpl extends BaseSchemaEntity implements Author {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The author names. */
    protected List<AuthorName> authorNames;
    
    /** The biographies. */
    protected List<Biography> biographies;
    
    /** The contacts. */
    protected List<Contact> contacts;
    
    /** The affiliation ids. */
    protected String affiliationIDS;
    
    /** The corresponding affiliation id. */
    protected String correspondingAffiliationID;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#getAuthorNames()
     */
    public List<AuthorName> getAuthorNames() {
        if (authorNames == null) {
            authorNames = new ArrayList<AuthorName>();
        }
        return this.authorNames;
    }
    
    /**
     * Sets the author names.
     * 
     * @param value the new author names
     */
    public void setAuthorNames(List<AuthorName> value) {
        this.authorNames = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#getBiographies()
     */
    public List<Biography> getBiographies() {
        if (biographies == null) {
            biographies = new ArrayList<Biography>();
        }
        return this.biographies;
    }
    
    /**
     * Sets the biographies.
     * 
     * @param value the new biographies
     */
    public void setBiographies(List<Biography> value) {
        this.biographies = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#getContacts()
     */
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }
    
    /**
     * Sets the contacts.
     * 
     * @param value the new contacts
     */
    public void setContacts(List<Contact> value) {
        this.contacts = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#getAffiliationIDS()
     */
    public String getAffiliationIDS() {
        return affiliationIDS;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#setAffiliationIDS(java.lang.String)
     */
    public void setAffiliationIDS(String value) {
        affiliationIDS = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#getCorrespondingAffiliationID()
     */
    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Author#setCorrespondingAffiliationID(java.lang.String)
     */
    public void setCorrespondingAffiliationID(String value) {
        correspondingAffiliationID = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAffiliationIDS(XppUtils.getAttributeValueFromNode(parser, "AffiliationIDS"));
        setCorrespondingAffiliationID(XppUtils.getAttributeValueFromNode(parser, "CorrespondingAffiliationID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("AuthorName")) {
                AuthorNameImpl node = new AuthorNameImpl();
                node.init(parser);
                getAuthorNames().add(node);
            } else if (name.equals("Biography")) {
                BiographyImpl node = new BiographyImpl();
                node.init(parser);
                getBiographies().add(node);
            } else if (name.equals("Contact")) {
                ContactImpl node = new ContactImpl();
                node.init(parser);
                getContacts().add(node);
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
