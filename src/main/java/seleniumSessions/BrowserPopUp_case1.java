package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopUp_case1 {
	static WebDriver driver;
	static int static_wait = 3000;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		By popUp_1 = By.xpath("//a[@href='http://www.popuptest.com/popup3.html']");
		By popUp_2 = By.xpath("//a[text()='Good PopUp #4']");
		browserPopUp(popUp_1, popUp_2, static_wait);
	}
	public static void browserPopUp(By locator_1,By locator_2,int wait) throws InterruptedException {
		driver.findElement(locator_1).click();
		driver.findElement(locator_2).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWinID = it.next();
		System.out.println("parent window ID  :"+parentWinID);
		String childWinID_1 = it.next();
		System.out.println("child_1 window ID :"+childWinID_1);
		String childWinID_2 = it.next();
		System.out.println("child_2 window ID :"+childWinID_2);
		driver.switchTo().window(childWinID_1);
		Thread.sleep(wait);
		System.out.println("child_1 window title :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(childWinID_2);
		Thread.sleep(wait);
		System.out.println("child_2 window title :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWinID);
		Thread.sleep(wait);
		System.out.println("parent window title :"+driver.getTitle());
		driver.quit();
	}

}
