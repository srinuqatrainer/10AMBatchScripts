package com.IdentifyTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTitle_Bing {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		String actual_Title=driver.getTitle();
		
		System.out.println(actual_Title);
		
		driver.close();
		
		
		

	}

}
