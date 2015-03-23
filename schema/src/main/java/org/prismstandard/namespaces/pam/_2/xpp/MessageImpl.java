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
package org.prismstandard.namespaces.pam._2.xpp;
import java.io.IOException;

import org.prismstandard.namespaces.pam._2.Message;
import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.Head;
import org.w3._1999.xhtml.xpp.BodyImpl;
import org.w3._1999.xhtml.xpp.HeadImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;

/**
 * The Class MessageImpl.
 */
public class MessageImpl extends BaseSchemaEntity implements Message {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The head. */
    protected HeadImpl head;
    
    /** The body. */
    protected BodyImpl body;
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Message#getHead()
     */
    public Head getHead() {
        return head;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Message#setHead(org.w3._1999.xhtml.Head)
     */
    public void setHead(Head value) {
        head = ((HeadImpl) value);
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Message#getBody()
     */
    public Body getBody() {
        return body;
    }
    
    /* (non-Javadoc)
     * @see org.prismstandard.namespaces.pam._2.Message#setBody(org.w3._1999.xhtml.Body)
     */
    public void setBody(Body value) {
        body = ((BodyImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("xhtml:head")) {
            	HeadImpl node = new HeadImpl();
            	node.init(parser);
                setHead(node);
            } else if (name.equals("xhtml:body")) {
            	BodyImpl node = new BodyImpl();
            	node.init(parser);
                setBody(node);
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
