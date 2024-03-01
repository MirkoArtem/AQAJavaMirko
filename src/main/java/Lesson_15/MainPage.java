package Lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainPage {
    private By byShop = By.className("main-page__content");
    private By byCartCountMobile = By.className("navbar-mobile__notify");
    private By byCartCountPc = By.className("navbar-pc__notify");
    private By byProduct = new By.ByTagName("article");
    private By bySizeItem = By.className("sizes-list__item");
    private final WebDriver driver;
    private List<WebProduct> products = new ArrayList<>();
    private ArrayList<Product> productsInCart = new ArrayList<>();

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void initProducts() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.attributeContains(byProduct, "data-card-index", "0"));
        WebElement shopElement = driver.findElement(byShop);
        List<WebElement> productElements = shopElement.findElements(byProduct);
        products = productElements
                .stream()
                .map(element -> new WebProduct(element))
                .collect(Collectors.toList());
    }

    public void addRandomProductInCart() {
        Random rnd = new Random();
        int position = rnd.nextInt(products.size() - 1);
        WebProduct wProduct = products.get(position);
        products.remove(position);

        if (wProduct.isNotCorrect()) return;

        new Actions(driver).moveToElement(wProduct.getPriceForScroll()).perform();
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOfAllElements(wProduct.getAddCard()));

        TestUtil.shot(driver, "beforeClick");
        Product product = new Product(wProduct.getId(), wProduct.getName(), wProduct.getPrice());
        wProduct.clickAddToCart();
        TestUtil.shot(driver, "afterClick");

        int countSizes = wProduct.getSizes();
        if (countSizes > 1) {

            new WebDriverWait(driver, Duration.ofSeconds(1))
                    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySizeItem));

            List<WebElement> elements = driver.findElements(bySizeItem);

            int positionSize = rnd.nextInt(elements.size() - 1) + 1;
            WebElement sizeEl = elements.get(positionSize);
            sizeEl.click();
        }
        productsInCart.add(product);
    }

    public int getCountInCart() {
        return Integer.parseInt(driver.findElement(byCartCountPc).getText());
    }

    public List<WebProduct> getProducts() {
        return products;
    }

    public ArrayList<Product> getProductsInCart() {
        return productsInCart;
    }
}
