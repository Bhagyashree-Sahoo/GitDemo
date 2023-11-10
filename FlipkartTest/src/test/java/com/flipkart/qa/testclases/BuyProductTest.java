package com.flipkart.qa.testclases;

import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.AddressPage;
import com.flipkart.qa.pages.BuyProduct;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.ProductList;

public class BuyProductTest extends TestBase {

	HomePage homePage;
	ProductList productList;
	BuyProduct buyproduct;
	AddressPage  addresspage;

	public BuyProductTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Scanner myObj = new Scanner(System.in);
		String name = myObj.nextLine();
		System.out.println(" Input Name is : "+ name);
		
		initialization();
		productList = new ProductList();
		homePage = new HomePage();
		// buyproduct = new BuyProduct();
		homePage.cancelation();
		
	}

	@Test
	public void clickBuyNowBtn() throws InterruptedException {
		productList = homePage.searchItem("iphone 14");
		buyproduct=productList.getProductByName("APPLE iPhone 14 (Blue, 128 GB)");
		addresspage=buyproduct.clickBuyNow();

	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println(" Browser close kara re kukura");
		driver.quit();
		
	}

}
