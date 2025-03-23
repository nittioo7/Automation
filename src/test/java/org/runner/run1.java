package org.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utlis.windowManager;

public class run1 {

    private WebDriver driver;
    protected HomePage homePage;

//    public static void main(String[] args) {
//        run1 run = new run1();
//        run.setup();
//    }

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        returnHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void returnHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
//        driver.quit();
    }

    public windowManager getWindowMange(){
        return new windowManager(driver);
    }
}
