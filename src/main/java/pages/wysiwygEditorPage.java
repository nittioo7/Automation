package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wysiwygEditorPage {
    private WebDriver driver;
    private By close = By.cssSelector(".tox-notifications-container button");
    private By textArea = By.cssSelector("#tinymce p");
    private By button = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");

    public wysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void closeAlert(){
        driver.findElement(close).click();
    }

    private void switchToIFrame(){
        driver.switchTo().frame("tinymce");
    }

    public void clearText(){
        switchToIFrame();
        driver.findElement(textArea).clear();
        switchToMain();
    }

    public void setText(String text){
        switchToIFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMain();
    }

    public void clickButton(){
        driver.findElement(button).click();
    }

    private void switchToMain(){
        driver.switchTo().parentFrame();
    }
}
