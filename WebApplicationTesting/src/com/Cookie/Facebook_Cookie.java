package com.Cookie;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BrowserAutomation.FireFox_Browser;

public class Facebook_Cookie
{
	WebDriver driver=null;
	String url="http://facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void cookie()
	{
		Set<Cookie>myCookies=driver.manage().getCookies();
		
		int cookies_Count=myCookies.size();
System.out.println("Total number of Cookies of facebook Application are : "+cookies_Count);

		Iterator<Cookie>it=myCookies.iterator();
		
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getDomain()+" "+c.getName());
			
		}
		
		driver.manage().deleteAllCookies();
		
		myCookies=driver.manage().getCookies();
		
		int cookies_NewCount=myCookies.size();
		
		System.out.println("Total nuber of cookies after deletion are :"+cookies_NewCount);
				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
