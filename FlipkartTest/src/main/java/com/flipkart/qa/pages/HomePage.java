package com.flipkart.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage  extends TestBase{
	
	@FindBy(xpath="//div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[1]/a[1]/img[1]")
	WebElement logo;
	
	@FindBy(xpath="/html/body/div[3]/div/span")
	WebElement cancel;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public void cancelation() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cancel.click();
	}
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateFlipkartImage() {
	   return logo.isDisplayed();
	}
	
	public ProductList searchItem( String item) {
		Actions act = new Actions(driver);
		search.sendKeys(item);
		act.sendKeys(Keys.ENTER).build().perform();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ProductList();
		
	}

}
