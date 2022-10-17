package com.automationblog.qa.LoginTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class AutoITtest extends BaseClass {
	
	

	@Test
	public void autoitTest() throws InterruptedException, IOException
	{
		
		BlogPage Bp = new BlogPage(driver);
		
	//	Actions ac = new Actions(driver);
		
		int i = driver.findElements(By.tagName("iframe")).size();
		System.out.println(i);
		
		driver.switchTo().frame("frame-one1434677811");

		WebElement we = driver.findElement(By.id("RESULT_TextField-1"));
//		we.sendKeys("C:\\Users\\Mainuddin\\Desktop");
//		TakesScreenshot ts = (TakesScreenshot)driver; 
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File tgt = new File("C:\\Users\\Mainuddin\\eclipse-workspace\\BlogProject\\takesScreenshots\\scree.png");
//		FileUtils.copyFile(src,tgt);

	   // TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = we.getScreenshotAs(OutputType.FILE);
	    File trt = new File("C:\\Users\\Mainuddin\\eclipse-workspace\\BlogProject\\takesScreenshots\\scrn567.png");
	    FileUtils.copyFile(src,trt);
		 
		 System.out.println("Screen shot is captured");
	    //Runtime.getRuntime().exec("C:\\Users\\Mainuddin\\Downloads\\autoitt.exe");
		//we.sendKeys("C:\\Users\\Mainuddin\\Desktop");

		
		
	}
	
	
	
	

}
