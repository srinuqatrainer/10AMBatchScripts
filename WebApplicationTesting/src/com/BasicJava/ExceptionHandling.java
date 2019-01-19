package com.BasicJava;

public class ExceptionHandling {

	int a=10;
	int b=0;
	int c;
	
	public void division()
	{
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		ExceptionHandling h = new ExceptionHandling();
		h.division();

	}

}
