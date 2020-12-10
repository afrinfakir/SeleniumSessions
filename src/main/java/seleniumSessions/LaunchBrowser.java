package seleniumSessions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		
		//System.setProperty("webdriver.chrome.driver", "G:\\sept_selenium\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","G:\\sept_sele_gecko\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "G:\\gecko32\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		//System.setProperty("webdriver.ie.driver", arg1)
		
		//System.setProperty("webdriver.gecko.driver","G:\\sept_sele_gecko\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","G:\\gecko32\\geckodriver.exe");
		
		//File pathBinary = new File("G:\\sept_sele_gecko\\geckodriver.exe");
//		File pathBinary = new File("C:\Users\Ashish\AppData\Local\Mozilla Firefox\firefox.exe");
//		
//		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
//		DesiredCapabilities desired = DesiredCapabilities.firefox();
//		FirefoxOptions options = new FirefoxOptions();
//		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//		WebDriver driver = new FirefoxDriver(options);
//		driver.get("https://www.google.co.in/");
//		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		driver.quit();
	}

}
