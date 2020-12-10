package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	static WebDriver driver;
	 static String Google_titles = "Google";
	@BeforeMethod
	public void Amazon_setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void google_urlTest() {
		String Amazon_url = driver.getCurrentUrl();
		Assert.assertEquals(Amazon_url,"https://www.google.com/" );	
	}
	@Test
	public void google_titleTest() {
		String google_title = driver.getTitle();
		Assert.assertEquals(google_title, Google_titles);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	


}
