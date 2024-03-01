package Lesson_15_test;

import Lesson_15.CartPage;
import Lesson_15.MainPage;
import Lesson_15.Product;
import Lesson_15.TestUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest extends BaseTest {

    @Test
    public void testApp() {
        MainPage mainPage = new MainPage(driver);
        mainPage.initProducts();
        Assertions.assertFalse(mainPage.getProducts().isEmpty(), "Не нашел позиций в магазине");

        for (int i = 0; i < 6; i++) {
            addRandomProductToCart(mainPage);
        }

        ArrayList<Product> selectedProduct = mainPage.getProductsInCart();

        driver.get("https://www.wildberries.ru/lk/basket");
        CartPage cartPage = new CartPage(driver, selectedProduct);
        cartPage.initProducts();
        Assertions.assertFalse(cartPage.getProducts().isEmpty(), "Не нашел позиций в корзине");
        Assertions.assertEquals(selectedProduct.size(), cartPage.getProducts().size(), "В корзине не верное число продуктов");
        Assertions.assertEquals(selectedProduct.size(), cartPage.getCartCount(), "В корзине не верно отображается счетчик позиций");

        int compareSize = cartPage.compareItems();
        Assertions.assertNotEquals(-1, compareSize, "В корзине лишний продукт");
        Assertions.assertEquals(selectedProduct.size(), compareSize, "В корзине те же самые продукты что мы и добавили на главной странице");

        Assertions.assertEquals(cartPage.getFinalSumExpect(), cartPage.getFinalSumActual(), "Не верная общая сумма покупок для оплаты");
    }

    private void addRandomProductToCart(MainPage mainPage) {
        mainPage.addRandomProductInCart();
        List<Product> productsAdded = mainPage.getProductsInCart();

        TestUtil.sleep(300L);

        int cartContain = mainPage.getCountInCart();
        Assertions.assertEquals(productsAdded.size(), cartContain, "Количество добавленных не совпадает " + productsAdded.size() + "!=" + cartContain + "\n" + productsAdded);
    }
}