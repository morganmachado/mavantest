package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAloginPage {
	
	WebDriver ldriver;
	
	public QAloginPage(WebDriver driver) 
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath ="//input[@id='email']") WebElement pemail;
	@FindBy (id="password") WebElement ppassword;
	@FindBy (xpath ="//input[@name='submit']") WebElement psubmit;
	
	
	public void setemail(String uemail) {
		pemail.sendKeys(uemail);
	}
	
	public void setpassword(String upass) {
		ppassword.sendKeys(upass);
	}
	
	public void setsubmit() {
		psubmit.click();
		
	}
	
	

}
