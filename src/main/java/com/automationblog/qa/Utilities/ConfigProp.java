package com.automationblog.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ConfigProp {
	
	
	File file;
	InputStream inputstream;
	Properties prop;
	String Fpath;
	
	public ConfigProp() throws IOException
	{
		file = new File("./src/main/java/com/automationblog/qa/Properties/Variable.properties");
		
		inputstream = new FileInputStream(file);
		
		prop = new Properties();
		
	    prop.load(inputstream);
	    
	   
	}
	
	

	public String getURL()
	{
		return prop.getProperty("url");
	}
	
	public String chromeDriver()
	{
		return prop.getProperty("chrome");
	}
	
	public String search()
	{
		return prop.getProperty("search");
	}
	
	public String XlsPath()
	{
		return prop.getProperty("xls");
	}
	

}
