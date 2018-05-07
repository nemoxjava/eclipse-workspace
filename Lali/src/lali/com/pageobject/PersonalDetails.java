package lali.com.pageobject;

import org.openqa.selenium.By;

public class PersonalDetails extends BasePage {
	By name = By.id("mat-input-0");
	By SecondName = By.id("mat-input-1");
	By phone = By.id("mat-input-2");
	By teams = By.cssSelector("#mat-checkbox-1 > label > div");
	By approve = By.cssSelector("#mat-checkbox-2 > label > div");
	public PersonalDetails(DriverWrapper driver) {
		super (driver);
	}
	
	//Action Methods
	
	
}
