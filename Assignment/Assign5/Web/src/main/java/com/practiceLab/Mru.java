package com.practiceLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mru {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/espocrm");
        Thread.sleep(5000);

        // Login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);

        // Open Email module
        driver.findElement(By.cssSelector("[href='#Email']")).click();
        Thread.sleep(5000);

        // Compose Email
        driver.findElement(By.cssSelector("[data-name='composeEmail']")).click();
        Thread.sleep(5000);

        // Email fields
        driver.findElement(By.cssSelector(".input-group > input[autocomplete='espo-to']"))
                .sendKeys("abc@gmail.com");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[autocomplete='espo-cc']"))
                .sendKeys("xyz@gmail.com");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[autocomplete='espo-bcc']"))
                .sendKeys("xyz@gmail.com");
        Thread.sleep(5000);

        // Select parent category (Opportunity)
        driver.findElement(By.cssSelector("div.selectize-control")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("div[data-value='Opportunity']")).click();
        Thread.sleep(5000);

        // Other fields
        driver.findElement(By.cssSelector("input[data-name='parentName']")).sendKeys("abc");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[data-name='selectTemplateName']")).sendKeys("abc");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[data-name='subject']")).sendKeys("xyz");
        Thread.sleep(6000);

        // File upload
        driver.findElement(By.cssSelector("input.file.pull-right"))
                .sendKeys("C:\\Users\\cdac\\Desktop\\mrunali.txt");
        Thread.sleep(5000);

        // Send email
        driver.findElement(By.cssSelector("button[data-name='send']")).click();
        Thread.sleep(5000);

        System.out.println("Form submitted successfully");

        driver.close();
    }
}
