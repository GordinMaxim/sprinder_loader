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

import com.springer.api.schema.Facets;
import com.springer.api.schema.Records;
import com.springer.api.schema.Response;
import com.springer.api.schema.Result;

/**
 * The Class ResponseImpl.
 */
public class ResponseImpl extends BaseSchemaEntity implements Response {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The query. */
    protected String query;
    
    /** The api key. */
    protected String apiKey;
    
    /** The result. */
    protected ResultImpl result;
    
    /** The records. */
    protected RecordsImpl records;
    
    /** The facets. */
    protected FacetsImpl facets;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#getQuery()
     */
    public String getQuery() {
        return query;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#setQuery(java.lang.String)
     */
    public void setQuery(String value) {
        query = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#getApiKey()
     */
    public String getApiKey() {
        return apiKey;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#setApiKey(java.lang.String)
     */
    public void setApiKey(String value) {
        apiKey = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#getResult()
     */
    public Result getResult() {
        return result;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#setResult(com.springer.api.schema.Result)
     */
    public void setResult(Result value) {
        result = ((ResultImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#getRecords()
     */
    public Records getRecords() {
        return records;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#setRecords(com.springer.api.schema.Records)
     */
    public void setRecords(Records value) {
        records = ((RecordsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#getFacets()
     */
    public Facets getFacets() {
        return facets;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.Response#setFacets(com.springer.api.schema.Facets)
     */
    public void setFacets(Facets value) {
        facets = ((FacetsImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("query")) {
                setQuery(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("apiKey")) {
                setApiKey(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("result")) {
                ResultImpl node = new ResultImpl();
                node.init(parser);
                setResult(node);
            } else if (name.equals("records")) {
                RecordsImpl node = new RecordsImpl();
                node.init(parser);
                setRecords(node);
            } else if (name.equals("facets")) {
                FacetsImpl node = new FacetsImpl();
                node.init(parser);
                setFacets(node);
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
