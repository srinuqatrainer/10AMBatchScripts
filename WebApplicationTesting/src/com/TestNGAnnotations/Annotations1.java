package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=0)
	public void logIn()
	{
		System.out.println("Gmail LogIn functionality Test");
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
}
