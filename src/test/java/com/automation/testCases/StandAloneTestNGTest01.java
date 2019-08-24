package com.automation.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class StandAloneTestNGTest01 {

	public String baseUrl = "http://www.google.com";
	String pp = System.getProperty("user.dir");
	public WebDriver driver ; 
	String browser = "firefox";

	@BeforeTest
	public void beforetest() {

		System.out.println("this is beforetest");
		if (browser.contains("firefox")){
			System.setProperty("webdriver.gecko.driver", pp + "/Drivers/geckodriver");
			System.out.println(System.getProperty("webdriver.gecko.driver"));
			driver = new FirefoxDriver();

		} else if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", pp + "/Drivers/chromedriver");
			System.out.println(System.getProperty("webdriver.chrome.driver"));
			driver = new ChromeDriver();
		}

		System.out.println("launching "+ browser +" browser"); 
		driver.get(baseUrl);
	}


	@Test
	public void verifyHomepageTitle() {
		System.out.println("This is test1");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@AfterTest
	public void aftertest() {
		System.out.println("This is aftertest");
		driver.quit();
	}



}
