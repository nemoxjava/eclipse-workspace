package com.eply.tests;

import org.testng.annotations.Test;

import com.eply.pageobjects.AccountPage;
import com.eply.pageobjects.LoginPage;
import com.eply.pageobjects.MainPage;

public class AccountTest extends BaseTest{
	
	@Test
	public void testAccount(){
		MainPage mainPage = new MainPage(driver);
		mainPage.navigation("account");

		//mainPage.navigation("invites");
		AccountPage accountPage = new AccountPage(driver);
		accountPage.fillInformation("Petach Tikva", "054333333");
	}
	
	@Test
	public void testAccount1(){
		AccountPage accountPage = new AccountPage(driver);
		accountPage.fillInformation("TA", "222");
	}
	
}
