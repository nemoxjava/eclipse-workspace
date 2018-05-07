package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import eply.com.pageobjects.LoginPage;

public class LoginFailedTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.eply.com/Login/index.aspx");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal", "123456");
		
	}

}
