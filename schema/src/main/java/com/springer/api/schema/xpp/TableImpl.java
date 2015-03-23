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

import com.springer.api.schema.Caption;
import com.springer.api.schema.Table;
import com.springer.api.schema.Tfooter;
import com.springer.api.schema.Tgroup;

/**
 * The Class TableImpl.
 */
public class TableImpl extends BaseSchemaEntity implements Table {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The table. */
    protected TableImpl table;
    
    /** The caption. */
    protected CaptionImpl caption;
    
    /** The tgroup. */
    protected TgroupImpl tgroup;
    
    /** The tfooter. */
    protected TfooterImpl tfooter;
    
    /** The _float. */
    protected String _float;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getTable()
     */
    public Table getTable() {
        return table;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setTable(com.springer.api.schema.Table)
     */
    public void setTable(Table value) {
        table = ((TableImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getCaption()
     */
    public Caption getCaption() {
        return caption;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setCaption(com.springer.api.schema.Caption)
     */
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getTgroup()
     */
    public Tgroup getTgroup() {
        return tgroup;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setTgroup(com.springer.api.schema.Tgroup)
     */
    public void setTgroup(Tgroup value) {
        tgroup = ((TgroupImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getTfooter()
     */
    public Tfooter getTfooter() {
        return tfooter;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setTfooter(com.springer.api.schema.Tfooter)
     */
    public void setTfooter(Tfooter value) {
        tfooter = ((TfooterImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getFloat()
     */
    public String getFloat() {
        return _float;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setFloat(java.lang.String)
     */
    public void setFloat(String value) {
        _float = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#getID()
     */
    public String getID() {
        return id;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Table#setID(java.lang.String)
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
        setFloat(XppUtils.getAttributeValueFromNode(parser, "Float"));
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                setTable(node);
            } else if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("tgroup")) {
                TgroupImpl node = new TgroupImpl();
                node.init(parser);
                setTgroup(node);
            } else if (name.equals("tfooter")) {
                TfooterImpl node = new TfooterImpl();
                node.init(parser);
                setTfooter(node);
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
