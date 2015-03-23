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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Para;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Para")
public class ParaImpl
    implements Serializable, Para
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "InlineEquation", type = InlineEquationImpl.class),
        @XmlElementRef(name = "Equation", type = EquationImpl.class),
        @XmlElementRef(name = "CitationRef", type = CitationRefImpl.class),
        @XmlElementRef(name = "Subscript", type = SubscriptImpl.class),
        @XmlElementRef(name = "BlockQuote", type = BlockQuoteImpl.class),
        @XmlElementRef(name = "Footnote", type = FootnoteImpl.class),
        @XmlElementRef(name = "InlineMediaObject", type = JAXBElement.class),
        @XmlElementRef(name = "UnorderedList", type = UnorderedListImpl.class),
        @XmlElementRef(name = "Table", type = TableImpl.class),
        @XmlElementRef(name = "ExternalRef", type = ExternalRefImpl.class),
        @XmlElementRef(name = "Figure", type = FigureImpl.class),
        @XmlElementRef(name = "Emphasis", type = EmphasisImpl.class),
        @XmlElementRef(name = "MediaObject", type = MediaObjectImpl.class),
        @XmlElementRef(name = "Superscript", type = SuperscriptImpl.class),
        @XmlElementRef(name = "DefinitionList", type = DefinitionListImpl.class),
        @XmlElementRef(name = "OrderedList", type = OrderedListImpl.class),
        @XmlElementRef(name = "InternalRef", type = InternalRefImpl.class)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
