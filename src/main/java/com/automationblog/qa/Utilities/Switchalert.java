package com.automationblog.qa.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class Switchalert extends BaseClass {
	
	
	
	public Alert alertOps()
	{
		
		 return driver.switchTo().alert();
	}
	
}
