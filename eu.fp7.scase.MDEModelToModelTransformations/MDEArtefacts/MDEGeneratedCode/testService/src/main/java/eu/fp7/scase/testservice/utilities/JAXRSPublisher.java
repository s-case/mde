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


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import eu.fp7.scase.testservice.bookmark.JavabookmarkController;
import eu.fp7.scase.testservice.account.JavaaccountController;
import eu.fp7.scase.testservice.bookmark.JavabookmarkControllerManager;
import eu.fp7.scase.testservice.account.JavaaccountControllerManager;
import eu.fp7.scase.testservice.bookmarkSearch.JavaAlgobookmarkSearchController;

/* This class is responsible to publish any resource controllers that can handle incoming HTTP requests
to the web service container (Jetty etc)*/

@ApplicationPath("/api/")
public class JAXRSPublisher extends Application{

    public JAXRSPublisher(){}

    /* This function returns to the container (Jetty, Tomcat etc) the classes that expose any web API*/
    @Override
    public Set<Class<?>> getClasses(){
        HashSet<Class<?>> SetOfClasses = new HashSet<Class<?>>();
		SetOfClasses.add(JavabookmarkController.class);
		SetOfClasses.add(JavaaccountController.class);
		SetOfClasses.add(JavabookmarkControllerManager.class);
		SetOfClasses.add(JavaaccountControllerManager.class);
		SetOfClasses.add(JavaAlgobookmarkSearchController.class);

        return SetOfClasses;
    }

    @Override
    public Set<Object> getSingletons(){
        return new HashSet<Object>();
    }
}
