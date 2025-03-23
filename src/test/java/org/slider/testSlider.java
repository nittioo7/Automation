package org.slider;
import org.runner.run1;
import org.testng.annotations.Test;

public class testSlider extends run1 {


    @Test
    public void testSlider1(){
        var slider = homePage.clickHorizontalSlider();
        slider.clickSlider();
        slider.checkRange();
    }
}
