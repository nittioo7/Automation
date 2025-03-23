package org.javaScriptTest;

import org.runner.run1;
import org.testng.annotations.Test;

public class testDropDown extends run1 {

    @Test
    public void test(){
        homePage.clickDropDown().addMultipleAttribute();
    }
}
