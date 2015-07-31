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


package eu.fp7.scase.testservice.account;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.Table;
import javax.persistence.Transient;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.Session;

import eu.fp7.scase.testservice.utilities.HypermediaLink;
import eu.fp7.scase.testservice.bookmark.JavabookmarkModel;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.FieldBridge;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

import eu.fp7.scase.testservice.utilities.SetStringFieldBridge;

/* This class models the data of a account resource. It is enhanced with JAXB annotations for automated representation
parsing/marshalling as well as with Hibernate annotations for ORM transformations.*/
@XmlRootElement
@Entity
@Table(name="account")
@Indexed
public class JavaaccountModel{


    /* There follows a list with the properties that model the account resource, as prescribed in the service CIM*/
		@Column(name = "password")
		@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
		private String password;

		@Column(name = "username")
		private String username;

		@Id
		@GeneratedValue
		@Column(name = "accountId")
		private int accountId;

		// The Linklist property holds all the hypermedia links to be sent back to the client
		@Transient
		private List<HypermediaLink> linklist = new ArrayList<HypermediaLink>();

		// This property models the One to Many relationship between two resources as it is defined by the Hibernate syntax below.
		@OneToMany(fetch = FetchType.EAGER, mappedBy="account",orphanRemoval=true)
		@OnDelete(action=OnDeleteAction.CASCADE)
		private Set<JavabookmarkModel> SetOfJavabookmarkModel = new HashSet<JavabookmarkModel>();

    /* There follows a list of setter and getter functions.*/
	    public void setpassword(String password){
        	this.password = password;
    	}

	    public void setusername(String username){
        	this.username = username;
    	}

	    public void setaccountId(int accountId){
        	this.accountId = accountId;
    	}

	    public void setlinklist(List<HypermediaLink> linklist){
        	this.linklist = linklist;
    	}

		@XmlTransient
	    public void setSetOfJavabookmarkModel(Set<JavabookmarkModel> SetOfJavabookmarkModel){
        	this.SetOfJavabookmarkModel = SetOfJavabookmarkModel;
    	}

	    public String getpassword(){
        	return this.password;
    	}

	    public String getusername(){
        	return this.username;
    	}

	    public int getaccountId(){
        	return this.accountId;
    	}

	    public List<HypermediaLink> getlinklist(){
        	return this.linklist;
    	}

	    public Set<JavabookmarkModel> getSetOfJavabookmarkModel(){
        	return this.SetOfJavabookmarkModel;
    	}


    /* This function deletes explicitly any collections of this resource that are stored in the database 
    and iteratively does so for any subsequent related resources.
    NOTE: this function is needed to handle erroneous handling of cascade delete of some hibernate versions.*/
    public void deleteAllCollections(Session hibernateSession){


        Iterator<JavabookmarkModel> JavabookmarkModelIterator = SetOfJavabookmarkModel.iterator();
        while(JavabookmarkModelIterator.hasNext()){
            JavabookmarkModelIterator.next().deleteAllCollections(hibernateSession);
        }
    }
}
