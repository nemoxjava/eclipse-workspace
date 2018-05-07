package lali.com.pageobject;

import org.openqa.selenium.By;

import lali.com.pageobject.DriverWrapper;

public class BasePage {
	DriverWrapper driver;
	
	public BasePage(DriverWrapper driver) {
		this.driver = driver;
	}
	public void Click(By by) {
		driver.click(by);
	}
	
	protected void setText(By by, CharSequence[] user) {
		driver.setText(by,user);
	}
	
	protected String getText(By by) {
		return driver.getText(by);
	}
	protected void MarkCheckbox(By by) {
		driver.click(by);
	}
}
