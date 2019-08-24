
package com.automation.testCases;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StandAloneProperties {

	public static WebDriver driver;
	String pp = System.getProperty("user.dir");

	@BeforeTest
	public void setup() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/morgan/eclipse/maventest/Configuration/config.properties");
		prop.load(ip);
		if (prop.getProperty("Browser").contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", pp + "/Drivers/geckodriver");
			if (prop.getProperty("headless").equals("true")) {
				FirefoxOptions options = new FirefoxOptions();
				options.setHeadless(true);
				driver = new FirefoxDriver(options);
			}
			else if (prop.getProperty("headless").equals("false")){
				driver = new FirefoxDriver();
			}

		}
		else if (prop.getProperty("Browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", pp + "/Drivers/chromedriver");
			if (prop.getProperty("headless").equals("true")) {
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);

				driver = new ChromeDriver(options);
			}
			else if (prop.getProperty("headless").equals("false")){
				driver = new ChromeDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	}


	@Test
	public void tester() throws IOException, InterruptedException   {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/morgan/eclipse/maventest/Configuration/config.properties");
		prop.load(ip);
		driver.get(prop.getProperty("baseURL"));
		Thread.sleep(2000);
		System.out.println("bitch " + driver.getTitle());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}




