package org.IFrame;

import org.runner.run1;
import org.testng.annotations.Test;

public class testNestedFrame extends run1 {


    @Test
    public void nestedTest(){
        var frame = homePage.clickIFrame();
        frame.clickNestedFrame();
//        frame.switchToTop();
        System.out.println(frame.switchToMiddleFrame());
        System.out.println(frame.switchToRightFrame());
        System.out.println(frame.switchToLeftFrame());
        System.out.println(frame.bottomFrame());

        System.out.println(frame.switchToRightFrame());
    }
}
