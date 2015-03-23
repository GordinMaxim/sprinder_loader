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


/**
 * The Class FacetValue.
 */
public class FacetValue{
   	
	   /** The count. */
	   private String count;
   	
	   /** The value. */
	   private String value;

 	/**
	  * Gets the count.
	  * 
	  * @return the count
	  */
	 public String getCount(){
		return this.count;
	}
	
	/**
	 * Sets the count.
	 * 
	 * @param count the new count
	 */
	public void setCount(String count){
		this.count = count;
	}
 	
	 /**
 	 * Gets the value.
 	 * 
 	 * @return the value
 	 */
	 public String getValue(){
		return this.value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the new value
	 */
	public void setValue(String value){
		this.value = value;
	}
}
