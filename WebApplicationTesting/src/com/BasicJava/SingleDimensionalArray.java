package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
		/*int i=10;
		i=20;
		System.out.println(i);*/
		
		/*dataType arrayName[] = new dataType[size];
		dataType []arrayName = new dataType[size];*/
		
		// Array index always stats with 0
		// Array can store only one dataType value
		// Once declared the size of the Array ... we cannot store more value than the size
		// if a value is not not stored in the array index ,then it will be save with a default value as 0
		
		int a[] = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		/*System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[2]);*/
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
