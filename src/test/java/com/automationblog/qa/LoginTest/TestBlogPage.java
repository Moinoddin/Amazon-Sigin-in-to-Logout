package com.automationblog.qa.LoginTest;

import org.testng.annotations.Test;

import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class TestBlogPage extends BaseClass  

{
	
	
	
	@Test
	public void BlogPageTest() throws InterruptedException 
	
	{

		driver.manage().window().maximize();
		
		System.out.println("URL loaded from Test Case class");
		
		BlogPage bp = new BlogPage(driver);
			
	//	Thread.sleep(3000);
	//	System.out.println("object created of BlogPage");
		
	//	bp.WekipediaSearch("java");
	//	bp.WekipediaButton();
		
		bp.WekipediaSearch().sendKeys(configprop.search());
		bp.WekipediaButton().click();
	
	
	
	}
			
	
	

}
