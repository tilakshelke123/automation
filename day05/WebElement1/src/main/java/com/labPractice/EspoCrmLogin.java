package com.labPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EspoCrmLogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url = "http://localhost/espocrm/";
		driver.get(url);
		Thread.sleep(2000);
		System.out.println("Espocrm load Successfully !!!");

		By user = By.xpath("//input[@id='field-userName']");
		WebElement userput = driver.findElement(user);
		userput.clear();
		Thread.sleep(2000);
		userput.sendKeys("admin");
		Thread.sleep(2000);

		By pass = By.xpath("//input[@id='field-password']");
		WebElement passput = driver.findElement(pass);
		passput.clear();
		Thread.sleep(2000);
		passput.sendKeys("admin");
		Thread.sleep(2000);

		By login = By.xpath("//button[@id=\"btn-login\"]");
		WebElement loginclick = driver.findElement(login);

		loginclick.click();
		Thread.sleep(2000);
		System.out.println("Login Account  Successfully !!!");

		By account = By.xpath("(//a[@class='nav-link'])[2]");
		WebElement accClick = driver.findElement(account);
		Thread.sleep(2000);
		accClick.click();
		System.out.println("clicked on Account !!!");
		Thread.sleep(2000);

		By test = By.xpath("//a[@class='link'] ");
		WebElement testClick = driver.findElement(test);
		Thread.sleep(2000);
		testClick.click();
		System.out.println("clicked on test Account !!!");
		Thread.sleep(2000);

		By edit = By.xpath(
				"// div[@class='btn-group actions-btn-group']/descendant::button[@class='btn action btn-xs-wide detail-action-item btn-default radius-left'] ");
		WebElement editClick = driver.findElement(edit);
		Thread.sleep(2000);
		editClick.click();
		System.out.println("clicked on edit button !!!");
		Thread.sleep(2000);

		By web = By.xpath("(//input[@class='main-element form-control'])[2]");
		WebElement webInput = driver.findElement(web);
		webInput.clear();
		webInput.sendKeys("www.google.com");
		System.out.println("Entered Website SuccessFully !!!!!!");
		Thread.sleep(2000);

		By gmail = By.xpath("//input[@class='form-control email-address']");
		WebElement gmailInput = driver.findElement(gmail);
		gmailInput.clear();
		gmailInput.sendKeys("ts123@gmail.com");
		System.out.println("Entered gmail SuccessFully !!!!!!");
		Thread.sleep(2000);

		// By phone = By.xpath("(//div[@class='selectize-control form-control
		// radius-left single
		// plugin-espo_select']/descendant::div[@class='selectize-input items
		// has-options full has-items'])[1]");
		By phone = By.xpath(
				"//html/body/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/span[1]/div/div[1]/div");
		WebElement phoneInput = driver.findElement(phone);
		/// html/body/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/span[1]/div/div[1]/div
		Thread.sleep(2000);
		phoneInput.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@data-value='Mobile'])[1]")).click();
		Thread.sleep(2000);

		By code = By.xpath("//div[@class='iti__selected-dial-code']");
		WebElement codeInput = driver.findElement(code);
		codeInput.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-country-code='in']")).click();
		Thread.sleep(2000);
		By num = By.xpath("//input[@class='form-control phone-number numeric-text no-margin-shifting  ']");
		WebElement numInput = driver.findElement(num);
		Thread.sleep(2000);
		numInput.clear();
		numInput.sendKeys("7776980384");
		System.out.println(" phone number enetered SuccessFully !!!!!!");
		Thread.sleep(2000);

		By street = By.xpath("//textarea[@data-name='billingAddressStreet']");
		WebElement streetInput = driver.findElement(street);
		streetInput.clear();
		streetInput.sendKeys("Innovation Park CDAC Acts");
		Thread.sleep(2000);

		By city = By.xpath("//input[@data-name='billingAddressCity']");
		WebElement cityInput = driver.findElement(city);
		cityInput.clear();
		cityInput.sendKeys("Pune");
		Thread.sleep(2000);

		By state = By.xpath("//input[@data-name='billingAddressState']");
		WebElement stateInput = driver.findElement(state);
		stateInput.clear();
		stateInput.sendKeys("Maharashtra");
		Thread.sleep(2000);

		By postal = By.xpath("//input[@data-name='billingAddressPostalCode']");
		WebElement postalInput = driver.findElement(postal);
		postalInput.clear();
		postalInput.sendKeys("411002");
		Thread.sleep(2000);

		By country = By.xpath("//input[@data-name='billingAddressCountry']");
		WebElement countryInput = driver.findElement(country);
		countryInput.clear();
		countryInput.sendKeys("India");
		Thread.sleep(2000);

		System.out.println("Billing Address Entered SuccessFully !!!!!!");
		Thread.sleep(2000);

		By copyBill = By.xpath("//button[@class='btn btn-default btn-sm action']");
		WebElement copyBillInput = driver.findElement(copyBill);
		Thread.sleep(2000);
		copyBillInput.click();
		Thread.sleep(2000);

		System.out.println("Shipping Address Entered SuccessFully !!!!!!");
		Thread.sleep(2000);

//  select SECTION 
//		By detailsType = By.xpath("//span[text()='Type']/parent::label/following-sibling::div/descendant::div[2]");
//		//By detailsType = By.xpath("//*[@id=\"account-detail-304\"]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div[1]");
//		WebElement detailsInput = driver.findElement(detailsType);
//		Thread.sleep(2000);

//		Select details = new Select(detailsInput);
//		Thread.sleep(2000);
//		details.selectByIndex(3);
//		System.out.println(" Details selected  SuccessFully !!!!!!");
//		Thread.sleep(2000);
//
//		By industry = By.xpath("(//div[@class='selectize-input items has-options full has-items'])[2]");
//		WebElement industryInput = driver.findElement(industry);
//
//		Select industrySelect = new Select(industryInput);
//		industrySelect.selectByIndex(7);
//		System.out.println("Industry Selected  SuccessFully !!!!!!");
//		Thread.sleep(2000);
		//

//	// by  dropdown 
		// By detailsType = By.xpath("(//div[@class='selectize-input items has-options
		// full has-items'])[1]");
		// By detailsType =
		// By.xpath("//span[text()='Type']/parent::label/following-sibling::div/descendant::div[2]']");

		WebElement abcd = driver.findElement(By.xpath("//span[text()='Type']/parent::label/following-sibling::div/descendant::div[2]"));
		// Thread.sleep(2000);
		// WebElement detailsInput = driver.findElement(detailsType);
		abcd.click();
		Thread.sleep(2000);
		// detailsInput.click();
//	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Partner']")).click();
		System.out.println(" Details selected  SuccessFully !!!!!!");
		System.out.println("Details not  Selected  SuccessFully !!!!!!");
		Thread.sleep(2000);

		By industry = By.xpath("(//div[@data-name='industry'])[2]/descendant::div[2]");
		WebElement industryInput = driver.findElement(industry);
		industryInput.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='Software']")).click();
		System.out.println("Industry Selected  SuccessFully !!!!!!");
		System.out.println("Industry Not Selected  SuccessFully !!!!!!");
		Thread.sleep(2000);
//

		// desciption
		By desciption = By.xpath("//textarea[@data-name='description']");
		WebElement desciptionInput = driver.findElement(desciption);

		desciptionInput.sendKeys(" Innovation parts Cdac Acts Pashan Pune  411002 ");
		System.out.println("Description added  SuccessFully !!!!!!");
		Thread.sleep(2000);

		// save buttoon

		By saveButton = By.xpath("//button[@class='btn action btn-xs-wide edit-action-item btn-primary radius-left']");
		WebElement saveBtInput = driver.findElement(saveButton);
		saveBtInput.click();
		System.out.println("Save data SuccessFully !!!!!!");
		Thread.sleep(2000);

		// compairing Each details .

	}

}
