package com.automation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automation.pageObjects.QAloginPage;
import com.automation.pageObjects.QAorder;

public class QAordertest extends QAbase01 {


	@Test
	public void dropdntest() {
		driver.get(baseURL);
		QAorder od = new QAorder(driver);
		QAloginPage lp = new QAloginPage(driver);
		lp.setemail(uemail);
		lp.setpassword(upass);
		lp.setsubmit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		od.setquote();
		od.setdropdn("3");
	}


}
