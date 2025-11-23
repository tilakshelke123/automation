package com.check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);
		
		By locatorPoweredBy = By.linkText("EspoCRM, Inc.");
		WebElement lnkPoweredBy = driver.findElement(locatorPoweredBy);
		lnkPoweredBy.click();

		Thread.sleep(5000);
		driver.quit();

		driver = new ChromeDriver();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);

		By locatorChargedBy = By.partialLinkText("Inc.");
		WebElement lnkChargedBy = driver.findElement(locatorChargedBy);
		lnkChargedBy.click();
		
		
		Thread.sleep(5000);
		driver.quit();

	}
}
