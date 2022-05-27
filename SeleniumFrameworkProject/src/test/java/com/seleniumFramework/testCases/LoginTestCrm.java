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

	
	@Test(priority=1)
	public void loginAppcase()
	{
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.loginToPortal(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		System.out.println("test");
		
	//initElements
	
	}
	@Test(priority=2)
	public void searchTestCase() throws InterruptedException
	{
		SearchText st=PageFactory.initElements(driver, SearchText.class);
		st.searchText(excel.getStringData("Search", 0, 0));
		Thread.sleep(3000);
		st.clickLink();
	}
	
	@Test(priority=3)
	public void freeCourseTestCase()
	{
		FreeCourse fc=PageFactory.initElements(driver,FreeCourse.class);
		fc.clickFreeCourse();
	}
	
	@Test(priority=4)
	public void allCoursesTestCase()
	{
		AllCourses fc=PageFactory.initElements(driver,AllCourses.class);
		fc.clickAllCourses();
		
	}
}
