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

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.ListItem;

/**
 * The Class ListItemImpl.
 */
public class ListItemImpl extends BaseSchemaEntity implements ListItem {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The item number. */
    protected String itemNumber;
    
    /** The item content. */
    protected ItemContentImpl itemContent;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ListItem#getItemNumber()
     */
    public String getItemNumber() {
        return itemNumber;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ListItem#setItemNumber(java.lang.String)
     */
    public void setItemNumber(String value) {
        itemNumber = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ListItem#getItemContent()
     */
    public ItemContent getItemContent() {
        return itemContent;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ListItem#setItemContent(com.springer.api.schema.ItemContent)
     */
    public void setItemContent(ItemContent value) {
        itemContent = ((ItemContentImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ItemNumber")) {
                setItemNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ItemContent")) {
                ItemContentImpl node = new ItemContentImpl();
                node.init(parser);
                setItemContent(node);
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
