package com.Grid_DataProvider;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{
	
	@DataProvider(parallel=true)
	
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "tutorial";
		data[0][1] = "tutorial";
		data[0][2] = "firefox";
		
		data[1][0] = "tutorial";
		data[1][1] = "tutorial";
		data[1][2] = "chrome";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void logIn(String uName,String pwd, String browser) throws MalformedURLException
	{
		
		
		// identifying the  NODE's
				System.out.println("The browser is : "+browser);
				
				DesiredCapabilities cap = null;
				
				if(browser.equalsIgnoreCase("firefox"))
				{
					cap = DesiredCapabilities.firefox();
					cap.setBrowserName("firefox");
					cap.setPlatform(Platform.WINDOWS);
				}
				else
					if(browser.equalsIgnoreCase("chrome"))
					{
						cap=DesiredCapabilities.chrome();
						cap.setBrowserName("chrome");
						cap.setPlatform(Platform.WINDOWS);
					}
				
				RemoteWebDriver driver = new RemoteWebDriver(new 
						                         URL("http://192.168.0.6:4444/wd/hub"),cap);
				driver.get("http://newtours.demoaut.com");
				
				
				driver.findElement(By.name("userName")).sendKeys(uName);
				driver.findElement(By.name("password")).sendKeys(pwd);
				driver.findElement(By.name("login")).click();
				
	}

	
}
