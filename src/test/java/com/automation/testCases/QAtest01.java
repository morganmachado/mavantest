package com.automation.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.automation.pageObjects.QAloginPage;

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




}