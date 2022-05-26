package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCourse {

	WebDriver driver;
	public FreeCourse(WebDriver lDriver)
	{
		this.driver=lDriver;
	
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-13318\"]/a/span") WebElement freeCourse;
	@FindBy(xpath="//*[@id=\"post-\"]/a/h3") WebElement firstCourse;
	@FindBy(linkText="WordPress for Entrepreneur/Beginner") WebElement contactDetails;
	
	
	public void clickFreeCourse()
	{
		
		freeCourse.click();
		//firstCourse.click();
		//System.out.println("The Number is" +contactDetails.getText());
				
	}
	
	
}
