package pages.etsy;

import pages.Common;
import pages.Locators;

public class ClothingAndShoes {
    public static void open() {
        Common.openUrl("https://www.etsy.com/c/clothing-and-shoes?ref=catnav-10923");
    }

    public static void clickToAcceptCookies() {
        Common.acceptCookies(Locators.Etsy.buttonAcceptCookies);
    }

    public static void clickAllFiltersButton() {
        Common.clickElement(Locators.Etsy.ClothingAndShoes.buttonAllFilters);
    }

    public static void clickOnSaleCheckbox() {
        Common.clickElement(Locators.Etsy.ClothingAndShoes.inputBoxOnSale);
    }

    public static void clickApplyButton() {
        Common.clickElement(Locators.Etsy.ClothingAndShoes.buttonApply);
    }

    public static String readProductText() {
        return Common.getElementText(Locators.Etsy.ClothingAndShoes.fieldProductText);
    }


}
