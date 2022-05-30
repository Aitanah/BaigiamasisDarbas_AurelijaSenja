package pages.etsy;

import pages.Common;
import pages.Locators;
import tests.BaseTest;
import java.util.Collections;
import java.util.List;

public class Vintage extends BaseTest {

    public static void open() {
        Common.openUrl("https://www.etsy.com/c/vintage?ref=vintage_nav_promo");
    }

    public static void clickToAcceptCookies() {
        Common.acceptCookies(Locators.Etsy.buttonAcceptCookies);
    }

    public static void clickSortByButton() {
        Common.clickElement(Locators.Etsy.Vintage.buttonSortBy);
    }

    public static void selectLowestPriceButton() {
        Common.clickElement(Locators.Etsy.Vintage.buttonLowestPrice);
    }

    public static List<String> readProductsPrices() {
        List<String> productPricesList = Common.getElementTextListByLocator(Locators.Etsy.Vintage.fieldPrices);
        return productPricesList;
    }

    public static List<String> sortProductPrices() {
        List<String> list = Common.getElementTextListByLocator(Locators.Etsy.Vintage.fieldPrices);
        Collections.sort(list);
        return list;
    }

}
