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

import com.springer.api.schema.Issue;
import com.springer.api.schema.Volume;
import com.springer.api.schema.VolumeInfo;

/**
 * The Class VolumeImpl.
 */
public class VolumeImpl extends BaseSchemaEntity implements Volume {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The volume info. */
    protected VolumeInfoImpl volumeInfo;
    
    /** The issue. */
    protected IssueImpl issue;
    
    /** The output medium. */
    protected String outputMedium;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#getVolumeInfo()
     */
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#setVolumeInfo(com.springer.api.schema.VolumeInfo)
     */
    public void setVolumeInfo(VolumeInfo value) {
        volumeInfo = ((VolumeInfoImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#getIssue()
     */
    public Issue getIssue() {
        return issue;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#setIssue(com.springer.api.schema.Issue)
     */
    public void setIssue(Issue value) {
        issue = ((IssueImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#getOutputMedium()
     */
    public String getOutputMedium() {
        return outputMedium;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Volume#setOutputMedium(java.lang.String)
     */
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("VolumeInfo")) {
                VolumeInfoImpl node = new VolumeInfoImpl();
                node.init(parser);
                setVolumeInfo(node);
            } else if (name.equals("Issue")) {
                IssueImpl node = new IssueImpl();
                node.init(parser);
                setIssue(node);
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
