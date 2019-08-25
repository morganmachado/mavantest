package com.automation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class QAbase01 {
	
	public static WebDriver driver;
	String pp = System.getProperty("user.dir");
	String browser = "chrome";
	String headless = "true";
	String baseURL = "http://demo.guru99.com/insurance/v1/index.php";

@BeforeClass
public void setup() {
	System.setProperty("WebDriver.chrome.driver", pp + "/Drivers/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.setHeadless(true);
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
	



@AfterClass

public void Teardown() {
	driver.quit();
}



}
