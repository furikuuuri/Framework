package page.abstract_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomConditions;
import model.User;

public class loginWithEmailPage extends AbstractPage {
    private static final String LOGIN_WITH_EMAIL_PAGE_URL = "https://www.dcrussia.ru/account/";

    @FindBy(xpath = "//*[@id='dwfrm_loyaltyinclude_email']")
    private WebElement loginInput;

    @FindBy(xpath = "//label[@id=\"id_email_status_dwfrm_loyaltyinclude_email\"]")
    private WebElement labelErrMessage;

    @FindBy(xpath = "//*[@id=\"cboxClose\"]")
    private WebElement closeBox;

    public loginWithEmailPage(WebDriver driver) {
        super(driver);
    }

    public loginWithEmailPage openPage() {
        driver.get(LOGIN_WITH_EMAIL_PAGE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(CustomConditions.jQueryAJAXsCompleted());
        return this;
    }

    public loginWithEmailPage inputMail(User user) {
        CustomConditions.waitWebElementLocatedBy(driver, By.xpath("//*[@id=\"cboxClose\"]"));
        closeBox.click();
        CustomConditions.waitWebElementLocatedBy(driver, By.xpath("//*[@id='dwfrm_loyaltyinclude_email']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginInput.sendKeys(user.GetMail());
        return this;
    }

    public boolean checkLabelErrMessage(){
        CustomConditions.waitWebElementLocatedBy(driver, By.xpath("//label[@id=\"id_email_status_dwfrm_loyaltyinclude_email\"]"));
        return !labelErrMessage.getText().equals("Пожалуйста, введите свой E-mail");
    }


}
