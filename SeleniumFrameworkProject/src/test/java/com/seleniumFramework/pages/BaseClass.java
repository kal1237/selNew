package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.seleniumFramework.utility.BrowserFactory;
import com.seleniumFramework.utility.ConfigDataProviders;
import com.seleniumFramework.utility.ExcelDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProviders config;
	public ExcelDataProvider excel;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel =new ExcelDataProvider();
		config=new ConfigDataProviders();
		
				
	}

@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getURL());
	}
	

@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
