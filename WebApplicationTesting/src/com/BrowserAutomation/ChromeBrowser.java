package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args)
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\BrowserAutomation\\ChromeBrowser.java");
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		

	}

}
