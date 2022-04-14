package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By loginButtonLocator = By.cssSelector("li[data-component='SignIn']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public LoginPage pressLoginButton(){
        click(loginButtonLocator);
        return new LoginPage(driver);
    }
}
