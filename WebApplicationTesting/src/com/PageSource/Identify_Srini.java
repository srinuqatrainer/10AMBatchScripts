package com.PageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identify_Srini {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		String source=driver.getPageSource();
		
		if(source.contains("Srini"))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not existing");
		}
		driver.close();

	}

}
