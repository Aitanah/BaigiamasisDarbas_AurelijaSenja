package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AddToCart extends BaseTest {

    @BeforeMethod
    public void openPage() {
        pages.etsy.Home.open();
        pages.etsy.Home.clickToAcceptCookies();
    }

    @Test
    public void addProductToCart() {
        String color = "1919103954";
        String numberOfBars = "1919103948";
        String personalization = "Heart: Flower";

        String expectedMessage = "1 item in your cart";

        pages.etsy.Home.clickOnProduct();
        pages.etsy.Listing.selectColorFromDropDown(color);
        pages.etsy.Listing.selectNumberOfBarsFromDropdown(numberOfBars);
        pages.etsy.Listing.enterPersonalization(personalization);
        pages.etsy.Listing.clickAddToCartButton();

        String actualMessage = pages.etsy.AddToCart.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
