package com.eply.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eply.pageobjects.LoginPage;

public class Login extends BaseTest{
	
	@BeforeClass
	public void tlogin(){
	}
	
	@Test (priority=99)
	public void loginSucceed() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
	}
	
	@Test(priority=1)
	public void loginFailed1() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("ga@informup.com", "2222");
		String expected = "Sorry, either your username or password was incorrect.To continue you must update your password.";
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(expected, actual);
	}

	@Test(priority=2)
	public void loginFailed2() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("mup.com", "2222");
		Assert.assertTrue(loginPage.isErrorMsgExist());
	}


}
