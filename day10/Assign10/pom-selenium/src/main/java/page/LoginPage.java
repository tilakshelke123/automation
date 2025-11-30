package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	

	

	private String txtUsername = "//input[@id='field-userName']";
    private String txtpasswordField = "//input[@id='field-password']";
    private String btnloginButton = "//button[@id='btn-login']";
 //   private String imgLogo = "//img[@src='client/img/logo-light.svg']";
    private String homelogo = " //li[@class='not-in-more tab active']";
 
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

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

    public void login(String username, String password) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(txtUsername)));
    	//  what ever you can check here  webelement is present or not this can be alreday check by 
        //Base page get element() method !!!!
    	enterUsername(username);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(txtpasswordField)));
        enterPassword(password);
        clickLogin();
        gotoDashboard();
        
        
//        enterUsername(username);
//        enterPassword(password);
//        clickLogin();
//        gotoDashboard();
    }
}
