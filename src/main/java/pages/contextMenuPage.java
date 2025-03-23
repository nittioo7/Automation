package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class contextMenuPage {
    private WebDriver driver;
//    private WebElement box = driver.findElement(By.id("hot-spot"));

    public contextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void contextClick(){
        Actions act = new Actions(driver);
        WebElement box = driver.findElement(By.id("hot-spot"));
        act.moveToElement(box).contextClick().perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
