package com.automation.testCases;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.AssertJUnit;
import com.automation.pageObjects.QAloginPage;
import com.automation.pageObjects.popup;

public class QAtest01 extends QAbase01 {


	@Test
	public void LoginTest() 
	{
		driver.get(baseURL);
		QAloginPage lp = new QAloginPage(driver);
		lp.setemail(uemail);
		lp.setpassword(upass);
		lp.setsubmit();

		if (driver.getTitle().equals("Insurance Broker System"))
		{
			AssertJUnit.assertTrue(true);
		}
		else {
			AssertJUnit.assertTrue(false);
		}
	}

	@Test
	public void popuptest() throws InterruptedException {
		driver.get("http://www.popuptest.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		popup pu = new popup(driver);
		pu.setpopupclick();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id = " +parentWindowId);

		String childwindowId = it.next();
		System.out.println("child window id = " +childwindowId);

		driver.switchTo().window(childwindowId);
		System.out.println("child window title =" +driver.getTitle());
		Thread.sleep(5000);
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title =" +driver.getTitle());



	}




}