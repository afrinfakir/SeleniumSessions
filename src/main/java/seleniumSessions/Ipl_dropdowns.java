package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ipl_dropdowns {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?sxsrf=ALeKk01FpglTkRD2NvFZTUYdmi-XUekdnw%3A1602914493887&ei=vYiKX7zkNcjEz7sP7L-6iA0&q=ipl+2020+live+score&oq=ipl+&gs_lcp=CgZwc3ktYWIQARgCMgQIIxAnMgcIIxDJAxAnMgQIIxAnMggILhCxAxCDATIICAAQsQMQgwEyCAgAELEDEIMBMggIABCxAxCDATIECAAQQzIICAAQsQMQgwEyCAgAELEDEIMBOgQIABBHOgIIADoKCAAQsQMQgwEQClCpm-sCWOHM6wJgseXrAmgAcAJ4AIABlAKIAc0dkgEGMC4yLjE1mAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&sclient=psy-ab&zx=1603632655573#sie=lg;/g/11h4yld3j_;5;/m/03b_lm1;st;fp;1;;");
		driver.findElement(By.xpath("//div[@class='ebsfL']/g-dropdown-menu-button-caption/span[text()='2020']")).click();
		Thread.sleep(3000);
		List<WebElement> yearList = driver.findElements(By.xpath("//g-menu-item['jsname=\"NNJLud']/div"));
		int year = yearList.size();
		System.out.println(year);
		for(WebElement e : yearList) {
			String years = e.getText();
			System.out.println(years);
			if(years.equals("2016")) {
				e.click();
				break;
				
			}
			
			
		}
		
		
	
	}

}
