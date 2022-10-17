package com.automationblog.qa.LoginTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.automationblog.qa.Utilities.JscriptMethd;
import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;


public class JsExecutor extends BaseClass{


	
	@Test(groups = {"smoke"})
	public void jsTest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		BlogPage bp = new BlogPage(driver);
		
	    //	WebElement bt = driver.findElement(By.className("wikipedia-search-input"));
	    // 	WebElement bm = driver.findElement(By.className("wikipedia-search-button"));
	    //	JsFlash.drawBorder(bt ,driver);

	   
		JscriptMethd.flashColor(bp.WekipediaSearch(),driver);
		JscriptMethd.drawBorder(bp.WekipediaSearch(), driver);
		JscriptMethd.clickElementByJS(bp.WekipediaSearch(), driver);
		JscriptMethd.refereshPage(driver);
	    System.out.println(JscriptMethd.getTitle(driver));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	

}
