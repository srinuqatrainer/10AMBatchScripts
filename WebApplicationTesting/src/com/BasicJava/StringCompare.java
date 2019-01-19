package com.BasicJava;

public class StringCompare {

	public static void main(String[] args)
	{
		
		String a="hello";
		String b="Hello";
		
		//if(a.equals(b))    // Checks for the exact match case
		if(a.equalsIgnoreCase(b)) // Ignores the case sensitiveness during comparation
		{
			System.out.println(" Both Strings are same ");
		}
		else
		{
			System.out.println(" Both Strings are not same ");
		}
		
		System.out.println(" ***************************** ");
		
		String x="hello";
		String y=" hello";
		
		if(x.equals(y))
		{
			System.out.println("Both String are same");
		}
		else
		{
			System.out.println(" Both String are not Equal");
		}
		
		System.out.println("########################################");
		
		String p="hello";
		String q="ello";
		
		if(p.contains(q))
		{
			System.out.println(" q is existing in p ");
		}
		else
		{
			System.out.println(" q is not existing in p");
		}

	}

}
