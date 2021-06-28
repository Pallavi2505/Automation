
package com.automation.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

/**
 * @Pallavi
 *
 */
public class BaseClass 
{
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	@BeforeSuite
	public void setUpSuite() 
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp() 
	{
		driver=BrowserFactory.openApplication(driver, config.getBrowser(), config.getStagingUrl());
	}
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.closeApplication(driver);
	}

}
