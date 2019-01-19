package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	@Parameters("Browser")
	
	@Test
	public void logIn(String browser) throws IOException, InterruptedException
	{
		// identifying the  NODE's
		System.out.println("The browser is : "+browser);
		
		DesiredCapabilities cap = null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new 
				                              URL("http://192.168.0.5:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\newTours.properties");
		Properties pr = new Properties();
		pr.load(file2);
		
		int rowsCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowsCount;i++)
		{
		
			Row r=sheet.getRow(i);
		// <input type="text" name="userName" size="10">
		
driver.findElement(By.name(pr.getProperty("uName"))).clear();
driver.findElement(By.name(pr.getProperty("uName"))).sendKeys(r.getCell(0).getStringCellValue());
				
				Thread.sleep(5000);
				// <input type="password" name="password" size="10">
				driver.findElement(By.name(pr.getProperty("pwd"))).clear();
				WebElement password=driver.findElement(By.name(pr.getProperty("pwd")));
				password.sendKeys(r.getCell(1).getStringCellValue());
				
				// <input type="image" name="login" value="Login" src="/images/btn_signin.gif"
				// width="58" height="17" alt="Sign-In" border="0">
				
				driver.findElement(By.name(pr.getProperty("signIn"))).click();
				
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
				
				FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ApplicationResultFiles\\NewTours_LogIn_TestResult_FrameWork.xlsx");
				workBook.write(file1);
				
				driver.navigate().back();
		}
		
		driver.quit();
		
	}
	
	
	
}
