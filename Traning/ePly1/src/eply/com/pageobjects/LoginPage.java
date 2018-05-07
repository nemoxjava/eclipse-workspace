package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	WebElement user;
	WebElement password;
	WebElement btnLogin;
	WebElement forgotPasswordLink;

	public LoginPage(WebDriver driver) {
		super(driver);
		user = driver.findElement(By.cssSelector("#Username"));
		password = driver.findElement(By.cssSelector("#Password"));
		btnLogin = driver.findElement(By.cssSelector("#LoginButton"));
		forgotPasswordLink = driver.findElement(By.cssSelector("#ForgotPasswordButton"));
	}

	//Actions Methods
	public void login(String user,String password) {
		fillText(this.user,user);
		fillText(this.password,password);
		click(btnLogin);
	}
	
	public void openforgotPassword() {
		click(forgotPasswordLink);
	}
	
	public void contactUs() {
		
	}
	
}
