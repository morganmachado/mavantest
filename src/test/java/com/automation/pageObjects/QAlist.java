package com.automation.pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class QAlist {
	WebDriver ldriver;
	public  QAlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//*[@id='ui-id-2']") WebElement uquote;

	private List<WebElement> selects;

	public List<WebElement> getSelects() {
	      selects = findElements(By.xpath("//select[@id='quotation_breakdowncover']"));
	      return selects;
	    } 
	


	public void setquote() {
		uquote.click();
	}
