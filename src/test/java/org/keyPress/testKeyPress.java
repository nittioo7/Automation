package org.keyPress;
import org.runner.run1;
import org.testng.annotations.Test;

public class testKeyPress extends run1{


    @Test
    public void testSendKey(){
        var keyPage = homePage.clickKeysPage();
//        keyPage.sendKeys("nitesh");
        System.out.println(keyPage.getResult());
//        You entered: H
        keyPage.enterPie();
    }
}
