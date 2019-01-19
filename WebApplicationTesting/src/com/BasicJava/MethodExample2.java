package com.BasicJava;

public class MethodExample2 {

	int a=10;
	int b=20;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	
	public void subtraction()
	{
		c=a-b;
		System.out.println(c);
	}
	
	public void multiplication()
	{
		c=a*b;
		System.out.println(c);
	}
	
	public void division()
	{
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		MethodExample2 m = new MethodExample2();
		m.add();
		m.subtraction();
		m.multiplication();
		m.division();

	}

}
