package com.lab;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/alerts.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Show Alert']")).click();
		Thread.sleep(2000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text: "+alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Show Input Alert']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Dismiss Message: "+alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//button[text()='Show Input Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("test");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		alertText = driver.switchTo().alert().getText();
		System.out.println("Entered Value: "+alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		
		Thread.sleep(2000);
		driver.quit();

	}
}