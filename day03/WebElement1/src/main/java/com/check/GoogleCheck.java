package com.check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCheck {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?zx=1763536702921&no_sw_cr=1");
		Thread.sleep(5000);
		// condition

		By youtube = By.className("CgwTDb");
		WebElement checkDisplay = driver.findElement(youtube);
		Thread.sleep(5000);
		System.out.println(checkDisplay.isDisplayed());
		Thread.sleep(5000);
		checkDisplay.click();
		Thread.sleep(5000);
		System.out.println(checkDisplay.isDisplayed());
	}

}
