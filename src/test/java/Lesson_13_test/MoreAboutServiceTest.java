package Lesson_13_test;

import Lesson_13.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoreAboutServiceTest extends BaseTest {
    @DisplayName("Test: check link 'More about service'")
    @Test
    public void testLinkMoreAboutService(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickMoreAboutServiceLink();
        String actualResult = homePage.getMoreAboutServiceLinkHeader();
        String expectResult = "Порядок оплаты и безопасность интернет платежей";
        Assertions.assertEquals(expectResult, actualResult);
    }
}
