package org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locaters {
    private static WebDriver driver;

    public static void toRun(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link : links){
            System.out.println(link.getText());
            System.out.println(link.getRect().getDimension());
        }
        System.out.println(links.size());
        WebElement Shifting = driver.findElement(By.linkText("Shifting Content"));
//        System.out.println(links.get(By.tagName()));
        Shifting.click();
        WebElement menu = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu.click();
        List<WebElement> inShift = driver.findElements(By.tagName("li"));
        System.out.println(inShift.size());
        for (WebElement in : inShift){
            System.out.println(in.getText());
        }

        driver.quit();
    }

    public static void main(String[] args) {
        toRun();
    }
}
