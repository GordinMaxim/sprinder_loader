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

package com.springer.api.schema.json;


/**
 * The Class Subject.
 */
public class Subject{
   	
	   /** The subject. */
	   private String subject;
   	
	   /** The type. */
	   private String type;

 	/**
	  * Gets the subject.
	  * 
	  * @return the subject
	  */
	 public String getSubject(){
		return this.subject;
	}
	
	/**
	 * Sets the subject.
	 * 
	 * @param subject the new subject
	 */
	public void setSubject(String subject){
		this.subject = subject;
	}
 	
	 /**
 	 * Gets the type.
 	 * 
 	 * @return the type
 	 */
	 public String getType(){
		return this.type;
	}
	
	/**
	 * Sets the type.
	 * 
	 * @param type the new type
	 */
	public void setType(String type){
		this.type = type;
	}
}
