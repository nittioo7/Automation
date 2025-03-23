package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgetPasswordPage {

    private WebDriver driver;
    private By email = By.id("email");
    private By submit = By.id("form_submit");

    public forgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String emailId){
        driver.findElement(email).sendKeys(emailId);
    }

    public void submit(){
        driver.findElement(submit).click();
    }

}
