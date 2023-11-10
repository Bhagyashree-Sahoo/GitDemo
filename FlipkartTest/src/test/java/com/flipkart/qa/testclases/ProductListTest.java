package com.flipkart.qa.testclases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.BuyProduct;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.ProductList;

public class ProductListTest extends TestBase {

	HomePage homePage;
	ProductList productList;

	public ProductListTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		productList = new ProductList();
		homePage = new HomePage();
		homePage.cancelation();
		productList = homePage.searchItem("iphone 14");
	}

	@Test
	public void clickOnProduct() {
		productList.getProductByName("APPLE iPhone 14 (Blue, 128 GB)");
		
	}

	@AfterMethod
	public void close() {
		driver.quit();

	}

}
