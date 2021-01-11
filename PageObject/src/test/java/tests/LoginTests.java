package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.abstract_page.loginWithEmailPage;
import service.UserCreator;

public class LoginTests extends CommonConditions{
    @Test
    public void inputWrongEmail() throws InterruptedException {
        User testUser= UserCreator.withCredentialsFromProperty();
        boolean isMailValid =new loginWithEmailPage(driver)
                .openPage()
                .inputMail(testUser)
                .checkLabelErrMessage();
        System.out.println(isMailValid);
        Assert.assertTrue(isMailValid,"Mail is not valid");
    }
}
