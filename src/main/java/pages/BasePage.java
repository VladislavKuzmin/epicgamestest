package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    protected void waitVisibility(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void click(By locator){
        waitVisibility(locator);
        findElement(locator).click();
    }

    protected void type(By locator, String text){
        waitVisibility(locator);
        findElement(locator).sendKeys(text);
    }

//    protected void clickCheckBox(By locator){
//        waitVisibility(locator);
//        if(!findElement(locator).isSelected())
//            click(locator);
//    }

//    protected void select(By locator, String text){
//        Select select = new Select(findElement(locator));
//        select.selectByVisibleText(text);
//        }
}
