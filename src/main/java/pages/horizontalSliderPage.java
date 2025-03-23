package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class horizontalSliderPage {
    private WebDriver driver;
    private By slider = By.className("sliderContainer");
    private By range = By.id("range");

    public horizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(slider).findElement(By.tagName("input")).click();
    }

    public double getRange(){
        return Double.parseDouble(driver.findElement(range).getText());
    }

    public void checkRange(){
        if(getRange() < 4){
            Actions act = new Actions(driver);
            while (getRange() < 4){
                act.sendKeys(Keys.ARROW_RIGHT).perform();
            }
        }
        else {
            System.out.println("range is not smaller than 4");
        }
    }
}
