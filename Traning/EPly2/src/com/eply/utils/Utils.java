package com.eply.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {

	public static WebDriver initDriver()
	{
		WebDriver driver = null;
		//Read driver from properties file
		String browser = "Dontknow";
		switch(browser){
		case "Chrome":
			//define chrome
			break;
		case "FF":
			//define FF
			break;
		case "IE":
			//define chrome
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;
		
	}
}
