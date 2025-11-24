package com.assign;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static boolean Check_Element(WebDriver driver, By user) throws NoSuchElementException {
		if (driver.findElements(user).size() > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get(url);

		// user
		By user = By.xpath("//input[@id='username']");
		WebElement userInput = driver.findElement(user);
		Thread.sleep(2000);
		userInput.clear();
		Thread.sleep(2000);
		userInput.sendKeys("student");
		System.out.println("User Entered Successfully !!!!");
		try {
			if (Check_Element(driver, user)) {
				System.out.println("user Element found Successfully !!");

			} else {
				System.out.println("User Element Not Found .!!!!");
			}
		} catch (NoSuchElementException e) {
			System.out.println("user  such Element Not Found ");
		}

// password 
		try {
			By pass = By.xpath("//input[@id='password']");
			WebElement passInput = driver.findElement(pass);
			Thread.sleep(2000);
			passInput.clear();
			Thread.sleep(2000);
			passInput.sendKeys("Password123");
			System.out.println("Entered Password Successfully !!!!");
			if (Check_Element(driver, pass)) {
				System.out.println("password elemeent found Successfully");

			} else {
				System.out.println("password Element Not Found !!!");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Password such Eleement Not Found !!");
		}

		// login

		try {
			By login = By.xpath("//button[@id='submit']");
			WebElement loginClick = driver.findElement(login);
			Thread.sleep(5000);
			loginClick.click();
			System.out.println("Login  Successfully !! !!!!");
			if (Check_Element(driver, login)) {
				System.out.println("login button present  ");

			} else {
				System.out.println("Login Element Not Found !!!");
			}
		} catch (NoSuchElementException e) {
			System.out.println("No Login Elenemt Found !!!");
		}

		Thread.sleep(5000);
		driver.quit();
	}

}
