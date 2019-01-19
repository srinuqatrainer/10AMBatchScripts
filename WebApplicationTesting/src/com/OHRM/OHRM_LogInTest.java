package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogInTest {

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
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		//<input name="txtPassword" id="txtPassword" type="password">
		driver.findElementByName("txtPassword").sendKeys(password);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		WebElement logIn=driver.findElementByClassName("button");
		logIn.click();
		
		String expected_Text="Welcome Admin";
		System.out.println("Expected text is: "+expected_Text);
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String actual_Text=driver.findElementByXPath("//*[@id='welcome']").getText();
		
		if(actual_Text.equalsIgnoreCase(expected_Text))
		{
			System.out.println("Successfully logged into OHRM Application - PASS");
		}
		else
		{
			System.out.println("Failed to LogIn - FAIL");
		}
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		driver.findElementByLinkText("Welcome Admin").click();
		
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		WebElement logOut=driver.findElementByPartialLinkText("Logo");
		logOut.click();
		
		driver.close();
		System.out.println("Application close");
	}

}
