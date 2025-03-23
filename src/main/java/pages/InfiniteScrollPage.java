package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By scroll = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollTo(int i){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecuter = (JavascriptExecutor)driver;

        while(getNumberOfParagraphPresent() < i){
            jsExecuter.executeScript(script);
        }
    }

    private int getNumberOfParagraphPresent(){
        return driver.findElements(scroll).size();
    }
}
