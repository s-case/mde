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


package eu.fp7.scase.testservice.bookmarkSearch;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.core.UriInfo;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import com.sun.jersey.core.util.Base64;
import eu.fp7.scase.testservice.account.JavaaccountModel;

import eu.fp7.scase.testservice.utilities.HypermediaLink;
import eu.fp7.scase.testservice.utilities.HibernateController;
import eu.fp7.scase.testservice.utilities.PersistenceUtil;
import eu.fp7.scase.testservice.account.JavaaccountModel;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;

/* This class processes search requests for bookmarkSearch resource and creates the hypermedia links with the search results to be returned to the client*/
public class GetbookmarkSearchHandler{

    private HibernateController oHibernateController;
    private UriInfo oApplicationUri; //Standard datatype that holds information on the URI info of this request
    private JavaAlgobookmarkSearchModel oJavaAlgobookmarkSearchModel;
	private String searchAccountPassword;
	private String searchKeyword;
	private String authHeader;
	private JavaaccountModel oAuthenticationAccount;

    public GetbookmarkSearchHandler(String authHeader, String searchKeyword, String searchAccountPassword, UriInfo oApplicationUri){
        oJavaAlgobookmarkSearchModel = new JavaAlgobookmarkSearchModel();
        this.oHibernateController = HibernateController.getHibernateControllerHandle();
        this.oApplicationUri = oApplicationUri;
		this.authHeader = authHeader;
		this.oAuthenticationAccount = new JavaaccountModel(); 
		this.searchAccountPassword = searchAccountPassword;
		this.searchKeyword = searchKeyword;
    }

    public JavaAlgobookmarkSearchModel getbookmarksearch(){

    	//check if there is a non null authentication header
    	if(authHeader == null){
    		throw new WebApplicationException(Response.Status.FORBIDDEN);
    	}
		else{
	    	//decode the auth header
    		decodeAuthorizationHeader();

        	//authenticate the user against the database
        	oAuthenticationAccount = oHibernateController.authenticateUser(oAuthenticationAccount);

			//check if the authentication failed
			if(oAuthenticationAccount == null){
        		throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        	}
		}

		//Return any results in the hypermedia links form.
        return searchDatabase();
    }

	/* This function performs the decoding of the authentication header */
    public void decodeAuthorizationHeader()
    {
    	//check if this request has basic authentication
    	if( !authHeader.contains("Basic "))
    	{
    		throw new WebApplicationException(Response.Status.BAD_REQUEST);
    	}
    	
        authHeader = authHeader.substring("Basic ".length());
        String[] decodedHeader;
        decodedHeader = Base64.base64Decode(authHeader).split(":");
        
        if( decodedHeader == null)
        {
        	throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        
        oAuthenticationAccount.setusername(decodedHeader[0]);
        oAuthenticationAccount.setpassword(decodedHeader[1]);
    }

    /* This function produces hypermedia links to be sent to the client that include all the search results, so as it will be able to forward the application state in a valid way.*/
    public JavaAlgobookmarkSearchModel searchDatabase(){
		
		// if any searchable property of resource Account is included in clients search request
    	if((this.searchAccountPassword != null && this.searchAccountPassword.equalsIgnoreCase("true")))
    	{
			//then add hypermedia links to any search results from this resource
    		addAccountHypermediaLinks();
    	}

		return this.oJavaAlgobookmarkSearchModel;
	}

	/* This functions produces hypermedia links to be sent to the client that include search results of resource Account search requests
	 */
    public void addAccountHypermediaLinks(){
   
    	FullTextEntityManager oFullTextEntityManager = PersistenceUtil.getFullTextEntityManager();
    	PersistenceUtil.beginEntityManagerTransaction();

		ArrayList<String> strQueryParams = new ArrayList<String>();		

		if((this.searchAccountPassword != null && this.searchAccountPassword.equalsIgnoreCase("true"))){
			strQueryParams.add("password");
		}

    	QueryBuilder oQueryBuilder = oFullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(JavaaccountModel.class).get();
    	org.apache.lucene.search.Query oLuceneQuery = oQueryBuilder.keyword().onFields(strQueryParams.toArray(new String[strQueryParams.size()])).matching(this.searchKeyword).createQuery();
    	// wrap Lucene query in a javax.persistence.Query
    	javax.persistence.Query oJpaQuery = oFullTextEntityManager.createFullTextQuery(oLuceneQuery, JavaaccountModel.class);

    	// execute search
    	List<JavaaccountModel> JavaaccountModelList =(List<JavaaccountModel>) oJpaQuery.getResultList();

    	Iterator<JavaaccountModel> iteratorOfJavaaccountModelList = JavaaccountModelList.iterator();
    	while(iteratorOfJavaaccountModelList.hasNext())
    	{
    		JavaaccountModel oJavaaccountModel = iteratorOfJavaaccountModelList.next();
    	}
    	
    	PersistenceUtil.endEntityManagerTransaction();    	
    }	
	
}
