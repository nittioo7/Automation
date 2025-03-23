package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFramePage {
    private WebDriver driver;
    private By nested = By.linkText("Nested Frames");
    private By bottom = By.cssSelector("frameset > frame[name='frame-bottom']");
    private By middle = By.cssSelector("frame[name=\"frame-middle\"]");
    private By left = By.cssSelector("frame[name=\"frame-left\"]");
    private By right = By.cssSelector("frame[name=\"frame-right\"]");
//    private WebElement midEle = driver.findElement(By.cssSelector("frame[name=\"frame-middle\"]"));

    public iFramePage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToTop(){
        driver.switchTo().frame("frame-top");
    }

    public String bottomFrame(){
        driver.switchTo().frame("frame-bottom");
        String text = getFrameText();
        exitFrame();
        return text;
    }

    public String switchToMiddleFrame(){
//        WebElement midEle = driver.findElement(By.cssSelector("frame[name=\"frame-middle\"]"));
        switchToTop();
        driver.switchTo().frame("frame-middle");
        String text =getFrameText();
        exitFrame();
        return text;
    }

    public String switchToLeftFrame(){
        switchToTop();
        driver.switchTo().frame("frame-left");
        String text = getFrameText();
        exitFrame();
        return text;
    }

    public String switchToRightFrame(){
        switchToTop();
        driver.switchTo().frame("frame-right");
        String text = getFrameText();
        exitFrame();
        return text;
    }

    public void exitFrame(){
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public String getFrameText(){
        return driver.findElement(By.cssSelector("body")).getText();
    }

    public void clickNestedFrame(){
        driver.findElement(nested).click();
    }

}
