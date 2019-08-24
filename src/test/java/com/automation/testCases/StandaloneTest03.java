package com.automation.testCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StandaloneTest03 {

	public String baseURL= "http://www.automationpractice.com";
	public String uname = "mr.morganmac@gmail.com";
	public String semail = "sampleemail@gmail.com";
	public String pword = "morganmac";
	public static WebDriver driver;
	String pp = System.getProperty("user.dir");
	String os = System.getProperty("os.name").toLowerCase();
	String Browser = "firefox";
	String headless = "true";

	@BeforeTest
	public void setup() {
		if (Browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", pp + "/Drivers/geckodriver");
			if (headless.equals("true")) {
				FirefoxOptions options = new FirefoxOptions();
				options.setHeadless(true);
				driver = new FirefoxDriver(options);
			}
			else if (headless.equals("false")){
				driver = new FirefoxDriver();
			}

		}
		else if (Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", pp + "/Drivers/chromedriver");
			if (headless.equals("true")) {
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);

				driver = new ChromeDriver(options);
			}
			else if (headless.equals("false")){
				driver = new ChromeDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	}


	@Test
	public void tester() {
		driver.get(baseURL);
		System.out.println("bitch " + driver.getTitle());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}




