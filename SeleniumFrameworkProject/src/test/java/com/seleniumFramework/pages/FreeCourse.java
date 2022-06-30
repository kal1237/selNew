package com.seleniumFramework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//class for checking FreeCourse
public class FreeCourse {

	WebDriver driver;
	public FreeCourse(WebDriver lDriver)
	{
		this.driver=lDriver;
	
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-13318\"]/a/span") WebElement freeCourse;
	@FindBy(id="form1") WebElement searchBar;
	@FindBy(xpath="//*[@id=\"search-container\"]/form/div/div/button") WebElement search;
	@FindBy(xpath="//*[@id=\"post-\"]/a/h3") WebElement wordPress;
	
	
	public void clickFreeCourse()
	{
		
		freeCourse.click();
		searchBar.sendKeys("WordPress");
		search.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", wordPress);
		wordPress.click();
				
	}
	
	
}
