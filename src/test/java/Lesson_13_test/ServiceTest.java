package Lesson_13_test;

import Lesson_13.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class ServiceTest extends BaseTest {
    @DisplayName("Test: check service")
    @Test
    public void testServiceInputAllFields(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickAndInputFieldPhone();
        homePage.clickAndInputFieldSum();
        homePage.clickAndInputFieldEmail();
        homePage.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual = homePage.getPaymentPage();
        String expected = " 5.00 BYN";
        Assertions.assertEquals(expected,actual);

    }
}
