package com.automationblog.qa.LoginTest;

import org.testng.annotations.Test;
@Test(groups = {"all"})
public class MetaGroup {

	
	@Test(groups = {"smoke"})
	public void Test11()
	{
		System.out.println("MestGroup-Test11"+"  "+ Thread.currentThread().getId());
	}
	
	@Test(groups = {"smoke"})
	public void Test12()
	{
		System.out.println("MestGroup-Test12"+"  "+ Thread.currentThread().getId());
	}
	
	@Test(groups = {"Regresstion"})
	public void Test13()
	{
		System.out.println("MestGroup-Test13"+"  "+ Thread.currentThread().getId());
	}
	@Test(groups = {"sanity"})
	public void Test14()
	{
		System.out.println("MestGroup-Test14"+"  "+ Thread.currentThread().getId());
	}
	
	
}
