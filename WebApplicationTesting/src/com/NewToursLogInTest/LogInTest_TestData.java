package com.NewToursLogInTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest_TestData {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = null;
		 driver = new FirefoxDriver();
		 
		 String url="http://newtours.demoaut.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int k=1;k<=rowCount;k++)
		{
			Row r=sheet.getRow(k);
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(r.getCell(1).getStringCellValue());
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif"
		// width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		System.out.println("The expected title is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The actual TItle is :"+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successfully - PASS");
			r.createCell(2).setCellValue("LogIn Successfully - PASS");
			
		}
		else
		{
			System.out.println("LogIn failed - FAIL");
			r.createCell(2).setCellValue("LogIn failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ApplicationResultFiles\\LogInTestResultData.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
	}				
		// <a href="mercurysignoff.php">SIGN-OFF</a>
		driver.close();

	}

}
