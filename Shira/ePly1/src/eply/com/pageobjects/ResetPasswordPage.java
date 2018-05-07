package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage extends BasePage {
	
	WebElement user;
	WebElement btnContinue;
	WebElement btnCancle;
	
	public ResetPasswordPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		user = driver.findElement(By.cssSelector("#UserNameTextBox"));
		btnContinue = driver.findElement(By.cssSelector("#ContinueButton"));
		btnCancle = driver.findElement(By.cssSelector("#CancelButton"));
	}
	
	// Actions Methods
	
	public void resetPassword(String user) {
		fillText(this.user,user);
		click(btnContinue);
	}
	
	public void cancleResetPassword() {
		click(btnCancle);
	}
	
	public String getMessageReset() {
		WebElement error=driver.findElement(By.cssSelector("#ErrorLabel"));
		return error.getText();
	}
}
