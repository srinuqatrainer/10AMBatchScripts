package com.BrowserAutomation;


import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Browser {

	public static void main(String[] args) 
	{
		FirefoxDriver hi = new FirefoxDriver();
		
		hi.get("http://gmail.com");

	}

}
