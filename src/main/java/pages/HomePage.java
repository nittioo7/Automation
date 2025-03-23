package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By auth = By.linkText("Basic Auth");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public dropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new dropDownPage(driver);
    }

    public forgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
        return new forgetPasswordPage(driver);
    }

    public hoverPage clickHoverPage(){
        clickLink("Hovers");
        return new hoverPage(driver);
    }

    public keyPressPage clickKeysPage(){
        clickLink("Key Presses");
        return new keyPressPage(driver);
    }

    public horizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new horizontalSliderPage(driver);
    }

    public alertPage clickAlert(){
        clickLink("JavaScript Alerts");
        return new alertPage(driver);
    }

    public fileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new fileUploadPage(driver);
    }

    public modelPage clickEntryAd(){
        clickLink("Entry Ad");
        return new modelPage(driver);
    }

    public contextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new contextMenuPage(driver);
    }

    public wysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new wysiwygEditorPage(driver);
    }

    public iFramePage clickIFrame(){
        clickLink("Frames");
        return new iFramePage(driver);
    }

    public dynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new dynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public void clickLink(String text){
        driver.findElement(By.linkText(text)).click();
    }
}
