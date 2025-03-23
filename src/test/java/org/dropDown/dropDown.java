package org.dropDown;

import org.runner.run1;
import org.testng.annotations.Test;
import pages.dropDownPage;
import static org.testng.Assert.assertEquals;

public class dropDown extends run1 {

    @Test
    public void testDropDown(){
        dropDownPage dropDown = homePage.clickDropDown();
        dropDown.selectOption("Option 1");
//        assertEquals(dropDown.getText(), "Option 1", "option not selected");
        assertEquals(dropDown.getText().size(), 1, "more than 1 option selected");
    }
}
