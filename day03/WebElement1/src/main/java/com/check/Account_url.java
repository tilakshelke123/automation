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
		Thread.sleep(5000);
		
		By locatorUsername = By.id("field-userName");
		WebElement txtUsername = driver.findElement(locatorUsername);
		txtUsername.sendKeys("admin");
		Thread.sleep(2000);
		txtUsername.sendKeys("admin");
		Thread.sleep(2000);
		txtUsername.clear();
		Thread.sleep(2000);
		txtUsername.sendKeys("admin");
		System.out.println("Text Entered in txtUsername is "+txtUsername.getText());
		System.out.println("Text Entered in txtUsername is "+txtUsername.getAttribute("value"));

		By locatorPassword = By.name("password");
		WebElement txtPassword = driver.findElement(locatorPassword);
		txtPassword.sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.className("fa-eye")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("far")).click();
		Thread.sleep(2000);

		By locatorLogin = By.tagName("button");
		WebElement btnLogin = driver.findElement(locatorLogin);
		btnLogin.click();
		
		
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/ul/li[3]/a/span[2]")).click();
		Thread.sleep(5000);
		
		By checkElement= By.className("select-all");
		WebElement check= driver.findElement(checkElement);
		Thread.sleep(5000);
		System.out.println(check.isSelected());
		Thread.sleep(5000);
		check.click();
		Thread.sleep(5000);
		System.out.println(check.isSelected());
		Thread.sleep(5000);
		System.out.println("Successfully done !!!!");
		driver.quit();

	}

}
