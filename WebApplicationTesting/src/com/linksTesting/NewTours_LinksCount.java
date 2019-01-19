package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LinksCount {

	public static void main(String[] args)
	{
		
		String url="http://newtours.demoaut.com";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <a href="mercuryregister.php">REGISTER</a>
		
		//driver.findElement(By.linkText("SIGN-ON")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println("The total number of links on NewTours Home page are :"+linksCount);
		
		driver.close();
		

	}

}
