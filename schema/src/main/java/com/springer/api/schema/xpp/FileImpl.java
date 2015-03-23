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

import com.springer.api.schema.File;
import com.springer.api.schema.Path;

/**
 * The Class FileImpl.
 */
public class FileImpl extends BaseSchemaEntity implements File {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The color. */
    protected Boolean color;
    
    /** The format. */
    protected String format;
    
    /** The paths. */
    protected List<Path> paths;
    
    /** The type. */
    protected String type;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#isColor()
     */
    public Boolean isColor() {
        return color;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#setColor(java.lang.Boolean)
     */
    public void setColor(Boolean value) {
        color = ((Boolean) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#getFormat()
     */
    public String getFormat() {
        return format;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#setFormat(java.lang.String)
     */
    public void setFormat(String value) {
        format = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#getPaths()
     */
    public List<Path> getPaths() {
        if (paths == null) {
            paths = new ArrayList<Path>();
        }
        return this.paths;
    }
    
    /**
     * Sets the paths.
     * 
     * @param value the new paths
     */
    public void setPaths(List<Path> value) {
        this.paths = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#getType()
     */
    public String getType() {
        return type;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.File#setType(java.lang.String)
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
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Color")) {
                setColor(Boolean.valueOf(XppUtils.getElementValueFromNode(parser)));
            } else if (name.equals("Format")) {
                setFormat(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Path")) {
                PathImpl node = new PathImpl();
                node.init(parser);
                getPaths().add(node);
            } else if (name.equals("Type")) {
                setType(XppUtils.getElementValueFromNode(parser));
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
