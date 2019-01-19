package com.Application_Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_ExportDataToExcel {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver= null;
		driver = new FirefoxDriver();
		
		String url ="http://newtours.demoaut.com";
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int countries_Count=countries.size();
		System.out.println(countries_Count);
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ExcelFiles\\CountriesList.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int k=0;k<countries_Count;k++ )
		{
			String countryName=countries.get(k).getText();
			System.out.println(countryName);
			
			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			c.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ExcelFiles\\CountriesList.xlsx");
			workBook.write(file1);
			
		}
		
		driver.quit();
		
		
		
		

	}

}
