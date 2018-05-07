package com.eply.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

public class LoginPage extends BasePage{

	@FindBy(css="#Username")
	WebElement Username;

	@FindBy(css="#Password")
	WebElement Password;

	@FindBy(id="LoginButton")
	WebElement LoginButton;


	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void login(String user,String pass){
		//highlight
		fillText(Username, user);
		//Username.sendKeys(user);
		//highlight
		fillText(Password, pass);
		//Password.sendKeys(pass);
		//highlight
		//LoginButton.click();
		click(LoginButton);
		//click(driver.findElement(By.cssSelector("#LoginButton")));

	}

	public void forgotPassword(String user){
		//click the link

		//fillin your user

		//click 
	}

	public String getErrorMsg(){
		WebElement error = driver.findElement(By.cssSelector("#Message"));
		return getText(error);
	}

	public boolean isErrorMsgExist(){
		try
		{
			driver.findElement(By.cssSelector("#Message"));
			return true;
		}
		catch(Exception  err){
			return false;
		}
	}


}
