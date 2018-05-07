package pavel.com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testEclipsScenario {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newsru.co.il");

	}

}
