package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GETvSNavigate {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		
//	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		
//		System.out.println(driver.getTitle());
//		
//		WebElement url = driver.findElement(By.id("Form_submitForm_subdomain"));
//		url.sendKeys("afrin@gmail.com");
//		
//		driver.navigate().refresh();
//		
//		url.sendKeys("afrin@gmail.com");
//		
//		//driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("afrin@gmail.com");
//
//		driver.quit();
//		//System.out.println(driver.getTitle());
		
		driver.get("http://www.amazon.com");
		driver.get("http://www.google.com");
		
		//driver.navigate().to("http://www.amazon.com");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.close();


		
	}

}
