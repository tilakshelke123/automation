
package com.lab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(10000);

		
		WebElement el = driver.findElement(By.className("CgwTDb"));
		System.out.println(el.isDisplayed());
		Thread.sleep(5000);
		System.out.println(el.isDisplayed());
		
		
		Thread.sleep(5000);
		driver.quit();

	}
}