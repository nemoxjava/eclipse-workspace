package com.eply.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.eply.pageobjects.LoginPage;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("https://www.eply.com/Login/index.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Start video
	}
	
	@BeforeClass
	public void tlogin(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
		//close video
	}
}
