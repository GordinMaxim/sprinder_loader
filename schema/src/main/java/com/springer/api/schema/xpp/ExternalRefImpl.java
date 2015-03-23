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

import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.RefSource;
import com.springer.api.schema.RefTarget;

/**
 * The Class ExternalRefImpl.
 */
public class ExternalRefImpl extends BaseSchemaEntity implements ExternalRef {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The ref source. */
    protected RefSourceImpl refSource;
    
    /** The ref target. */
    protected RefTargetImpl refTarget;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ExternalRef#getRefSource()
     */
    public RefSourceImpl getRefSource() {
        return refSource;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ExternalRef#setRefSource(com.springer.api.schema.RefSource)
     */
    public void setRefSource(RefSource value) {
        refSource = ((RefSourceImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ExternalRef#getRefTarget()
     */
    public RefTarget getRefTarget() {
        return refTarget;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ExternalRef#setRefTarget(com.springer.api.schema.RefTarget)
     */
    public void setRefTarget(RefTarget value) {
        refTarget = ((RefTargetImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("RefSource")) {
            	RefSourceImpl node = new RefSourceImpl();
            	node.init(parser);
                setRefSource(node);
            } else if (name.equals("RefTarget")) {
                RefTargetImpl node = new RefTargetImpl();
                node.init(parser);
                setRefTarget(node);
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
