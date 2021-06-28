package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;//global variable of properties class
	public ConfigDataProvider() 
	{
		File src=new File("./Configuration/Config.properties");
		try 
		{
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();//Properties class object
		pro.load(fis);
		}
		catch(Exception e) 
		{
			System.out.println("not able to load config file"+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keytosearch) 
	{
		return pro.getProperty(keytosearch);
	}
	public String getBrowser() 
	{
		return pro.getProperty("Browser");
	}
	public String getStagingUrl() 
	{
		return pro.getProperty("qaURL");
	}
	
	
	
	

}
