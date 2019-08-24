package com.automation.testCases;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pageObjects.LoginPage;


public class LoginTest01 extends BaseClass {


	@Test
	public void LoginTest() throws Exception {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setsigninBtn();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		lp.setusername(uname);
		lp.setpassword(pword);
		lp.setclicksubmit();

		if (driver.getTitle().equals("My account - My Store")) {

			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}


	@Test
	public void CreateAccountTest() throws Exception {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setsigninBtn();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		lp.setsampleEmail(semail);
		lp.setsubmitEmail();
		Thread.sleep(5000);
		String text = lp.setsubmitAccount();
		System.out.println("text is " +text);

		if (text.contains("r")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}


}
