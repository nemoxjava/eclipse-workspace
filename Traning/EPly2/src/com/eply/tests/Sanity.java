package com.eply.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.eply.pageobjects.AccountPage;
import com.eply.pageobjects.LoginPage;
import com.eply.pageobjects.MainPage;
import com.eply.utils.Utils;

public class Sanity {

	public static void main(String[] args) {
		WebDriver driver = Utils.initDriver();
		WebDriver driver1 = Utils.initDriver();
		driver.get("https://www.eply.com/Login/index.aspx?Logout=True");
		driver1.get("http://www.automation.co.il");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("eply", "demo123");
		
		MainPage mainPage = new MainPage(driver);
		mainPage.navigation("account");
		
		//mainPage.navigation("invites");
		AccountPage accountPage = new AccountPage(driver);
		accountPage.fillInformation("Petach Tikva", "054333333");
		
	}

}
