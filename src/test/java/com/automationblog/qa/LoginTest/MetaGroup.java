package com.automationblog.qa.LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automationblog.qa.Utilities.ItestLinstner;
import com.automationblog.qa.Utilities.RetryAnalyzer;

@Listeners(ItestLinstner.class)
public class MetaGroup {

	WebDriver driver;
	
	@Test(invocationCount = 8)
	public void Test19()
	{
		System.out.println("Test 19"+ Thread.currentThread().getId());
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test11()
	{
		
		Assert.assertTrue(true);
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
