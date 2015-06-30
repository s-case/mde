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

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SearchLayerCIM.AnnotationModel;

public class EcoreXMISearchLayerExtractor{
	private ResourceSet oResourceSet;
	private URI oURI;
	private org.eclipse.emf.ecore.resource.Resource oEcoreResource;
	private String strProjectName;
	
	//the code of this constructor is standard Ecore XMI writer initialization code
	public EcoreXMISearchLayerExtractor(String strProjectName){
		
		this.strProjectName = strProjectName;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(this.strProjectName + "SearchLayerCIM.xmi").getAbsolutePath());
		System.out.println(oURI.devicePath());

		// Create a resource for this file.
		oEcoreResource = oResourceSet.createResource(oURI);
	}
	
	public void exportEcoreXMI(AnnotationModel oSearchLayerCIM){
			this.oEcoreResource.getContents().add(oSearchLayerCIM);
		
		//save to disk
		try {
			this.oEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}