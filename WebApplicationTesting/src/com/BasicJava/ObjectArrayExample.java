package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args) 
	{
		
		// Object array is capable of storing different dataType value
		
		//Object arrayName[] = new Object[size];
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "LiveTech";
		a[2] = 10.1223;
		
		/*for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}*/
		
		// for each loop
		for(Object var:a)
		{
			System.out.println(var);
		}

	}

}
