package eply.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountSettingsPage extends BasePage {
	
	WebElement website;
	WebElement streetAddress;
	WebElement province;
	WebElement country;
	WebElement btnSave;
	WebElement myInfo;
	
	public AccountSettingsPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		website = driver.findElement(By.cssSelector("#Website"));
		streetAddress = driver.findElement(By.cssSelector("#Address"));
		province = driver.findElement(By.cssSelector("#Province"));
		country = driver.findElement(By.cssSelector("#Country"));
		btnSave = driver.findElement(By.cssSelector("#Button1"));
		myInfo = driver.findElement(By.cssSelector("#Menus_MyInfo2"));
	}
	
	// Actions Methods
	
	public void enterDetails(String website, String address, String province, String countryName) {
		
		fillText(this.website,website);
		fillText(streetAddress,address);
		selectFromList(this.province,province);
		selectFromList(this.country,countryName);
		click(btnSave);
	}
	
	public void goToMyInfo() {
		click(myInfo);
	}
	
	// validations
	
	public String isSaved() {
		WebElement message=driver.findElement(By.cssSelector("#UpdateClientError"));
		return message.getText();
	}
	
	
}
