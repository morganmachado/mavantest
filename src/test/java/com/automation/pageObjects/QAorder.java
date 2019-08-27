package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAorder {
	WebDriver ldriver;
	public  QAorder(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="[id='ui-id-2']") WebElement uquote;
	@FindBy (xpath="[id='quotation_breakdowncover']") WebElement dropdn;
	
	
	
	
}
