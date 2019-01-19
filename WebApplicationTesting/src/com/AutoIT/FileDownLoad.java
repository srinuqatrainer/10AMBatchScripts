package com.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownLoad {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\AutoItScripts\\FileDownload.exe");

	}

}
