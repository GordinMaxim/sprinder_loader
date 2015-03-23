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

import com.springer.api.schema.DefinitionListEntry;
import com.springer.api.schema.Description;
import com.springer.api.schema.Term;

/**
 * The Class DefinitionListEntryImpl.
 */
public class DefinitionListEntryImpl extends BaseSchemaEntity implements DefinitionListEntry {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The term. */
    protected TermImpl term;
    
    /** The description. */
    protected DescriptionImpl description;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.DefinitionListEntry#getTerm()
     */
    public Term getTerm() {
        return term;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.DefinitionListEntry#setTerm(com.springer.api.schema.Term)
     */
    public void setTerm(Term value) {
        term = ((TermImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.DefinitionListEntry#getDescription()
     */
    public Description getDescription() {
        return description;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.DefinitionListEntry#setDescription(com.springer.api.schema.Description)
     */
    public void setDescription(Description value) {
        description = ((DescriptionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Term")) {
                TermImpl node = new TermImpl();
                node.init(parser);
                setTerm(node);
            } else if (name.equals("Description")) {
                DescriptionImpl node = new DescriptionImpl();
                node.init(parser);
                setDescription(node);
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
