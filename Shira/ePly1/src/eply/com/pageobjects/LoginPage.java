package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	WebElement user;
	WebElement password;
	WebElement btnLogin;
	WebElement forgotPasswordLink;
	
	public LoginPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		user = driver.findElement(By.cssSelector("#Username"));
		password = driver.findElement(By.cssSelector("#Password"));
		btnLogin = driver.findElement(By.cssSelector("#LoginButton"));
		forgotPasswordLink = driver.findElement(By.cssSelector("#ForgotPasswordButton"));
	}
	
	// Actions Methods
	
	public void login(String user, String password) {
		fillText(this.user,user);
		fillText(this.password,password);
		click(btnLogin);
		sleep(2000);
	}
	
	public void forgotPassword( ) {
		click(forgotPasswordLink);
	}
	
	public void contactUs() {
		
	}
	
	// ---- validation methods ----
	
	// which error is displayed
	public String getErrorMsg() {
		WebElement error=driver.findElement(By.cssSelector("#Message"));
		return error.getText();
	}
	
	// is there an error
	public boolean isErrorMessageExists() {
		try {
			driver.findElement(By.cssSelector("#Message"));
			return true;
		}
		catch (Exception err) {
			return false;
		}		
	}
	
	// current page URL
	public String currentPageURL() {
		String address=driver.getCurrentUrl();
		return address;
	}
}
