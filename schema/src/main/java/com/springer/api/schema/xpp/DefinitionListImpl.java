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

import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.DefinitionListEntry;

/**
 * The Class DefinitionListImpl.
 */
public class DefinitionListImpl extends BaseSchemaEntity implements DefinitionList {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The definition list entries. */
    protected List<DefinitionListEntry> definitionListEntries;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.DefinitionList#getDefinitionListEntries()
     */
    public List<DefinitionListEntry> getDefinitionListEntries() {
        if (definitionListEntries == null) {
            definitionListEntries = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntries;
    }
    
    /**
     * Sets the definition list entries.
     * 
     * @param value the new definition list entries
     */
    public void setDefinitionListEntries(List<DefinitionListEntry> value) {
        this.definitionListEntries = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("DefinitionListEntry")) {
                DefinitionListEntryImpl node = new DefinitionListEntryImpl();
                node.init(parser);
                getDefinitionListEntries().add(node);
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
