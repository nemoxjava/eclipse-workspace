package eply.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {
	
	WebElement fromDate;
	WebElement toDate;
	WebElement email;
	WebElement btnSearch;
	
	public SearchPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		fromDate = driver.findElement(By.cssSelector("#RadFromDatePicker_dateInput"));
		toDate = driver.findElement(By.cssSelector("#RadToDatePicker_dateInput"));
		email = driver.findElement(By.cssSelector("#Email"));
		btnSearch = driver.findElement(By.cssSelector("#SearchButton"));
	}
	
	// Actions Methods
	
	public void enterDetails(String fromDate, String toDate, String email) {
		
		fillText(this.fromDate,fromDate);
		fillText(this.toDate,toDate);
		fillText(this.email,email);
		click(btnSearch);
	}

}
