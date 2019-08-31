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

	@FindBy (xpath="//*[@id='ui-id-2']") WebElement uquote;
	@FindBy (xpath="//select[@id='quotation_breakdowncover']") WebElement dropdn;
	@FindBy (xpath="//input[@id='quotation_windscreenrepair_t']") WebElement radioY;
	@FindBy (xpath="//input[@name='incidents']") WebElement incidents;
	@FindBy (xpath="//input[@name='registration']") WebElement registration;
	@FindBy (xpath="//input[@name='mileage']") WebElement mileage;
	@FindBy (xpath="//input[@name='value']") WebElement value;
	@FindBy (xpath="//select[@name='parkinglocation']") WebElement parkinglocationdn;
	@FindBy (xpath="//select[@name='year']") WebElement year;
	@FindBy (xpath="//select[@name='month']") WebElement month;
	@FindBy (xpath="//select[@name='date']") WebElement date;
	@FindBy (xpath="//input[@type='button']") WebElement CalculatePbutton;
	@FindBy (xpath="//p[@id='calculatedpremium']") WebElement calculatedpremium;


	public void setquote() {
		uquote.click();
	}

	public void setdropdn(String value) {
		Select select = new Select(dropdn);
		select.selectByValue(value);
	}

	public void selectradioY() {
		radioY.click();
	}

	public void setincidents(String inc) {
		incidents.sendKeys(inc);
	}
	public void setregistration() {
		registration.sendKeys("34234");
	}
	public void setmileage() {
		mileage.sendKeys("123");
	}
	public void setvalue() {
		value.sendKeys("1312");
	}
	public void setparkinglocationdn() {
		Select select = new Select(parkinglocationdn);
		select.selectByVisibleText("Public Place");
	}
	public void setyear() {
		Select select =new Select (year);
		select.selectByValue("2020");
	}
	public void setmonth(String text) {
		Select select = new Select(month);
		select.selectByVisibleText(text);
	}
	public void setdate() {
		Select select = new Select(date);
		select.selectByValue("12");
	}
	public void setCalculatePbutton() {
		CalculatePbutton.click();
	}
	public void getcalculatedpremium() {
		calculatedpremium.getText();
		System.out.println(calculatedpremium);
	}

}
