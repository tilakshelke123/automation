package com.check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);
		
		By locatorUsername = By.id("field-userName");
		WebElement txtUsername = driver.findElement(locatorUsername);
		txtUsername.sendKeys("admin");
		Thread.sleep(5000);
		txtUsername.sendKeys("admin");
		Thread.sleep(5000);
		txtUsername.clear();
		Thread.sleep(5000);
		txtUsername.sendKeys("admin");
		System.out.println("Text Entered in txtUsername is "+txtUsername.getText()); // No text
		System.out.println("Text Entered in txtUsername is "+txtUsername.getAttribute("value"));

		By locatorPassword = By.name("password");
		WebElement txtPassword = driver.findElement(locatorPassword);
		txtPassword.sendKeys("admin");
		Thread.sleep(5000);

		driver.findElement(By.className("fa-eye")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.className("far")).click();
		Thread.sleep(5000);

		By locatorLogin = By.tagName("button");
		WebElement btnLogin = driver.findElement(locatorLogin);
		btnLogin.click();
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
