package org.waits;

import org.runner.run1;
import org.testng.annotations.Test;

public class testExample2 extends run1 {


    @Test
    public void ex2Test(){
        var dy = homePage.clickDynamicLoading();
        var ex = dy.click2();
        ex.cliclStart();
        System.out.println(ex.getText());
    }
}
