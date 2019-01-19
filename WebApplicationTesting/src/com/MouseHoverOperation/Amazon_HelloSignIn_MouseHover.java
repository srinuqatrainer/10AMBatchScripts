package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		// nav-link-yourAccount
		
		WebElement helloSignIn=driver.findElementById("nav-link-yourAccount");
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).perform();;
		
		// <span class="nav-text">Your Orders</span> - your orders
		// <span class="nav-text">Your Wish List</span>
		
		// automate "Your wish list"
		// //*[@id="nav-flyout-yourAccount"]/div[3]/a[3]/span
		driver.findElement(By.xpath("//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span")).click();		
	
	}
}
