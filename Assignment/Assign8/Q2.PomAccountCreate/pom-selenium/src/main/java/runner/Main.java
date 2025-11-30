package runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import testcase.LoginTestCase;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.initDriver("chrome");
		
		LoginTestCase tc1 = new LoginTestCase(driver);
		tc1.validLogin();
		// below by me 
		//tc1.InvalidLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		tc1.ValidcreateAccount();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		tc1.Validlogout();
		
		Thread.sleep(5000);
	driver.quit();
	}
}
