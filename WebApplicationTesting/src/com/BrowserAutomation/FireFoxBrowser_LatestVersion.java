package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_LatestVersion {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\driverFiles\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driverFiles\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");

	}

}
