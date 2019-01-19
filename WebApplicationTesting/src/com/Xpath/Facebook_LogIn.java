package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// <input type="email" data-testid="royal_email">
		
		/*Xpath is of 2 types
		1.Absolute Xpath  -- html tag
		2.Relative Xpath  -- // 
		
		Syntax:
			 //tagName[@attribute='value']
			
			//input[@data-testid='royal_email']
			*/
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Srini");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Srini");
		
			
	// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
			
driver.findElementByXPath("//*[@class='inputtext' and @data-testid='royal_pass']").sendKeys("Hello");
			
		
		
		
		
		
		

	}

}
