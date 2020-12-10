package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class spiceJet {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//WebElement calender =
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']/following-sibling::button")).click();
		//WebElement depart_date = driver.findElement(By.xpath("//td[@data-month='10']/a[text()='27']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(calender).click();
		//System.out.println("sucss");
		//action.moveToElement(depart_date).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='30-11-2020'");


	    }
	}


