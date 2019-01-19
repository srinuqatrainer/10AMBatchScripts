package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration 
{

	WebDriver driver=null;
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void NewUserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Srinu");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("8585858");
		driver.findElement(By.id("userName")).sendKeys("Srinu@gmail.com");
		
		
		driver.findElement(By.name("address1")).sendKeys("HiTechCity");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("Sriniiii");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Sriniiii";
		System.out.println("Expected UserName is :"+expected_UserName);
		
		String actual_RegisteredUserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println("Actual username is "+actual_RegisteredUserName);
		
		if(actual_RegisteredUserName.contains(expected_UserName))
		{
			System.out.println("User Registered Sucessfully - PASS");
		}
		else
		{
			System.out.println("User Registration Failed - FAIL");
		}
	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
