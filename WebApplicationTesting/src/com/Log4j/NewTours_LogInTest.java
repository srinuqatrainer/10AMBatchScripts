package com.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest 
{
	public static Logger logger = Logger.getLogger("NewTours_LogInTest");
	public static void main(String[] args)
	{
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		FirefoxDriver driver = new FirefoxDriver();
		//System.out.println("Firefox browser opened successfully");
		logger.info("Firefox browser opened successfully");
		
		
		driver.get("http://newtours.demoaut.com");
		
		logger.info("Successfully navigated to NewTours Application");
		
		// <input type="text" name="userName" size="10">
		
		driver.findElementByName("userName").sendKeys("tutorial");
		logger.info("Enter the userName");
		
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElementByName("password");
		password.sendKeys("tutorial");
		logger.info("Enter the password");
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif"
		// width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		logger.info("Perfom click on logIN");
		
		String expected_Title="Find";
		System.out.println("The expected title is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The actual TItle is :"+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			//System.out.println("LogIn Successfully - PASS");
			logger.info("LogIn Successfully - PASS");
		}
		else
		{
			//System.out.println("LogIn failed - FAIL");
			logger.info("LogIn failed - FAIL");
		}
					
		driver.close();
		logger.info("Application closed successfully");
		

	}

}
