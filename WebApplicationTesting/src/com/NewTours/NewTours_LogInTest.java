package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" name="userName" size="10">
		
		driver.findElementByName("userName").sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElementByName("password");
		password.sendKeys("tutorial");
		
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
		}
		else
		{
			System.out.println("LogIn failed - FAIL");
		}
					
		// <a href="mercurysignoff.php">SIGN-OFF</a>
		driver.close();
		
		
		

	}

}
