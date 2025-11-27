package com.practiceLab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspoAutomateGmail {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://localhost/espocrm/";

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Succssfully loaded Espocrm !!!");
		Thread.sleep(5000);

		By user = By.cssSelector("input#field-userName");
		WebElement userInput = driver.findElement(user);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		userInput.clear();
		userInput.sendKeys("admin");
		System.out.println("User Entered Succssfully  !!!");

		Thread.sleep(2000);

		By pass = By.cssSelector("input#field-password");
		WebElement passInput = driver.findElement(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		passInput.clear();
		passInput.sendKeys("admin");
		System.out.println("password Entered Succssfully  !!!");

		Thread.sleep(2000);

		By login = By.cssSelector("button#btn-login");
		WebElement loginInput = driver.findElement(login);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		loginInput.click();
		System.out.println("Login  Succssfully  !!!");

		Thread.sleep(2000);

		By email = By.cssSelector("[href='#Email']");
		WebElement emailInput = driver.findElement(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		emailInput.click();
		System.out.println("susccessfully click on email nbutton  !!!");

		Thread.sleep(2000);
		
		By compose = By.cssSelector("[data-name='composeEmail']");
		WebElement composeInput = driver.findElement(compose);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		composeInput.click();
		System.out.println("Succssfully click on compose button !!!");
		Thread.sleep(4000);

		By toEmail = By.cssSelector("div.input-group > input[autocomplete=\"espo-to\"]");
		WebElement toEmailInput = driver.findElement(toEmail);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		toEmailInput.clear();
		toEmailInput.sendKeys("ts@gmail.com");
		System.out.println("toemail Entered Succssfully  !!!");

		Thread.sleep(4000);

		By cc = By.cssSelector("div.input-group > input[autocomplete=\"espo-cc\"]");
		WebElement ccInput = driver.findElement(cc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		ccInput.clear();
		ccInput.sendKeys("ts1@gmail.com");
		System.out.println(" cc Entered Succssfully  !!!");
		Thread.sleep(4000);

		By bcc = By.cssSelector("div.input-group > input[autocomplete='espo-bcc']");
		WebElement bccInput = driver.findElement(bcc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		bccInput.clear();
		bccInput.sendKeys("ts12@gmail.com");
		System.out.println("bcc Entered Succssfully  !!!");

		Thread.sleep(4000);

		By pAccount = By.cssSelector("div.selectize-input");
		WebElement pAccounInput = driver.findElement(pAccount);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		pAccounInput.click();
		System.out.println("parent account click uccssfully  !!!");
		Thread.sleep(4000);

		By selectPAccount = By.cssSelector("div.selectize-dropdown-content > div[data-value='Contact']");
		WebElement selectPAccountInput = driver.findElement(selectPAccount);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		selectPAccountInput.click();

		Thread.sleep(4000);

//		By selectP = By.cssSelector("button[fdprocessedid=\"jcizh7\"]");
//		WebElement selectPInput = driver.findElement(selectP);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		selectPInput.click();
//
//		Thread.sleep(2000);
//		By text = By.cssSelector("a[href=\"#Account/view/6922134e23c25fbe8\"]");
//		WebElement textInput = driver.findElement(text);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		textInput.click();

//		Thread.sleep(4000);
//
//		By temPlate= By.cssSelector("span.input-group-btn > button[fdprocessedid=\"e0lbpo\"]");
//		WebElement temPlatePInput = driver.findElement(temPlate);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		temPlatePInput.click();

		//Thread.sleep(4000);

		By sub = By.cssSelector("input[autocomplete=\"espo-subject\"]");
		WebElement subInput = driver.findElement(sub);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		subInput.clear();
		subInput.sendKeys("EspoCrm Gmail Automate");

		Thread.sleep(4000);

		By body = By.cssSelector("div[class=\"note-editable\"]");
		WebElement bodyInput = driver.findElement(body);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		bodyInput.clear();
		bodyInput.sendKeys(
				"We can automate the website of EspoCRM . This is Customer Relatioship Management Tools That can hekp to store the data in digitally format !! ");

		Thread.sleep(4000);

		By attach = By.cssSelector("span.btn.btn-default.btn-icon");
		WebElement attachInput = driver.findElement(attach);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		attachInput.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Telegram_Tilak\\OneDrive\\Desktop\\newone/one.txt");

		Thread.sleep(4000);

		By htmllButton = By.cssSelector("input[data-name=\"isHtml\"]");
		WebElement htmllButtonInput = driver.findElement(htmllButton);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		htmllButtonInput.click();

		Thread.sleep(4000);

		By send = By.cssSelector("button[data-name=\"send\"]");
		WebElement sendInput = driver.findElement(send);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		sendInput.click();
		System.out.println("save Gmail data Successfullly !!!!");
		Thread.sleep(2000);
		
		System.out.println("");
	}

}
