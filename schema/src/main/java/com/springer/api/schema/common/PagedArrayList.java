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

import java.util.ArrayList;


/**
 * The Class PagedArrayList.
 */
public class PagedArrayList<E> extends ArrayList<E> implements PagedList<E> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5011544152511118680L;
	
	/** The cursor. */
	private Cursor cursor = new Cursor();
	
	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#page()
	 */
	@Override
	public long start() {
		return cursor.getStart();
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#perPage()
	 */
	@Override
	public long perPage() {
		return cursor.getPageLength();
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#total()
	 */
	@Override
	public long total() {
		return cursor.getTotal();
	}
	
	/**
	 * Gets the cursor.
	 * 
	 * @return the cursor
	 */
	public Cursor getCursor() {
		return cursor;
	}
	
	/**
	 * Sets the cursor.
	 * 
	 * @param cursor the new cursor
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}
	
	/**
	 * The Class Cursor.
	 */
	public static class Cursor {
		
	   	/** The page length. */
	   	private long pageLength;
	   	
	   	/** The start. */
	   	private long start;
	   	
	   	/** The total. */
	   	private long total;

	 	/**
	 	 * Gets the page length.
	 	 * 
	 	 * @return the page length
	 	 */
	 	public long getPageLength(){
			return this.pageLength;
		}
		
		/**
		 * Sets the page length.
		 * 
		 * @param pageLength the new page length
		 */
		public void setPageLength(long pageLength){
			this.pageLength = pageLength;
		}
	 	
	 	/**
	 	 * Gets the start.
	 	 * 
	 	 * @return the start
	 	 */
	 	public long getStart(){
			return this.start;
		}
		
		/**
		 * Sets the start.
		 * 
		 * @param start the new start
		 */
		public void setStart(long start){
			this.start = start;
		}
	 	
	 	/**
	 	 * Gets the total.
	 	 * 
	 	 * @return the total
	 	 */
	 	public long getTotal(){
			return this.total;
		}
		
		/**
		 * Sets the total.
		 * 
		 * @param total the new total
		 */
		public void setTotal(long total){
			this.total = total;
		}
	}
}
