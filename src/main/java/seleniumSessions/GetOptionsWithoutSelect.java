package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionsWithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/search?sxsrf=ALeKk01FpglTkRD2NvFZTUYdmi-XUekdnw%3A1602914493887&ei=vYiKX7zkNcjEz7sP7L-6iA0&q=ipl+2020+live+score&oq=ipl+&gs_lcp=CgZwc3ktYWIQARgCMgQIIxAnMgcIIxDJAxAnMgQIIxAnMggILhCxAxCDATIICAAQsQMQgwEyCAgAELEDEIMBMggIABCxAxCDATIECAAQQzIICAAQsQMQgwEyCAgAELEDEIMBOgQIABBHOgIIADoKCAAQsQMQgwEQClCpm-sCWOHM6wJgseXrAmgAcAJ4AIABlAKIAc0dkgEGMC4yLjE1mAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&sclient=psy-ab&zx=1602945561912#sie=t;/m/03nxlj5;5;;st;fp;1;;");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='ebsfL']/g-dropdown-menu-button-caption[@class='S7TGef ijreF']/descendant::span[contains(text(),'2020')]"));
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals("2019")) {
				options.get(i).click();

			}
		}
	}

}
