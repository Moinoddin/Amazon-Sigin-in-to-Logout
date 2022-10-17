package com.automationblog.qa.LoginTest;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.automationblog.qa.Utilities.Switchalert;
import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class TestBlogPage extends BaseClass  

{
	
	
	
	@Test(groups = {"smoke"})
	public void BlogPageTest() throws InterruptedException 
	
	{
		BlogPage bp = new BlogPage(driver);
		
		driver.manage().window().maximize();
		
		System.out.println("URL loaded from Test Case class");
		
		bp.WekipediaSearch().sendKeys(configprop.search());
		bp.WekipediaButton().click();
		bp.alertTest();
		
		
		
	
	}
			
	
	

}
