package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
	}
	
	@Test
	public void logIn()
	{
		// <input type="text" name="userName" size="10">
		
				driver.findElement(By.name("userName")).sendKeys("tutorial");
				
				// <input type="password" name="password" size="10">
				
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("tutorial");
				
				// <input type="image" name="login" value="Login" src="/images/btn_signin.gif"
				// width="58" height="17" alt="Sign-In" border="0">
				
				driver.findElement(By.name("login")).click();
				
				String expected_Title="Find";
				System.out.println("The expected title is :"+expected_Title);
				
				String actual_Title=driver.getTitle();
				System.out.println("The actual TItle is :"+actual_Title);
				
				if(actual_Title.contains(expected_Title))
				{
					System.out.println("LogIn Successfully - PASS");
				}
				else
				{
					System.out.println("LogIn failed - FAIL");
				}
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
