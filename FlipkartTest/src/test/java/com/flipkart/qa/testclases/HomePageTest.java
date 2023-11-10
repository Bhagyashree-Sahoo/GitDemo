package com.flipkart.qa.testclases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.ProductList;

public class HomePageTest extends TestBase {

	HomePage homePage;
	ProductList productList;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		homePage.cancelation();
		
	}
	
	@Test(priority = 1)
	public void homepageLogoTest() {
		//homePage.cancelation() ;
		boolean flag = homePage.validateFlipkartImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void homepageTitleTest() {
		//homePage.cancelation() ;
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		// System.out.println(title);
	}
	
	@Test(priority = 3)
	public void search() {
		productList =homePage.searchItem("iphone 15");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
