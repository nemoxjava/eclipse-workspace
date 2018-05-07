package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(WebElement el ) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", el);
		el.click();
		sleep(2000);
	}
		
	public void fillText(WebElement el, String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", el);
		el.clear();
		el.sendKeys(text);
		sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: none;');", el);
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getText(WebElement el) {
		return el.getText();
	}
	
	public String getValue(WebElement el) {
		return el.getAttribute("value");
	}
	
	public void clear(WebElement el ) {
		el.clear();
		sleep(2000);
	}
	
	public void selectFromList(WebElement el, String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", el);
		Select select1 = new Select(el);
		select1.selectByVisibleText(value);
		sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: none;');", el);
	}
	
	// is there an error
	public boolean isErrorMessageExists(String errorEl) {
		try {
			driver.findElement(By.cssSelector(errorEl));
			return true;
		}
		catch (Exception err) {
			return false;
		}		
	}
	
//	// which error appears
//	public String getMsg(String messageEl) {
//		WebElement error=driver.findElement(By.cssSelector(messageEl));
//		return error.getText();
//	}
}
