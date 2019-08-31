package com.automation.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import com.automation.pageObjects.QAloginPage;
import com.automation.pageObjects.QAorder;

public class QAordertest extends QAbase01 {


	@Test
	public void dropdntest() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

		QAorder od = new QAorder(driver);
		QAloginPage lp = new QAloginPage(driver);
		lp.setemail(uemail);
		lp.setpassword(upass);
		lp.setsubmit();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		od.setquote();
		od.setdropdn("3");
		od.selectradioY();
		od.setincidents("9999");
		od.setpara();
		od.setvalue();
		od.setparkinglocationdn();
		od.setYearMonthDate("August");
		od.setCalculatePbutton();
		od.getcalculatedpremium();
		String morgan = driver.findElement(By.id("calculatedpremium")).getText();
		System.out.println(morgan);
		if (morgan.contains("No discount\n" + 
				"Premium: £420")){
			AssertJUnit.assertTrue(true);
		}
		else
		{
			AssertJUnit.assertTrue(false);
		}

	}


}
