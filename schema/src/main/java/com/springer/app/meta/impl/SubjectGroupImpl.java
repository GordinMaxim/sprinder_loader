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

package com.springer.app.meta.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.app.meta.Subject;
import com.springer.app.meta.SubjectGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subjects"
})
@XmlRootElement(name = "SubjectGroup")
public class SubjectGroupImpl
    implements Serializable, SubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Subject", required = true, type = SubjectImpl.class)
    protected List<Subject> subjects;

    public List<Subject> getSubjects() {
        if (subjects == null) {
            subjects = new ArrayList<Subject>();
        }
        return this.subjects;
    }

}
