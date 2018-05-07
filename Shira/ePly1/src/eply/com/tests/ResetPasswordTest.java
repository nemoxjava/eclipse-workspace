package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eply.com.pageobjects.LoginPage;
import eply.com.pageobjects.MyFormPage;
import eply.com.pageobjects.ResetPasswordPage;

public class ResetPasswordTest extends BaseTest {
	
	@BeforeClass
	public void tlogin() {
		
	}
	
	@Test
	public void forgotPasswordAndCancle() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.forgotPassword();	
		ResetPasswordPage resetPage = new ResetPasswordPage(driver);
		resetPage.cancleResetPassword();	
		LoginPage loginPage1 = new LoginPage(driver);
		String expected="https://www.eply.com/login/index.aspx";
		String actual=loginPage1.currentPageURL();
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void forgotPasswordAndReset() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.forgotPassword();	
		ResetPasswordPage resetPage = new ResetPasswordPage(driver);
		resetPage.resetPassword("g@informup.com");
		String expected="Instructions on how to reset your password have been sent to the email address registered with the username provided.";
		String actual=resetPage.getMessageReset();
		Assert.assertEquals(expected,actual);		
	}
	
	
}
