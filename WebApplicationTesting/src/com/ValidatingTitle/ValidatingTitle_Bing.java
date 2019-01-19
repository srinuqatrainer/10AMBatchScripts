package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Bing {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
		
		String expected_Title="orangehrm";
		System.out.println("The Expected Title of Bing Home Page is:"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The Actual Title of Bing Home Page is: "+actual_Title);
		
	//	if(actual_Title.equals(expected_Title))
		
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println("Title Matched - PASS");
			System.out.println("Successfully navigate to OHRM Application");
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
			System.out.println("Failed to navigate to OHRM Application");
		}

		driver.quit();
	}

}
