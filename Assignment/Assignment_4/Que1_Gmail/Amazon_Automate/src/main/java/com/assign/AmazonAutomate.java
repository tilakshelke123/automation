package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	String url = "https://www.amazon.in/ref=nav_logo";

	Thread.sleep(2000);
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println("Amazon Page loaded Successfully !!!");

	Thread.sleep(2000);
	Actions action = new Actions(driver);
	
	By fresh = By.cssSelector("#nav-link-groceries");
	Thread.sleep(2000);
	WebElement freshInput = driver.findElement(fresh);
	Thread.sleep(2000);
    action.moveToElement(freshInput).perform();
	System.out.println("Successfully Hover On Fresh Buttion ! !! !!!");
	
	Thread.sleep(5000);
	
	By freshBtn = By.cssSelector("div.f3-cgi-flyout-section.f3-cgi-flyout-section-stores a  div.f3-cgi-flyout-store-box.f3-cgi-flyout-store-box-left");
	WebElement freshBtnClick = driver.findElement(freshBtn);
	Thread.sleep(2000);
	Action act = action.build();
	freshInput.click();
	Thread.sleep(2000);
	System.out.println("Successfully Click on Fresh Icon ! !! !!!");
	
	Thread.sleep(5000);
	
	By skip = By.cssSelector("div#GLUXProgramSpecificSheetSkipLink a");
	WebElement skipInput = driver.findElement(skip);
	Thread.sleep(2000);
	skipInput.click();
	 Thread.sleep(2000);
	 System.out.println("Successfully Skip btn  ! !! !!!");
	

	
	}

}
