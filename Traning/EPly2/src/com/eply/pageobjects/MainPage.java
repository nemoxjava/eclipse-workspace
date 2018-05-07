package com.eply.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void navigation(String option){
		switch(option){
		case "account":
			click(driver.findElement(By.cssSelector("#ePlyHeader_accountLink")));
			break;
		case "invites":
			click(driver.findElement(By.cssSelector("#ePlyHeader_contactLink")));
			break;
		}
	}
	
	public void filter(String option,String filterName,String text){
		
	}
	
}
