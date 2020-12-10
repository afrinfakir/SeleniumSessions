package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		String browser = "ie";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\sept_selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\sept_sele_gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "G:\\ie_sele\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
//		}else if (browser.equalsIgnoreCase("Opera")){
//			System.setProperty("", "");
//			driver = new OperaDriver();
		}else {
			System.out.println("Please correct the browsername");
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
