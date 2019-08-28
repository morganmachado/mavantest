package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QAorder {
	WebDriver ldriver;
	public  QAorder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="[id='ui-id-2']") WebElement uquote;
	@FindBy (id="quotation_breakdowncover") WebElement dropdn;

	public void setquote() {
		uquote.click();
	}

	public void setdropdn(String value) {
		Select select = new Select(dropdn);
		select.selectByValue(value);

	}
}
