package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Espn_cricket_scorecard {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8048/scorecard/1216495/sunrisers-hyderabad-vs-mumbai-indians-56th-match-indian-premier-league-2020-21");
		System.out.println("Rashid Khan:"+get_bowler_info("Rashid Khan"));
		System.out.println("Sandeep Sharma:"+get_bowler_info("Sandeep Sharma"));
		System.out.println("S Nadeem:"+get_bowler_info("S Nadeem"));
		System.out.println("-------------");
		System.out.println("Point table for MI :"+get_points_table("MI"));
		System.out.println("Point table for DC :"+get_points_table("DC"));
		System.out.println("Point table for RCB:"+get_points_table("RCB"));
		System.out.println("Point table for SRH:"+get_points_table("SRH"));
		
	}
	public static List<String> get_bowler_info(String name) {
		List<String> bowling_card = new ArrayList<String>();
		List<WebElement> bowler_info = 
				driver.findElements(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td"));
		for(int i=0 ; i< bowler_info.size();i++) {
			String info = bowler_info.get(i).getText();
			bowling_card.add(info);
		}
		return bowling_card;
	}
	public static List<String> get_points_table(String TeamName) {
		List<String> points = new ArrayList<String>();
		List<WebElement> pointsTable =
				driver.findElements(By.xpath("//a[text()='"+TeamName+"']//parent::td//following-sibling::td"));
		for(WebElement e : pointsTable) {
		String Ipl_table = e.getText();
		points.add(Ipl_table);
		}
		return points;
	}

}
