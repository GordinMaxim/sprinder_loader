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
import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.RefSource;
import com.springer.api.schema.RefTarget;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRefImpl implements Serializable, ExternalRef
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RefSource", required = true, type = RefSourceImpl.class)
    protected RefSourceImpl refSource;
    @XmlElement(name = "RefTarget", required = true, type = RefTargetImpl.class)
    protected RefTargetImpl refTarget;

    public RefSource getRefSource() {
        return refSource;
    }

    public void setRefSource(RefSource value) {
        this.refSource = ((RefSourceImpl) value);
    }

    public RefTarget getRefTarget() {
        return refTarget;
    }

    public void setRefTarget(RefTarget value) {
        this.refTarget = ((RefTargetImpl) value);
    }

}
