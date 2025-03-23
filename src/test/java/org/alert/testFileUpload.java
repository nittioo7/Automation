package org.alert;
import org.runner.run1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testFileUpload extends run1{

    @Test
    public void fileUploadTest(){
        var fileUpload = homePage.clickFileUpload();
        fileUpload.clickUploadFile("C:\\Users\\HP\\IdeaProjects\\Auto\\src\\main\\java\\pages\\LoginSuccessPage.java");
        fileUpload.clickSubmitButton();
//        System.out.println(fileUpload.fileSubmitted());
        assertEquals(fileUpload.fileSubmitted(), "LoginSuccessPage.java", "Text do not match");
    }
}
