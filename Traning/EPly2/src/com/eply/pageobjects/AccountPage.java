package com.eply.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void fillInformation(String City, String phone){
		fillText(driver.findElement(By.cssSelector("#City")), City);
		fillText(driver.findElement(By.cssSelector("#Phone")),phone);
		//driver.findElement(By.cssSelector("#City")).sendKeys(City);
		//driver.findElement(By.cssSelector("#Phone")).sendKeys(phone);
	}
}
