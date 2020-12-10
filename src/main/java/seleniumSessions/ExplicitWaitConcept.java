package seleniumSessions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
//		By email_id = By.id("username");
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement id = wait.until(ExpectedConditions.presenceOfElementLocated(email_id));
//		id.sendKeys("afrin.fakir33@gmail.com");
	}
	public static WebElement getPresenceOfElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement getVisiblityOfElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));				
	}
	public static void getUrl(String url ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		boolean b = wait.until(ExpectedConditions.urlContains(url));
		System.out.println(b);
		System.out.println(driver.getCurrentUrl());
	}
	public static Alert getAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
		//this method is used to switch to alert.
	}
	public static void getListOfElements(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		List<WebElement> linkList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		linkList.stream().forEach(ele -> System.out.println(ele.getText()));
	}
	public static WebElement customWait(By locator)
	{
		WebElement element = null;
		int attempt = 0;
		while(attempt < 30) {
			try {
				element = driver.findElement(locator);
			}
			catch (NoSuchElementException e) {
				try {
					Thread.sleep(500);
				}
				catch (Exception e1) {
				}
				System.out.println("Element not found :"+ attempt+1);
			}
			attempt++;
			}
		return element;
	}
	
}
