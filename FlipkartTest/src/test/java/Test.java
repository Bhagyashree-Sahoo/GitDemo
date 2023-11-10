import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/apple-iphone-14-blue-128-gb/p/itmdb77f40da6b6d?pid=MOBGHWFHSV7GUFWA&lid=LSTMOBGHWFHSV7GUFWA3AV8J8&marketplace=FLIPKART&q=iphone+14&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=d906cbf4-2f80-4855-9ec8-e1ff8c258161.MOBGHWFHSV7GUFWA.SEARCH&ppt=sp&ppn=sp&ssid=ltd52wu27gtwc0741698590748596&qH=860f3715b8db08cd");
		driver.findElement(By.cssSelector("button.ihZ75k._3AWRsL")).click();
	
	
		
		
		
		
		
		
		
		
		
		//https://www.flipkart.com/apple-iphone-14-blue-128-gb/p/itmdb77f40da6b6d?pid=MOBGHWFHSV7GUFWA&lid=LSTMOBGHWFHSV7GUFWA3AV8J8&marketplace=FLIPKART&q=iphone+14&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=d906cbf4-2f80-4855-9ec8-e1ff8c258161.MOBGHWFHSV7GUFWA.SEARCH&ppt=sp&ppn=sp&ssid=ltd52wu27gtwc0741698590748596&qH=860f3715b8db08cd

	}

}
