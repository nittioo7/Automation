package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class modelPage {
    private WebDriver driver;
    private By title = By.cssSelector(".modal-title h3");
    private By body = By.cssSelector(".modal-body p");
    private By close = By.cssSelector(".modal .modal-footer p");

    public modelPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public String body(){
        return driver.findElement(body).getText();
    }

    public void close(){
        driver.findElement(close).click();
    }
}
