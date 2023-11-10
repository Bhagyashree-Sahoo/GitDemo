package StandAloneTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

		Boolean b = driver.findElement(By.xpath(
				"//div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[1]/a[1]/img[1]"))
				.isDisplayed();
		System.out.println(b);

		String title = driver.getTitle();
		// System.out.println(title);
		Assert.assertEquals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
				title);

		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
		act.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(3000);

		List<WebElement> productList = driver.findElements(By.cssSelector("div._4rR01T"));

		for (WebElement product : productList) {
			System.out.println("Capture Product name : " + product.getText());
			if (product.getText().equals("APPLE iPhone 14 (Blue, 128 GB)")) {
				System.out.println("Clicking on : " + product.getText());

				product.click();
			}
		}

		Thread.sleep(10000);
		// store window ids in array list
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		// switch to active tab
		driver.switchTo().window(wid.get(1));
		System.out.println("Page title of active tab: " + driver.getTitle());
		// Buynow-button.ihZ75k._3AWRsL

		System.out.println("click button");
		driver.findElement(By.cssSelector(".ihZ75k")).click();
		System.out.println(" button clicked");
		driver.findElement(By.cssSelector("._2IX_2-")).sendKeys("9776916980");
		System.out.println("done");
		
		driver.findElement(By.cssSelector("._2KpZ6l")).click();

		

	}

}
