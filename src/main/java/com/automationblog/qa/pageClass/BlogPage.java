package com.automationblog.qa.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 




public class BlogPage 
{
		
	WebDriver driver;
	
	 public BlogPage(WebDriver driver)
	{
	   
	   this.driver = driver; 
 	   PageFactory.initElements(driver, this);
	
	}
	
	 
	// WebElement Wekipedia = driver.findElement(By.className("wikipedia-search-input"));
	 
	@FindBy(className="wikipedia-search-input")
		WebElement Wekipedia;
				
	@FindBy(className="wikipedia-search-button")
	WebElement WikipediaButton;
	
	
	@FindBy(xpath="//button[contains(text(),'Click Me')]")
	WebElement linktext;
	

		
	public WebElement WekipediaSearch()
	{
		return Wekipedia;
	}
	
	public WebElement WekipediaButton()
	{
		return WikipediaButton;
		
	}
	
	public void alertTest()
	{
	      linktext.click();
	      driver.switchTo().alert().accept();
	}

}
