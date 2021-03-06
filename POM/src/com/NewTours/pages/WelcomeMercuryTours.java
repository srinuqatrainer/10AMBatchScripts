package com.NewTours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{
	// Object Repository

		/*WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
		signOn.click(); */
		
		@FindBy(linkText="SIGN-ON")
		WebElement signOn;
		
		public void SignOn()
		{
			signOn.click();
		}
		
		@FindBy(linkText="REGISTER")
		WebElement register;
		
		public void Register()
		{
			register.click();
		}
		
		@FindBy(linkText="SUPPORT")
		WebElement support;
		
		public void Support()
		{
			support.click();
		}
		
		@FindBy(linkText="CONTACT")
		WebElement contact;
		
		public void Contact()
		{
			contact.click();
		}
		
		@FindBy(name="userName")
		WebElement Username;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="login")
		WebElement SignIn;
		
		
		public void LogIn(String Uname,String Pwd)
		{
			Username.sendKeys(Uname);
			Password.sendKeys(Pwd);
			SignIn.click();
		}
}
