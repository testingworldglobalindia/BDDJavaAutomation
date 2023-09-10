package org.hcl.web.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {

	public static String readApplicationConfigutation(String key) throws IOException{
		File f = new File("ConfigurationFiles/ProjectConfiguration.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		return (prop.get(key).toString());
		
	}
	
	public static String readElementLocators(String key) throws IOException{
		File f = new File("ConfigurationFiles/ElementLocators.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		return (prop.get(key).toString());
		
	}
	
	public static String readExpectedResults(String key) throws IOException{
		File f = new File("ConfigurationFiles/ExpectedResults.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		return (prop.get(key).toString());
		
	}
	
	
}


