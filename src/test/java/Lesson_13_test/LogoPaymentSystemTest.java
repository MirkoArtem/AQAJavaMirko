package Lesson_13_test;

import Lesson_13.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LogoPaymentSystemTest extends BaseTest {
    @DisplayName("Test: check logo payment system Visa")
    @Test
    public void testLogoPaymentSystemVisa(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemVisa();
        String expectName = "Visa";
        Assertions.assertEquals(expectName, actualName);
    }
    @DisplayName("Test: check logo payment system Verified By Visa")
    @Test
    public void testLogoPaymentSystemVerifiedByVisa(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemVerifiedByVisa();
        String expectName = "Verified By Visa";
        Assertions.assertEquals(expectName, actualName);
    }
    @DisplayName("Test: check logo payment system Verified By MasterCard")
    @Test
    public void testLogoPaymentSystemMasterCard(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemMasterCard();
        String expectName = "MasterCard";
        Assertions.assertEquals(expectName, actualName);
    }
    @DisplayName("Test: check logo payment system MasterCard Secure Code")
    @Test
    public void testLogoPaymentSystemMasterCardSecureCode(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemMasterCardSecureCode();
        String expectName = "MasterCard Secure Code";
        Assertions.assertEquals(expectName, actualName);
    }
    @DisplayName("Test: check logo payment system Belkart")
    @Test
    public void testLogoPaymentSystemBelkart(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemBelkart();
        String expectName = "Белкарт";
        Assertions.assertEquals(expectName, actualName);
    }
    @DisplayName("Test: check logo payment system Mir")
    @Test
    public void testLogoPaymentSystemMir(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getLogoPaymentSystemMir();
        String expectName = "МИР";
        Assertions.assertEquals(expectName, actualName);
    }
}
