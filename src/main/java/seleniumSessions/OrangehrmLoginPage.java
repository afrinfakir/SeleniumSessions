package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangehrmLoginPage {
	public static void main(String[] args) throws InterruptedException {
		By url_hrm = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By company = By.id("Form_submitForm_CompanyName");
		By phoneNum = By.id("Form_submitForm_Contact");
		By EmpCount = By.id("Form_submitForm_NoOfEmployees");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.init_driver("chrome");
		br.getUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(6000);

		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.doSendkeys(url_hrm, "afrinOrangeHRM.com");
		elementUtils.doSendkeys(firstname, "Aafrin");
		elementUtils.doSendkeys(lastname, "Fakir");
		elementUtils.doSendkeys(email, "afrin234@gamil.com");
		elementUtils.doSendkeys(jobTitle, "Software Testing");
		elementUtils.doSendkeys(company, "Infinite software solutions");
		elementUtils.doSendkeys(phoneNum, "9685475545");
		elementUtils.doSendkeys(industry, "Computer/Technology-Services");
		elementUtils.doSendkeys(EmpCount, "76 - 100");
		//elementUtils.doSendkeys(country, "India");	
		elementUtils.selectValueFromDropdown(country, "India");
		//br.closeBrowser();

	}

}
