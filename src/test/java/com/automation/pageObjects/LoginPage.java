package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage (WebDriver driver) 
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (className="login") WebElement signinBtn;
	@FindBy(id="email") WebElement userName;
	@FindBy(id="passwd") WebElement passWord;
	@FindBy(id="SubmitLogin") WebElement submitBtn;
	@FindBy (id="email_create") WebElement sampleEmail;
	@FindBy (id="SubmitCreate") WebElement submitEmail;
	@FindBy (id="submitAccount") WebElement submitAccount;


	public void setsigninBtn() {
		signinBtn.click();
	}

	public void setusername (String uname) {
		userName.sendKeys(uname);
	}

	public void setpassword(String pword) {
		passWord.sendKeys(pword);
	}

	public void setclicksubmit() {
		submitBtn.click();
	}

	public void setsampleEmail(String semail) {
		sampleEmail.sendKeys(semail);
	}
	public void setsubmitEmail() {
		submitEmail.click();
	}
	public String setsubmitAccount() {
		return submitAccount.getText();
	}









}
