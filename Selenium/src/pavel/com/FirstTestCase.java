package pavel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LogInPage;

public class FirstTestCase {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://discount-vaad.codev.co.il/login?destination=node/5");
		LogInPage.user_login(driver).click();
		LogInPage.user_login(driver).sendKeys("2");
		LogInPage.pass_login(driver).click();
		LogInPage.pass_login(driver).sendKeys("123456");
		LogInPage.btn_login(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

}
