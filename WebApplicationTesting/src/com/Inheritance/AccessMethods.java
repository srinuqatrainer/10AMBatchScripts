package com.Inheritance;

public class AccessMethods extends Base
{

	public void test3()
	{
		System.out.println("Method test3 executed successfully");
	}
	
	public static void main(String[] args)
	{
		AccessMethods a = new AccessMethods();
		a.test3();
		a.test1();
		a.test2();

	}

}
