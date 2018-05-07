package discount.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sanity {

	

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().fullscreen();
			driver.manage().window().fullscreen();
			String baseUrl = "http://discount.stage.codev.co.il/login";
			String expectedTitle = "Workers-committee.com";
	        String actualTitle = "";
	        driver.get(baseUrl);
	        actualTitle = driver.getTitle();
	        if (actualTitle.contentEquals(expectedTitle)) {
	        	System.out.println("success");
	        } else {
	        	System.out.println("not our site");
	        }
	        driver.close();
	        
		}

	}


