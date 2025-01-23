package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;
    private By firstItem = By.cssSelector(".s-item .s-item__link");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }
}
