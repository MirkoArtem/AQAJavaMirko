package Lesson_13;

import org.openqa.selenium.*;

public class HomePage {
    private WebDriver driver;
    private String nameOfOperation = "//div[@class = 'pay__wrapper']/h2";
    private String logoPaymentSystemVisa = "//div[@class = 'pay__partners']/ul/li[1]/img";
    private String logoPaymentSystemMasterCard = "//div[@class = 'pay__partners']/ul/li[3]/img";
    private String logoPaymentSystemVerifiedByVisa = "//div[@class = 'pay__partners']/ul/li[2]/img";
    private String logoPaymentSystemMasterCardSecureCode = "//div[@class = 'pay__partners']/ul/li[4]/img";
    private String logoPaymentSystemBelkart = "//div[@class = 'pay__partners']/ul/li[5]/img";
    private String logoPaymentSystemMir = "//div[@class = 'pay__partners']/ul/li[6]/img";
    private String moreAboutService = "//a[@href = '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']";
    private String moreAboutServiceHeader = "//span[@class = 'breadcrumbs__link']";
    private String emailInput = "//input[@id = 'connection-email']";
    private String sumInput = "//input[@id = 'connection-sum']";
    private String phoneInput = "//input[@id = 'connection-phone']";
    private String submitButton = "//*[@id='pay-connection']/button";
    private String submitCookieButton = "//button[@id = 'cookie-agree']";
    private String paymentPage = ".//div[@class = 'header__payment-amount']";
    private String frameElement = "//iframe[@class = 'bepaid-iframe']";
    public HomePage(WebDriver driver){this.driver = driver;}
    public String getName(){
        WebElement blockNameOfOperation = driver.findElement(By.xpath(nameOfOperation));
        return blockNameOfOperation.getText();
    }
    public String getLogoPaymentSystemVisa(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemVisa));
        return logoPaymentSystemElement.getAttribute("alt");
    }
    public String getLogoPaymentSystemVerifiedByVisa(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemVerifiedByVisa));
        return logoPaymentSystemElement.getAttribute("alt");
    }
    public String getLogoPaymentSystemMasterCard(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemMasterCard));
        return logoPaymentSystemElement.getAttribute("alt");
    }
    public String getLogoPaymentSystemMasterCardSecureCode(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemMasterCardSecureCode));
        return logoPaymentSystemElement.getAttribute("alt");
    }
    public String getLogoPaymentSystemBelkart(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemBelkart));
        return logoPaymentSystemElement.getAttribute("alt");
    }
    public String getLogoPaymentSystemMir(){
        WebElement logoPaymentSystemElement = driver.findElement(By.xpath(logoPaymentSystemMir));
        return logoPaymentSystemElement.getAttribute("alt");
    }

    public void clickSubmitButtonCookie(){
        WebElement submitButtonCookieElement = driver.findElement(By.xpath(submitCookieButton));
        submitButtonCookieElement.click();
    }
    public void clickMoreAboutServiceLink(){
        WebElement moreAboutServiceLinkElement = driver.findElement(By.xpath(moreAboutService));
        moreAboutServiceLinkElement.click();
    }
    public String getMoreAboutServiceLinkHeader(){
        WebElement moreAboutServiceElement = driver.findElement(By.xpath(moreAboutServiceHeader));
        return moreAboutServiceElement.getText();
    }
    public void clickSubmitButton(){
        WebElement submitButtonElement = driver.findElement(By.xpath(submitButton));
        submitButtonElement.click();
    }
    public void clickAndInputFieldPhone(){
        WebElement fieldPhoneElement = driver.findElement(By.xpath(phoneInput));
        fieldPhoneElement.click();
        fieldPhoneElement.sendKeys("297777777");
    }
    public void clickAndInputFieldEmail(){
        WebElement fieldEmailElement = driver.findElement(By.xpath(emailInput));
        fieldEmailElement.click();
        fieldEmailElement.sendKeys("test@test.com");
    }
    public void clickAndInputFieldSum(){
        WebElement fieldSumElement = driver.findElement(By.xpath(sumInput));
        fieldSumElement.click();
        fieldSumElement.sendKeys("5");
    }
    public String getPaymentPage(){
        WebElement otherPage = driver.findElement(By.xpath(frameElement));
        WebElement paymentPageElement = otherPage.findElement(By.xpath(paymentPage));
        return paymentPageElement.getText();
    }

}

