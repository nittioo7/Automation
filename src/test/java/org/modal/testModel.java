package org.modal;

import org.runner.run1;
import org.testng.annotations.Test;

public class testModel extends run1 {


    @Test
    public void ModalTest() throws InterruptedException {
        var modal = homePage.clickEntryAd();
        Thread.sleep(1000);
        System.out.println(modal.getTitle());
        System.out.println(modal.body());
        modal.close();
    }
}
