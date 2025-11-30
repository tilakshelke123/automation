package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	// login
	private String txtUsername = "//input[@id='field-userName']";
	private String txtpasswordField = "//input[@id='field-password']";
	private String btnloginButton = "//button[@id='btn-login']";
	// private String imgLogo = "//img[@src='client/img/logo-light.svg']";
	private String homelogo = " //li[@class='not-in-more tab active']";

	// logout
	private String menuclick = "//a[@id='nav-menu-dropdown']";
	private String logClick = "//a[@data-name='logout']";

	// CreateAccount
	private String acct = "//span[text()='Accounts']";
	private String crAccount = "//span[text()='Create Account']";
	private String name = "//input[@data-name=\"name\"]";
	private String web = "//input[@data-name=\"website\"]";
	private String email = "//input[@class='form-control email-address']";
	private String phone = "(//div[text()='Office'])[1]";
	private String smob = "//div[text()='Mobile']";
	private String cCode = "//div[@class='iti__selected-dial-code']";
	private String sCode = "//li[@data-dial-code='91']";
	private String call = "//input[@class='form-control phone-number numeric-text no-margin-shifting  ']";
	private String street = "(//textarea[@placeholder=\"Street\"])[1]";
	private String city = "(//input[@placeholder=\"City\"])[1]";
	private String state = "(//input[@placeholder=\"State\"])[1]";
	private String postal = "(//input[@placeholder=\"Postal Code\"])[1]";
	private String country = "(//input[@placeholder=\"Country\"])[1]";
	private String copyBill = "//button[@data-action=\"copyFromBilling\"]";

	// type
	// industry
	private String desc = "//textarea[@data-name=\"description\"]";
	private String save ="//button[@data-action=\"save\"]";

	
	//------------------------------------------------
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// login
	private void enterUsername(String username) {
		type(txtUsername, username);
	}

	private void enterPassword(String password) {
		type(txtpasswordField, password);
	}

	private void clickLogin() {
		click(btnloginButton);
	}

	private void gotoDashboard() {
		click(homelogo);
	}

	// logout
	private void profileClick() {
		click(menuclick);
	}

	private void LogoutClick() {
		click(logClick);
	}

	// Account create
	private void AccountClick() {
		click(acct);
	}
	private void Click_CreateAccount() {
		click(crAccount);
	}
	private void Click_Name(String Aname) {
		type(name,Aname);
	}
	private void Click_Web(String Website) {
		type(web,Website);
	}
	private void Click_mail(String Mail) {
		type(email,Mail);
	}
	private void  Click_phone() {
		click(phone);
	}
	private void Choosephone() {
		click(smob);
	}
	private void Click_Code() {
		click(cCode);
	}
	private void Select_Code() {
		click(sCode);
	}
	private void click_call(String Number) {
		type(call,Number);
	}
	private void click_street(String Street1) {
		type(street,Street1);
	}
	
	private void click_city(String City1) {
		type(city,City1);
	}
	
	private void click_state(String State1) {
		type(state,State1);
	}
	
	private void click_postal(String Postal1) {
		type(postal,Postal1);
	}
	
	private void click_country(String Country1) {
		type(country,Country1);
	}
	private void click_copyBil() {
		click(copyBill);
	}
	private void click_Desc(String Desc1) {
		type(desc,Desc1);
	}
	private void Click_save() {
		click(save);
	}
	
	

	// login method
	public void login(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(txtUsername)));
		// what ever you can check here webelement is present or not this can be alreday
		// check by
		// Base page get element() method !!!!
		enterUsername(username);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(txtpasswordField)));
		enterPassword(password);
		clickLogin();
		System.out.println("Successfully Login ");
		gotoDashboard();

	}

	// logout method
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		profileClick();
		LogoutClick();
		System.out.println("Successfully Logout");
	}

	// Create Account method
	public void CreateAccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		AccountClick();
		Click_CreateAccount();
		Click_Name("Tilak");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(acct)));
		Click_Web("www.Flipart.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(web)));
		Click_mail("indiancricketTeam@gamil.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(email)));
		Click_phone();
		Choosephone();
		Click_Code();
		Select_Code();
		click_call("3334445556");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(call)));
		click_street("Akurdi Rilway Station ,DY Patil Street");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(street)));
		click_city("Pune");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(city)));
		click_state("Maharashtra");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(state)));
		click_postal("411057");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(postal)));
		click_country("India");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(country)));
		click_copyBil();
		click_Desc("Dy Patil International College Of University , near by Akurdi Railway Station Akurdi , Pimpri-Chinchwad , Pune- 411001");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(desc)));
		Click_save();
		System.out.println(" Account Created Successfully !!!");
		
	}

}
