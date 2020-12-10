package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToEle_Action {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		By frst_ele = By.id("ctl00_HyperLinkLogin");
		By second_ele = By.xpath("//a[text()='SpiceClub Members']");
		By third_ele = By.xpath("//a[text()='Sign up']");
		int waits = 3000;
		movingToEle(frst_ele, second_ele, waits, third_ele);
	}

	public static void movingToEle(By locator1, By locator2, int wait, By locator3) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locator1))
		      .moveToElement(driver.findElement(locator2)).build().perform();
		Thread.sleep(wait);
		driver.findElement(locator3).click();
	}
}
