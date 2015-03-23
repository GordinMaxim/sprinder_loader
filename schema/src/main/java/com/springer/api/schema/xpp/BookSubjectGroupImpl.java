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
package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BookSubject;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.SubjectCollection;

/**
 * The Class BookSubjectGroupImpl.
 */
public class BookSubjectGroupImpl extends BaseSchemaEntity implements BookSubjectGroup {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The book subjects. */
    protected List<BookSubject> bookSubjects;
    
    /** The subject collection. */
    protected SubjectCollectionImpl subjectCollection;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubjectGroup#getBookSubjects()
     */
    public List<BookSubject> getBookSubjects() {
        if (bookSubjects == null) {
            bookSubjects = new ArrayList<BookSubject>();
        }
        return this.bookSubjects;
    }
    
    /**
     * Sets the book subjects.
     * 
     * @param value the new book subjects
     */
    public void setBookSubjects(List<BookSubject> value) {
        this.bookSubjects = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubjectGroup#getSubjectCollection()
     */
    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.BookSubjectGroup#setSubjectCollection(com.springer.api.schema.SubjectCollection)
     */
    public void setSubjectCollection(SubjectCollection value) {
        subjectCollection = ((SubjectCollectionImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookSubject")) {
                BookSubjectImpl node = new BookSubjectImpl();
                node.init(parser);
                getBookSubjects().add(node);
            } else if (name.equals("SubjectCollection")) {
                SubjectCollectionImpl node = new SubjectCollectionImpl();
                node.init(parser);
                setSubjectCollection(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
