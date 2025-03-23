package utlis;

import org.openqa.selenium.WebDriver;

public class windowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public windowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void refresh(){
        navigate.refresh();
    }

    public void forward(){
        navigate.forward();
    }

    public void getURL(String url){
        navigate.to(url);
    }

    public void manageTabs(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("numbers of window - " + windows.size());
        System.out.println("window handle");
        windows.forEach(System.out::println);
        for(String window : windows){
            System.out.println("Switch to window - " +window);
            driver.switchTo().window(window);
            System.out.println("current window - " + driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
