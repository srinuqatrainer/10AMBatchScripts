package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://jqueryui.com/droppable/";
		WebDriver driver=null;
		driver = new FirefoxDriver();
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(3000);
		
	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_Element, drop_Element).perform();
		
		driver.switchTo().defaultContent();

	}

}
