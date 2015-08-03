/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2014
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : S-CASE
 * WorkFile            : 
 * Compiler            : 
 * File Description    :
 * Document Description:
* Related Documents	   :
* Note				   :
* Programmer		   : Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/

package eu.fp7.scase.cimGenerator;

import java.util.ArrayList;

import eu.fp7.scase.inputParser.YamlResource;
import ServiceCIM.RESTServiceCIMFactory;
import ServiceCIM.RESTfulServiceCIM;

public abstract class ACIMProducer
{
	protected RESTfulServiceCIM oRESTfulServiceCIM;
	protected ArrayList<YamlResource> listOfYamlResources;
	protected RESTServiceCIMFactory oRestServiceCIMFactory;
	protected String strProjectName;
	protected String strProjectOutputPath;
	protected String strServiceDatabaseIp;
	protected String strServiceDatabasePort;
	protected String strServiceDatabaseUsername;
	protected String strServiceDatabasePassword;
	
	public ACIMProducer(ArrayList<YamlResource> listOfYamlResources, String strProjectName, String strProjectOutputPath, String strServiceDatabaseIp, String strServiceDatabasePort, String strServiceDatabaseUsername, String strServiceDatabasePassword){
		this.listOfYamlResources = listOfYamlResources;
		this.oRestServiceCIMFactory = RESTServiceCIMFactory.eINSTANCE;
		this.strProjectName = strProjectName;
		this.oRESTfulServiceCIM = this.oRestServiceCIMFactory.createRESTfulServiceCIM();
		this.oRESTfulServiceCIM.setName(strProjectName);
		this.oRESTfulServiceCIM.setServiceOutputPath(strProjectOutputPath);
		this.oRESTfulServiceCIM.setServiceDatabaseIP(strServiceDatabaseIp);
		this.oRESTfulServiceCIM.setServiceDatabasePort(strServiceDatabasePort);
		this.oRESTfulServiceCIM.setServiceDatabaseUsername(strServiceDatabaseUsername);
		this.oRESTfulServiceCIM.setServiceDatabasePassword(strServiceDatabasePassword);
	}
	
	public RESTfulServiceCIM getRESTfulServiceCIM(){
		return this.oRESTfulServiceCIM;
	}
	
	public RESTServiceCIMFactory getRESTServiceCIMFactory(){
		return this.oRestServiceCIMFactory;
	}
	
	public String getProjectName(){
		return this.strProjectName;
	}
	
	public abstract RESTfulServiceCIM produceCIM();
}