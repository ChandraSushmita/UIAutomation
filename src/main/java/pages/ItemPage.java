package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private WebDriver driver;
    private By addToCartButton = By.id("atcRedesignId_btn");

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
