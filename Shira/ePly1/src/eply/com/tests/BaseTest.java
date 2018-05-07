package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import eply.com.pageobjects.LoginPage;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.eply.com/login/index.aspx");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void tlogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


