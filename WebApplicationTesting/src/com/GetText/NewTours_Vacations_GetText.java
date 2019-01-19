package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_GetText {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		WebElement vacations=driver.findElementByLinkText("Vacations");
		vacations.click();
		
		String text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]"
		+ "/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font[1]/b/font[1]")).getText();
		System.out.println("The text of Vacations Web page is :"+text);
		
		driver.close();

	}

}
