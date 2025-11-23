package com.labPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDataBase {

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

		By credit = By.xpath("//a[@data-name='create']");
		WebElement creditClick = driver.findElement(credit);
		Thread.sleep(5000);
		creditClick.click();
		System.out.println("clicked on Credit Account  button !!!");
		Thread.sleep(5000);
		
		By name = By.xpath("//input[@data-name='name']");
		WebElement nameInput = driver.findElement(name);
		Thread.sleep(5000);
		nameInput.clear();
		nameInput.sendKeys("CCST_DATA");
		System.out.println("Successfully Entered Credit Account Details !!");
		Thread.sleep(5000);
		

		By web = By.xpath("(//input[@class='main-element form-control'])[2]");
		WebElement webInput = driver.findElement(web);
		webInput.clear();
		webInput.sendKeys("https://cdac.in/index.aspx?id=edu_acts_CertCoursesHomePage");
		System.out.println("Entered Website SuccessFully !!!!!!");
		Thread.sleep(5000);

		By gmail = By.xpath("//input[@class='form-control email-address']");
		WebElement gmailInput = driver.findElement(gmail);
		gmailInput.clear();
		gmailInput.sendKeys("cdac-acts@gmail.com");
		System.out.println("Entered gmail SuccessFully !!!!!!");
		Thread.sleep(5000);

	
		By phone = By.xpath("(//div[@class='selectize-input items full has-options has-items'])[1]");
		////html/body/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/span[1]/div/div[1]/div
		Thread.sleep(2000);
		WebElement phoneInput = driver.findElement(phone);
		Thread.sleep(5000);
		phoneInput.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@data-value='Mobile'])[1]")).click();
		Thread.sleep(2000);

		By code = By.xpath("//div[@class='iti__selected-dial-code']");
		WebElement codeInput = driver.findElement(code);
		codeInput.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='iti__selected-dial-code']")).click();
		Thread.sleep(2000);
		By num = By.xpath("//input[@class='form-control phone-number numeric-text no-margin-shifting  ']");
		WebElement numInput = driver.findElement(num);
		Thread.sleep(5000);
		numInput.clear();
		numInput.sendKeys("1234567892");
		System.out.println(" phone number enetered SuccessFully !!!!!!");
		Thread.sleep(5000);

		By street = By.xpath("//textarea[@data-name='billingAddressStreet']");
		WebElement streetInput = driver.findElement(street);
		streetInput.clear();
		streetInput.sendKeys("Innovation Park CDAC Acts");
		Thread.sleep(5000);

		By city = By.xpath("//input[@data-name='billingAddressCity']");
		WebElement cityInput = driver.findElement(city);
		cityInput.clear();
		cityInput.sendKeys("Pune");
		Thread.sleep(5000);

		By state = By.xpath("//input[@data-name='billingAddressState']");
		WebElement stateInput = driver.findElement(state);
		stateInput.clear();
		stateInput.sendKeys("Maharashtra");
		Thread.sleep(5000);

		By postal = By.xpath("//input[@data-name='billingAddressPostalCode']");
		WebElement postalInput = driver.findElement(postal);
		postalInput.clear();
		postalInput.sendKeys("411002");
		Thread.sleep(5000);

		By country = By.xpath("//input[@data-name='billingAddressCountry']");
		WebElement countryInput = driver.findElement(country);
		countryInput.clear();
		countryInput.sendKeys("India");
		Thread.sleep(5000);

		System.out.println("Billing Address Entered SuccessFully !!!!!!");
		Thread.sleep(5000);

		By copyBill = By.xpath("//button[@class='btn btn-default btn-sm action']");
		WebElement copyBillInput = driver.findElement(copyBill);
		copyBillInput.click();
		Thread.sleep(5000);

		System.out.println("Shipping Address Entered SuccessFully !!!!!!");
		Thread.sleep(5000);


//
		
		// desciption 
		By desciption = By.xpath("//textarea[@data-name='description']");
		WebElement desciptionInput = driver.findElement(desciption);
		
		desciptionInput.sendKeys(" Innovation parts Cdac Acts Pashan Pune  411002 ");
		System.out.println("Description added  SuccessFully !!!!!!");
		Thread.sleep(5000);
		
		
		//save buttoon 
		
		By saveButton = By.xpath("//button[@data-action='save']");
		WebElement saveBtInput = driver.findElement(saveButton);
		Thread.sleep(2000);
		saveBtInput.click();
		System.out.println("Save data SuccessFully !!!!!!");
		Thread.sleep(2000);
		
		// compairing Each details .
		
		
	}

}
