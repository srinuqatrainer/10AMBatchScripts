package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeMethod
	public void applicationLaunchAndLogIn()
	{
		System.out.println("Gmail Application launch and logIn");
	}

	@Test(priority=1)
	public void inBox()
	{
		System.out.println("Gmail inBox Functionality Test");
	}
	
	@Test(priority=2)
	public void composeMail()
	{
		System.out.println("Gmail ComposeMail Functionality Test");
	}
	
	@Test(enabled=false)
	public void drafts()
	{
		System.out.println("Gmail drafts functionality Test");
	}
	
	
	@AfterMethod
	public void applicationClose()
	{
		System.out.println("Gmail Application Close");
	}
}
