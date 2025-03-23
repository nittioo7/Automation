package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertPage {
    private WebDriver driver;
    private By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    private By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");

    public alertPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJSAlert(){
        driver.findElement(jsAlert).click();
    }

    public void clickJSConfirm(){
        driver.findElement(jsConfirm).click();
    }

    public void sendText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void clickJSPrompt(){
        driver.findElement(jsPrompt).click();
    }

    public void acceptAlert(){
//        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    public String alert_text(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
