package com.automationblog.qa.LoginTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationblog.qa.baseClass.BaseClass;

public class FetchList extends BaseClass{
	
	
	public void fetchList() throws InterruptedException{
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='nav-line-2']/span[2]")).click();
		Thread.sleep(5000);
		int n =driver.findElements(By.xpath("//div[@id='icp-language-settings']/div/div/label/i")).size();
		System.out.println(n);
		String start = "//div[@id='icp-language-settings']/div[";
		String last = "]/div/label/i";
		String xpath, xpath1;
		String last1 = "]/div/label/span/span";
		//driver.findElement(By.xpath("//div[@id='icp-language-settings']/div[4]/div/label/i")).click();
		
		for (int i=2 ; i<=9 ; i++)
		{
			xpath = start+i+last;
			xpath1 = start+i+last1;
			WebElement li = driver.findElement(By.xpath(xpath));
			WebElement litxt = driver.findElement(By.xpath(xpath1));
			System.out.println(litxt.getText());
			li.click();
			Thread.sleep(3000);
			
		}
		
		
	}
	
	@Test
	public void fetch() throws InterruptedException
	{
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='nav-line-2']/span[2]")).click();
		Thread.sleep(5000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='icp-language-settings']/div/div/label/span/span"));
		for(WebElement list: li)
		{
			System.out.println(list.getText());
			list.click();
		}
		
		
	}
	
	
	

}
