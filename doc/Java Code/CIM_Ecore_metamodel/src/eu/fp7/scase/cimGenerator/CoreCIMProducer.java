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
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;


import eu.fp7.scase.inputParser.YamlProperty;
import eu.fp7.scase.inputParser.YamlResource;
import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.InputRepresentation;
import ServiceCIM.MediaType;
import ServiceCIM.OutputRepresentation;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import ServiceCIM.Property;

public class CoreCIMProducer extends ACIMProducer{
	
	public CoreCIMProducer(ArrayList<YamlResource> listOfCIMYamlResources, String strProjectName, String strProjectOutputPath, String strServiceDatabaseIp, String strServiceDatabasePort, String strServiceDatabaseUsername, String strServiceDatabasePassword){
		super(listOfCIMYamlResources, strProjectName, strProjectOutputPath, strServiceDatabaseIp, strServiceDatabasePort, strServiceDatabaseUsername, strServiceDatabasePassword);
	}

	@Override
	public RESTfulServiceCIM produceCIM() {
		
		createAllCIMResources();
		addResourceRelations();
	//	validateProducedCIM();
		
		return this.getRESTfulServiceCIM();
	}
	
	private void createAllCIMResources(){
		for(int n = 0; n < this.listOfYamlResources.size(); n++){
			YamlResource oCurrentYamlResource = this.listOfYamlResources.get(n);
			Resource oNewCIMResource = this.getRESTServiceCIMFactory().createResource();
			oNewCIMResource.setName(oCurrentYamlResource.getName());
			oNewCIMResource.setIsAlgorithmic(oCurrentYamlResource.getResourceType());
			oNewCIMResource = addResourceProperties(oNewCIMResource, oCurrentYamlResource);
			oNewCIMResource = addResourceCRUDActivities(oNewCIMResource, oCurrentYamlResource);
			oNewCIMResource = addResourceRepresentations(oNewCIMResource, oCurrentYamlResource);
			this.getRESTfulServiceCIM().getHasResources().add(oNewCIMResource);
		}
	}
	
	private Resource addResourceProperties(Resource oNewCIMResource, YamlResource oCurrentYamlResource){
		
		for(int n = 0; n < oCurrentYamlResource.getYamlProperties().size(); n++){
			YamlProperty oCurrentYamlProperty = oCurrentYamlResource.getYamlProperties().get(n);
			Property oNewResourceProperty = this.getRESTServiceCIMFactory().createProperty();
			oNewResourceProperty.setName(oCurrentYamlProperty.getName());
			oNewResourceProperty.setType(oCurrentYamlProperty.getType());
			oNewResourceProperty.setIsUnique(oCurrentYamlProperty.getUniqueness());
			oNewResourceProperty.setIsNamingProperty(oCurrentYamlProperty.getNamingAbility());
			oNewCIMResource.getHasProperty().add(oNewResourceProperty);
		}
		
		return oNewCIMResource;
	}
	
	private void addResourceRelations(){
		
		for(int n = 0; n < this.getRESTfulServiceCIM().getHasResources().size(); n++){
			for(int i = 0; i < this.listOfYamlResources.size(); i++){
				//if we come by the parent Yaml resource of this CIM resource
				if(this.getRESTfulServiceCIM().getHasResources().get(n).getName().equalsIgnoreCase(this.listOfYamlResources.get(i).getName())){
					//add to the CIM resource the same related resources as the ones that the Yaml resource has
					addOutgoingRelations(n, i);
				}
			}
			addIncomingRelations(n);
		}
	}
	
	private void addOutgoingRelations(int iCIMResourceIndex, int iYamlResourceIndex){
		
		for(int i = 0; i < this.listOfYamlResources.get(iYamlResourceIndex).getRelatedResources().size(); i++){
			for(int n = 0; n < this.getRESTfulServiceCIM().getHasResources().size(); n++){
				if(this.getRESTfulServiceCIM().getHasResources().get(n).getName().equalsIgnoreCase(this.listOfYamlResources.get(iYamlResourceIndex).getRelatedResources().get(i))){
					this.getRESTfulServiceCIM().getHasResources().get(iCIMResourceIndex).getHasRelatedResource().add(this.getRESTfulServiceCIM().getHasResources().get(n));
				}
			}	
		}
	}
	
	private void addIncomingRelations(int iCIMResourceIndex){
		
		for(int n = 0; n < this.listOfYamlResources.size(); n++){
			for(int i = 0; i < this.listOfYamlResources.get(n).getRelatedResources().size(); i++){
				if(this.getRESTfulServiceCIM().getHasResources().get(iCIMResourceIndex).getName().equalsIgnoreCase(this.listOfYamlResources.get(n).getRelatedResources().get(i))){
					for(int j = 0; j < this.getRESTfulServiceCIM().getHasResources().size(); j++){
						if(this.getRESTfulServiceCIM().getHasResources().get(j).getName().equalsIgnoreCase(this.listOfYamlResources.get(n).getName())){
							this.getRESTfulServiceCIM().getHasResources().get(iCIMResourceIndex).getIsRelatedResource().add(this.getRESTfulServiceCIM().getHasResources().get(j));
						}
					}
				}
			}
		}
	}
	
	private Resource addResourceCRUDActivities(Resource oNewCIMResource, YamlResource oCurrentYamlResource){
		
		for(int n = 0; n < oCurrentYamlResource.getCRUDActivities().size(); n++){
			
			CRUDActivity oCRUDActivity = this.getRESTServiceCIMFactory().createCRUDActivity();
			if(oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("create")){
				oCRUDActivity.setCRUDVerb(CRUDVerb.CREATE);
			}
			else if(oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("read")){
				oCRUDActivity.setCRUDVerb(CRUDVerb.READ);
			}
			else if(oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("update")){
				oCRUDActivity.setCRUDVerb(CRUDVerb.UPDATE);
			}
			else if(oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("delete")){
				oCRUDActivity.setCRUDVerb(CRUDVerb.DELETE);
			}
			else{
				System.out.println("Corrupted input! Unkown CRUD verb: " + oCurrentYamlResource.getCRUDActivities().get(n));
				Runtime.getRuntime().exit(-1);
			}
			oNewCIMResource.getHasCRUDActivity().add(oCRUDActivity);
		}
		return oNewCIMResource;
	}
	
	private Resource addResourceRepresentations(Resource oNewCIMResource, YamlResource oCurrentYamlResource){
		
		oNewCIMResource = addInputRepresentations(oNewCIMResource, oCurrentYamlResource);
		oNewCIMResource = addOutputRepresentations(oNewCIMResource, oCurrentYamlResource);
		
		return oNewCIMResource;
	}
	
	private Resource addInputRepresentations(Resource oNewCIMResource, YamlResource oCurrentYamlResource){
		
		if(oCurrentYamlResource.getInputRepresentation() != null){
			InputRepresentation oInputRepresentation = this.getRESTServiceCIMFactory().createInputRepresentation();
			if(oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("JSON")){
				oInputRepresentation.setInputMediaType(MediaType.JSON);
			}
			else if(oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("XML")){
				oInputRepresentation.setInputMediaType(MediaType.XML);
			}
			else{
				System.out.println("Corrupted inpt! Unkown input media type: " + oCurrentYamlResource.getInputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewCIMResource.getHasInputRepresentation().add(oInputRepresentation);
		}
		
		return oNewCIMResource;
	}
	
	private Resource addOutputRepresentations(Resource oNewCIMResource, YamlResource oCurrentYamlResource){
		
		if(oCurrentYamlResource.getOutputRepresentation() != null){
			OutputRepresentation oOutputRepresentation = this.getRESTServiceCIMFactory().createOutputRepresentation();
			if(oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("JSON")){
				oOutputRepresentation.setOutputMediaType(MediaType.JSON);
			}
			else if(oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("XML")){
				oOutputRepresentation.setOutputMediaType(MediaType.XML);
			}
			else{
				System.out.println("Corrupted input! Unknown output media type: " + oCurrentYamlResource.getOutputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewCIMResource.getHasOutputRepresentation().add(oOutputRepresentation);
		}
		
		return oNewCIMResource;
	}

	
	private void validateProducedCIM(){
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.getRESTfulServiceCIM());
		if( diagnostic.getSeverity() == Diagnostic.OK){
			System.out.println("Produced CIM is valid!");
		}
		else{
			System.out.println("Produced CIM is invalid!");
			System.out.println(diagnostic.getMessage());
			for(Iterator<Diagnostic> iteratorOfDiagnostics = diagnostic.getChildren().iterator(); iteratorOfDiagnostics.hasNext();){
				Diagnostic childDiagnostic = (Diagnostic) iteratorOfDiagnostics.next();
				System.out.println(childDiagnostic.getMessage());
 			}
		}
	}
}