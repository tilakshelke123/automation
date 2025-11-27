package runner;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import testcase.LoginTestCase;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.initDriver("chrome");
		
		LoginTestCase tc1 = new LoginTestCase(driver);
	//	tc1.validLogin();
		// below by me 
		tc1.InvalidLogin();
		
		Thread.sleep(5000);
	driver.quit();
	}
}
