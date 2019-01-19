package com.TabOperation;

import java.util.Set;

import org.apache.log4j.net.SyslogAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Help_CreateAGoogleAccount_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		System.out.println("The title of Gmail Home Page is : "+driver.getTitle());
		
		String parent=driver.getWindowHandle();
		System.out.println("The Parent window id is : "+parent);
		
		// <a href="https://support.google.com/accounts?hl=en" target="_blank">Help</a>
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String>child=driver.getWindowHandles();
		
		System.out.println("The id's of parent and child window are : "+child);
		
		for(String h:child)
		{
			if(!h.equals(parent))
			{
				driver.switchTo().window(h);
				
				System.out.println("The title of the child window is :"+driver.getTitle());
				
		String linkText=driver.findElement(By.linkText("Create a Google Account")).getText();
				System.out.println("The text of the link is : "+linkText);
				// <a href="/accounts/answer/27441?hl=en&amp;ref_topic=3382296">Create a Google Account</a>
				driver.findElement(By.linkText("Create a Google Account")).click();
				
				
				System.out.println("The title of sub child window is : "+driver.getTitle());
			}
		}
		
		driver.quit();
		
		

	}

}
