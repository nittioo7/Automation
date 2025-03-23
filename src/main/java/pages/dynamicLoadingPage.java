package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.cssSelector("#content > div > a:nth-child(5)");
    private By example2 = By.cssSelector("#content > div > a:nth-child(8)");

    public dynamicLoadingPage(WebDriver driver){
        this.driver = driver;
        // Implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Anytime the webDrive will pull this website until 10 seconds or until it will find the element,
        // If it will find the element it will interact with the element or wait it 10 seconds,
        // After 10 seconds if it will not find the element than it will throw noSuchElementException.

    }

    public void newTab(){
        Actions act = new Actions(driver);
        act.keyDown(driver.findElement(example1),Keys.CONTROL).perform();

    }

    public example1Page click1(){
        driver.findElement(example1).click();
        return new example1Page(driver);
    }

    public example2Page click2(){
        driver.findElement(example2).click();
        return new example2Page(driver);
    }
}
