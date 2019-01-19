package com.FacebookLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {

	public static void main(String[] args) 
	{
		//FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("100");
		driver.findElementById("pass").sendKeys("hello");
		
		driver.findElementById("loginbutton").click();

	}

}
