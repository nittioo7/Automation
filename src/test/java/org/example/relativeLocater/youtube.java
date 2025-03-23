package org.example.relativeLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;
import java.util.Set;

public class youtube {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp(){
        driver.get("https://www.youtube.com/");
    }

    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }

    @Test
    public void scrap(){
        List<WebElement> links = driver.findElements(By.id("endpoint"));
        for(WebElement link :links) {
            System.out.println(link);
        }
    }
}
