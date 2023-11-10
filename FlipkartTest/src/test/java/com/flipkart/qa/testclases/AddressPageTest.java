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

public class AddressPageTest extends TestBase {

	HomePage homePage;
	ProductList productList;
	BuyProduct buyproduct;
	AddressPage addresspage;

	public AddressPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		productList = new ProductList();
		homePage = new HomePage();
		// buyproduct = new BuyProduct();
		homePage.cancelation();

	}

	@Test(priority = 1)
	public void enterOtp() throws InterruptedException {
		productList = homePage.searchItem("iphone 14");
		buyproduct = productList.getProductByName("APPLE iPhone 14 (Blue, 128 GB)");
		addresspage = buyproduct.clickBuyNow();
		addresspage.enterNumber("9776916980");
		Scanner sc = new Scanner(System.in);
		String otp = sc.next();
		addresspage.enterOtp(otp);

	}

	

}
