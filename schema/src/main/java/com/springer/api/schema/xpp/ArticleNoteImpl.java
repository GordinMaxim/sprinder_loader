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

import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.SimplePara;

/**
 * The Class ArticleNoteImpl.
 */
public class ArticleNoteImpl extends BaseSchemaEntity implements ArticleNote {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The simple para. */
    protected SimpleParaImpl simplePara;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleNote#getSimplePara()
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleNote#setSimplePara(com.springer.api.schema.SimplePara)
     */
    public void setSimplePara(SimplePara value) {
        simplePara = ((SimpleParaImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleNote#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ArticleNote#setType(java.lang.String)
     */
    public void setType(String value) {
        type = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                setSimplePara(node);
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
