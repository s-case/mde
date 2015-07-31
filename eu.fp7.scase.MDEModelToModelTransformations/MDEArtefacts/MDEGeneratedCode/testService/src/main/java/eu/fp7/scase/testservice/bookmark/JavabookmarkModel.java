/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2015
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : testService
 * WorkFile            : 
 * Compiler            : 
 * File Description    : 
 * Document Description: 
* Related Documents	   : 
* Note				   : 
* Programmer		   : RESTful MDE Engine created by Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/


package eu.fp7.scase.testservice.bookmark;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.annotations.ForeignKey;

import eu.fp7.scase.testservice.utilities.HypermediaLink;
import eu.fp7.scase.testservice.account.JavaaccountModel;


/* This class models the data of a bookmark resource. It is enhanced with JAXB annotations for automated representation
parsing/marshalling as well as with Hibernate annotations for ORM transformations.*/
@XmlRootElement
@Entity
@Table(name="bookmark")
public class JavabookmarkModel{


    /* There follows a list with the properties that model the bookmark resource, as prescribed in the service CIM*/
		@Column(name = "url")
		private String url;

		@Column(name = "scope")
		private String scope;

		@ElementCollection(fetch = FetchType.EAGER)
		@CollectionTable(name="bookmarkkeywords", joinColumns=@JoinColumn(name="bookmarkId"))
		@Column(name = "keywords")
		@ForeignKey(name = "fk_bookmark_keywords")
		private Set<String> keywords = new HashSet<String>();

		@Id
		@GeneratedValue
		@Column(name = "bookmarkId")
		private int bookmarkId;

		// The Linklist property holds all the hypermedia links to be sent back to the client
		@Transient
		private List<HypermediaLink> linklist = new ArrayList<HypermediaLink>();

		// This property models the Many to One relationship between two resources as it is defined by the Hibernate syntax below.
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="accountId")
		@ForeignKey(name = "fk_account_bookmark")
		private JavaaccountModel account;

    /* There follows a list of setter and getter functions.*/
	    public void seturl(String url){
        	this.url = url;
    	}

	    public void setscope(String scope){
        	this.scope = scope;
    	}

	    public void setkeywords(Set<String> keywords){
        	this.keywords = keywords;
    	}

	    public void setbookmarkId(int bookmarkId){
        	this.bookmarkId = bookmarkId;
    	}

	    public void setlinklist(List<HypermediaLink> linklist){
        	this.linklist = linklist;
    	}

		@XmlTransient
	    public void setaccount(JavaaccountModel account){
        	this.account = account;
    	}

	    public String geturl(){
        	return this.url;
    	}

	    public String getscope(){
        	return this.scope;
    	}

	    public Set<String> getkeywords(){
        	return this.keywords;
    	}

	    public int getbookmarkId(){
        	return this.bookmarkId;
    	}

	    public List<HypermediaLink> getlinklist(){
        	return this.linklist;
    	}

	    public JavaaccountModel getaccount(){
        	return this.account;
    	}


    /* This function deletes explicitly any collections of this resource that are stored in the database 
    and iteratively does so for any subsequent related resources.
    NOTE: this function is needed to handle erroneous handling of cascade delete of some hibernate versions.*/
    public void deleteAllCollections(Session hibernateSession){

        Query query = hibernateSession.createSQLQuery(String.format("DELETE FROM %s where %sId = %d","bookmarkkeywords".toLowerCase(),"bookmark",this.getbookmarkId()));
        query.executeUpdate();

    }
}
