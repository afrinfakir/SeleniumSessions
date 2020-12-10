package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class closeAndQuit {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		driver.close();
		System.out.println(driver.getTitle()); //org.openqa.selenium.NoSuchSessionException: invalid session id
		driver.quit();
		
		System.out.println(driver.getTitle());  //org.openqa.selenium.NoSuchSessionException: Session ID is null
		driver.close();


		
	}

}
