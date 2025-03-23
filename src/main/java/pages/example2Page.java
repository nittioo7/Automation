package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class example2Page {
    private WebDriver driver;
    private By start = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By text = By.id("finish");

    public example2Page(WebDriver driver){
        this.driver = driver;
    }

    public void cliclStart(){
        driver.findElement(start).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(text));
    }

    public String getText(){
        return driver.findElement(text).getText();
    }
}
