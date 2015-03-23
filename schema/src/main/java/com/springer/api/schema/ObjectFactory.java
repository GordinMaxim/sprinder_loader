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

package com.springer.api.schema;

import java.util.Date;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.impl.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * com.springer.api.schema in the com.springer.api.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;
    private final static QName _CopyrightHolderName_QNAME = new QName("", "CopyrightHolderName");
    private final static QName _Total_QNAME = new QName("", "total");
    private final static QName _NumberInSeries_QNAME = new QName("", "NumberInSeries");
    private final static QName _EquationNumber_QNAME = new QName("", "EquationNumber");
    private final static QName _Format_QNAME = new QName("", "Format");
    private final static QName _JournalTitle_QNAME = new QName("", "JournalTitle");
    private final static QName _BookPrintISBN_QNAME = new QName("", "BookPrintISBN");
    private final static QName _BookSequenceNumber_QNAME = new QName("", "BookSequenceNumber");
    private final static QName _VolumeId_QNAME = new QName("", "VolumeId");
    private final static QName _PartID_QNAME = new QName("", "PartID");
    private final static QName _BookTitleID_QNAME = new QName("", "BookTitleID");
    private final static QName _InstitutionalAuthorName_QNAME = new QName("", "InstitutionalAuthorName");
    private final static QName _FamilyName_QNAME = new QName("", "FamilyName");
    private final static QName _H1_QNAME = new QName("", "h1");
    private final static QName _ChapterID_QNAME = new QName("", "ChapterID");
    private final static QName _FirstPage_QNAME = new QName("", "FirstPage");
    private final static QName _EditionNumber_QNAME = new QName("", "EditionNumber");
    private final static QName _PubDate_QNAME = new QName("", "PubDate");
    private final static QName _PublisherName_QNAME = new QName("", "PublisherName");
    private final static QName _APPId_QNAME = new QName("", "APPId");
    private final static QName _Country_QNAME = new QName("", "Country");
    private final static QName _Color_QNAME = new QName("", "Color");
    private final static QName _ConfEventDate_QNAME = new QName("", "ConfEventDate");
    private final static QName _DateLoaded_QNAME = new QName("", "DateLoaded");
    private final static QName _Email_QNAME = new QName("", "Email");
    private final static QName _JournalAbbreviatedTitle_QNAME = new QName("", "JournalAbbreviatedTitle");
    private final static QName _Start_QNAME = new QName("", "start");
    private final static QName _VolumeID_QNAME = new QName("", "VolumeID");
    private final static QName _ArticleID_QNAME = new QName("", "ArticleID");
    private final static QName _Provider_QNAME = new QName("", "Provider");
    private final static QName _ChapterId_QNAME = new QName("", "ChapterId");
    private final static QName _Street_QNAME = new QName("", "Street");
    private final static QName _OrgDivision_QNAME = new QName("", "OrgDivision");
    private final static QName _Query_QNAME = new QName("", "query");
    private final static QName _PartChapterCount_QNAME = new QName("", "PartChapterCount");
    private final static QName _PartNumber_QNAME = new QName("", "PartNumber");
    private final static QName _Particle_QNAME = new QName("", "Particle");
    private final static QName _JournalID_QNAME = new QName("", "JournalID");
    private final static QName _IssueId_QNAME = new QName("", "IssueId");
    private final static QName _ConfEventLocation_QNAME = new QName("", "ConfEventLocation");
    private final static QName _IssueArticleCount_QNAME = new QName("", "IssueArticleCount");
    private final static QName _VolumeIDStart_QNAME = new QName("", "VolumeIDStart");
    private final static QName _GivenName_QNAME = new QName("", "GivenName");
    private final static QName _ChapterLastPage_QNAME = new QName("", "ChapterLastPage");
    private final static QName _CopyrightHolder_QNAME = new QName("", "CopyrightHolder");
    private final static QName _OpenAccess_QNAME = new QName("", "OpenAccess");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _ArticleFirstPage_QNAME = new QName("", "ArticleFirstPage");
    private final static QName _BookChapterCount_QNAME = new QName("", "BookChapterCount");
    private final static QName _SeriesHeader_QNAME = new QName("", "SeriesHeader");
    private final static QName _ArticleURI_QNAME = new QName("", "ArticleURI");
    private final static QName _CopyrightYear_QNAME = new QName("", "CopyrightYear");
    private final static QName _Institution_QNAME = new QName("", "Institution");
    private final static QName _IssueID_QNAME = new QName("", "IssueID");
    private final static QName _City_QNAME = new QName("", "City");
    private final static QName _PublisherURL_QNAME = new QName("", "PublisherURL");
    private final static QName _BookID_QNAME = new QName("", "BookID");
    private final static QName _BookElectronicISBN_QNAME = new QName("", "BookElectronicISBN");
    private final static QName _ConfEventName_QNAME = new QName("", "ConfEventName");
    private final static QName _Em_QNAME = new QName("", "em");
    private final static QName _IssueHeader_QNAME = new QName("", "IssueHeader");
    private final static QName _BookTitleId_QNAME = new QName("", "BookTitleId");
    private final static QName _ImageType_QNAME = new QName("", "ImageType");
    private final static QName _SourceTitle_QNAME = new QName("", "SourceTitle");
    private final static QName _PricelistYear_QNAME = new QName("", "PricelistYear");
    private final static QName _DOI_QNAME = new QName("", "DOI");
    private final static QName _Month_QNAME = new QName("", "Month");
    private final static QName _JournalSPIN_QNAME = new QName("", "JournalSPIN");
    private final static QName _JournalPrintISSN_QNAME = new QName("", "JournalPrintISSN");
    private final static QName _BookContext_QNAME = new QName("", "BookContext");
    private final static QName _VolumeIDEnd_QNAME = new QName("", "VolumeIDEnd");
    private final static QName _BookDOI_QNAME = new QName("", "BookDOI");
    private final static QName _SeriesID_QNAME = new QName("", "SeriesID");
    private final static QName _JournalId_QNAME = new QName("", "JournalId");
    private final static QName _Literal_QNAME = new QName("", "Literal");
    private final static QName _Suffix_QNAME = new QName("", "Suffix");
    private final static QName _SeriesAbbreviatedTitle_QNAME = new QName("", "SeriesAbbreviatedTitle");
    private final static QName _InlineMediaObject_QNAME = new QName("", "InlineMediaObject");
    private final static QName _Postcode_QNAME = new QName("", "Postcode");
    private final static QName _Strong_QNAME = new QName("", "strong");
    private final static QName _JournalElectronicISSN_QNAME = new QName("", "JournalElectronicISSN");
    private final static QName _PublisherLocation_QNAME = new QName("", "PublisherLocation");
    private final static QName _Phone_QNAME = new QName("", "Phone");
    private final static QName _Sub_QNAME = new QName("", "sub");
    private final static QName _JournalSubTitle_QNAME = new QName("", "JournalSubTitle");
    private final static QName _Keyword_QNAME = new QName("", "Keyword");
    private final static QName _Type_QNAME = new QName("", "Type");
    private final static QName _SeriesPrintISSN_QNAME = new QName("", "SeriesPrintISSN");
    private final static QName _Day_QNAME = new QName("", "Day");
    private final static QName _Sup_QNAME = new QName("", "sup");
    private final static QName _ChapterSequenceNumber_QNAME = new QName("", "ChapterSequenceNumber");
    private final static QName _ApiKey_QNAME = new QName("", "apiKey");
    private final static QName _Handle_QNAME = new QName("", "Handle");
    private final static QName _Year_QNAME = new QName("", "Year");
    private final static QName _SeriesElectronicISSN_QNAME = new QName("", "SeriesElectronicISSN");
    private final static QName _ArticleDOI_QNAME = new QName("", "ArticleDOI");
    private final static QName _BookVolumeNumber_QNAME = new QName("", "BookVolumeNumber");
    private final static QName _PartTitle_QNAME = new QName("", "PartTitle");
    private final static QName _ChapterDOI_QNAME = new QName("", "ChapterDOI");
    private final static QName _BookSubTitle_QNAME = new QName("", "BookSubTitle");
    private final static QName _IssueIDEnd_QNAME = new QName("", "IssueIDEnd");
    private final static QName _Etal_QNAME = new QName("", "Etal");
    private final static QName _Fax_QNAME = new QName("", "Fax");
    private final static QName _SourceType_QNAME = new QName("", "SourceType");
    private final static QName _ArticleLastPage_QNAME = new QName("", "ArticleLastPage");
    private final static QName _Location_QNAME = new QName("", "Location");
    private final static QName _IssueIDStart_QNAME = new QName("", "IssueIDStart");
    private final static QName _OrgName_QNAME = new QName("", "OrgName");
    private final static QName _LastPage_QNAME = new QName("", "LastPage");
    private final static QName _ArticleEditorialResponsibility_QNAME = new QName("", "ArticleEditorialResponsibility");
    private final static QName _PageLength_QNAME = new QName("", "pageLength");
    private final static QName _ArticleSequenceNumber_QNAME = new QName("", "ArticleSequenceNumber");
    private final static QName _ArticleCategory_QNAME = new QName("", "ArticleCategory");
    private final static QName _ChapterFirstPage_QNAME = new QName("", "ChapterFirstPage");
    private final static QName _CitationNumber_QNAME = new QName("", "CitationNumber");
    private final static QName _PartSequenceNumber_QNAME = new QName("", "PartSequenceNumber");
    private final static QName _State_QNAME = new QName("", "State");
    private final static QName _Initials_QNAME = new QName("", "Initials");
    private final static QName _BookHeader_QNAME = new QName("", "BookHeader");
    private final static QName _ItemNumber_QNAME = new QName("", "ItemNumber");
    private final static QName _CaptionNumber_QNAME = new QName("", "CaptionNumber");
    private final static QName _Postbox_QNAME = new QName("", "Postbox");
    private final static QName _VolumeIssueCount_QNAME = new QName("", "VolumeIssueCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.springer.api.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JournalOnlineFirst }
     * 
     */
    public JournalOnlineFirst createJournalOnlineFirst() {
        return new JournalOnlineFirstImpl();
    }

    /**
     * Create an instance of {@link EditorGroup }
     * 
     */
    public EditorGroup createEditorGroup() {
        return new EditorGroupImpl();
    }

    /**
     * Create an instance of {@link BookSubject }
     * 
     */
    public BookSubject createBookSubject() {
        return new BookSubjectImpl();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new AuthorImpl();
    }

    /**
     * Create an instance of {@link BibliographyGrant }
     * 
     */
    public BibliographyGrant createBibliographyGrant() {
        return new BibliographyGrantImpl();
    }

    /**
     * Create an instance of {@link Records }
     * 
     */
    public Records createRecords() {
        return new RecordsImpl();
    }

    /**
     * Create an instance of {@link BodyHTMLGrant }
     * 
     */
    public BodyHTMLGrant createBodyHTMLGrant() {
        return new BodyHTMLGrantImpl();
    }

    /**
     * Create an instance of {@link Section4 }
     * 
     */
    public Section4 createSection4() {
        return new Section4Impl();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new ResponseImpl();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItemImpl();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new CaptionImpl();
    }

    /**
     * Create an instance of {@link ISXN }
     * 
     */
    public ISXN createISXN() {
        return new ISXNImpl();
    }

    /**
     * Create an instance of {@link Colspec }
     * 
     */
    public Colspec createColspec() {
        return new ColspecImpl();
    }

    /**
     * Create an instance of {@link VolumeInfo }
     * 
     */
    public VolumeInfo createVolumeInfo() {
        return new VolumeInfoImpl();
    }

    /**
     * Create an instance of {@link CaptionContent }
     * 
     */
    public CaptionContent createCaptionContent() {
        return new CaptionContentImpl();
    }

    /**
     * Create an instance of {@link Institutions }
     * 
     */
    public Institutions createInstitutions() {
        return new InstitutionsImpl();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new FileImpl();
    }

    /**
     * Create an instance of {@link BibEditorName }
     * 
     */
    public BibEditorName createBibEditorName() {
        return new BibEditorNameImpl();
    }

    /**
     * Create an instance of {@link ChapterInfo }
     * 
     */
    public ChapterInfo createChapterInfo() {
        return new ChapterInfoImpl();
    }

    /**
     * Create an instance of {@link Journal }
     * 
     */
    public Journal createJournal() {
        return new JournalImpl();
    }

    /**
     * Create an instance of {@link ArticleGrants }
     * 
     */
    public ArticleGrants createArticleGrants() {
        return new ArticleGrantsImpl();
    }

    /**
     * Create an instance of {@link Figure }
     * 
     */
    public Figure createFigure() {
        return new FigureImpl();
    }

    /**
     * Create an instance of {@link ArticleHeader }
     * 
     */
    public ArticleHeader createArticleHeader() {
        return new ArticleHeaderImpl();
    }

    /**
     * Create an instance of {@link PartContext }
     * 
     */
    public PartContext createPartContext() {
        return new PartContextImpl();
    }

    /**
     * Create an instance of {@link ArticleSubTitle }
     * 
     */
    public ArticleSubTitle createArticleSubTitle() {
        return new ArticleSubTitleImpl();
    }

    /**
     * Create an instance of {@link IssueInfo }
     * 
     */
    public IssueInfo createIssueInfo() {
        return new IssueInfoImpl();
    }

    /**
     * Create an instance of {@link EquationSource }
     * 
     */
    public EquationSource createEquationSource() {
        return new EquationSourceImpl();
    }

    /**
     * Create an instance of {@link ImageObject }
     * 
     */
    public ImageObject createImageObject() {
        return new ImageObjectImpl();
    }

    /**
     * Create an instance of {@link Appendix }
     * 
     */
    public Appendix createAppendix() {
        return new AppendixImpl();
    }

    /**
     * Create an instance of {@link IssueCopyright }
     * 
     */
    public IssueCopyright createIssueCopyright() {
        return new IssueCopyrightImpl();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public Issue createIssue() {
        return new IssueImpl();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public Footnote createFootnote() {
        return new FootnoteImpl();
    }

    /**
     * Create an instance of {@link OrderedList }
     * 
     */
    public OrderedList createOrderedList() {
        return new OrderedListImpl();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new RowImpl();
    }

    /**
     * Create an instance of {@link ChapterContext }
     * 
     */
    public ChapterContext createChapterContext() {
        return new ChapterContextImpl();
    }

    /**
     * Create an instance of {@link Series }
     * 
     */
    public Series createSeries() {
        return new SeriesImpl();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new ArticleImpl();
    }

    /**
     * Create an instance of {@link ArticleHistory }
     * 
     */
    public ArticleHistory createArticleHistory() {
        return new ArticleHistoryImpl();
    }

    /**
     * Create an instance of {@link EditorName }
     * 
     */
    public EditorName createEditorName() {
        return new EditorNameImpl();
    }

    /**
     * Create an instance of {@link Path }
     * 
     */
    public Path createPath() {
        return new PathImpl();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public Term createTerm() {
        return new TermImpl();
    }

    /**
     * Create an instance of {@link DefinitionList }
     * 
     */
    public DefinitionList createDefinitionList() {
        return new DefinitionListImpl();
    }

    /**
     * Create an instance of {@link TextObject }
     * 
     */
    public TextObject createTextObject() {
        return new TextObjectImpl();
    }

    /**
     * Create an instance of {@link InternalRef }
     * 
     */
    public InternalRef createInternalRef() {
        return new InternalRefImpl();
    }

    /**
     * Create an instance of {@link BibArticle }
     * 
     */
    public BibArticle createBibArticle() {
        return new BibArticleImpl();
    }

    /**
     * Create an instance of {@link Thead }
     * 
     */
    public Thead createThead() {
        return new TheadImpl();
    }

    /**
     * Create an instance of {@link ChapterHeader }
     * 
     */
    public ChapterHeader createChapterHeader() {
        return new ChapterHeaderImpl();
    }

    /**
     * Create an instance of {@link MediaObject }
     * 
     */
    public MediaObject createMediaObject() {
        return new MediaObjectImpl();
    }

    /**
     * Create an instance of {@link BibChapter }
     * 
     */
    public BibChapter createBibChapter() {
        return new BibChapterImpl();
    }

    /**
     * Create an instance of {@link Revised }
     * 
     */
    public Revised createRevised() {
        return new RevisedImpl();
    }

    /**
     * Create an instance of {@link Section3 }
     * 
     */
    public Section3 createSection3() {
        return new Section3Impl();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new AffiliationImpl();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new ContactImpl();
    }

    /**
     * Create an instance of {@link SeriesID }
     * 
     */
    public SeriesID createSeriesID() {
        return new SeriesIDImpl();
    }

    /**
     * Create an instance of {@link Images }
     * 
     */
    public Images createImages() {
        return new ImagesImpl();
    }

    /**
     * Create an instance of {@link Bibliography }
     * 
     */
    public Bibliography createBibliography() {
        return new BibliographyImpl();
    }

    /**
     * Create an instance of {@link Tfooter }
     * 
     */
    public Tfooter createTfooter() {
        return new TfooterImpl();
    }

    /**
     * Create an instance of {@link ChapterCopyright }
     * 
     */
    public ChapterCopyright createChapterCopyright() {
        return new ChapterCopyrightImpl();
    }

    /**
     * Create an instance of {@link Tbody }
     * 
     */
    public Tbody createTbody() {
        return new TbodyImpl();
    }

    /**
     * Create an instance of {@link CitationRef }
     * 
     */
    public CitationRef createCitationRef() {
        return new CitationRefImpl();
    }

    /**
     * Create an instance of {@link UnorderedList }
     * 
     */
    public UnorderedList createUnorderedList() {
        return new UnorderedListImpl();
    }

    /**
     * Create an instance of {@link SeriesTitle }
     * 
     */
    public SeriesTitle createSeriesTitle() {
        return new SeriesTitleImpl();
    }

    /**
     * Create an instance of {@link P }
     * 
     */
    public P createP() {
        return new PImpl();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new DescriptionImpl();
    }

    /**
     * Create an instance of {@link AuthorName }
     * 
     */
    public AuthorName createAuthorName() {
        return new AuthorNameImpl();
    }

    /**
     * Create an instance of {@link Para }
     * 
     */
    public Para createPara() {
        return new ParaImpl();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new EntryImpl();
    }

    /**
     * Create an instance of {@link SubjectCollection }
     * 
     */
    public SubjectCollection createSubjectCollection() {
        return new SubjectCollectionImpl();
    }

    /**
     * Create an instance of {@link ExternalRef }
     * 
     */
    public ExternalRef createExternalRef() {
        return new ExternalRefImpl();
    }

    /**
     * Create an instance of {@link RefTarget }
     * 
     */
    public RefTarget createRefTarget() {
        return new RefTargetImpl();
    }

    /**
     * Create an instance of {@link Acknowledgments }
     * 
     */
    public Acknowledgments createAcknowledgments() {
        return new AcknowledgmentsImpl();
    }

    /**
     * Create an instance of {@link ImageObjectElement }
     * 
     */
    public ImageObjectElement createImageObjectElement() {
        return new ImageObjectElementImpl();
    }

    /**
     * Create an instance of {@link Subjects }
     * 
     */
    public Subjects createSubjects() {
        return new SubjectsImpl();
    }

    /**
     * Create an instance of {@link KeywordGroup }
     * 
     */
    public KeywordGroup createKeywordGroup() {
        return new KeywordGroupImpl();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new SubjectImpl();
    }

    /**
     * Create an instance of {@link Tgroup }
     * 
     */
    public Tgroup createTgroup() {
        return new TgroupImpl();
    }

    /**
     * Create an instance of {@link Biography }
     * 
     */
    public Biography createBiography() {
        return new BiographyImpl();
    }

    /**
     * Create an instance of {@link FullText }
     * 
     */
    public FullText createFullText() {
        return new FullTextImpl();
    }

    /**
     * Create an instance of {@link EditorGroupElement }
     * 
     */
    public EditorGroupElement createEditorGroupElement() {
        return new EditorGroupElementImpl();
    }

    /**
     * Create an instance of {@link Eds }
     * 
     */
    public Eds createEds() {
        return new EdsImpl();
    }

    /**
     * Create an instance of {@link Facets }
     * 
     */
    public Facets createFacets() {
        return new FacetsImpl();
    }

    /**
     * Create an instance of {@link ChapterHistory }
     * 
     */
    public ChapterHistory createChapterHistory() {
        return new ChapterHistoryImpl();
    }

    /**
     * Create an instance of {@link BodyRef }
     * 
     */
    public BodyRef createBodyRef() {
        return new BodyRefImpl();
    }

    /**
     * Create an instance of {@link RefSource }
     * 
     */
    public RefSource createRefSource() {
        return new RefSourceImpl();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new ImageImpl();
    }

    /**
     * Create an instance of {@link AbstractGrant }
     * 
     */
    public AbstractGrant createAbstractGrant() {
        return new AbstractGrantImpl();
    }

    /**
     * Create an instance of {@link ArticleNote }
     * 
     */
    public ArticleNote createArticleNote() {
        return new ArticleNoteImpl();
    }

    /**
     * Create an instance of {@link BodyPDFGrant }
     * 
     */
    public BodyPDFGrant createBodyPDFGrant() {
        return new BodyPDFGrantImpl();
    }

    /**
     * Create an instance of {@link DefinitionListEntry }
     * 
     */
    public DefinitionListEntry createDefinitionListEntry() {
        return new DefinitionListEntryImpl();
    }

    /**
     * Create an instance of {@link ChapterTitle }
     * 
     */
    public ChapterTitle createChapterTitle() {
        return new ChapterTitleImpl();
    }

    /**
     * Create an instance of {@link Received }
     * 
     */
    public Received createReceived() {
        return new ReceivedImpl();
    }

    /**
     * Create an instance of {@link RegistrationDate }
     * 
     */
    public RegistrationDate createRegistrationDate() {
        return new RegistrationDateImpl();
    }

    /**
     * Create an instance of {@link BookCopyright }
     * 
     */
    public BookCopyright createBookCopyright() {
        return new BookCopyrightImpl();
    }

    /**
     * Create an instance of {@link JournalSubject }
     * 
     */
    public JournalSubject createJournalSubject() {
        return new JournalSubjectImpl();
    }

    /**
     * Create an instance of {@link FacetValue }
     * 
     */
    public FacetValue createFacetValue() {
        return new FacetValueImpl();
    }

    /**
     * Create an instance of {@link Citation }
     * 
     */
    public Citation createCitation() {
        return new CitationImpl();
    }

    /**
     * Create an instance of {@link Section2 }
     * 
     */
    public Section2 createSection2() {
        return new Section2Impl();
    }

    /**
     * Create an instance of {@link OnlineDate }
     * 
     */
    public OnlineDate createOnlineDate() {
        return new OnlineDateImpl();
    }

    /**
     * Create an instance of {@link JournalSubjectGroup }
     * 
     */
    public JournalSubjectGroup createJournalSubjectGroup() {
        return new JournalSubjectGroupImpl();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public Authors createAuthors() {
        return new AuthorsImpl();
    }

    /**
     * Create an instance of {@link BibBook }
     * 
     */
    public BibBook createBibBook() {
        return new BibBookImpl();
    }

    /**
     * Create an instance of {@link AuthorGroup }
     * 
     */
    public AuthorGroup createAuthorGroup() {
        return new AuthorGroupImpl();
    }

    /**
     * Create an instance of {@link BookTitle }
     * 
     */
    public BookTitle createBookTitle() {
        return new BookTitleImpl();
    }

    /**
     * Create an instance of {@link Subscript }
     * 
     */
    public Subscript createSubscript() {
        return new SubscriptImpl();
    }

    /**
     * Create an instance of {@link NoArticleTitle }
     * 
     */
    public NoArticleTitle createNoArticleTitle() {
        return new NoArticleTitleImpl();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new BookImpl();
    }

    /**
     * Create an instance of {@link Occurrence }
     * 
     */
    public Occurrence createOccurrence() {
        return new OccurrenceImpl();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new FacetImpl();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new EditorImpl();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new ResultImpl();
    }

    /**
     * Create an instance of {@link ArticleInfo }
     * 
     */
    public ArticleInfo createArticleInfo() {
        return new ArticleInfoImpl();
    }

    /**
     * Create an instance of {@link NoInitials }
     * 
     */
    public NoInitials createNoInitials() {
        return new NoInitialsImpl();
    }

    /**
     * Create an instance of {@link ESMGrant }
     * 
     */
    public ESMGrant createESMGrant() {
        return new ESMGrantImpl();
    }

    /**
     * Create an instance of {@link SeriesInfo }
     * 
     */
    public SeriesInfo createSeriesInfo() {
        return new SeriesInfoImpl();
    }

    /**
     * Create an instance of {@link BlockQuote }
     * 
     */
    public BlockQuote createBlockQuote() {
        return new BlockQuoteImpl();
    }

    /**
     * Create an instance of {@link JournalInfo }
     * 
     */
    public JournalInfo createJournalInfo() {
        return new JournalInfoImpl();
    }

    /**
     * Create an instance of {@link Chapter }
     * 
     */
    public Chapter createChapter() {
        return new ChapterImpl();
    }

    /**
     * Create an instance of {@link PartInfo }
     * 
     */
    public PartInfo createPartInfo() {
        return new PartInfoImpl();
    }

    /**
     * Create an instance of {@link PublisherInfo }
     * 
     */
    public PublisherInfo createPublisherInfo() {
        return new PublisherInfoImpl();
    }

    /**
     * Create an instance of {@link MetadataGrant }
     * 
     */
    public MetadataGrant createMetadataGrant() {
        return new MetadataGrantImpl();
    }

    /**
     * Create an instance of {@link ArticleBackmatter }
     * 
     */
    public ArticleBackmatter createArticleBackmatter() {
        return new ArticleBackmatterImpl();
    }

    /**
     * Create an instance of {@link BibUnstructured }
     * 
     */
    public BibUnstructured createBibUnstructured() {
        return new BibUnstructuredImpl();
    }

    /**
     * Create an instance of {@link IssueHistory }
     * 
     */
    public IssueHistory createIssueHistory() {
        return new IssueHistoryImpl();
    }

    /**
     * Create an instance of {@link Superscript }
     * 
     */
    public Superscript createSuperscript() {
        return new SuperscriptImpl();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new BodyImpl();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new HeadingImpl();
    }

    /**
     * Create an instance of {@link CoverDate }
     * 
     */
    public CoverDate createCoverDate() {
        return new CoverDateImpl();
    }

    /**
     * Create an instance of {@link InlineEquation }
     * 
     */
    public InlineEquation createInlineEquation() {
        return new InlineEquationImpl();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new PublisherImpl();
    }

    /**
     * Create an instance of {@link ItemContent }
     * 
     */
    public ItemContent createItemContent() {
        return new ItemContentImpl();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new TableImpl();
    }

    /**
     * Create an instance of {@link ArticleCopyright }
     * 
     */
    public ArticleCopyright createArticleCopyright() {
        return new ArticleCopyrightImpl();
    }

    /**
     * Create an instance of {@link Equation }
     * 
     */
    public Equation createEquation() {
        return new EquationImpl();
    }

    /**
     * Create an instance of {@link ArticleTitle }
     * 
     */
    public ArticleTitle createArticleTitle() {
        return new ArticleTitleImpl();
    }

    /**
     * Create an instance of {@link Abstract }
     * 
     */
    public Abstract createAbstract() {
        return new AbstractImpl();
    }

    /**
     * Create an instance of {@link IssueTitle }
     * 
     */
    public IssueTitle createIssueTitle() {
        return new IssueTitleImpl();
    }

    /**
     * Create an instance of {@link AbstractSection }
     * 
     */
    public AbstractSection createAbstractSection() {
        return new AbstractSectionImpl();
    }

    /**
     * Create an instance of {@link Volume }
     * 
     */
    public Volume createVolume() {
        return new VolumeImpl();
    }

    /**
     * Create an instance of {@link Accepted }
     * 
     */
    public Accepted createAccepted() {
        return new AcceptedImpl();
    }

    /**
     * Create an instance of {@link BookSubjectGroup }
     * 
     */
    public BookSubjectGroup createBookSubjectGroup() {
        return new BookSubjectGroupImpl();
    }

    /**
     * Create an instance of {@link SimplePara }
     * 
     */
    public SimplePara createSimplePara() {
        return new SimpleParaImpl();
    }

    /**
     * Create an instance of {@link BibComments }
     * 
     */
    public BibComments createBibComments() {
        return new BibCommentsImpl();
    }

    /**
     * Create an instance of {@link OrgAddress }
     * 
     */
    public OrgAddress createOrgAddress() {
        return new OrgAddressImpl();
    }

    /**
     * Create an instance of {@link ArticleContext }
     * 
     */
    public ArticleContext createArticleContext() {
        return new ArticleContextImpl();
    }

    /**
     * Create an instance of {@link ChapterBackmatter }
     * 
     */
    public ChapterBackmatter createChapterBackmatter() {
        return new ChapterBackmatterImpl();
    }

    /**
     * Create an instance of {@link Emphasis }
     * 
     */
    public Emphasis createEmphasis() {
        return new EmphasisImpl();
    }

    /**
     * Create an instance of {@link Keywords }
     * 
     */
    public Keywords createKeywords() {
        return new KeywordsImpl();
    }

    /**
     * Create an instance of {@link PrintDate }
     * 
     */
    public PrintDate createPrintDate() {
        return new PrintDateImpl();
    }

    /**
     * Create an instance of {@link BibAuthorName }
     * 
     */
    public BibAuthorName createBibAuthorName() {
        return new BibAuthorNameImpl();
    }

    /**
     * Create an instance of {@link BookInfo }
     * 
     */
    public BookInfo createBookInfo() {
        return new BookInfoImpl();
    }

    /**
     * Create an instance of {@link Section1 }
     * 
     */
    public Section1 createSection1() {
        return new Section1Impl();
    }

    /**
     * Create an instance of {@link Part }
     * 
     */
    public Part createPart() {
        return new PartImpl();
    }

    /**
     * Create an instance of {@link ChapterGrants }
     * 
     */
    public ChapterGrants createChapterGrants() {
        return new ChapterGrantsImpl();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new RecordImpl();
    }

    /**
     * Create an instance of {@link FormalPara }
     * 
     */
    public FormalPara createFormalPara() {
        return new FormalParaImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolderName")
    public JAXBElement<String> createCopyrightHolderName(String value) {
        return new JAXBElement<String>(_CopyrightHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "total")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberInSeries")
    public JAXBElement<String> createNumberInSeries(String value) {
        return new JAXBElement<String>(_NumberInSeries_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EquationNumber")
    public JAXBElement<String> createEquationNumber(String value) {
        return new JAXBElement<String>(_EquationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalTitle")
    public JAXBElement<String> createJournalTitle(String value) {
        return new JAXBElement<String>(_JournalTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookPrintISBN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookPrintISBN(String value) {
        return new JAXBElement<String>(_BookPrintISBN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookSequenceNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookSequenceNumber(Long value) {
        return new JAXBElement<Long>(_BookSequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeId")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createVolumeId(Long value) {
        return new JAXBElement<Long>(_VolumeId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createPartID(Long value) {
        return new JAXBElement<Long>(_PartID_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookTitleID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookTitleID(Long value) {
        return new JAXBElement<Long>(_BookTitleID_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InstitutionalAuthorName")
    public JAXBElement<String> createInstitutionalAuthorName(String value) {
        return new JAXBElement<String>(_InstitutionalAuthorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FamilyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<String>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "h1")
    public JAXBElement<String> createH1(String value) {
        return new JAXBElement<String>(_H1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterID(Long value) {
        return new JAXBElement<Long>(_ChapterID_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FirstPage")
    public JAXBElement<String> createFirstPage(String value) {
        return new JAXBElement<String>(_FirstPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EditionNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createEditionNumber(Long value) {
        return new JAXBElement<Long>(_EditionNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PubDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPubDate(String value) {
        return new JAXBElement<String>(_PubDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherName")
    public JAXBElement<String> createPublisherName(String value) {
        return new JAXBElement<String>(_PublisherName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "APPId")
    public JAXBElement<String> createAPPId(String value) {
        return new JAXBElement<String>(_APPId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Color")
    public JAXBElement<Boolean> createColor(Boolean value) {
        return new JAXBElement<Boolean>(_Color_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConfEventDate")
    public JAXBElement<String> createConfEventDate(String value) {
        return new JAXBElement<String>(_ConfEventDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DateLoaded")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createDateLoaded(Date value) {
        return new JAXBElement<Date>(_DateLoaded_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalAbbreviatedTitle")
    public JAXBElement<String> createJournalAbbreviatedTitle(String value) {
        return new JAXBElement<String>(_JournalAbbreviatedTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "start")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createStart(Long value) {
        return new JAXBElement<Long>(_Start_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeID")
    public JAXBElement<String> createVolumeID(String value) {
        return new JAXBElement<String>(_VolumeID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleID(String value) {
        return new JAXBElement<String>(_ArticleID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Provider")
    public JAXBElement<String> createProvider(String value) {
        return new JAXBElement<String>(_Provider_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterId")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterId(Long value) {
        return new JAXBElement<Long>(_ChapterId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrgDivision")
    public JAXBElement<String> createOrgDivision(String value) {
        return new JAXBElement<String>(_OrgDivision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartChapterCount")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createPartChapterCount(Long value) {
        return new JAXBElement<Long>(_PartChapterCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartNumber(String value) {
        return new JAXBElement<String>(_PartNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Particle")
    public JAXBElement<String> createParticle(String value) {
        return new JAXBElement<String>(_Particle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalID")
    public JAXBElement<String> createJournalID(String value) {
        return new JAXBElement<String>(_JournalID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueId")
    public JAXBElement<String> createIssueId(String value) {
        return new JAXBElement<String>(_IssueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConfEventLocation")
    public JAXBElement<String> createConfEventLocation(String value) {
        return new JAXBElement<String>(_ConfEventLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueArticleCount")
    public JAXBElement<String> createIssueArticleCount(String value) {
        return new JAXBElement<String>(_IssueArticleCount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDStart")
    public JAXBElement<String> createVolumeIDStart(String value) {
        return new JAXBElement<String>(_VolumeIDStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GivenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterLastPage")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterLastPage(Long value) {
        return new JAXBElement<Long>(_ChapterLastPage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolder")
    public JAXBElement<String> createCopyrightHolder(String value) {
        return new JAXBElement<String>(_CopyrightHolder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenAccess")
    public JAXBElement<Boolean> createOpenAccess(Boolean value) {
        return new JAXBElement<Boolean>(_OpenAccess_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleFirstPage(String value) {
        return new JAXBElement<String>(_ArticleFirstPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookChapterCount")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookChapterCount(Long value) {
        return new JAXBElement<Long>(_BookChapterCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SeriesHeader")
    public JAXBElement<EditorGroup> createSeriesHeader(EditorGroup value) {
        return new JAXBElement<EditorGroup>(_SeriesHeader_QNAME, ((Class) EditorGroupImpl.class), null, ((EditorGroupImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleURI")
    public JAXBElement<String> createArticleURI(String value) {
        return new JAXBElement<String>(_ArticleURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightYear")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createCopyrightYear(Long value) {
        return new JAXBElement<Long>(_CopyrightYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Institution")
    public JAXBElement<String> createInstitution(String value) {
        return new JAXBElement<String>(_Institution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueID")
    public JAXBElement<String> createIssueID(String value) {
        return new JAXBElement<String>(_IssueID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherURL")
    public JAXBElement<String> createPublisherURL(String value) {
        return new JAXBElement<String>(_PublisherURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookID(String value) {
        return new JAXBElement<String>(_BookID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookElectronicISBN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookElectronicISBN(String value) {
        return new JAXBElement<String>(_BookElectronicISBN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConfEventName")
    public JAXBElement<String> createConfEventName(String value) {
        return new JAXBElement<String>(_ConfEventName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "em")
    public JAXBElement<String> createEm(String value) {
        return new JAXBElement<String>(_Em_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueHeader")
    public JAXBElement<EditorGroup> createIssueHeader(EditorGroup value) {
        return new JAXBElement<EditorGroup>(_IssueHeader_QNAME, ((Class) EditorGroupImpl.class), null, ((EditorGroupImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookTitleId")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookTitleId(Long value) {
        return new JAXBElement<Long>(_BookTitleId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageType")
    public JAXBElement<String> createImageType(String value) {
        return new JAXBElement<String>(_ImageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceTitle")
    public JAXBElement<String> createSourceTitle(String value) {
        return new JAXBElement<String>(_SourceTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PricelistYear")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createPricelistYear(Long value) {
        return new JAXBElement<Long>(_PricelistYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Month")
    public JAXBElement<String> createMonth(String value) {
        return new JAXBElement<String>(_Month_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalSPIN")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createJournalSPIN(Long value) {
        return new JAXBElement<Long>(_JournalSPIN_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalPrintISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalPrintISSN(String value) {
        return new JAXBElement<String>(_JournalPrintISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeriesID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookContext")
    public JAXBElement<SeriesID> createBookContext(SeriesID value) {
        return new JAXBElement<SeriesID>(_BookContext_QNAME, ((Class) SeriesIDImpl.class), null, ((SeriesIDImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDEnd")
    public JAXBElement<String> createVolumeIDEnd(String value) {
        return new JAXBElement<String>(_VolumeIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookDOI")
    public JAXBElement<String> createBookDOI(String value) {
        return new JAXBElement<String>(_BookDOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SeriesID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createSeriesID(Long value) {
        return new JAXBElement<Long>(_SeriesID_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalId(String value) {
        return new JAXBElement<String>(_JournalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Literal")
    public JAXBElement<String> createLiteral(String value) {
        return new JAXBElement<String>(_Literal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Suffix")
    public JAXBElement<String> createSuffix(String value) {
        return new JAXBElement<String>(_Suffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SeriesAbbreviatedTitle")
    public JAXBElement<String> createSeriesAbbreviatedTitle(String value) {
        return new JAXBElement<String>(_SeriesAbbreviatedTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InlineMediaObject")
    public JAXBElement<ImageObject> createInlineMediaObject(ImageObject value) {
        return new JAXBElement<ImageObject>(_InlineMediaObject_QNAME, ((Class) ImageObjectImpl.class), null, ((ImageObjectImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "strong")
    public JAXBElement<String> createStrong(String value) {
        return new JAXBElement<String>(_Strong_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalElectronicISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalElectronicISSN(String value) {
        return new JAXBElement<String>(_JournalElectronicISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherLocation")
    public JAXBElement<String> createPublisherLocation(String value) {
        return new JAXBElement<String>(_PublisherLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sub")
    public JAXBElement<String> createSub(String value) {
        return new JAXBElement<String>(_Sub_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalSubTitle")
    public JAXBElement<String> createJournalSubTitle(String value) {
        return new JAXBElement<String>(_JournalSubTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Keyword")
    public JAXBElement<String> createKeyword(String value) {
        return new JAXBElement<String>(_Keyword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SeriesPrintISSN")
    public JAXBElement<String> createSeriesPrintISSN(String value) {
        return new JAXBElement<String>(_SeriesPrintISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Day")
    public JAXBElement<String> createDay(String value) {
        return new JAXBElement<String>(_Day_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sup")
    public JAXBElement<String> createSup(String value) {
        return new JAXBElement<String>(_Sup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterSequenceNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterSequenceNumber(Long value) {
        return new JAXBElement<Long>(_ChapterSequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apiKey")
    public JAXBElement<String> createApiKey(String value) {
        return new JAXBElement<String>(_ApiKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Handle")
    public JAXBElement<String> createHandle(String value) {
        return new JAXBElement<String>(_Handle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<String>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SeriesElectronicISSN")
    public JAXBElement<String> createSeriesElectronicISSN(String value) {
        return new JAXBElement<String>(_SeriesElectronicISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleDOI")
    public JAXBElement<String> createArticleDOI(String value) {
        return new JAXBElement<String>(_ArticleDOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookVolumeNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookVolumeNumber(Long value) {
        return new JAXBElement<Long>(_BookVolumeNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartTitle")
    public JAXBElement<String> createPartTitle(String value) {
        return new JAXBElement<String>(_PartTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterDOI")
    public JAXBElement<String> createChapterDOI(String value) {
        return new JAXBElement<String>(_ChapterDOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookSubTitle")
    public JAXBElement<String> createBookSubTitle(String value) {
        return new JAXBElement<String>(_BookSubTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueIDEnd")
    public JAXBElement<String> createIssueIDEnd(String value) {
        return new JAXBElement<String>(_IssueIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Etal")
    public JAXBElement<String> createEtal(String value) {
        return new JAXBElement<String>(_Etal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceType")
    public JAXBElement<String> createSourceType(String value) {
        return new JAXBElement<String>(_SourceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleLastPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleLastPage(String value) {
        return new JAXBElement<String>(_ArticleLastPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Location")
    public JAXBElement<String> createLocation(String value) {
        return new JAXBElement<String>(_Location_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueIDStart")
    public JAXBElement<String> createIssueIDStart(String value) {
        return new JAXBElement<String>(_IssueIDStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrgName")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastPage")
    public JAXBElement<String> createLastPage(String value) {
        return new JAXBElement<String>(_LastPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleEditorialResponsibility")
    public JAXBElement<String> createArticleEditorialResponsibility(String value) {
        return new JAXBElement<String>(_ArticleEditorialResponsibility_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pageLength")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createPageLength(Long value) {
        return new JAXBElement<Long>(_PageLength_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleSequenceNumber")
    public JAXBElement<String> createArticleSequenceNumber(String value) {
        return new JAXBElement<String>(_ArticleSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleCategory")
    public JAXBElement<String> createArticleCategory(String value) {
        return new JAXBElement<String>(_ArticleCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterFirstPage")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterFirstPage(Long value) {
        return new JAXBElement<Long>(_ChapterFirstPage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CitationNumber")
    public JAXBElement<String> createCitationNumber(String value) {
        return new JAXBElement<String>(_CitationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartSequenceNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createPartSequenceNumber(Long value) {
        return new JAXBElement<Long>(_PartSequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Initials")
    public JAXBElement<String> createInitials(String value) {
        return new JAXBElement<String>(_Initials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookHeader")
    public JAXBElement<EditorGroup> createBookHeader(EditorGroup value) {
        return new JAXBElement<EditorGroup>(_BookHeader_QNAME, ((Class) EditorGroupImpl.class), null, ((EditorGroupImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ItemNumber")
    public JAXBElement<String> createItemNumber(String value) {
        return new JAXBElement<String>(_ItemNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CaptionNumber")
    public JAXBElement<String> createCaptionNumber(String value) {
        return new JAXBElement<String>(_CaptionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Postbox")
    public JAXBElement<String> createPostbox(String value) {
        return new JAXBElement<String>(_Postbox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIssueCount")
    public JAXBElement<String> createVolumeIssueCount(String value) {
        return new JAXBElement<String>(_VolumeIssueCount_QNAME, String.class, null, value);
    }

}
