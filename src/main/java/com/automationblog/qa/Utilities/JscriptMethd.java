package com.automationblog.qa.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationblog.qa.baseClass.BaseClass;
import com.automationblog.qa.pageClass.BlogPage;

public class JscriptMethd {
	
	
	public static void flashColor(WebElement element, WebDriver driver)
	{
		String bgcolor = element.getCssValue("backgroundColor"); 
		
		System.out.println(bgcolor);
		
		
		for(int i=0; i<100 ; i++)
		{
			changeColor("#000000", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+ "'", element);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {}
		
						
	}
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid red'", element);
		
	}

	public static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refereshPage(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
			
	}
	public static String getTitle(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = js.executeScript("return document.title").toString();
		return str;
	}

	
	
	
	
	
}
