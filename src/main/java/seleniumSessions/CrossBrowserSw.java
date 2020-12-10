package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserSw {
public static WebDriver driver;
	public static void main(String[] args) {
		
		String browser = "firefox";
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "G:\\sept_selenium\\chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "G:\\sept_sele_gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "safari":
			System.setProperty("", "");
			driver = new SafariDriver();
			break;
		case "opera":
			System.setProperty("", "");
			driver = new OperaDriver();
			break;
		default:
			System.out.println("Please correct the browsername...");
		break;
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();


	}

}
