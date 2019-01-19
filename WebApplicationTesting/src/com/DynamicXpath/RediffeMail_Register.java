package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RediffeMail_Register {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		// <input type="text" onblur="fieldTrack(this);" 
		//name="namea66ce60d" value="" style="width:185px;" maxlength="61">
		// name="name9aadafd1"
		//driver.findElement(By.name("namea66ce60d")).sendKeys("Srini");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("srini");
		
		//*[starts-with(@attribute, ’starting part of value which does not change’)]

		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Srini");
		

	}

}
