package Lesson_14_test;

import Lesson_14.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

public class EmptyFieldTextTest extends BaseTest{
    @DisplayName("Test: check field Communication")
    @Test
    public void testFieldCommunication(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldCommunication();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual1 = homePage.getEmptyFieldPhoneCommunication();
        String actual2 = homePage.getEmptyFieldSumCommunication();
        String actual3 = homePage.getEmptyFieldEmailCommunication();
        String expected1 = "Номер телефона";
        String expected2 = "Сумма";
        String expected3 = "E-mail для отправки чека";
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }
    @DisplayName("Test: check field Home Internet")
    @Test
    public void testFieldHomeInternet(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldHomeInternet();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual1 = homePage.getEmptyFieldPhoneHomeInternet();
        String actual2 = homePage.getEmptyFieldSumHomeInternet();
        String actual3 = homePage.getEmptyFieldEmailHomeInternet();
        String expected1 = "Номер абонента";
        String expected2 = "Сумма";
        String expected3 = "E-mail для отправки чека";
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }
    @DisplayName("Test: check field Installment")
    @Test
    public void testFieldInstallment(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldInstallment();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual1 = homePage.getEmptyFieldNumberInstallment();
        String actual2 = homePage.getEmptyFieldSumInstallment();
        String actual3 = homePage.getEmptyFieldEmailInstallment();
        String expected1 = "Номер счета на 44";
        String expected2 = "Сумма";
        String expected3 = "E-mail для отправки чека";
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }
    @DisplayName("Test: check field Debt")
    @Test
    public void testFieldDebt(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldDebt();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual1 = homePage.getEmptyFieldNumberDebt();
        String actual2 = homePage.getEmptyFieldSumDebt();
        String actual3 = homePage.getEmptyFieldEmailDebt();
        String expected1 = "Номер счета на 2073";
        String expected2 = "Сумма";
        String expected3 = "E-mail для отправки чека";
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }
}
