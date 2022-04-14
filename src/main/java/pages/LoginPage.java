package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //By loginButtonLocator = By.xpath("//li[@data-component='SignIn']");
    By epicGamesLoginButtonLocator = By.id("login-with-epic");
    By emailLocator = By.id("email");
    By passwordLocator = By.id("password");
    By signInButtonLocator = By.id("sign-in");
    By registerLocator = By.id("to-register");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage pressEpicGamesLoginButton(){
        click(epicGamesLoginButtonLocator);
        return this;
    }

    public LoginPage typeEmail(String email){
        type(emailLocator, email);
        return this;
    }

    public LoginPage typePassword(String password){
        type(passwordLocator, password);
        return this;
    }

    public HomePage pressSignInButton(){
        click(signInButtonLocator);
        return new HomePage(driver);
    }

    public RegistrationPage pressRegisterButton(){
        click(registerLocator);
        return new RegistrationPage(driver);
    }
}
