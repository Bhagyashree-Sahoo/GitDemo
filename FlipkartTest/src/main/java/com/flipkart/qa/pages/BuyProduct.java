package com.flipkart.qa.pages;

import java.util.Scanner;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class BuyProduct  extends TestBase{
	
	
	public BuyProduct() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".ihZ75k")
	WebElement BuyNow;
	
	
	public AddressPage clickBuyNow() throws InterruptedException {
		Thread.sleep(10000);
		// store window ids in array list
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		// switch to active tab
		driver.switchTo().window(wid.get(1));
		System.out.println("Page title of active tab: " + driver.getTitle());
		BuyNow.click();
		
		return new AddressPage();
	}
	
	
	//driver.findElement(By.cssSelector(".ihZ75k")).click();

}

