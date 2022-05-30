package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {

    @BeforeMethod
    public void openPage() {
        pages.etsy.Home.open();
        pages.etsy.Home.clickToAcceptCookies();
    }

    @Test
    public void searchForAnything() {
        String expectedSearchText = "Golden Ring";

        pages.etsy.Home.enterSearchObjectName(expectedSearchText);
        pages.etsy.Home.clickSearchButton();

        String actualSearchText = pages.etsy.Home.readSearchText();

        Assert.assertTrue(actualSearchText.contains(expectedSearchText));
    }
}
