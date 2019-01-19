package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_LogIn_LinkCount {

	public static void main(String[] args) 
	{
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
				
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();

		act.sendKeys("password").perform();;
		
		act.sendKeys(Keys.ENTER).perform();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are :"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
			
					String linkNames=links.get(i).getText();
					System.out.println(i+" "+linkNames);
			}
		}
		
		driver.close();
		

	}

}
