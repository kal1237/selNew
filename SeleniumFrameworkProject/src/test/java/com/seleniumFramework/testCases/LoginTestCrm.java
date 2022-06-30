package com.seleniumFramework.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.seleniumFramework.pages.AllCourses;
import com.seleniumFramework.pages.BaseClass;
import com.seleniumFramework.pages.LoginPage;
import com.seleniumFramework.pages.SearchText;
import com.seleniumFramework.pages.FreeCourse;
import com.seleniumFramework.utility.BrowserFactory;

public class LoginTestCrm extends BaseClass{

	//test case1: for login
	@Test(priority=1)
	public void loginAppcase()
	{
		logger=report.createTest("Test Case1:Login to ItLearn Portal");
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		logger.info("Starting Application");
		lp.loginToPortal(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		logger.pass("TestCase1 was successfull");
		
		
	
	
	}
	
	//test case2 :search course textbox
	@Test(priority=2)
	public void searchTestCase() throws InterruptedException
	{
		logger=report.createTest("Test Case2:Search Course Text BOX");
		SearchText st=PageFactory.initElements(driver, SearchText.class);
		logger.info("Starting Application");
		st.searchText(excel.getStringData("Search", 0, 0));
		Thread.sleep(3000);
		st.clickLink();
		logger.pass("TestCase2 was successfull");
	}
	
	//test case3:free courses
	@Test(priority=3)
	public void freeCourseTestCase()
	{
		logger=report.createTest("Test Case3:Free Course and Search");
		FreeCourse fc=PageFactory.initElements(driver,FreeCourse.class);
		logger.info("Starting Application");
		fc.clickFreeCourse();
		logger.pass("TestCase3 was successfull");
	}
	
	//test case4:all courses-->devOps-->Docker Certified
	@Test(priority=4)
	public void allCoursesTestCase()
	{
		logger=report.createTest("Test Case4:All courses--devOps-->Docker Certified");
		AllCourses fc=PageFactory.initElements(driver,AllCourses.class);
		logger.info("Starting Application");
		fc.clickAllCourses();
		logger.pass("TestCase4 was successfull");
		
	}
}
