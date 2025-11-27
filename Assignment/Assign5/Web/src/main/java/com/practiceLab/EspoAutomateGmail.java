package com.practiceLab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspoAutomateGmail {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://localhost/espocrm/";
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Succssfully loaded Espocrm !!!");
		Thread.sleep(5000);

		By user = By.cssSelector("input#field-userName");
		WebElement userInput = driver.findElement(user);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		userInput.clear();
		userInput.sendKeys("admin");
		System.out.println("User Entered Succssfully  !!!");

		Thread.sleep(2000);

		By pass = By.cssSelector("input#field-password");
		WebElement passInput = driver.findElement(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		passInput.clear();
		passInput.sendKeys("admin");
		System.out.println("password Entered Succssfully  !!!");

		Thread.sleep(2000);

		By login = By.cssSelector("button#btn-login");
		WebElement loginInput = driver.findElement(login);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		loginInput.click();
		System.out.println("Login  Succssfully  !!!");

		Thread.sleep(2000);
		
		By email = By.cssSelector("[href='#Email']");
		WebElement emailInput = driver.findElement(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		emailInput.click();
		
		
		By compose = By.cssSelector("[data-name='composeEmail']");
		WebElement composeInput = driver.findElement(compose);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		composeInput.click();
		
		
		Thread.sleep(2000);
	}

}
