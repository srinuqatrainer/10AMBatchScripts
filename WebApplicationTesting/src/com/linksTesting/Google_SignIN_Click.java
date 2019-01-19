package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIN_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		/*
		 <a class="gb_Pe gb_Ba gb_Mb" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
continue=https://www.google.com/" target="_top">Sign in</a>
		 */

		// driver.findElementById("gb_70").click();
		//driver.findElement(By.linkText("Sign in")).click();
		
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
	}

}
