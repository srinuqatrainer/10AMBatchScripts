package com.IdentifyingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingURL_Facebook {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The Current URL of Facebook is :"+actual_Url);
		
		driver.close();
		

	}

}
