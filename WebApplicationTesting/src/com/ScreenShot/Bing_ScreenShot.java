package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		Thread.sleep(7000); // Explicit wait
		
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_ScreenShot, new File("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\ScreenShot\\bing1.png"));
		
		driver.quit();

	}

}
