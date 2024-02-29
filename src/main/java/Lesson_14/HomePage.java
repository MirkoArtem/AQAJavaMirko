package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomePage {
    private WebDriver driver;
    private String submitCookieButton = "//button[@id = 'cookie-agree']";
    private String fieldService = "//button[@class = 'select__header']";
    private String fieldCommunication = "//*[@class = 'select__list']/li[1]";
    private String fieldHomeInternet = "//*[@class = 'select__list']/li[2]";
    private String fieldInstallment = "//*[@class = 'select__list']/li[3]";
    private String fieldDebt = "//*[@class = 'select__list']/li[4]";
    private String phoneInput = "//input[@id = 'connection-phone']";
    private String emailInput = "//input[@id = 'connection-email']";
    private String sumInput = "//input[@id = 'connection-sum']";
    private String submitButton = "//*[@id='pay-connection']/button";
    private String emptyFieldPhoneCommunication = "//input[@id = 'connection-phone']";
    private String emptyFieldSumCommunication = "//input[@id = 'connection-sum']";
    private String emptyFieldEmailCommunication = "//input[@id = 'connection-email']";
    private String emptyFieldPhoneHomeInternet = "//input[@id = 'internet-phone']";
    private String emptyFieldSumHomeInternet = "//input[@id = 'internet-sum']";
    private String emptyFieldEmailHomeInternet = "//input[@id = 'internet-email']";
    private String emptyFieldNumberInstallment = "//input[@id = 'score-instalment']";
    private String emptyFieldSumInstallment = "//input[@id = 'instalment-sum']";
    private String emptyFieldEmailInstallment = "//input[@id = 'instalment-email']";
    private String emptyFieldNumberDebt = "//input[@id = 'score-arrears']";
    private String emptyFieldSumDebt = "//input[@id = 'arrears-sum']";
    private String emptyFieldEmailDebt = "//input[@id = 'arrears-email']";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSubmitButtonCookie(){
        WebElement submitButtonCookieElement = driver.findElement(By.xpath(submitCookieButton));
        submitButtonCookieElement.click();
    }
    public void clickFieldService(){
        WebElement fieldServiceElemen = driver.findElement(By.xpath(fieldService));
        fieldServiceElemen.click();
    }
    public void clickFieldCommunication(){
        WebElement fieldCommunicationElement = driver.findElement(By.xpath(fieldCommunication));
        fieldCommunicationElement.click();
    }
    public void clickFieldHomeInternet(){
        WebElement fieldHomeInternetElement = driver.findElement(By.xpath(fieldHomeInternet));
        fieldHomeInternetElement.click();
    }
    public void clickFieldInstallment(){
        WebElement fieldInstallmentElement = driver.findElement(By.xpath(fieldInstallment));
        fieldInstallmentElement.click();
    }
    public void clickFieldDebt(){
        WebElement fieldDebtElement = driver.findElement(By.xpath(fieldDebt));
        fieldDebtElement.click();
    }
    public void clickAndInputFieldPhone(){
        WebElement fieldPhoneElement = driver.findElement(By.xpath(phoneInput));
        fieldPhoneElement.click();
        fieldPhoneElement.sendKeys("297777777");
    }
    public void clickAndInputFieldSum(){
        WebElement fieldSumElement = driver.findElement(By.xpath(sumInput));
        fieldSumElement.click();
        fieldSumElement.sendKeys("5");
    }
    public void clickAndInputFieldEmail(){
        WebElement fieldEmailElement = driver.findElement(By.xpath(emailInput));
        fieldEmailElement.click();
        fieldEmailElement.sendKeys("test@test.com");
    }
    public void clickSubmitButton(){
        WebElement submitButtonElement = driver.findElement(By.xpath(submitButton));
        submitButtonElement.click();
    }

    public String getEmptyFieldPhoneCommunication() {
        WebElement emptyFieldPhoneCommunicationElement = driver.findElement(By.xpath(emptyFieldPhoneCommunication));
        return emptyFieldPhoneCommunicationElement.getAttribute("placeholder");
    }

    public String getEmptyFieldSumCommunication() {
        WebElement emptyFieldSumCommunicationElement = driver.findElement(By.xpath(emptyFieldSumCommunication));
        return emptyFieldSumCommunicationElement.getAttribute("placeholder");
    }

    public String getEmptyFieldEmailCommunication() {
        WebElement emptyFieldEmailCommunicationElement = driver.findElement(By.xpath(emptyFieldEmailCommunication));
        return emptyFieldEmailCommunicationElement.getAttribute("placeholder");
    }

    public String getEmptyFieldPhoneHomeInternet() {
        WebElement emptyFieldPhoneHomeInternetElement = driver.findElement(By.xpath(emptyFieldPhoneHomeInternet));
        return emptyFieldPhoneHomeInternetElement.getAttribute("placeholder");
    }

    public String getEmptyFieldSumHomeInternet() {
        WebElement emptyFieldSumHomeInternetElement = driver.findElement(By.xpath(emptyFieldSumHomeInternet));
        return emptyFieldSumHomeInternetElement.getAttribute("placeholder");
    }

    public String getEmptyFieldEmailHomeInternet() {
        WebElement emptyFieldEmailHomeInternetElement = driver.findElement(By.xpath(emptyFieldEmailHomeInternet));
        return emptyFieldEmailHomeInternetElement.getAttribute("placeholder");
    }

    public String getEmptyFieldNumberInstallment() {
        WebElement emptyFieldNumberInstallmentElement = driver.findElement(By.xpath(emptyFieldNumberInstallment));
        return emptyFieldNumberInstallmentElement.getAttribute("placeholder");
    }

    public String getEmptyFieldSumInstallment() {
        WebElement emptyFieldSumInstallmentElement = driver.findElement(By.xpath(emptyFieldSumInstallment));
        return emptyFieldSumInstallmentElement.getAttribute("placeholder");
    }

    public String getEmptyFieldEmailInstallment() {
        WebElement emptyFieldEmailInstallmentElement = driver.findElement(By.xpath(emptyFieldEmailInstallment));
        return emptyFieldEmailInstallmentElement.getAttribute("placeholder");
    }

    public String getEmptyFieldNumberDebt() {
        WebElement emptyFieldNumberDebtElement = driver.findElement(By.xpath(emptyFieldNumberDebt));
        return emptyFieldNumberDebtElement.getAttribute("placeholder");
    }

    public String getEmptyFieldSumDebt() {
        WebElement emptyFieldSumDebtElement = driver.findElement(By.xpath(emptyFieldSumDebt));
        return emptyFieldSumDebtElement.getAttribute("placeholder");
    }

    public String getEmptyFieldEmailDebt() {
        WebElement emptyFieldEmailDebtElement = driver.findElement(By.xpath(emptyFieldEmailDebt));
        return emptyFieldEmailDebtElement.getAttribute("placeholder");
    }
    public void goToOtherLink(){
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-iframe")));
        WebElement paidFrameElement = driver.findElement(By.cssSelector(".bepaid-iframe"));
        driver.switchTo().frame(paidFrameElement);
    }
    public String getTotalSum(){
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__payment-amount")));
        String headerSum = driver.findElement(By.className("header__payment-amount")).getText();
        return headerSum;
    }
    public String getTotalSumOnButton(){
        WebElement cardRootElement = driver.findElement(By.className("card-page__card"));
        String btnSum = cardRootElement.findElement(By.tagName("button")).getText();
        return btnSum;
    }
    public String getPhoneNumber(){
        String headerPhone = driver.findElement(By.className("header__payment-info")).getText();
        return headerPhone;
    }
}
