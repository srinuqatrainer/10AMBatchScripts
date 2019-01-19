package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURL_facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
		
		String expected_URL="facebook.com";
		System.out.println("The Client expected URL is : "+expected_URL);
		
		String expected_Title="Facebook – log in or sign up";
		System.out.println("The expected title of facebook home page is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The actual title of facebook home page is: "+actual_Title);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The Current URL of Facebook is :"+actual_Url);
		
		if(actual_Url.contains(expected_URL))
		{
			System.out.println("URL Matched , Successfully navigated to Facebook HomePage - PASS");
		}
		else
		{
			System.out.println("URL not Matched, Failed to navigate to Facebook HomePage - Fail");
		
		}
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title matched - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
driver.quit();
}
}