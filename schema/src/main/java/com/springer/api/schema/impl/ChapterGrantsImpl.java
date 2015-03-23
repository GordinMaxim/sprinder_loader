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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.AbstractGrant;
import com.springer.api.schema.BibliographyGrant;
import com.springer.api.schema.BodyHTMLGrant;
import com.springer.api.schema.BodyPDFGrant;
import com.springer.api.schema.ChapterGrants;
import com.springer.api.schema.ESMGrant;
import com.springer.api.schema.MetadataGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataGrant",
    "abstractGrant",
    "bodyPDFGrant",
    "bodyHTMLGrant",
    "bibliographyGrant",
    "esmGrant"
})
@XmlRootElement(name = "ChapterGrants")
public class ChapterGrantsImpl
    implements Serializable, ChapterGrants
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "MetadataGrant", required = true, type = MetadataGrantImpl.class)
    protected MetadataGrantImpl metadataGrant;
    @XmlElement(name = "AbstractGrant", required = true, type = AbstractGrantImpl.class)
    protected AbstractGrantImpl abstractGrant;
    @XmlElement(name = "BodyPDFGrant", required = true, type = BodyPDFGrantImpl.class)
    protected BodyPDFGrantImpl bodyPDFGrant;
    @XmlElement(name = "BodyHTMLGrant", required = true, type = BodyHTMLGrantImpl.class)
    protected BodyHTMLGrantImpl bodyHTMLGrant;
    @XmlElement(name = "BibliographyGrant", required = true, type = BibliographyGrantImpl.class)
    protected BibliographyGrantImpl bibliographyGrant;
    @XmlElement(name = "ESMGrant", required = true, type = ESMGrantImpl.class)
    protected ESMGrantImpl esmGrant;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }

    public void setMetadataGrant(MetadataGrant value) {
        this.metadataGrant = ((MetadataGrantImpl) value);
    }

    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }

    public void setAbstractGrant(AbstractGrant value) {
        this.abstractGrant = ((AbstractGrantImpl) value);
    }

    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }

    public void setBodyPDFGrant(BodyPDFGrant value) {
        this.bodyPDFGrant = ((BodyPDFGrantImpl) value);
    }

    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }

    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        this.bodyHTMLGrant = ((BodyHTMLGrantImpl) value);
    }

    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }

    public void setBibliographyGrant(BibliographyGrant value) {
        this.bibliographyGrant = ((BibliographyGrantImpl) value);
    }

    public ESMGrant getESMGrant() {
        return esmGrant;
    }

    public void setESMGrant(ESMGrant value) {
        this.esmGrant = ((ESMGrantImpl) value);
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
