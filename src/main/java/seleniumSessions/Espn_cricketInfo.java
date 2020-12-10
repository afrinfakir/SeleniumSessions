package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Espn_cricketInfo {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8048/scorecard/1216495/sunrisers-hyderabad-vs-mumbai-indians-56th-match-indian-premier-league-2020-21");
		
		/*List<WebElement> score_card = driver.findElements(By.xpath("//a[contains(text(),'Ishan Kishan')]/parent::td//following-sibling::td"));
		System.out.println(score_card.size());
		List<String> table = new ArrayList<String>();
		for(int i = 0 ; i<score_card.size() ; i++) {
			String score = score_card.get(i).getText();
			System.out.println(score);
			table.add(score);
		}
		System.out.println(table);*/
		
		get_Wicket_TakerName("Ishan Kishan");
		
		
		
		
		
	}
	public static void get_Wicket_TakerName(String name) {
		String wicket_baller = driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td//following-sibling::td//span)[2]")).getText();
		System.out.println(wicket_baller);
	}

}
