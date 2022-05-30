package pages.etsy;

import pages.Common;
import pages.Locators;

public class Listing {

//    For Test: addToCart at AddToCart
    public static void selectColorFromDropDown(String color) {
        String homePageHandle = Common.getCurrentWindowHandle();
        Common.switchToNewWindowFromParentWindowByHandle(homePageHandle);
        Common.selectOptionByValue(Locators.Etsy.Listing.selectSize, color);
    }

    public static void selectNumberOfBarsFromDropdown(String numberOfBars) {
        Common.waitForElementToBeClickable(Locators.Etsy.Listing.selectColor);
        Common.selectOptionByValue(Locators.Etsy.Listing.selectColor, numberOfBars);
    }

    public static void enterPersonalization(String personalization) {
        Common.waitForElementToBeClickable(Locators.Etsy.Listing.fieldPersonalization);
        Common.sendKeysToElement(Locators.Etsy.Listing.fieldPersonalization, personalization);
    }

    public static void clickAddToCartButton() {
        Common.clickElement(Locators.Etsy.Listing.buttonAddToCart);
    }


}
