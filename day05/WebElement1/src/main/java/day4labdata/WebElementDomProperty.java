
package day4labdata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDomProperty {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);
		
		By locatorUsername = By.id("field-userName"); //  criteria 
		WebElement txtUsername = driver.findElement(locatorUsername); // we find 
		txtUsername.sendKeys("admin"); // and we passed the value 

		By locatorPassword = By.name("password");
		WebElement txtPassword = driver.findElement(locatorPassword);
		txtPassword.sendKeys("admin");
		Thread.sleep(5000);

		By locatorLogin = By.tagName("button");
		WebElement btnLogin = driver.findElement(locatorLogin);
		btnLogin.click();
		
		
		Thread.sleep(5000);

		driver.get("http://localhost/espocrm/#Account");

		Thread.sleep(5000);

		System.out.println("Initial State");
		WebElement el = driver.findElement(By.className("select-all"));
		Thread.sleep(5000);

		System.out.println("GetAttribute: "+el.getAttribute("checked"));
		System.out.println("GetDOMProperty: "+el.getDomProperty("checked"));

		el.click();
		
		System.out.println("After Click");
		System.out.println("GetAttribute: "+el.getAttribute("checked"));
		System.out.println("GetDOMProperty: "+el.getDomProperty("checked")); // updated value 

		Thread.sleep(5000);
		driver.quit();

	}
}