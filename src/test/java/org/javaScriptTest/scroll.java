package org.javaScriptTest;

import org.runner.run1;
import org.testng.annotations.Test;

public class scroll extends run1 {

    @Test
    public void testScroll(){
        homePage.clickInfiniteScroll().scrollTo(8);
    }
}
