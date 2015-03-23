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
import com.springer.api.schema.ItemContent;
import com.springer.api.schema.ListItem;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemNumber",
    "itemContent"
})
@XmlRootElement(name = "ListItem")
public class ListItemImpl
    implements Serializable, ListItem
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ItemNumber", required = true)
    protected String itemNumber;
    @XmlElement(name = "ItemContent", required = true, type = ItemContentImpl.class)
    protected ItemContentImpl itemContent;

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    public ItemContent getItemContent() {
        return itemContent;
    }

    public void setItemContent(ItemContent value) {
        this.itemContent = ((ItemContentImpl) value);
    }

}
