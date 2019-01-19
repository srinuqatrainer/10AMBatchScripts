package com.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("Button-label")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("browse-btn")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\AutoItScripts\\FileUpload.exe");

	}

}
