package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By cartCount = By.id("gh-cart-n");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getCartCount() {
        return Integer.parseInt(driver.findElement(cartCount).getText());
    }
}
