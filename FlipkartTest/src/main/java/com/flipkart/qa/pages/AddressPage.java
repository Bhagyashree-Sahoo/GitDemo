package com.flipkart.qa.pages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class AddressPage extends TestBase {
	
	

	@FindBy(css = "._2IX_2-")
	WebElement number;
	
	@FindBy(css = "._2KpZ6l")
	WebElement continueBtn;
	

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")
	WebElement otp;
	
	@FindBy(css = "._3AWRsL")
	WebElement loginBtn;
	
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterNumber(String num  ) {
		number.sendKeys(num);
		continueBtn.click();
	
	}
	
	public void enterOtp(String o) throws InterruptedException {
		otp.sendKeys(o);
		Thread.sleep(5000);
		loginBtn.click();
		Thread.sleep(10000);
	}
	
	

}
