package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class keyPressPage {
    private WebDriver driver;
    private By input =  By.id("target");
    private By result = By.id("result");

    public keyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeys(String text){
        driver.findElement(input).sendKeys(text);
    }

//    public void sendKeys(char t){
//        driver.findElement(input).sendKeys(t);
//    }

    public void enterPie(){
        sendKeys("π");
        sendKeys("\u03C0");
        Actions act = new Actions(driver);
        act.keyDown(Keys.ALT);
        act.sendKeys("227");
        act.keyUp(Keys.ALT);
//        sendKeys(Keys.chord(Keys.ALT,Keys.NUMPAD2,Keys.NUMPAD2,Keys.NUMPAD7) + "3.14");
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
