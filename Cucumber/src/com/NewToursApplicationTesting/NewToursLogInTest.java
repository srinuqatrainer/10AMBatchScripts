package com.NewToursApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLogInTest
{
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	
	@Given("^Open firefox browser and navigate to newtours application$")
	public void Open_firefox_browser_and_navigate_to_newtours_application()
	 {
	
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User enters valid userName and password and click on signIn button$")
	public void User_enters_valid_userName_and_password_and_click_on_signIn_button() throws Throwable 
	{
		// <input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		// <input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user should be able to successfully login and close the application$")
	public void user_should_be_able_to_successfully_login_and_close_the_application() throws Throwable 
	{
		
		String expected_text="Welcome Admin";
		System.out.println("The expected text is :"+expected_text);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String actual_Text=driver.findElement(By.id("welcome")).getText();
		System.out.println("The actual text is : "+actual_Text);
		
		if(actual_Text.contains(expected_text))
		{
			System.out.println("Successfully logIn - PASS");
		}
		else
		{
			System.out.println("LogIN Failed - FAIL");
		}
		
		driver.quit();
	}
}
