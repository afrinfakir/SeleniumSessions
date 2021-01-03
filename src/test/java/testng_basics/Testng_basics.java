package testng_basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_basics {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//SoftAssert softassert = new SoftAssert();
		Assert.assertEquals(false, true);
		//softassert.assertEquals(true, false);
		//System.out.println(" soft assertion failed...");
		//softassert.assertAll();
		
		
	}
	@Test
	public void homepageTest() {
		System.out.println("Home page");
		//Assert.assertEquals(false, true);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false);
		System.out.println("home page failed...");
		//sa.assertAll();
	}

}
