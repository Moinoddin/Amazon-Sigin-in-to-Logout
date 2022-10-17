package com.automationblog.qa.LoginTest;


import org.testng.annotations.Test;

public class GroupsTest {
	
  
  @Test(groups = {"smoke","sanity"})
  public void test1() {
	  
	  System.out.println("Test1"+"  "+ Thread.currentThread().getId());
	  
  }
  
  @Test(dependsOnGroups = "smoke")
  public void test2() 
  {
	  
	  System.out.println("Test2" +"  "+ Thread.currentThread().getId());
	  
  }
  
  @Test(groups ="Regresstion")
  public void test3() {
	  
	  
	  System.out.println("Test3" +"  "+ Thread.currentThread().getId());
  }
  @Test(groups = "sanity")
  public void test4() {
	  
	  System.out.println("Test4" +"  "+ Thread.currentThread().getId());
	  
  }
}
