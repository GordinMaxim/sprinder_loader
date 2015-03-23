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

import java.util.List;

/**
 * The Class Image.
 */
public class Image{
   	
	   /** The d oi. */
	   private String dOI;
   	
	   /** The i sxn. */
	   private String iSXN;
   	
	   /** The article title. */
	   private String articleTitle;
   	
	   /** The authors. */
	   private List<Author> authors;
   	
	   /** The book doi. */
	   private String bookDOI;
   	
	   /** The book title id. */
	   private String bookTitleId;
   	
	   /** The caption. */
	   private String caption;
   	
	   /** The chapter id. */
	   private String chapterId;
   	
	   /** The file. */
	   private List<File> file;
   	
	   /** The identifier. */
	   private String identifier;
   	
	   /** The image type. */
	   private String imageType;
   	
	   /** The institutions. */
	   private List<Institution> institutions;
   	
	   /** The keywords. */
	   private List<Keyword> keywords;
   	
	   /** The open access. */
	   private String openAccess;
   	
	   /** The provider. */
	   private String provider;
   	
	   /** The pub date. */
	   private String pubDate;
   	
	   /** The source title. */
	   private String sourceTitle;
   	
	   /** The source type. */
	   private String sourceType;
   	
	   /** The subject collection. */
	   private String subjectCollection;
   	
	   /** The subjects. */
	   private List<Subject> subjects;

 	/**
	  * Gets the dOI.
	  * 
	  * @return the dOI
	  */
	 public String getDOI(){
		return this.dOI;
	}
	
	/**
	 * Sets the dOI.
	 * 
	 * @param dOI the new dOI
	 */
	public void setDOI(String dOI){
		this.dOI = dOI;
	}
 	
	 /**
 	 * Gets the iSXN.
 	 * 
 	 * @return the iSXN
 	 */
	 public String getISXN(){
		return this.iSXN;
	}
	
	/**
	 * Sets the iSXN.
	 * 
	 * @param iSXN the new iSXN
	 */
	public void setISXN(String iSXN){
		this.iSXN = iSXN;
	}
 	
	 /**
 	 * Gets the article title.
 	 * 
 	 * @return the article title
 	 */
	 public String getArticleTitle(){
		return this.articleTitle;
	}
	
	/**
	 * Sets the article title.
	 * 
	 * @param articleTitle the new article title
	 */
	public void setArticleTitle(String articleTitle){
		this.articleTitle = articleTitle;
	}
 	
	 /**
 	 * Gets the authors.
 	 * 
 	 * @return the authors
 	 */
	 public List<Author> getAuthors(){
		return this.authors;
	}
	
	/**
	 * Sets the authors.
	 * 
	 * @param authors the new authors
	 */
	public void setAuthors(List<Author> authors){
		this.authors = authors;
	}
 	
	 /**
 	 * Gets the book doi.
 	 * 
 	 * @return the book doi
 	 */
	 public String getBookDOI(){
		return this.bookDOI;
	}
	
	/**
	 * Sets the book doi.
	 * 
	 * @param bookDOI the new book doi
	 */
	public void setBookDOI(String bookDOI){
		this.bookDOI = bookDOI;
	}
 	
	 /**
 	 * Gets the book title id.
 	 * 
 	 * @return the book title id
 	 */
	 public String getBookTitleId(){
		return this.bookTitleId;
	}
	
	/**
	 * Sets the book title id.
	 * 
	 * @param bookTitleId the new book title id
	 */
	public void setBookTitleId(String bookTitleId){
		this.bookTitleId = bookTitleId;
	}
 	
	 /**
 	 * Gets the caption.
 	 * 
 	 * @return the caption
 	 */
	 public String getCaption(){
		return this.caption;
	}
	
	/**
	 * Sets the caption.
	 * 
	 * @param caption the new caption
	 */
	public void setCaption(String caption){
		this.caption = caption;
	}
 	
	 /**
 	 * Gets the chapter id.
 	 * 
 	 * @return the chapter id
 	 */
	 public String getChapterId(){
		return this.chapterId;
	}
	
	/**
	 * Sets the chapter id.
	 * 
	 * @param chapterId the new chapter id
	 */
	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}
 	
	 /**
 	 * Gets the file.
 	 * 
 	 * @return the file
 	 */
	 public List<File> getFile(){
		return this.file;
	}
	
	/**
	 * Sets the file.
	 * 
	 * @param file the new file
	 */
	public void setFile(List<File> file){
		this.file = file;
	}
 	
	 /**
 	 * Gets the identifier.
 	 * 
 	 * @return the identifier
 	 */
	 public String getIdentifier(){
		return this.identifier;
	}
	
	/**
	 * Sets the identifier.
	 * 
	 * @param identifier the new identifier
	 */
	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}
 	
	 /**
 	 * Gets the image type.
 	 * 
 	 * @return the image type
 	 */
	 public String getImageType(){
		return this.imageType;
	}
	
	/**
	 * Sets the image type.
	 * 
	 * @param imageType the new image type
	 */
	public void setImageType(String imageType){
		this.imageType = imageType;
	}
 	
	 /**
 	 * Gets the institutions.
 	 * 
 	 * @return the institutions
 	 */
	 public List<Institution> getInstitutions(){
		return this.institutions;
	}
	
	/**
	 * Sets the institutions.
	 * 
	 * @param institutions the new institutions
	 */
	public void setInstitutions(List<Institution> institutions){
		this.institutions = institutions;
	}
 	
	 /**
 	 * Gets the keywords.
 	 * 
 	 * @return the keywords
 	 */
	 public List<Keyword> getKeywords(){
		return this.keywords;
	}
	
	/**
	 * Sets the keywords.
	 * 
	 * @param keywords the new keywords
	 */
	public void setKeywords(List<Keyword> keywords){
		this.keywords = keywords;
	}
 	
	 /**
 	 * Gets the open access.
 	 * 
 	 * @return the open access
 	 */
	 public String getOpenAccess(){
		return this.openAccess;
	}
	
	/**
	 * Sets the open access.
	 * 
	 * @param openAccess the new open access
	 */
	public void setOpenAccess(String openAccess){
		this.openAccess = openAccess;
	}
 	
	 /**
 	 * Gets the provider.
 	 * 
 	 * @return the provider
 	 */
	 public String getProvider(){
		return this.provider;
	}
	
	/**
	 * Sets the provider.
	 * 
	 * @param provider the new provider
	 */
	public void setProvider(String provider){
		this.provider = provider;
	}
 	
	 /**
 	 * Gets the pub date.
 	 * 
 	 * @return the pub date
 	 */
	 public String getPubDate(){
		return this.pubDate;
	}
	
	/**
	 * Sets the pub date.
	 * 
	 * @param pubDate the new pub date
	 */
	public void setPubDate(String pubDate){
		this.pubDate = pubDate;
	}
 	
	 /**
 	 * Gets the source title.
 	 * 
 	 * @return the source title
 	 */
	 public String getSourceTitle(){
		return this.sourceTitle;
	}
	
	/**
	 * Sets the source title.
	 * 
	 * @param sourceTitle the new source title
	 */
	public void setSourceTitle(String sourceTitle){
		this.sourceTitle = sourceTitle;
	}
 	
	 /**
 	 * Gets the source type.
 	 * 
 	 * @return the source type
 	 */
	 public String getSourceType(){
		return this.sourceType;
	}
	
	/**
	 * Sets the source type.
	 * 
	 * @param sourceType the new source type
	 */
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
 	
	 /**
 	 * Gets the subject collection.
 	 * 
 	 * @return the subject collection
 	 */
	 public String getSubjectCollection(){
		return this.subjectCollection;
	}
	
	/**
	 * Sets the subject collection.
	 * 
	 * @param subjectCollection the new subject collection
	 */
	public void setSubjectCollection(String subjectCollection){
		this.subjectCollection = subjectCollection;
	}
 	
	 /**
 	 * Gets the subjects.
 	 * 
 	 * @return the subjects
 	 */
	 public List<Subject> getSubjects(){
		return this.subjects;
	}
	
	/**
	 * Sets the subjects.
	 * 
	 * @param subjects the new subjects
	 */
	public void setSubjects(List<Subject> subjects){
		this.subjects = subjects;
	}
}
