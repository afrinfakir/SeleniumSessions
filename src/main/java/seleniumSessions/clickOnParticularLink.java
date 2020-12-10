package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickOnParticularLink {
	
	static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langList.size());
/*1
 * printing element by using for each loop
 * clicking on back button
 * 
 */
		for(WebElement e : langList) {
			//System.out.println(e.getAttribute("href")+"-->"+e.getText());
			System.out.println(e.getText());
			e.click();
			//driver.navigate().back();
			//driver.findElements(By.xpath("//div[@id='SIvCob']/a"));	
		}
		/*2
		 * 
		 * printing ele by for loop
		 */
		for(int i =0; i< langList.size();i++) {
			String language = langList.get(i).getText();
			System.out.println(language);
			if(language.equals("मराठी")) {
				langList.get(i).click();
				break;
			}
		}
	}

}
