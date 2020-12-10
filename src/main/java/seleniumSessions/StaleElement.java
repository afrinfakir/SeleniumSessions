package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {
	
	public static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		System.out.println(driver.getTitle());
		
		WebElement url = driver.findElement(By.id("Form_submitForm_subdomain"));
		
		//9f34b74a-3e47-429d-973d-8ac5c9bfe5c9 ---web ele ID is internally maintained
		//but when we refresh page that time dom will be loaded again so updated version comes
		//so web ele ID got changed so we get stale ele exception
		url.sendKeys("afrin@gmail.com");
		
		driver.navigate().refresh();
		url.sendKeys("afrin@gmail.com");
		
		
		
	}

}
