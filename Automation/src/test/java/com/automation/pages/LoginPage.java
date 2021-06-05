package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Pallavi
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	public WebElement loginbutton;
	@FindBy(name="email")
	public WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(linkText="Login")
	public WebElement loginbutton1;
	
	public void loginToCRM(String usernameApplication, String passwordApplication) 
	{
		loginbutton.click();
		username.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		loginbutton1.click();
	}
	

}
