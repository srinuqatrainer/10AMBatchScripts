package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_getAttribute {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryregister.php">REGISTER</a>
		
	String reference_Url=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		
		System.out.println("The referece URL of Register Element is :"+reference_Url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String actual_Url=driver.getCurrentUrl();
		
		if(actual_Url.equals(reference_Url))
		{
			System.out.println(" Successfully navigate to Register Page");
		}
		else
		{
			System.out.println("Failed to navigate to register Page");
		}
		
		driver.close();

	}

}
