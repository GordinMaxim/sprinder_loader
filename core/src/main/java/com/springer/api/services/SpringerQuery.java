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
package com.springer.api.services;

import java.util.List;

import com.springer.api.schema.common.Facet;
import com.springer.api.schema.common.PagedList;

/**
 * The Interface SpringerQuery.
 */
public interface SpringerQuery<E> extends SpringerCommunicator {
	
	/**
	 * Single result.
	 * 
	 * @return the e
	 */
	public E singleResult();

	/**
	 * List.
	 * 
	 * @return the paged list< e>
	 */
	public PagedList<E> list();
	
	/**
	 * Facets.
	 * 
	 * @return the list< facet>
	 */
	public List<Facet> facets();
	
	/**
	 * Reset.
	 */
//	public void addResonseHandler(AsyncResponseHandler<List<T>> handler);
	
	/**
	 * Reset.
	 */
	public void reset();
	
	/**
	 * With query.
	 * 
	 * @param query the query
	 * 
	 * @return the springer query< e>
	 */
	public SpringerQuery<E> withQuery(String query);

}
