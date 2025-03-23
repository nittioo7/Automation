package org.example.relativeLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Relative {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void TearDown(){
//        driver.quit();
    }

    @Test
    public void find(){
        WebElement loginPanal = driver.findElement(By.id("logInPanelHeading"));
//        WebElement credentail = driver.findElement(RelativeLocator.with(By.tagName("span")).above(loginPanal));
//        System.out.println(credentail.getText());
    }
}
