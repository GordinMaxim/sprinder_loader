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

package com.springer.api.schema.common;

import java.util.List;

/**
 * The Class Facet.
 */
public class Facet{
   	
	   /** The name. */
	   private String name;
   	
	   /** The values. */
	   private List<FacetValue> values;

 	/**
	  * Gets the name.
	  * 
	  * @return the name
	  */
	 public String getName(){
		return this.name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name){
		this.name = name;
	}
 	
	 /**
 	 * Gets the values.
 	 * 
 	 * @return the values
 	 */
	 public List<FacetValue> getValues(){
		return this.values;
	}
	
	/**
	 * Sets the values.
	 * 
	 * @param values the new values
	 */
	public void setValues(List<FacetValue> values){
		this.values = values;
	}
}
