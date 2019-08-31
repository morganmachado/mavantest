package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class popup {
	
	WebDriver driver;
	
	public popup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//@FindBy (linkText= "Chromeless") WebElement popupclick;
	//@FindBy (xpath  = "//a[contains(.,'Chromeless')]") WebElement popupclick;
	@FindBy(xpath = "//a[text()='Chromeless']") WebElement popupclick;
	
	
	public void setpopupclick() {
	popupclick.click()	;
	}

	

}
