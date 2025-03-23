package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class example1Page {
    private WebDriver driver;
    private By start = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By text = By.id("finish");

    public example1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(start).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        //Explicit wait -  it will wait until the expected condition or time provided
    }

    public String getText(){
        return driver.findElement(text).getText();
    }
}
