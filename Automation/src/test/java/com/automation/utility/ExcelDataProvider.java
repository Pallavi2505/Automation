package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider
{
	XSSFWorkbook wb;//work book reference
	
	public ExcelDataProvider() 
	{
		File src=new File("./Testdata/Data.xlsx");
		
		try
		{
		    FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		 catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
	//method returns the sheet data in string 
	public String getStringData(String sheetName, int Row, int Column) 
	{
		return wb.getSheet(sheetName). getRow(Row). getCell(Column).getStringCellValue();
	}
	//method returns the sheet data in numeric
	public double getNumericData(String sheetName, int Row, int Column) 
	{
		return wb.getSheet(sheetName). getRow(Row). getCell(Column).getNumericCellValue();
	}
	public String getStringData(int sheetIndex, int Row, int Column) 
	{
		return wb.getSheetAt(sheetIndex). getRow(Row). getCell(Column).getStringCellValue();
	}
	
	
	
	
}
