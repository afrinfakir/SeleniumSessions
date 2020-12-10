package seleniumSessions;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkfinding {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0 ;i<links.size();i++) {
		String linkName = links.get(i).getText();
		String hrefText = links.get(i).getAttribute("href");
		System.out.println(linkName+"-->"+hrefText);
		//System.out.println(linkName);
//		if(!linkName.isEmpty())
//		{
//			System.out.println(i + "-->"+linkName);
//		}
	}
	System.out.println("----------------");
	List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println(images.size());
	for(int i=0 ; i < images.size();i++) {
		String srcvalue = images.get(i).getAttribute("src");
		System.out.println(srcvalue);
	}

		
	}

}
