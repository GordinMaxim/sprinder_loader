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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;

/**
 * The Class DateAdapter.
 */
public class DateAdapter {
	
	/**
	 * Parses the date.
	 * 
	 * @param s the s
	 * 
	 * @return the date
	 */
	public static Date parseDate(String s) {
		return DatatypeConverter.parseDate(s).getTime();
	}

	/**
	 * Prints the date.
	 * 
	 * @param dt the dt
	 * 
	 * @return the string
	 */
	public static String printDate(Date dt) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(dt);
		return DatatypeConverter.printDate(cal);
	}
}
