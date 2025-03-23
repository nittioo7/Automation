package org.javaScriptTest;

import org.runner.run1;
import org.testng.annotations.Test;

public class javaScriptTest extends run1 {


    @Test
    public void testJSExecuter(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}
