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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ListItem;
import com.springer.api.schema.OrderedList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listItems"
})
@XmlRootElement(name = "OrderedList")
public class OrderedListImpl implements Serializable, OrderedList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ListItem", required = true, type = ListItemImpl.class)
    protected List<ListItem> listItems;

    public List<ListItem> getListItems() {
        if (listItems == null) {
            listItems = new ArrayList<ListItem>();
        }
        return this.listItems;
    }

}
