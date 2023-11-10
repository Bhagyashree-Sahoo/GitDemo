package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;

	public static Properties prop;

	public TestBase() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(path+
					"\\src\\main\\java\\com\\flipkart\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Bhagyashree\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);// load page
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);// it applicable for all
																							// elements
		driver.get(prop.getProperty("url"));
	}

}
