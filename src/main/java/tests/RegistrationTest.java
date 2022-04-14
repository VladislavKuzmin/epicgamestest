package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class RegistrationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.epicgames.com/ru/");
        HomePage homePage = new HomePage(driver);

        homePage.pressLoginButton()
                .pressRegisterButton()
                .pressEpicGamesRegisterButton()
                .selectCountry("Ukraine")
                .typeName("test")
                .typeLastName("test")
                .typeDisplayName("test123456789te5t")
                .typeEmail("test123456789te5t@mail.ru")
                .typePassword("AOaTUo)iea12")
                .pressTermOfUseCheckBox();
    }
}
