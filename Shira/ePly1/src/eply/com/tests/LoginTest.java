package eply.com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import eply.com.pageobjects.LoginPage;
import eply.com.pageobjects.ResetPasswordPage;

public class LoginTest extends BaseTest {

	@BeforeClass
	public void tlogin() {
		
	}

	@Test (priority=1) // runs first
	public void loginFailed1() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal", "123456");
		String expected="Sorry, either your username or password was incorrect.";
		String actual=loginPage.getErrorMsg();
		Assert.assertEquals(expected,actual); // comparison between expected and result
		
	}
	
	@Test (priority=2) 
	public void loginFailed2() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "123456");
		Assert.assertTrue(loginPage.isErrorMessageExists()); // any boolean test
	}
	
	
	@Test (priority=99) // runs last according to priority
	public void loginSucceed() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
		String expected="https://www.eply.com/Data/dashboard.aspx";
		String actual=loginPage.currentPageURL();
		Assert.assertEquals(expected,actual);
	}
		
}
