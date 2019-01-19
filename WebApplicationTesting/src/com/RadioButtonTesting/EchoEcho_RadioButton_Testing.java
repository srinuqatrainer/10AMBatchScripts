package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButton_Testing {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		
WebElement radioButtonBlock=driver.findElement(By.
xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form"
		+ "/table[3]/tbody/tr/td/table/tbody/tr/td"));

		// <input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		// <input type="radio" name="group1" value="Cheese">
		// <input type="radio" name="group2" value="Water">
		
		List<WebElement>radioButtons_Group1=radioButtonBlock.findElements(By.name("group1"));
		
		System.out.println(radioButtons_Group1.size());
		
		for(int i=0;i<radioButtons_Group1.size();i++)
		{
			radioButtons_Group1.get(i).click();
			
	for(int k=0;k<radioButtons_Group1.size();k++) // to get the status of the radio buttons
			{
				System.out.println(radioButtons_Group1.get(k).getAttribute("value")+" - "
			+radioButtons_Group1.get(k).getAttribute("checked"));
			}
			
		}
		
		driver.close();
		
		

	}

}
