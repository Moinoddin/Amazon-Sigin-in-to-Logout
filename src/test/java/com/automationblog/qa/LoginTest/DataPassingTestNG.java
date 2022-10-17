package com.automationblog.qa.LoginTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPassingTestNG {
	
  @Test(dataProvider = "datapassing")
  public void f(HashMap<Integer,String> sr, ArrayList<Integer> li) 
  {
	  
	  System.out.println(sr);
	  System.out.println(li);
	  
	  
  }
  
  @DataProvider()
  public Object[][] datapassing()
  {
	  HashMap<Integer,String> hm = new HashMap<Integer,String>();
	  
	 hm.put(1, "Mainuddin");
	 hm.put(2, "M"); 
	 hm.put(3, "Sarwad");
	 
	 List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	 
	// 	System.out.println(hm.containsKey(3));
	 
		Object[][] obj = new Object[1][2];
		
		obj[0][0] = hm;
		obj[0][1] = li; 
		
	return obj;
	
	 
	 
  }
  
  
  
  
  
}
