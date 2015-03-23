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
package com.springer.api.services.example;

import java.util.List;

import com.springer.api.schema.common.Facet;
import com.springer.api.schema.common.FacetValue;
import com.springer.api.schema.common.PagedArrayList;
import com.springer.api.schema.common.PagedList;
import com.springer.api.schema.json.Creator;
import com.springer.api.schema.json.Metadata;
import com.springer.api.services.MetadataQuery;
import com.springer.api.services.SpringerQueryFactory;


/**
 * The Class MetadataQuerySample.
 */
public class MetadataQuerySample {

    /**
     * The main method.
     * 
     * @param args the arguments
     * 
     * @throws Exception the exception
     */
	public static void main(String[] args) throws Exception {
		Loader("Ershov, A. P.");
	}

	public static void Loader(String author) {
		SpringerQueryFactory factory = SpringerQueryFactory.newInstance();
		MetadataQuery service = factory.createMetadataQuery("8174ac32133587b0eb9867dd94146582");
		PagedArrayList<Metadata> metadata = (PagedArrayList<Metadata> )service.withQuery("name:" + author).list();

		for(PagedArrayList.Cursor cursor = metadata.getCursor();
			cursor.getStart() != cursor.getTotal();
			cursor.setStart(cursor.getPageLength())) {
			for (Metadata data : metadata) {
				List<Creator> creators = data.getCreators();
				boolean b = false;
				for (Creator c : creators) {
					if(author.equals(c.getCreator())) {
						b = true;
					}
				}
				if(b) {
					printResult(data);
				}
			}
		}
//
//		System.out.println("\n\t-- FACETS --\t\n");
//		List<Facet> facets = service.facets();
//		for (Facet facet : facets) {
//			System.out.println("[Name]: " + facet.getName());
//			for (FacetValue facetValue : facet.getValues()) {
//				System.out.println("\t" + facetValue.getValue() + ":" + facetValue.getCount());
//			}
//		}
	}

	/**
	 * Prints the result.
	 * 
	 * @param data the data
	 */
	private static void printResult(Metadata data) {
		List<Creator> creators = data.getCreators();
		System.out.println("[Meta]: ");
		for(Creator c : creators) {
			System.out.print("<creator>" + c.getCreator() + "</creator>");
		}
		System.out.println(" :" + data.getTitle());
	}
}
