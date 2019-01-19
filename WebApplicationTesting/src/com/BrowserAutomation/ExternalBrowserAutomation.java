package com.BrowserAutomation;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExternalBrowserAutomation {

	public static void main(String[] args)
	{
		// Internet explorer Browser Automation
		System.setProperty("webdriver.ie.driver", "C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\driverFiles\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://yahoo.com");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\driverFiles\\MicrosoftWebDriver.exe");
		EdgeDriver driv = new EdgeDriver();
		driv.get("http://livetech.in");
		

	}

}
