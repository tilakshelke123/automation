package com.labPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspoCrmLogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url = "http://localhost/espocrm/";
		driver.get(url);
		Thread.sleep(5000);
		System.out.println("Espocrm load Successfully !!!");

		By user = By.xpath("//input[@id='field-userName']");
		WebElement userput = driver.findElement(user);
		userput.clear();
		Thread.sleep(2000);
		userput.sendKeys("admin");
		Thread.sleep(5000);

		By pass = By.xpath("//input[@id='field-password']");
		WebElement passput = driver.findElement(pass);
		passput.clear();
		Thread.sleep(2000);
		passput.sendKeys("admin");
		Thread.sleep(5000);

		By login = By.xpath("//button[@id=\"btn-login\"]");
		WebElement loginclick = driver.findElement(login);

		loginclick.click();
		Thread.sleep(5000);
		System.out.println("Login Account  Successfully !!!");

		By account = By.xpath("(//a[@class='nav-link'])[2]");
		WebElement accClick = driver.findElement(account);
		Thread.sleep(5000);
		accClick.click();
		System.out.println("clicked on Account !!!");
		Thread.sleep(5000);

		By test = By.xpath("//a[@class='link'] ");
		WebElement testClick = driver.findElement(test);
		Thread.sleep(5000);
		testClick.click();
		System.out.println("clicked on test Account !!!");
		Thread.sleep(5000);
         
		
		By edit = By.xpath("// div[@class='btn-group actions-btn-group']/descendant::button[@class='btn action btn-xs-wide detail-action-item btn-default radius-left'] ");
		WebElement editClick = driver.findElement(edit);
		Thread.sleep(5000);
		editClick.click();
		System.out.println("clicked on edit button !!!");
		Thread.sleep(5000);
		
		By web = By.xpath("(//input[@class='main-element form-control'])[2]");
		WebElement webInput = driver.findElement(web);
		webInput.clear();
		webInput.sendKeys("www.google.com");
		System.out.println("Entered Website SuccessFully !!!!!!");
		Thread.sleep(5000);
		
		By gmail = By.xpath("//input[@class='form-control email-address']");
		WebElement gmailInput = driver.findElement(gmail);
		gmailInput.clear();
		gmailInput.sendKeys("ts123@gmail.com");
		System.out.println("Entered gmail SuccessFully !!!!!!");
		Thread.sleep(5000);
		
	}

}
