package com.web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new  ChromeDriver();
	 
    Thread.sleep(5000);
    System.out.println("after 5 sec !!!");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
// driver.get("https://bankofindia.bank.in/");
	  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11751203325900940110%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062090%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
//	 driver.manage().window().maximize();
	  Thread.sleep(5000);
	// WebElement text =
			 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Tilak");
	// text.sendKeys("Komal");
	 
	 
	 
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.id("ap_email")).sendKeys("+917776980384");
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.id("ap_password")).sendKeys("Tilak@123");
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.id("signInSubmit")).click();
//	  System.out.println(" aMAZON lOAD sUCCESSFULLY !!!");
//	}
	
}
}
