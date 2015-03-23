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

package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Facets;
import com.springer.api.schema.Records;
import com.springer.api.schema.Response;
import com.springer.api.schema.Result;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "apiKey",
    "result",
    "records",
    "facets"
})
@XmlRootElement(name = "response")
public class ResponseImpl
    implements Serializable, Response
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String query;
    protected String apiKey;
    @XmlElement(required = true, type = ResultImpl.class)
    protected ResultImpl result;
    @XmlElement(required = true, type = RecordsImpl.class)
    protected RecordsImpl records;
    @XmlElement(required = true, type = FacetsImpl.class)
    protected FacetsImpl facets;

    public String getQuery() {
        return query;
    }

    public void setQuery(String value) {
        this.query = value;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String value) {
        this.apiKey = value;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result value) {
        this.result = ((ResultImpl) value);
    }

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records value) {
        this.records = ((RecordsImpl) value);
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets value) {
        this.facets = ((FacetsImpl) value);
    }

}
