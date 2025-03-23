package org.hover;
import org.runner.run1;
import org.testng.annotations.Test;
import pages.hoverPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testHover extends run1{

    private int i = 1;
    @Test
    public void test1(){
        hoverPage hover = homePage.clickHoverPage();
        var caption = hover.hoverOver(i);
        assertTrue(caption.captionIsVisible());
        assertEquals(caption.getString(),"name: user"+i,"not match");
        assertTrue(caption.getLink().endsWith("/users/"+i));
        assertEquals(caption.getLinkText(),"View profile");
    }

}
