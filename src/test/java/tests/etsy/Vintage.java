package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Vintage extends BaseTest {

    @BeforeMethod
    public void openPage() {
        pages.etsy.Vintage.open();
        pages.etsy.Vintage.clickToAcceptCookies();
    }

    @Test
    public void sortByLowestPrice() {
        String expectedPrices = String.valueOf(pages.etsy.Vintage.sortProductPrices());

        pages.etsy.Vintage.clickSortByButton();
        pages.etsy.Vintage.selectLowestPriceButton();

        String actualPrices = String.valueOf(pages.etsy.Vintage.readProductsPrices());

        Assert.assertEquals(actualPrices, expectedPrices);
    }
}
