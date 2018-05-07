package eply.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import eply.com.pageobjects.AccountSettingsPage;
import eply.com.pageobjects.MyFormPage;
import eply.com.pageobjects.MyInfoPage;

public class AccountTest extends BaseTest {
	
	@Test
	public void MyAccountSettingsTest1() {
		MyFormPage myForm = new MyFormPage(driver);	
		myForm.goToAccount();
		sleep(2000);
		AccountSettingsPage myInfo1 = new AccountSettingsPage(driver);	
		myInfo1.enterDetails("www.shiri.com", "Tel Aviv", "Ontario", "Austria");
		sleep(2500);
		String expected="Saved.";
		String actual=myInfo1.isSaved();
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void MyAccountSettingsTest2() {
		AccountSettingsPage myInfo2 = new AccountSettingsPage(driver);	
		myInfo2.enterDetails("www.alexander.com", "Jerusalem", "Alaska", "United States");
		sleep(2500);
		String expected="Saved.";
		String actual=myInfo2.isSaved();
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void MyInfoTest1() {
		AccountSettingsPage account = new AccountSettingsPage(driver);	
		account.goToMyInfo();
		sleep(2000);
		MyInfoPage myInfo11 = new MyInfoPage(driver);
		myInfo11.enterInfoGoodEmail("Shiri", "Alexander", "Mrs", "shiri@gmail.com", "French Canada");
		MyInfoPage myInfo12 = new MyInfoPage(driver);
		sleep(2000);
		String expected="Enregistrez";
		String actual=myInfo12.saveButtonText();
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void MyInfoTest2() {
		MyInfoPage myInfo21 = new MyInfoPage(driver);
		myInfo21.enterInfoGoodEmail("Tamar", "Moran", "Ms", "tamar@gmail.com", "English");
		MyInfoPage myInfo22 = new MyInfoPage(driver);
		sleep(2000);
		String expected="Save";
		String actual=myInfo22.saveButtonText();
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void MyInfoTestBadEmail() {
		MyInfoPage myInfo31 = new MyInfoPage(driver);
		sleep(2000);
		String expected="Please enter a valid email address";
		String actual=myInfo31.errorBadEmail("tamargmail.com");
		Assert.assertEquals(expected,actual);
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
