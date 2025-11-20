
package com.lab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectJava{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/select.php");
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement el = driver.findElement(By.id("country"));
		Select country = new Select(el); // "select" is  class 
		System.out.println("###Multiple "+country.isMultiple()); //  if single select it gives you return  false 
		Thread.sleep(Duration.ofSeconds(2));
		
	//	country.selectByIndex(0); //  it gives errror  why bcoz its already take default value  
		Thread.sleep(Duration.ofSeconds(1));
		country.selectByValue("IN");
		Thread.sleep(Duration.ofSeconds(1));
		country.selectByVisibleText("France");
		Thread.sleep(Duration.ofSeconds(1));
		country.selectByContainsVisibleText("Ger");
		
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();

	}
}