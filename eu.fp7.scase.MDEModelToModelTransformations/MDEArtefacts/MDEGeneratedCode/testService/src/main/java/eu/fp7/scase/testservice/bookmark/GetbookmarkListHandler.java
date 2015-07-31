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


import javax.ws.rs.core.UriInfo;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import com.sun.jersey.core.util.Base64;
import eu.fp7.scase.testservice.account.JavaaccountModel;

import java.util.Iterator;
import eu.fp7.scase.testservice.utilities.HypermediaLink;
import eu.fp7.scase.testservice.utilities.HibernateController;
import eu.fp7.scase.testservice.account.JavaaccountModel;

/* This class processes GET requests for bookmark resources and creates the hypermedia to be returned to the client*/
public class GetbookmarkListHandler{

    private HibernateController oHibernateController;
    private UriInfo oApplicationUri; //Standard datatype that holds information on the URI info of this request
    private JavaaccountModel oJavaaccountModel;
	private String authHeader;
	private JavaaccountModel oAuthenticationAccount;

    public GetbookmarkListHandler(String authHeader, int accountId, UriInfo oApplicationUri){
        this.oHibernateController = HibernateController.getHibernateControllerHandle();
        this.oApplicationUri = oApplicationUri;
        oJavaaccountModel = new JavaaccountModel();
        oJavaaccountModel.setaccountId(accountId);
		this.authHeader = authHeader;
		this.oAuthenticationAccount = new JavaaccountModel(); 
    }

    public JavabookmarkModelManager getJavabookmarkModelManager(){

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

        oJavaaccountModel = oHibernateController.getbookmarkList(oJavaaccountModel);
        return createHypermedia(oJavaaccountModel);
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

    /* This function produces hypermedia links to be sent to the client so as it will be able to forward the application state in a valid way.*/
    public JavabookmarkModelManager createHypermedia(JavaaccountModel oJavaaccountModel){
        JavabookmarkModelManager oJavabookmarkModelManager = new JavabookmarkModelManager();

        /* Create hypermedia links towards this specific bookmark resource. These must be GET and POST as it is prescribed in the meta-models.*/
        oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oApplicationUri.getPath()), "Get all bookmarks of this account", "GET", "Sibling"));
        oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oApplicationUri.getPath()), "Create a new bookmark", "POST", "Sibling"));

        /* Then calculate the relative path to any related resource of this one and add for each one a hypermedia link to the Linklist.*/
        String oRelativePath;
        oRelativePath = oApplicationUri.getPath();
        Iterator<JavabookmarkModel> setIterator = oJavaaccountModel.getSetOfJavabookmarkModel().iterator();
        while(setIterator.hasNext()){
            JavabookmarkModel oNextJavabookmarkModel = new JavabookmarkModel();
            oNextJavabookmarkModel = setIterator.next();
            oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s/%d", oApplicationUri.getBaseUri(), oRelativePath, oNextJavabookmarkModel.getbookmarkId()), String.format("%s", oNextJavabookmarkModel.geturl()), "GET", "Child", oNextJavabookmarkModel.getbookmarkId()));
        }

        /* Finally calculate the relative path towards the resources of which this one is related and add one hypermedia link for each one of them in the Linklist.*/
		oRelativePath = oApplicationUri.getPath();
        int iLastSlashIndex = String.format("%s%s", oApplicationUri.getBaseUri(), oRelativePath).lastIndexOf("/");
        oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oRelativePath).substring(0, iLastSlashIndex), "Delete the parent JavaaccountModel", "DELETE", "Parent"));
        oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oRelativePath).substring(0, iLastSlashIndex), "Get the parent JavaaccountModel", "GET", "Parent"));
        oJavabookmarkModelManager.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oRelativePath).substring(0, iLastSlashIndex), "Update the JavaaccountModel", "PUT", "Parent"));
        return oJavabookmarkModelManager;
    }
}
