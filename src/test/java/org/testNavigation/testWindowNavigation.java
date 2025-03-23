package org.testNavigation;

import org.runner.run1;
import org.testng.annotations.Test;

public class testWindowNavigation extends run1 {

    @Test
    public void navigationTest(){
        homePage.clickDynamicLoading().click2();
        getWindowMange().goBack();
        getWindowMange().refresh();
        getWindowMange().forward();
        getWindowMange().getURL("https://www.google.com");
    }

    @Test
    public void tabs(){
        homePage.clickDynamicLoading().newTab();
//        homePage.clickDynamicLoading().click2();
//        getWindowMange().manageTabs("Example 1");
    }
}
