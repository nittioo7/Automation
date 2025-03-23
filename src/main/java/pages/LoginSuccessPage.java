package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccessPage {
    private WebDriver driver;
    private By msg = By.id("flash");

    public LoginSuccessPage(WebDriver driver){
        this.driver = driver;
    }

    public String successful(){
        return driver.findElement(msg).getText();
    }
}
