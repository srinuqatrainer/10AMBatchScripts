package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		/*dataType arrayName[][] = new dataType[size][size];
		dataType [][]arrayName = new dataType[size][size];*/
		
		String a[][] = new String[2][2];
		
		a[0][0] = "LiveTech";
		a[0][1] = "Hello";
		
		a[1][0] = "Selenium";
		a[1][1] = "Testing";
		
		
		
		// System.out.println(a[1][0]);
		
		for(int i=0;i<=1;i++) // will goto Row's
		{
			for(int j=0;j<=1;j++) // will goto Every Row of All the Columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
