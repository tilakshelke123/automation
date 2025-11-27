package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAutomate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	String url = "https://accounts.google.com/v3/signin/accountchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-819266794%3A1764079455228471&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARESoU2lGH96MESkZWEjn8_t5Y2AvsSIVAShed11oeytkd7tunDeEBG6xwnLYeTXjfO4DFdQ-zWM2w&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	Thread.sleep(2000);
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println("Google Gmail Page loaded Successfully !!!");

	By mail = By.cssSelector(".whsOnd.zHQkBf");
	WebElement mailInput = driver.findElement(mail);
	mailInput.sendKeys("tilakshelke123456@gmail.com");
	Thread.sleep(2000);
	
	
//	By next = By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ div +div +div");
	//WebElement nextInput = driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ span"));
	By next = By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ span");
	WebElement nextInput = driver.findElement(next);
	
	//	Thread.sleep(2000);
	nextInput.click();
	Thread.sleep(2000);
	System.out.println("Successfully Click On Next Button !! !!!");
	}

}
