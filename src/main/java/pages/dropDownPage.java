package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class dropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");
//    private WebElement toSelect = driver.findElement(dropDown);

    private Select findDropDown(){
        return new Select(driver.findElement(dropDown));
    }

    public dropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectOption(String option){
//        List<String> list = select.getOptions().toString();
        findDropDown().selectByVisibleText(option);
    }

    public void addMultipleAttribute(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, findDropDown());
    }

    public List<String> getText(){
        List<WebElement> element = findDropDown().getAllSelectedOptions();
//        System.out.println(text);
        return element.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
