package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utility.BrowserFactory;

/**
 * @Pallavi
 *
 */
public class LoginTestCRM 
{
	WebDriver driver;
	
	@Test
	public void loginApp() 
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.freecrm.com/index.html");
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.loginToCRM("Selenium_50","Abcd@123");
		BrowserFactory.quitBrowser(driver);
	}

}
