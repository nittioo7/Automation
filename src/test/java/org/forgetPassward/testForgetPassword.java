package org.forgetPassward;
import org.runner.run1;
import org.testng.annotations.Test;
import pages.forgetPasswordPage;

public class testForgetPassword extends run1{

    @Test
    public void testSuccessMessage(){
        forgetPasswordPage forgetPass = homePage.clickForgetPassword();
        forgetPass.setEmail("nitesh@kumar.com");
        forgetPass.submit();

    }
}
