package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_BackToHome {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		WebElement vacations=driver.findElementByLinkText("Vacations");
		vacations.click();
		
		// <img src="/images/forms/home.gif" width="118" height="23" border="0">
		
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		// based on relative xpath -- automate "Back To Home" element
		driver.findElement(By.xpath("//*[@src='/images/forms/home.gif']")).click();
		
		// absolute xpath 
		
//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		

	}

}
