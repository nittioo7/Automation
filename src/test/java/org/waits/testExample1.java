package org.waits;

import org.runner.run1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testExample1 extends run1 {

    @Test
    public void exampleTest(){
        var ex1 = homePage.clickDynamicLoading();
        var example1 = ex1.click1();
        example1.clickStart();
        assertEquals(example1.getText(), "Hello World!");
//        System.out.println(example1.getText());
    }
}
