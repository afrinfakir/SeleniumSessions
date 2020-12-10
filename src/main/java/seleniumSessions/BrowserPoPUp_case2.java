package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPoPUp_case2 {
	static WebDriver driver;
	static int static_wait = 3000;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		By child1 = By.xpath("//a[@href='http://www.popuptest.com/popup3.html']");
		browserPopup(child1, static_wait);
		By child2 = By.xpath("//a[text()='Good PopUp #4']");
		browserPopup(child2, static_wait);
	}
	public static void browserPopup(By locator, int wait) throws InterruptedException {
		driver.findElement(locator).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWinID = it.next();
		System.out.println("parent window ID :" + parentWinID);
		String childWinID = it.next();
		System.out.println("child window ID :" + childWinID);
		driver.switchTo().window(childWinID);
		Thread.sleep(wait);
		System.out.println("child window title :" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWinID);
		Thread.sleep(wait);
		System.out.println("parent window title :" + driver.getTitle());

	}

}
