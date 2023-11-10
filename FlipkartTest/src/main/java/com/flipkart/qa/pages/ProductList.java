package com.flipkart.qa.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class ProductList  extends TestBase {
	
	@FindBy(css="div._4rR01T")
	List<WebElement> products;
	
	
	
	public ProductList() {
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getProductList() {
		return products;
	}
	
	public BuyProduct getProductByName(String productname) {
		
		BuyProduct buyProduct = null;
		List<WebElement> productList = getProductList();
		

		for (WebElement product : productList) {
			System.out.println("Capture Product name : "+ product.getText() );
			if (product.getText().equals(productname)) {
				System.out.println("Clicking on : "+product.getText() );
				
				product.click();
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	
		
	
	return new BuyProduct();
	}

	
}
	


