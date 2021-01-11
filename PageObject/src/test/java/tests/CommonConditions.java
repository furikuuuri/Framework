package tests;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class CommonConditions {
    protected String mail="maxim03nock@mail.ru";
    protected WebDriver driver;

    @BeforeMethod
    protected void browserStart() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    protected void browserTearDown() {
        DriverSingleton.deleteAllCookies();
    }
    @AfterTest
    protected void quiteBrowserAfterTest() {
        DriverSingleton.closeDriver();
    }
}
