package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		TotalLink("a", "href");
	}
	public static void TotalLink(String tag, String attribute) {
		List<WebElement> links = driver.findElements(By.tagName(tag));
		System.out.println("Total Links available--->" + links.size());
		for (int i = 0; i < links.size(); i++) {
			String linkText = links.get(i).getText();
			String attrVal = links.get(i).getAttribute(attribute);
			System.out.println(i + "-->" + linkText + "-->" + attrVal);
		}
	}
}
