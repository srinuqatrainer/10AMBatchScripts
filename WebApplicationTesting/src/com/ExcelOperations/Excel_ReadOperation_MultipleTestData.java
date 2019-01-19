package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_MultipleTestData {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\10AMBatch\\WebApplicationTesting\\src\\com\\ExcelFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identifying total active cell count in a sheet
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // to goto Every Row
		{
			Row r=sheet.getRow(i); // goes to a particular Row
			
			int cellCount=r.getLastCellNum(); // identifying total active Cells in the Row 
			
			for(int k=0;k<cellCount;k++) // to goto every row of all the cells to get the data
			{
				Cell c=r.getCell(k); // goes to a Row of a Cell
				String data=c.getStringCellValue(); // gets the data from the Row of a Cell
				System.out.print(data+" "); // print the data 
			}
			System.out.println();
			
		}
		

	}

}
