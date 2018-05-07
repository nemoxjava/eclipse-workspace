package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import eply.com.pageobjects.LoginPage;
import eply.com.pageobjects.MyFormPage;
import eply.com.pageobjects.MyInfoPage;
import eply.com.pageobjects.SearchPage;

public final class SearchAllTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eply.com/login/index.aspx");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
		
		MyFormPage myForm = new MyFormPage(driver);	
		Thread.sleep(2000);
		myForm.goToSearchAll();
		
		SearchPage searchPage = new SearchPage(driver);	
		searchPage.enterDetails("7/12/2016","7/12/2017","shiri@gmail.com");
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
