package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void demo() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation Testing-Java with selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}

}
