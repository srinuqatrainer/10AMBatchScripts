package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_PIM_MouseHover {

	public static void main(String[] args) 
	{
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		String expected_Title="OrangeHRM";
		System.out.println("The Expected Title is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The actual Title is :"+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("OrangeHRM Home Page Launched Successfully");
		}
		else
		{
			System.out.println("OrangeHRM Home Page failed to launch");
		}
		// <input name="txtUsername" id="txtUsername" type="text">
		//driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		
		
		//<input name="txtPassword" id="txtPassword" type="password">
		driver.findElementByName("txtPassword").sendKeys(password);
		
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		WebElement logIn=driver.findElementByClassName("button");
		logIn.click();
		
		WebElement pim=driver.findElementById("menu_pim_viewPimModule");
		
		Actions act =new Actions(driver);
		act.moveToElement(pim).perform();
		
		driver.findElementById("menu_pim_addEmployee").click();
		

	}

}
