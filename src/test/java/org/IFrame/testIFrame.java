package org.IFrame;

import org.runner.run1;
import org.testng.annotations.Test;

public class testIFrame extends run1 {

    @Test
    public void iFrameTest(){
        var iFrame = homePage.clickWysiwygEditor();
        iFrame.closeAlert();
        iFrame.clearText();
        iFrame.setText("Hello");
        iFrame.clickButton();
        iFrame.setText("World!");
    }
}
