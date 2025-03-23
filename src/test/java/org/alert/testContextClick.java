package org.alert;

import org.runner.run1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testContextClick extends run1 {

    @Test
    public void contextClickTest(){
        var context = homePage.clickContextMenu();
        context.contextClick();
        assertEquals(context.getAlertText(), "You selected a context menu", "text do not match");
//        System.out.println(context.getAlertText());
        context.acceptAlert();
    }
}
