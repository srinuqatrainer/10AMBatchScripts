package com.BasicJava;

public class TryCatchExample {

	public static void main(String[] args) 
	{
		int i=10;
		int j=0;
		int c;
		
		try
		{
			c=i/j;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(" Cannot perform the operation");
		}

	}

}
