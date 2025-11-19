package com.check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_url {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(Duration.ofSeconds(5));
		
		By locatorUsername = By.id("field-userName");
		WebElement txtUsername = driver.findElement(locatorUsername);
		txtUsername.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(2));
		txtUsername.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(2));
		txtUsername.clear();
		Thread.sleep(Duration.ofSeconds(2));
		txtUsername.sendKeys("admin");
		System.out.println("Text Entered in txtUsername is "+txtUsername.getText());
		System.out.println("Text Entered in txtUsername is "+txtUsername.getAttribute("value"));

		By locatorPassword = By.name("password");
		WebElement txtPassword = driver.findElement(locatorPassword);
		txtPassword.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(2));

		driver.findElement(By.className("fa-eye")).click();
		Thread.sleep(Duration.ofSeconds(2));
		
		driver.findElement(By.className("far")).click();
		Thread.sleep(Duration.ofSeconds(2));

		By locatorLogin = By.tagName("button");
		WebElement btnLogin = driver.findElement(locatorLogin);
		btnLogin.click();
		
		
		Thread.sleep(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/ul/li[3]/a/span[2]")).click();
		Thread.sleep(Duration.ofSeconds(5));
		
		By checkElement= By.className("select-all");
		WebElement check= driver.findElement(checkElement);
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println(check.isSelected());
		Thread.sleep(Duration.ofSeconds(5));
		check.click();
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println(check.isSelected());
		Thread.sleep(Duration.ofSeconds(10));
		System.out.println("Successfully done !!!!");
		driver.quit();

	}

}
