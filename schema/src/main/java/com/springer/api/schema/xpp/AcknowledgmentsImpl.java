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

import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.SimplePara;

/**
 * The Class AcknowledgmentsImpl.
 */
public class AcknowledgmentsImpl extends BaseSchemaEntity implements Acknowledgments {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    protected HeadingImpl heading;
    
    /** The simple para. */
    protected SimpleParaImpl simplePara;
    
    /** The formal para. */
    protected FormalParaImpl formalPara;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#getHeading()
     */
    public Heading getHeading() {
        return heading;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#setHeading(com.springer.api.schema.Heading)
     */
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#getSimplePara()
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#setSimplePara(com.springer.api.schema.SimplePara)
     */
    public void setSimplePara(SimplePara value) {
        simplePara = ((SimpleParaImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#getFormalPara()
     */
    public FormalPara getFormalPara() {
        return formalPara;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Acknowledgments#setFormalPara(com.springer.api.schema.FormalPara)
     */
    public void setFormalPara(FormalPara value) {
        formalPara = ((FormalParaImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                setSimplePara(node);
            } else if (name.equals("FormalPara")) {
                FormalParaImpl node = new FormalParaImpl();
                node.init(parser);
                setFormalPara(node);
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
