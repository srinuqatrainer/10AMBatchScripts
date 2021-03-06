package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureCompleWebTableData {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
   // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<=36;i++) // goto every Row
		{
			for(int j=1;j<=8;j++)
			{
				String data=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		driver.quit();
	}

}
