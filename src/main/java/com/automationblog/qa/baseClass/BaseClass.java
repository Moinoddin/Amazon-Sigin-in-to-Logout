package com.automationblog.qa.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automationblog.qa.Utilities.ConfigProp;

public class BaseClass {
	
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fileinput;
	public Logs logger;
	public File file;
	public ConfigProp configprop;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("chrome")String browser) throws IOException, Exception  
	{
	
	if(browser.equals("chrome"))
	{
	configprop = new ConfigProp();	
	//PropertyConfigurator.configure("Log4j.properties");
		
	
	//******** Setting Chrome Driver with directly from directory hierarchy***********//
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
	//	logger.info("System has Set Chrome Webdriver Path Successfully ");
		
	//******** Created ConnfigProperties class to fetch method of properties file path********//
		
	

		System.setProperty("webdriver.chrome.driver",configprop.chromeDriver());
		
		driver = new ChromeDriver();
	//	logger.info("Chrome Driver Object Created Here Chrome Browser Will launch");
		
	//******** Directly accessing the path of Properties File ***********//	
	//	file = new File("./src/main/java/com/automationblog/qa/Properties/Variable.properties");
	//  logger.info("Setted Properties File");
		
	//	file = new File("./src/main/java/com/automationblog/qa/Properties/Variable.properties");
		
	//******** Setting Properties File path from ConnfigProperties by calling method of it ***********//
		
	//	fileinput = new FileInputStream(file);
	//	logger.info("File Object load in FileInputStream Class");
		
	//	prop = new Properties();
	//	logger.info("Created Object of Properties Class");
		
	//	prop.load(fileinput);
	//	logger.info("loaded Fileinput object to Read Properties File");
		
		driver.get(configprop.getURL());
//		logger.info("getting a URL from Properties File");
//		
	}	
	//	Thread.sleep(3000);

	}
	
	
	@AfterMethod
	public void tearup() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	//	logger.info("Browser is closed");
	}
	
	
	

}
