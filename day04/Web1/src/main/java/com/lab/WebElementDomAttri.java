
package com.lab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDomAttri {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/dom.php");
		Thread.sleep(5000);
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		System.out.println("Before Type");
		System.out.println("GetAttribute: "+txtUsername.getAttribute("value"));
		System.out.println("GetDOMAttribute: "+txtUsername.getDomAttribute("value")); // default value 
		txtUsername.sendKeys("admin"); // append  //  not override 
		System.out.println("After Type");
		System.out.println("GetAttribute: "+txtUsername.getAttribute("value"));
		System.out.println("GetDOMAttribute: "+txtUsername.getDomAttribute("value")); //default value


		Thread.sleep(5000);
		driver.quit();

	}
}