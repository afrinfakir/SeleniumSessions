package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hubspot_webTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("username")).sendKeys("afrin.fakir33@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Afrin@123");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(6000);
		driver.navigate().to("https://app.hubspot.com/contacts/8762838/contacts/list/view/all/");
		Thread.sleep(6000);
		
		clickCheckBox("priti k");
		System.out.println(getEmailId("Afrin"));
		System.out.println(getEmailId("altamash p"));
		System.out.println("-----------");
		System.out.println(getPhoneNumber("altamash p"));
		System.out.println(getPhoneNumber("Afrin"));
		System.out.println(getPhoneNumber("priti k"));
	}
	
	public static void clickCheckBox(String name) {
		driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td"
				+ "//input[@type='checkbox']//parent::span")).click();
	}
	public static String getEmailId(String name) {
		String text = driver
				.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a"))
				.getText();
		return text;
	}
	public static String getPhoneNumber(String name) {
		String phn_num =  driver
				.findElement(By.xpath("(//span[text()='"+name+"']//ancestor::td//following-sibling::td"
						+ "//following-sibling::td/span)[position()=1]"))
				.getText();
		return phn_num;
	}

}
