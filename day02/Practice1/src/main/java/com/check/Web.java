package com.check;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class Web {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
	// 	driver.get("https://www.flipkart.com/");
		// driver.get(url);
		driver.navigate().to(url);
		Thread.sleep(5000);
		
		driver.get("https://iacsd.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		System.out.println(" url loaded!!!");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		System.out.println("full screen loaded successfully!!");
		Thread.sleep(5000);
		
		driver.manage().window().getPosition();
		System.out.println("got current position !!");
		Thread.sleep(5000);
		
		driver.manage().window().getSize();
		System.out.println("got current size !!");
		Thread.sleep(5000);
		
		driver.manage().window().setPosition(new Point(20, 30));
		System.out.println("point set   !!");
		Thread.sleep(5000);
		System.out.println("update position got  !!");
		driver.manage().window().getPosition();
		Thread.sleep(5000);
		
		driver.manage().window().setSize(new Dimension(200, 300));
		System.out.println("dimsension set  !!");
		driver.manage().window().getSize();
		System.out.println("update dimsension got  !!");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println(" Wait for 5 Second");
		System.out.println("websites : "+ driver.getCurrentUrl());
		System.out.println(" you got websites");
		Thread.sleep(5000);
		
		System.out.println(" title "+driver.getTitle());
		Thread.sleep(5000);
		
		System.out.println(" you got title");
		Thread.sleep(5000);
		
		System.out.println(" get page source  "+driver.getPageSource());
		System.out.println(" you got page source ");
		
		// log type 
		 Set<String> logTypes = driver.manage().logs().getAvailableLogTypes();
         System.out.println("Available log types: " + logTypes);
         
         Thread.sleep(5000);
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER); 
		
		for (LogEntry logEntry : logEntries) {
		    System.out.println("Log Level: " + logEntry.getLevel() + ", Message: " + logEntry.getMessage());
		}
		
		Thread.sleep(5000);
		driver.close();
		
		
		System.out.println("Broswer closed Successfully !!!!");
		
		
		
		
		
	}

}
