package testcase;

import org.openqa.selenium.WebDriver;

import page.ExcelFile;
import page.LoginPage;

public class LoginTestCase {

	
	private LoginPage login;
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public void validLogin() {
		login.login("admin", "admin");
	}
	
	// this entered by me 
//	public void InvalidLogin() {
//		try {
//		login.login("admin1", "admin1");
//		System.out.println("Invalid login passed !!!");
//		
//		}catch(Exception e)
//		{
//			System.out.println("login  failed!!!");
//			}
//		}
}
