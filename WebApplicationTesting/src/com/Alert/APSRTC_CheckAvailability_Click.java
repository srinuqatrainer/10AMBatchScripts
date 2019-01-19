package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_CheckAvailability_Click {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
				
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		// getting the text of an alert window
		String alert_Message=alt.getText();
		System.out.println("The alert message is :"+alert_Message);

		
		// it is used to perform / accept the OK button on the alert
		alt.accept();
		
		// it is used to perform  / cancel the "Cancel" button on the alert
		//alt.dismiss();
		
		// it is used to send the data into the text field/element
		//alt.sendKeys("Srini");
		
		driver.close();

	}

}
