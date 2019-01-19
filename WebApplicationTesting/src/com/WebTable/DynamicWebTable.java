package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Identify the block of the table
WebElement table =driver.findElement(By.xpath
		("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		
		// in the identified block the table , finding the total number of rows
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		// getting the Rows count
		System.out.println(rows.size());
		
		for(int i=0;i<rows.size();i++) // goto every Row of the table
		{
			// going to every row and indentifying the total number of columns
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
		//	System.out.println(cols.size());
			for(int j=0;j<cols.size();j++ ) // Of every Row - getting all the column data
					{
						String data=cols.get(j).getText();
						System.out.print(data+"  ");
					}
			System.out.println();
		}
		driver.close();
	}

}
