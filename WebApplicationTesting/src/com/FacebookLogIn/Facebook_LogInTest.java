package com.FacebookLogIn;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		driver.findElementByClassName("inputtext").sendKeys("Srini");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver.findElementByClassName("inputtext").sendKeys("hello");
		
		//driver.findElementByName("pass").sendKeys("hello");

	}

}
