package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AllCourses {
	
	WebDriver driver;
	public AllCourses(WebDriver lDriver)
	{
		this.driver=lDriver;
	
	}
	@FindBy(xpath="//*[@id=\"primary_menu\"]/a") WebElement allCourses;
	@FindBy(id="primary-menu") WebElement element;
	
	@FindBy(xpath="//*[@id=\"nav-menu-item-7443\"]/a/div/span")WebElement devOps ;
	@FindBy(xpath="//*[@id=\"nav-menu-item-7443\"]/ul") WebElement popular;
	@FindBy(xpath="//*[@id=\"nav-menu-item-27385\"]/a/div/span") WebElement docker;
	@FindBy(xpath="//*[@id=\"left-menu\"]/div[2]/li/a") WebElement curriculum;
	@FindBy(className="program-title") WebElement title;
	
	public void clickAllCourses()
	{
		allCourses.click();
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		devOps.click();
		System.out.println("DevOps Academy is clicked");
		action.moveToElement(popular).build().perform();
		System.out.println("popular courses");
		docker.click();
		System.out.println("Docker clicked");
		curriculum.click();
		System.out.println("Curriculum clicked");
		Assert.assertEquals("Curriculum", curriculum.getText());
		System.out.println("The text Curriculum is correct");
		Assert.assertEquals("Docker Certified Associate", title.getText());
		System.out.println("Expected title is correct");
		
	}
	
	
	

}
