package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_KeyBoardOperation {

	public static void main(String[] args)
	{
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
				
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();

		act.sendKeys("password").perform();;
		
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
