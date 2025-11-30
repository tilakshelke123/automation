package testcase;

import org.openqa.selenium.WebDriver;

import page.LoginPage;

public class LoginTestCase {

	private LoginPage login;
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public void validLogin() {
		login.login("admin", "admin");
	}

	public void ValidcreateAccount() {
		login.CreateAccount();
		
	}
	
	public void Validlogout() {
		login.logout();
		
	}


	
	// this entered by me 
	
//	public void InvalidLogin() {
//		try {
//		login.login("admin1", "admin1");
//		System.out.println("failed !!!");
//		
//		}catch(Exception e)
//		{
//			System.out.println(" passed!!!");
//			}
//		}
//	
}
