package Lesson_14_test;

import Lesson_14.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommunicationFormTest extends BaseTest{
    @DisplayName("Test: field Communication")
    @Test
    public void testCommunication(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldCommunication();
        homePage.clickAndInputFieldPhone();
        homePage.clickAndInputFieldSum();
        homePage.clickAndInputFieldEmail();
        homePage.clickSubmitButton();
        homePage.goToOtherLink();
        String actual = homePage.getTotalSum();
        String expected  = "5.00 BYN";
        Assertions.assertEquals(expected,actual);
        String actual1 = homePage.getTotalSumOnButton();
        String expected1 = "Оплатить 5.00 BYN";
        Assertions.assertEquals(expected1,actual1);
        String actual2 = homePage.getPhoneNumber();
        String expected2 = "Оплата: Услуги связи Номер:375297777777";
        Assertions.assertEquals(expected2,actual2);
    }
    @DisplayName("Test: text in empty fields")
    @Test
    public void testEmptyField() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldCommunication();
        homePage.clickAndInputFieldPhone();
        homePage.clickAndInputFieldSum();
        homePage.clickAndInputFieldEmail();
        homePage.clickSubmitButton();
        homePage.goToOtherLink();
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("card-page__card")));
        WebElement cardRoot = driver.findElement(By.className("card-page__card"));
        List<WebElement> cardLabels = cardRoot.findElements(By.tagName("label"));

        for (WebElement element : cardLabels) {
            switch (element.getAttribute("class")) {
                case "ng-tns-c47-1 ng-star-inserted":
                    Assertions.assertEquals("Номер карты", element.getText());
                    break;
                case "ng-tns-c47-4 ng-star-inserted":
                    Assertions.assertEquals("Срок действия", element.getText());
                    break;
                case "ng-tns-c47-5 ng-star-inserted":
                    Assertions.assertEquals("CVC", element.getText());
                    break;
                case "ng-tns-c47-3 ng-star-inserted":
                    Assertions.assertEquals("Имя держателя (как на карте)", element.getText());
                    break;
            }
        }
    }
    @DisplayName("Test: check icons payment system")
    @Test
    public void testIconsPaymentSystem() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonCookie();
        homePage.clickFieldService();
        homePage.clickFieldCommunication();
        homePage.clickAndInputFieldPhone();
        homePage.clickAndInputFieldSum();
        homePage.clickAndInputFieldEmail();
        homePage.clickSubmitButton();
        homePage.goToOtherLink();
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("card-page__card")));
        WebElement cardRoot = driver.findElement(By.className("card-page__card"));
        List<WebElement> icons = cardRoot.findElements(By.tagName("img"));

        for (WebElement icon : icons) {
            if (icon.getAttribute("class").equals("ng-tns-c53-0 ng-star-inserted")) {
                Assertions.assertFalse(icon.getAttribute("src").isEmpty());
            }
        }
    }
}
