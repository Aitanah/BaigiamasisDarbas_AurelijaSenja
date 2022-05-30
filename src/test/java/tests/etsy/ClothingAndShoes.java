package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ClothingAndShoes extends BaseTest {

    @BeforeMethod
    public void openPage() {
        pages.etsy.ClothingAndShoes.open();
        pages.etsy.ClothingAndShoes.clickToAcceptCookies();
    }

    @Test
    public void filterProducts() {
        String expectedFilterResults = "% off";

        pages.etsy.ClothingAndShoes.clickAllFiltersButton();
        pages.etsy.ClothingAndShoes.clickOnSaleCheckbox();
        pages.etsy.ClothingAndShoes.clickApplyButton();

        String actualResults = pages.etsy.ClothingAndShoes.readProductText();

        Assert.assertTrue(actualResults.contains(expectedFilterResults));
    }
}
