package com.check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFindE {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(Duration.ofSeconds(2));
		
		driver.findElement(By.id("field-userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement header = driver.findElement(By.className("navbar-header"));
		Thread.sleep(Duration.ofSeconds(5));
		WebElement logo = header.findElement(By.className("navbar-logo-container"));
		Thread.sleep(Duration.ofSeconds(5));
		WebElement link =  logo.findElement(By.tagName("a"));
		Thread.sleep(Duration.ofSeconds(5));
		link.click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();

	}
}
