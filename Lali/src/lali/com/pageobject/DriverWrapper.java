package lali.com.pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {
	WebDriver driver;
	
	static {
		driverWrapper = new DriverWrapper(); 
	}
	
	private static DriverWrapper driverWrapper;
	private DriverWrapper(){
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa.insurtix.codev.co.il/Cars/insurtix/flows/car");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static DriverWrapper get() {
		return driverWrapper;
	}
	
	public void click(By by) {
		find(by).click();
	}
	public void setText(By by, CharSequence[] user) {
		find(by).sendKeys(user);
	}
	public String getText(By by) {
		return find(by).getText();
		//return null;
	}

	
	
	private WebElement find(By by) {
		try {
			WebElement el = driver.findElement(by);
			//TODO verify is clickable and displayed
			return el;
		}catch(Exception e) {
			System.err.println("Failed to find element By = " + by);
		}
		//TODO assert false - stop test
		return null;
	}

	public void quit() {
		driver.quit();		
	}
}