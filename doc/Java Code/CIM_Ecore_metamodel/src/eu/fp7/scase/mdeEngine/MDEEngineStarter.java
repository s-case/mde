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


package eu.fp7.scase.mdeEngine;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.inputParser.YamlInputParser;
import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.cimGenerator.ACIMProducer;
import eu.fp7.scase.cimGenerator.AuthenticationCIMProducer;
import eu.fp7.scase.cimGenerator.CoreCIMProducer;
import eu.fp7.scase.cimGenerator.EcoreXMIExtractor;
import eu.fp7.scase.cimGenerator.SearchLayerCIMProducer;



public class MDEEngineStarter
{
	private static YamlInputParser oYamlInputParser;
	private static ACIMProducer oACIMProducer;
	private static AuthenticationLayerCIM.AnnotationModel oAuthenticationLayerCIM;

	
	
	public static void main(String[] args)
	{	
		System.out.println("S-CASE MDE engine started.");
		
		//check input arguments sanity
		if(args.length != 9)
		{
			System.out.println("Usage: java -cp target/RESTfulMDEEngine-1.0-SNAPSHOT.jar main.java.scase.mdeEngine.MDEEngineStarter input_CIM_file_path project_Name output_path database_ip database_port database_username database_password use_authentication use_searching?");
			return;
		}
		
		//parse the input yaml file
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PARSING YAML INPUT");
		oYamlInputParser = new YamlInputParser(args[0]);
		ArrayList<YamlResource> listOfYamlResources = oYamlInputParser.parseYamlInputFile();
		System.out.println("Found " + listOfYamlResources.size() + " yaml resources");
		System.out.println("PARSING YAML DONE");
		
		//initiate CIM generator to create the envisioned system's CIM
		System.out.println("------------------------------------------------------------------------");
		System.out.println("CIM DEFINITION START");
		System.out.println("------------------------------------------------------------------------");
		oACIMProducer = new CoreCIMProducer(listOfYamlResources, args[1], args[2], args[3], args[4], args[5], args[6]);
		RESTfulServiceCIM oRESTfulServiceCIM = oACIMProducer.produceCIM();
		System.out.println("Created " + oRESTfulServiceCIM.getHasResources().size() + " CIM resources");
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(args[1]);
		oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServiceCIM);
		
		//if the authentication flag is true
		if(args[7].toString().equalsIgnoreCase("yes")){
			AuthenticationCIMProducer oAuthenticationCIMProducer = new AuthenticationCIMProducer(oRESTfulServiceCIM);
			oAuthenticationLayerCIM = oAuthenticationCIMProducer.produceAuthenticationCIM();
		}
		
		//if the searching flag is true
		if(args[8].toString().equalsIgnoreCase("yes")){
			
			SearchLayerCIMProducer oSearchLayerCIMProducer;
			
			//if there exists authentication layer as well
			if(args[7].toString().equalsIgnoreCase("yes")){
				oSearchLayerCIMProducer = new SearchLayerCIMProducer(oRESTfulServiceCIM, oAuthenticationLayerCIM);
			}
			else{ //else
				oSearchLayerCIMProducer = new SearchLayerCIMProducer(oRESTfulServiceCIM, null);
			}
			
			oSearchLayerCIMProducer.produceSearchLayerCIM();
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("CIM DEFINITION END");
		System.out.println("------------------------------------------------------------------------");
	}
}