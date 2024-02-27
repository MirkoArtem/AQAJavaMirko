package Lesson_13_test;

import Lesson_13.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameOfOperationTest extends BaseTest{
    @DisplayName("Test: get name of operation")
    @Test
    public void testNameOfOperation(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        String actualName = homePage.getName();
        String expectName = "Онлайн пополнение\n" +
                "без комиссии";
        Assertions.assertEquals(expectName, actualName);
    }
}
