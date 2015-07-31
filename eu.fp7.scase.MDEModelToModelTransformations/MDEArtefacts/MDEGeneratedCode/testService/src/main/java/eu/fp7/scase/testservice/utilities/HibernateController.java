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


package eu.fp7.scase.testservice.utilities;


import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import java.util.Set;
import java.util.HashSet;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

import eu.fp7.scase.testservice.bookmark.JavabookmarkModel;
import eu.fp7.scase.testservice.account.JavaaccountModel;

/* HibernateController class is responsible to handle the low level activity between Hibernate and the service database.
 You may not alter existing functions, or the service may not function properly.
 Should you need more functions these could be added at the end of this file.
 You may add any exception handling to existing and/or new functions of this file.*/

public class HibernateController{

    private static HibernateController oHibernateController = new HibernateController();

    /* Since the class follows the singleton design pattern its constructor is kept private. The unique instance of it is accessed through its public API "getHibernateControllerHandle()".*/
    private HibernateController(){}

    /* Since this class follows the singleton design pattern, this function offers to the rest of the system a handle to its unique instance.*/
    public static HibernateController getHibernateControllerHandle(){
        return oHibernateController;
    }

	/* This function performs the actual authentication activity by looking up in the database wether the request's user is an authenticated user*/
	 public JavaaccountModel authenticateUser(JavaaccountModel oJavaaccountModel)
	 {
		 try
		 {
			//create a new session and begin the transaction
		    Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
			
			//create the query in HQL language
			String strQuery = String.format("FROM JavaaccountModel WHERE (username = '%s' AND password = '%s')", oJavaaccountModel.getusername() , oJavaaccountModel.getpassword());
			Query  hibernateQuery = hibernateSession.createQuery(strQuery);
			
			oJavaaccountModel = null;
			
			//retrieve the unique result, if there is a result at all
			oJavaaccountModel = (JavaaccountModel) hibernateQuery.uniqueResult();
			
			if(oJavaaccountModel == null)
			{
	    		throw new WebApplicationException(Response.Status.UNAUTHORIZED);
			}
			
			//commit and terminate the session
			hibernateTransaction.commit();
			hibernateSession.close();
			
			//return the JavaaccountModel of the authenticated user, or null if authentication failed
			return oJavaaccountModel ;
		}
		catch (HibernateException exception)
		{
			System.out.println(exception.getCause());

			ResponseBuilderImpl builder = new ResponseBuilderImpl();
			builder.status(Response.Status.BAD_REQUEST);
			builder.entity(String.format("%s",exception.getCause()));
			Response response = builder.build();
			throw new WebApplicationException(response);
		}
	 }

    /* This function handles the low level JPA activities so as to add a new bookmark resource to the service database.*/
    public JavabookmarkModel postbookmark(JavabookmarkModel oJavabookmarkModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Insert the new bookmark to database*/
        int bookmarkId = (Integer) hibernateSession.save(oJavabookmarkModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();

        /* Return the JavabookmarkModel with updated bookmarkId*/
        oJavabookmarkModel.setbookmarkId(bookmarkId);
        return oJavabookmarkModel;
    }
	
    /* This function handles the low level hibernate activities so as to update an existing bookmark resource of the service database.*/
    public JavabookmarkModel putbookmark(JavabookmarkModel oJavabookmarkModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Update the existing bookmark of the database*/
        hibernateSession.update(oJavabookmarkModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavabookmarkModel;
    }

    /* This function handles the low level hibernate activities so as to retrieve an existing bookmark resource from the service database.*/
    public JavabookmarkModel getbookmark(JavabookmarkModel oJavabookmarkModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Retrieve the existing bookmark from the database*/
        oJavabookmarkModel = (JavabookmarkModel) hibernateSession.get(JavabookmarkModel.class, oJavabookmarkModel.getbookmarkId());

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavabookmarkModel;
    }

    /* This function handles the low level hibernate activities so as to delete an existing bookmark resource from the service database.*/
    public JavabookmarkModel deletebookmark(JavabookmarkModel oJavabookmarkModel){

   		/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Retrieve the existing bookmark from the database*/
        oJavabookmarkModel = (JavabookmarkModel) hibernateSession.get(JavabookmarkModel.class, oJavabookmarkModel.getbookmarkId());

        /* Delete any collection related with the existing bookmark from the database.
        Note: this is needed because some hibernate versions do not handle correctly cascade delete on collections.*/
        oJavabookmarkModel.deleteAllCollections(hibernateSession);

        /* Delete the existing bookmark from the database*/
        hibernateSession.delete(oJavabookmarkModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavabookmarkModel;
    }

	/* This function handles the low level hibernate activities so as to retrieve all the bookmark resources from the service database
    that are related to a specific account resource.*/

    public JavaaccountModel getbookmarkList(JavaaccountModel oJavaaccountModel){

        /* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Find the account of which the bookmark resource list is needed*/
        oJavaaccountModel = (JavaaccountModel) hibernateSession.get(JavaaccountModel.class, oJavaaccountModel.getaccountId());

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavaaccountModel;
    }
    /* This function handles the low level JPA activities so as to add a new account resource to the service database.*/
    public JavaaccountModel postaccount(JavaaccountModel oJavaaccountModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Insert the new account to database*/
        int accountId = (Integer) hibernateSession.save(oJavaaccountModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();

        /* Return the JavaaccountModel with updated accountId*/
        oJavaaccountModel.setaccountId(accountId);
        return oJavaaccountModel;
    }
	
    /* This function handles the low level hibernate activities so as to update an existing account resource of the service database.*/
    public JavaaccountModel putaccount(JavaaccountModel oJavaaccountModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Update the existing account of the database*/
        hibernateSession.update(oJavaaccountModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavaaccountModel;
    }

    /* This function handles the low level hibernate activities so as to retrieve an existing account resource from the service database.*/
    public JavaaccountModel getaccount(JavaaccountModel oJavaaccountModel){

    	/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Retrieve the existing account from the database*/
        oJavaaccountModel = (JavaaccountModel) hibernateSession.get(JavaaccountModel.class, oJavaaccountModel.getaccountId());

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavaaccountModel;
    }

    /* This function handles the low level hibernate activities so as to delete an existing account resource from the service database.*/
    public JavaaccountModel deleteaccount(JavaaccountModel oJavaaccountModel){

   		/* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Retrieve the existing account from the database*/
        oJavaaccountModel = (JavaaccountModel) hibernateSession.get(JavaaccountModel.class, oJavaaccountModel.getaccountId());

        /* Delete any collection related with the existing account from the database.
        Note: this is needed because some hibernate versions do not handle correctly cascade delete on collections.*/
        oJavaaccountModel.deleteAllCollections(hibernateSession);

        /* Delete the existing account from the database*/
        hibernateSession.delete(oJavaaccountModel);

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return oJavaaccountModel;
    }

    /* This function handles the low level hibernate activities so as to retrieve all the account resources from the service database.*/

    public Set<JavaaccountModel> getaccountList(Set<JavaaccountModel> SetOfaccountList){

        /* Create a new hibernate session and begin the transaction*/
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction hibernateTransaction = hibernateSession.beginTransaction();

        /* Retrieve the list of account resources that are needed.*/
        String strHibernateQuery = "FROM JavaaccountModel";
        Query hibernateQuery = hibernateSession.createQuery(strHibernateQuery);
        SetOfaccountList = new HashSet(hibernateQuery.list());

        /* Commit and terminate the session*/
        hibernateTransaction.commit();
        hibernateSession.close();
        return SetOfaccountList;
    }
}
