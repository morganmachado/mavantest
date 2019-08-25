package com.automation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL= "http://www.automationpractice.com";
	public String uname = "mr.morganmac@gmail.com";
	public String semail = "sampleemail@email.com";
	public String pword = "morganmac";
	public static WebDriver driver;
	String pp = System.getProperty("user.dir");
	String os = System.getProperty("os.name").toLowerCase();
	String Browser = "chrome";
	String headless = "true";

	@BeforeClass
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



	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}




