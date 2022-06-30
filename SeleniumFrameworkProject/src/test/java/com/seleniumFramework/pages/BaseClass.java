package com.seleniumFramework.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.seleniumFramework.utility.BrowserFactory;
import com.seleniumFramework.utility.ConfigDataProviders;
import com.seleniumFramework.utility.ExcelDataProvider;

//creating objects of driver,Config and excel

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProviders config;
	public ExcelDataProvider excel;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel =new ExcelDataProvider();
		config=new ConfigDataProviders();
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/report.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		
				
	}
	
	//before start of first test the  browser opens
	
@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getURL());
	}
	
//after end  of all tests the browser closes

@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
@AfterMethod
public void tearDownMethod()
{
	report.flush();   
}

}
