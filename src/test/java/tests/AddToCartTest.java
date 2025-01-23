package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ItemPage;
import pages.SearchResultsPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyItemCanBeAddedToCart() {
        driver.get("https://www.ebay.com");

        HomePage homePage = new HomePage(driver);
        homePage.searchForItem("book");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickFirstItem();

        ItemPage itemPage = new ItemPage(driver);
        itemPage.addToCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.getCartCount() > 0, "Cart count should be greater than 0");
    }
}
