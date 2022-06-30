package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//To check the Search Course
public class SearchText {

	WebDriver driver;
	public SearchText(WebDriver lDriver)
	{
		this.driver=lDriver;
	}
	@FindBy(name="search_course") WebElement search;
	@FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchEnter;
	@FindBy(xpath="//*[@id=\"courses-panel\"]/ul/li[1]/span/a") WebElement course;
	
public void searchText(String text){
		
		search.sendKeys(text);
		searchEnter.click();
		
	}
public void clickLink()
{
	course.click();
}
}
