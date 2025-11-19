package com.check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver = new ChromeDriver();
		
	String url = "http://localhost/espocrm/";
	driver.get(url);
	Thread.sleep(5000);
	

	}

}
