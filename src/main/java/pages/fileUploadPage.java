package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUploadPage {
    private WebDriver driver;
    private By uploadFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By fileSubmitted = By.id("uploaded-files");

    public fileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param absolutePath - send Absolute Path
     */
    public void clickUploadFile(String absolutePath){
        driver.findElement(uploadFile).sendKeys(absolutePath);
    }

    public void clickSubmitButton(){
        driver.findElement(uploadButton).click();
    }

    public String fileSubmitted(){
        return driver.findElement(fileSubmitted).getText();
    }
}
