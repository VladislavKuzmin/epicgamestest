package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class LoginTest {
     public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          String email = "test123456789te5t";
          String password = "AOaTUo)iea12";

          driver.get("https://store.epicgames.com/ru/");

          HomePage homePage = new HomePage(driver);
          homePage.pressLoginButton()
                  .pressEpicGamesLoginButton()
                  .typeEmail(email)
                  .typePassword(password)
                  .pressSignInButton();
          driver.quit();
     }

}
