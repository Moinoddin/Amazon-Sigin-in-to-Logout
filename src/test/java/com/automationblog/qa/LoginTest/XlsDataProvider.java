package com.automationblog.qa.LoginTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationblog.qa.Utilities.ConfigProp;
import com.automationblog.qa.Utilities.XlsUtil;
import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class XlsDataProvider extends BaseClass {
	

	
	@Test(dataProvider="getData")
	
	public void dataproviders(String st, String se) throws IOException 
	{
		BlogPage Bp = new BlogPage(driver);
		XlsDataProvider xl = new  XlsDataProvider();
		String str[][];
		 
		Bp.WekipediaSearch().sendKeys(st);
		Bp.WekipediaButton();
		
	//	str = xl.getData();
	//	System.out.println(str);
		
	}
	
	
	
	
	@DataProvider()
	public String[][] getData() throws IOException
	{
		ConfigProp cp = new ConfigProp();
		String path = cp.XlsPath();
	
		String x=""  ;
				
		int rownum = XlsUtil.getRowCount(path, "sheet1");
		int colcount = XlsUtil.getCellCount(path, "Sheet1", 0);
		
		
		String[][] loginData =new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
										
				loginData[i-1][j] =	 XlsUtil.getCellData(path,"Sheet1", i, j);
				
				//System.out.println(loginData[i-1][j]);
			}
		}
		
		return loginData;
	}
	

		

	

}
