package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		/*
		 
 <a href="mercuryregister.php">REGISTER</a>

 a - anchor tag -- Link on the web Page
 href - attribute

 Type of Element = link

locator - linkText
Selector - REGISTER (text of the link)

		 */
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
