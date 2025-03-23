package org.alert;

import org.runner.run1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testAlert extends run1 {

    @Test
    public void test1(){
        var alert = homePage.clickAlert();
        alert.clickJSAlert();
        alert.acceptAlert();
    }

    @Test
    public void testConfirm(){
        var alert = homePage.clickAlert();
        alert.clickJSConfirm();
//        System.out.println(alert.alert_text());
        assertEquals(alert.alert_text(), "I am a JS Confirm", "Text do not matches");
        alert.acceptAlert();
        assertEquals(alert.getResult(),"You clicked: Ok");
//        System.out.println(alert.getResult());
    }

    @Test
    public void testPrompt(){
        String text = "Nitesh";
        var alert = homePage.clickAlert();
        alert.clickJSPrompt();
        assertEquals(alert.alert_text(), "I am a JS prompt", "text do not match");
//        System.out.println(alert.alert_text());
        alert.sendText(text);
        alert.acceptAlert();
        assertEquals(alert.getResult(), "You entered: " + text);
//        System.out.println(alert.getResult());
    }
}
