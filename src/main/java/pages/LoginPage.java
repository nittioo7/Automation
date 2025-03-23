package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By password = By.id("password");
    private By login = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String pas){
        driver.findElement(password).sendKeys(pas);
    }

    public LoginSuccessPage clickLogin(){
        driver.findElement(login).click();

        return new LoginSuccessPage(driver);
    }

}
