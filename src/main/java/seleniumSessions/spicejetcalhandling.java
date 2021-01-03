package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejetcalhandling {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(3000);
		String startmonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]/span")).getText();
		while(!startmonth.contains("March")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			startmonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]/span")).getText();
		}
		List<WebElement> startDate = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td"));
		for(WebElement e :startDate) {
			if(e.getText().equals("29"))
			{
				e.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		Thread.sleep(3000);
		List<WebElement> endDate = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td"));
		for(WebElement e :endDate) {
			if(e.getText().equals("30"))
			{
				e.click();
				break;
			}
		}
		
	}

}
