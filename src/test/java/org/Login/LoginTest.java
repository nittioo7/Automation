package org.Login;

import org.openqa.selenium.By;
import org.runner.run1;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginSuccessPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends run1 {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        LoginSuccessPage loginSuccess = loginPage.clickLogin();
        System.out.println(loginSuccess.successful());
//        assertEquals(loginSuccess.successful(),"You logged into a secure area!","do not match");
        assertTrue(loginSuccess.successful().contains("You logged into a secure area!"));
//        driver.findElement(By.tagName("up")).
    }
}
