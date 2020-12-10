package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	static WebDriver driver;
	 static String Amazon_titles = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	@BeforeMethod
	public void Amazon_setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void Amazon_urlTest() {
		String Amazon_url = driver.getCurrentUrl();
		Assert.assertEquals(Amazon_url,"https://www.amazon.in/" );	
	}
	@Test
	public void Amazon_titleTest() {
		String Amazon_title = driver.getTitle();
		Assert.assertEquals(Amazon_title, Amazon_titles);
	}
	@Test
	public void Amazon_linkTest() {
		boolean b = driver.findElement(By.linkText("Mobiles")).isDisplayed();
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
