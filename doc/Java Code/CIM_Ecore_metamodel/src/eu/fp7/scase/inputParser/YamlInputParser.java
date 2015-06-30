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

package eu.fp7.scase.inputParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import org.yaml.snakeyaml.Yaml;

public class YamlInputParser {

	private String strYamlFilePath;
	private Yaml   oYamlHandler;
	private InputStream oInputStreamHandler;
	private ArrayList<YamlResource> listOfYamlResources;
	
	public YamlInputParser(String strYamlFilePath){
		
		this.strYamlFilePath = strYamlFilePath;
		this.listOfYamlResources = new ArrayList<YamlResource>();
		oYamlHandler = new Yaml();
		try {
			oInputStreamHandler = new FileInputStream(new File(strYamlFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<YamlResource> parseYamlInputFile(){
		
		this.listOfYamlResources = (ArrayList<YamlResource>) oYamlHandler.load(oInputStreamHandler);
		for( YamlResource oYamlResource : listOfYamlResources){
			System.out.println(oYamlResource + "\n");
		}
		return this.listOfYamlResources;
	}

}
