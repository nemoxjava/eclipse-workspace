package com.eply.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}


	public void click(WebElement el){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", el);
		el.click();
		sleep(2000);
	}


	public void fillText(WebElement el,String text){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", el);

		el.clear();
		el.sendKeys(text);
		sleep(2000);
	}
	
	public String getText(WebElement el){
		return el.getText();
	}
	
	//create highlight method
	public void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
