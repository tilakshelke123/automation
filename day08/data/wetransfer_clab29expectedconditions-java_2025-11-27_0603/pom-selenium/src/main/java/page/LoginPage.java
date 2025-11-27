package page;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	private String txtUsername = "//input[@id='field-userName']";
    private String txtpasswordField = "//input[@id='field-password']";
    private String btnloginButton = "//button[@id='btn-login']";
    private String imgLogo = "//img[@src='client/img/logo-light.svg']";
    
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
        click(imgLogo);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        gotoDashboard();
    }
}
