package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp_case2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@href='http://www.popuptest.com/popup3.html']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWinID = it.next();
		System.out.println("parent window ID  :"+parentWinID);
		String childWinID_1 = it.next();
		System.out.println("child_1 window ID :"+childWinID_1);
		driver.switchTo().window(childWinID_1);
		Thread.sleep(3000);
		System.out.println("child_1 window title :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWinID);
		Thread.sleep(3000);
		System.out.println("parent window title :"+driver.getTitle());
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()='Good PopUp #4']")).click();
		Set<String> handler1 = driver.getWindowHandles();
		Iterator<String> it1 = handler1.iterator();
		String parentWinID1 = it1.next();
		System.out.println(parentWinID1);
		String childWinID_2 = it1.next();
		System.out.println(childWinID_2);
		driver.switchTo().window(childWinID_2);
		Thread.sleep(3000);
		System.out.println("child window1 title :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWinID1);
		Thread.sleep(3000);
		System.out.println("parent window title :"+driver.getTitle());
		driver.quit();

		

	}
	
}
