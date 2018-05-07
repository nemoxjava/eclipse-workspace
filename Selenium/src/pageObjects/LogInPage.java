package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	private static WebElement el = null;
	
	public static WebElement user_login (WebDriver driver) {
		el = driver.findElement(By.id("edit-employeeidinput"));
		return el;
	}
	
	public static WebElement pass_login (WebDriver driver) {
		el = driver.findElement(By.id("edit-passwordinput"));
		return el;
	}
	
	public static WebElement btn_login (WebDriver driver) {
		el = driver.findElement(By.id("edit-submitloginbutton"));
		return el;
	}
	
	public static WebElement link_forgetpsw (WebDriver driver) {
		el = driver.findElement(By.id("edit-forgotpasswordbutton"));
		return el;
	}

}
