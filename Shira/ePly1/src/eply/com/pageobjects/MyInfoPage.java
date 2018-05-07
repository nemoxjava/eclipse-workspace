package eply.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage extends BasePage {
	
	WebElement firstName;
	WebElement lastName;
	WebElement title;
	WebElement email;
	WebElement language;
	WebElement btnSave;
	
	public MyInfoPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		firstName = driver.findElement(By.cssSelector("#FirstName"));
		lastName = driver.findElement(By.cssSelector("#LastName"));
		title = driver.findElement(By.cssSelector("#Title"));
		language = driver.findElement(By.cssSelector("#LocaleDDL"));
		email = driver.findElement(By.cssSelector("#Email"));
		btnSave = driver.findElement(By.cssSelector("#SaveInfoButtonTop"));
	}
	
	// Actions Methods
	
	public void enterInfoGoodEmail(String firstName, String lastName, String title, String email, String language) 
	{
		fillText(this.firstName,firstName);
		fillText(this.lastName,lastName);
		fillText(this.title,title);
		fillText(this.email,email);
		selectFromList(this.language,language);
		click(btnSave);
	}
	
	public String errorBadEmail(String badEmail) 
	{
		fillText(this.email,badEmail);
		click(btnSave);
		sleep(1000);
		WebElement error = driver.findElement(By.cssSelector("#Regularexpressionvalidator4"));
		return getText(error);
	}
	
//	
//	// validations
	
//	Save in French: "Enregistrez"
//	
	public String saveButtonText() {
		return getValue(btnSave);
	}

}
