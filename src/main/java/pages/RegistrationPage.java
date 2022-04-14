package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{

    By epicGamesRegisterButtonLocator = By.cssSelector("div[aria-label='Зарегистрироваться с помощью электронной почты']");

    By countryLocator = By.id("country");
    By nameLocator = By.id("name");
    By lastNameLocator = By.id("lastName");
    By displayNameLocator = By.id("displayName");
    By emailLocator = By.id("email");
    By passwordLocator = By.id("password");
    By termOfUseLocator = By.id("tos");

    By submitButtonLocator = By.id("btn-submit");

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public RegistrationPage pressEpicGamesRegisterButton(){
        click(epicGamesRegisterButtonLocator);
        return this;
    }

    public RegistrationPage selectCountry(String country){
        click(countryLocator);
        type(countryLocator, country);
        return this;
    }

    public RegistrationPage typeName(String name){
        type(nameLocator, name);
        return this;
    }

    public RegistrationPage typeLastName(String lastName){
        type(lastNameLocator, lastName);
        return this;
    }

    public RegistrationPage typeDisplayName(String displayName){
        type(displayNameLocator, displayName);
        return this;
    }

    public RegistrationPage typeEmail(String email){
        type(emailLocator, email);
        return this;
    }

    public RegistrationPage typePassword(String password){
        type(passwordLocator, password);
        return this;
    }

    public RegistrationPage pressTermOfUseCheckBox(){
        click(termOfUseLocator);
        return this;
    }


}
