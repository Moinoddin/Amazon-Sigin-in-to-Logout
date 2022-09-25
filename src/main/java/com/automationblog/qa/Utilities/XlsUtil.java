package com.automationblog.qa.Utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsUtil {
	
	public static InputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String str;
	
	public static int getRowCount(String xfile, String xlsheet) throws IOException
	{
		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		
		return rowcount;
	}
	
	public static int getCellCount(String xfile, String xlsheet, int rownum) throws IOException
	{
		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		
		return cellCount;

	}
	
	public static String getCellData(String xfile, String xlsheet, int rownum, int cellvalue) throws IOException
	{
		
		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		
		 str = wb.getSheet(xlsheet).getRow(rownum).getCell(cellvalue).getStringCellValue();
		
		wb.close();
		fi.close();
		
	//	String[][] data = new String[rownum][cellvalue];
		
		
		return str;
	}
	

}
