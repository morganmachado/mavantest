package com.automation.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class StanaloneTestNGTest {

	public String baseUrl = "http://www.google.com";
	String pp = System.getProperty("user.dir");
	public WebDriver driver ; 
	String browser = "firefox";




	@Test
	public void verifyHomepageTitle() {
		if (browser.contains("firefox")){
			System.setProperty("webdriver.gecko.driver", pp + "/Drivers/geckodriver");
			System.out.println(System.getProperty("webdriver.gecko.driver"));
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			driver = new FirefoxDriver(options);

		} else if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", pp + "/Drivers/chromedriver");
			System.out.println(System.getProperty("webdriver.chrome.driver"));
			driver = new ChromeDriver();
		}
		System.out.println("launching "+ browser +" browser"); 
		driver.get(baseUrl);

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}


}
