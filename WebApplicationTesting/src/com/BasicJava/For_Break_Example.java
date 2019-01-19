package com.BasicJava;

public class For_Break_Example {

	public static void main(String[] args) 
	{
		for(int i=3;i<=8;i++)
		{
			if(i!=5)
			{
				System.out.println(i);
				break;
			}
		}

		System.out.println("**************************");
		
		for(int a=10;a<=15;a++)
		{
			if(a==13)
			{
				break;
							
			}
			System.out.println(a);
		}
		
	}

}
