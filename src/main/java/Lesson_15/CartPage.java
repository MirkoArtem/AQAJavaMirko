package Lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CartPage {
    private final By allProductsInCart = new By.ByClassName("list-item__wrap");
    private final By sumToPay = new By.ByClassName("b-right");
    private List<WebCart> products = new ArrayList<>();
    private final ArrayList<Product> addedProductsInCart;
    private final WebDriver driver;

    public CartPage(WebDriver driver, ArrayList<Product> addedProductsInCart) {
        this.addedProductsInCart = addedProductsInCart;
        this.driver = driver;
    }

    public void initProducts() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allProductsInCart));

        List<WebElement> productElements = driver.findElements(allProductsInCart);
        products = productElements
                .stream()
                .map(element -> new WebCart(element))
                .collect(Collectors.toList());
    }

    public List<WebCart> getProducts() {
        return products;
    }

    public int compareItems() {

        int result = 0;
        for (WebCart cartProduct : products) {
            Product productInCart = new Product(
                    cartProduct.getId(),
                    cartProduct.getName(),
                    cartProduct.getPrice()
            );

            if (addedProductsInCart.contains(productInCart)) {
                result++;
            } else {
                return 0;
            }
        }
        return result;
    }

    public int getCartCount() {
        return driver.findElements(new By.ByTagName("h1"))
                .stream()
                .filter(it -> it.getAttribute("data-count") != null)
                .map(it -> Integer.parseInt(it.getAttribute("data-count")))
                .findFirst()
                .get();
    }

    public double getFinalSumExpect() {
        return addedProductsInCart.stream().mapToDouble(Product::getPrice).sum();
    }

    public Double getFinalSumActual() {
        String finalSum = driver.findElement(sumToPay).getText();
        String totalSumActual = finalSum.substring(0, finalSum.length() - 1).replace(" ", "");
        return Double.parseDouble(totalSumActual);
    }
}