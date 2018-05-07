package eply.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFormPage extends BasePage {
	
	WebElement filterName;
	WebElement btnFilter;
	WebElement btnAccount;
	WebElement btnSearch;
	
	public MyFormPage(WebDriver driver) {
		super(driver); // call my 'father' - since the father needs driver for its consturctor
		filterName = driver.findElement(By.cssSelector("#FormList_ctl00_ctl02_ctl02_FilterTextBox_EventName"));
		btnFilter = driver.findElement(By.cssSelector("#FormList_ctl00_ctl02_ctl02_Filter_EventName"));
		btnAccount = driver.findElement(By.cssSelector("#ePlyHeader_accountLink"));
		btnSearch = driver.findElement(By.cssSelector("#ePlyHeader_SearchLink"));

		
	}
	
	// Actions Methods
	
	public void filter(String filterByText,String filterRule) {
		fillText(this.filterName,filterByText);
		click(btnFilter);
		List<WebElement> list1 = driver.findElements(By.cssSelector(".rmText"));
		for (WebElement el1:list1) {
				if (el1.getText().equals(filterRule)) {
					el1.click();
					break;
				}
		}
	}
	
	public int linesCount() {
		WebElement element = driver.findElement(By.cssSelector("tbody"));
		List<WebElement> list2 = element.findElements(By.cssSelector("tr"));
		return list2.size();
	}

	public void goToAccount() {
		click(btnAccount);
	}
	
	public void goToSearchAll() {
		click(btnSearch);
	}
}
