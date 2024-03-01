package Lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebProduct {
    private WebElement _webProduct;
    private final String idAttr = "data-nm-id";
    private final By byJSize = By.className("j-size");
    private final By byName = By.className("product-card__name");
    private final By byPrice = By.className("price__lower-price");
    private final By byAddBtn = By.className("product-card__order-wrap");
    private final By byAddBtnA = By.tagName("a");

    public WebProduct(WebElement _webProduct) {
        this._webProduct = _webProduct;
    }

    public Boolean isNotCorrect() {
        return _webProduct.findElement(byName).getText().isEmpty();
    }

    public String getId() {
        return _webProduct.getAttribute(idAttr);
    }

    public String getName() {
        return _webProduct.findElement(byName).getText().replace("/ ", "");
    }

    public String getPrice() {
        String price = _webProduct.findElement(byPrice).getText();
        return price.substring(0, price.length() - 1).replace(" ", "");
    }

    public WebElement getPriceForScroll() {
        return _webProduct.findElement(byPrice);
    }

    public int getSizes() {
        return (int) _webProduct.findElements(byJSize)
                .stream().filter(it -> it.getAttribute("href").contains(getId()))
                .count();
    }

    public WebElement getAddCard() {
        return _webProduct.findElement(byAddBtn).findElement(byAddBtnA);
    }
    
    public void clickAddToCart() {
        getAddCard().click();
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " name: " + getName() + " price:" + getPrice();
    }
}
