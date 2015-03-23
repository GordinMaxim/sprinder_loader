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

import com.springer.api.schema.Facet;
import com.springer.api.schema.FacetName;
import com.springer.api.schema.FacetValue;

/**
 * The Class FacetImpl.
 */
public class FacetImpl extends BaseSchemaEntity implements Facet {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The facet values. */
    protected List<FacetValue> facetValues;
    
    /** The name. */
    protected FacetName name;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Facet#getFacetValues()
     */
    public List<FacetValue> getFacetValues() {
        if (facetValues == null) {
            facetValues = new ArrayList<FacetValue>();
        }
        return this.facetValues;
    }
    
    /**
     * Sets the facet values.
     * 
     * @param value the new facet values
     */
    public void setFacetValues(List<FacetValue> value) {
        this.facetValues = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Facet#getName()
     */
    public FacetName getName() {
        return name;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Facet#setName(java.lang.String)
     */
    public void setName(FacetName value) {
        name = ((FacetName) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setName(FacetName.fromValue(XppUtils.getAttributeValueFromNode(parser, "name")));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("facet-value")) {
                FacetValueImpl node = new FacetValueImpl();
                node.init(parser);
                getFacetValues().add(node);
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
