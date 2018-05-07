package pavel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "C:\\automation\\drivers");
		WebDriver driver = new ChromeDriver();
		driver.get("http://discount-vaad.codev.co.il/");
		WebElement user = driver.findElement(By.id("edit-employeeidinput"));
		user.sendKeys("2");
		WebElement pass = driver.findElement(By.id("edit-passwordinput"));
		pass.sendKeys("123456");
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"edit-submitloginbutton\"]"));
		btn.click();

	}

}
