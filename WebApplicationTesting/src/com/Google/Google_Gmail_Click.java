package com.Google;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// <a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		
		driver.findElementByClassName("gb_P").click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
