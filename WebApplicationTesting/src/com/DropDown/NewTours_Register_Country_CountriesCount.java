package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_CountriesCount {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// Country Dropdown
		// name="country"
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		System.out.println("The total countries are :"+countries.size());
		
		driver.close();

	}

}
