package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
import com.automation.utility.BaseClass;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ExcelDataProvider;

/**
 * @Pallavi
 *
 */
public class LoginTestCRM extends BaseClass
{
		
	@Test
	public void loginApp() 
	{
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
	}

}
