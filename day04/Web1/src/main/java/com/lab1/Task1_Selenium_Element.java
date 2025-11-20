package com.lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1_Selenium_Element {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		String url = "http://localhost/samples/elements.php";
		driver.get(url);
		Thread.sleep(5000);

		// usernamer
		By user = By.id("username");
		WebElement userput = driver.findElement(user);
		userput.sendKeys("tilakshelke08");

		Thread.sleep(5000);
		// password
		By pass = By.id("password");
		WebElement passput = driver.findElement(pass);
		passput.sendKeys("1234567890");

		Thread.sleep(5000);
		// Gender
		By gender = By.id("male");
		WebElement genderput = driver.findElement(gender);
		genderput.click();
		 System.out.println("male gender  Selected Successfully !!!");
		Thread.sleep(5000);

		// interest sports
		By sports1 = By.id("sports");
		WebElement sportsinput = driver.findElement(sports1);
		 System.out.println("sports Selected Successfully !!!");
		sportsinput.click();

		// interest music
		Thread.sleep(5000);

		By music1 = By.id("music");
		WebElement music1input = driver.findElement(music1);
		music1input.click();
		 System.out.println("Music Selected Successfully !!!");
		Thread.sleep(5000);
		
		
		
		// COUNTRY
		  WebElement choose = driver.findElement(By.id("country"));
		  Select sel = new Select(choose); // dropdown
		  sel.selectByValue("india");
		  Thread.sleep(5000);
		  sel.selectByValue("usa");
		  Thread.sleep(5000);
		  sel.selectByValue("uk");
		  Thread.sleep(5000);
		  
		  System.out.println("Country Selected Successfully !!!");

	}

}
