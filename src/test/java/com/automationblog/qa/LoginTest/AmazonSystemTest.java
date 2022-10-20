package com.automationblog.qa.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonSystemTest {
  @Test
  public void amazonSystemTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Project\\chromedriver_win32\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.navigate().to("https://amazon.in");
         
      driver.findElement(By.cssSelector("div.nav-line-1-container")).click();
      driver.findElement(By.cssSelector("input#ap_email")).sendKeys("msarwad@gmail.com");
      driver.findElement(By.cssSelector("input#continue")).click();
      driver.findElement(By.cssSelector("input#ap_password")).sendKeys("M@in0513");
      driver.findElement(By.cssSelector("input#signInSubmit")).click();
      
      Thread.sleep(30000);
      
      driver.findElement(By.cssSelector("input#auth-signin-button")).click();
     
      WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
      Searchbox.sendKeys("Woodland mens Sandal");
      
      driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
      
      driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Woodland mens Ogd 4003121 Sandal']")).click();
      Thread.sleep(2000);
      
      
     
      String originalWindow = driver.getWindowHandle();
      
      for (String windowHandle : driver.getWindowHandles()) 
      {
   	    if(!originalWindow.contentEquals(windowHandle)) {
   	        driver.switchTo().window(windowHandle);
   	        break;
   	    }
   	}
      
      
      Thread.sleep(3000);
    //  driver.switchTo().window(originalWindow);
      
    //  driver.switchTo().window()
      
      driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
      
      driver.findElement(By.name("proceedToRetailCheckout")).click();
      
      driver.findElement(By.xpath("//div[@id='address-book-entry-0']/div[2]/span")).click();
      
 
      Thread.sleep(3000);
      driver.quit();

  }
}
