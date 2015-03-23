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
package org.w3._1999.xhtml.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.P;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;

/**
 * The Class BodyImpl.
 */
public class BodyImpl extends BaseSchemaEntity implements Body {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The h1. */
    protected String h1;
    
    /** The ps. */
    protected List<P> ps;
    
    /* (non-Javadoc)
     * @see org.w3._1999.xhtml.Body#getH1()
     */
    public String getH1() {
        return h1;
    }
    
    /* (non-Javadoc)
     * @see org.w3._1999.xhtml.Body#setH1(java.lang.String)
     */
    public void setH1(String value) {
        h1 = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see org.w3._1999.xhtml.Body#getPS()
     */
    public List<P> getPS() {
        if (ps == null) {
            ps = new ArrayList<P>();
        }
        return this.ps;
    }
    
    /**
     * Sets the pS.
     * 
     * @param value the new pS
     */
    public void setPS(List<P> value) {
        this.ps = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("h1")) {
                setH1(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("p")) {
                PImpl node = new PImpl();
                node.init(parser);
                getPS().add(node);
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
