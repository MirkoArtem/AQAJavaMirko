package Lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebCart {

    private WebElement _webCart;
    private final By byName = By.className("good-info__good-name");
    private final By byPrice = By.className("list-item__price-new");

    public WebCart(WebElement _webCart) {
        this._webCart = _webCart;
    }

    public String getName() {
        return _webCart.findElement(byName).getText();
    }

    public String getPrice() {
        String price = _webCart.findElement(byPrice).getText();
        return price.substring(0, price.length() - 1).replace(" ", "");
    }

    public String getId() {

        return _webCart.findElement(By.className("list-item__good"))
                .findElements(By.tagName("div"))
                .stream()
                .filter(it -> it.getAttribute("data-nm") != null)
                .findFirst()
                .get()
                .getAttribute("data-nm");
    }
}