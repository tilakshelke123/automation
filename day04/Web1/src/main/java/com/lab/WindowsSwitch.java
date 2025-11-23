
package com.lab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);

		String originalWindow = driver.getWindowHandle(); // single window id 
		Set<String> before = driver.getWindowHandles(); // all list window id 
		System.out.println("Current Window Handle"+originalWindow);
		System.out.println("All Window IDs Before New Window "+before);
		driver.findElement(By.linkText("EspoCRM, Inc.")).click();
		Thread.sleep(5000);

		//Switching Logic
		Set<String> after = driver.getWindowHandles(); // again // all list window id 
		System.out.println("All Window IDs After New Window "+after);
		after.removeAll(before); // delete from "after" - "remove"
		String newHandle = after.iterator().next(); // print 
		System.out.println("Latest Opened Window ID: "+newHandle);
		driver.switchTo().window(newHandle);		
		//Switching Logic End
		
		Thread.sleep(5000);
		System.out.println("New Window Title: "+driver.getTitle());
		driver.findElement(By.xpath("//a[text()='DOWNLOAD']")).click();
		Thread.sleep(5000);
		driver.close();
		
		Thread.sleep(5000);
		driver.switchTo().window(originalWindow); //Mandatory (Exception - no such window: target window already closed)
		driver.switchTo().newWindow(WindowType.WINDOW); //  new window and switched automatically 
		Thread.sleep(5000);
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);
		driver.quit();

	}
}