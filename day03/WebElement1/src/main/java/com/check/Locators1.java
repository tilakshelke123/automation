package com.check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String url = "http://localhost/espocrm/";
		driver.get(url);
		Thread.sleep(5000);

		By link = By.linkText("EspoCRM, Inc.");
		WebElement linkcheck = driver.findElement(link);
		linkcheck.click();
		linkcheck.getText();
		System.out.println("Successfully click on  Link Crm !!!");

	}

}
