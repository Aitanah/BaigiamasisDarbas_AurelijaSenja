package pages.etsy;

import pages.Common;
import pages.Constants;
import pages.Locators;

public class Home {

//    For BeforeMethod at AccountProfile
    public static void open() {
        Common.openUrl("https://www.etsy.com");
    }

    public static void clickToAcceptCookies() {
        Common.acceptCookies(Locators.Etsy.buttonAcceptCookies);
    }

    public static void signIn() {
        Common.clickElement(Locators.Etsy.Home.buttonSignInHomePage);
        Common.sendKeysToElement(Locators.Etsy.Home.inputEmail, Constants.EMAIL);
        Common.sendKeysToElement(Locators.Etsy.Home.inputPassword, Constants.PASSWORD);
        Common.clickElement(Locators.Etsy.Home.buttonSignInForm);
    }

//    For Test: createCollection at AccountProfile
    public static void clickAccountMenuButton() {
        Common.waitForElementToBeClickable(Locators.Etsy.Home.buttonAccountMenu);
        Common.clickElement(Locators.Etsy.Home.buttonAccountMenu);
    }

    public static void selectViewYourAccountButton() {
        Common.waitForElementToBeClickable(Locators.Etsy.Home.buttonViewYourAccount);
        Common.clickElement(Locators.Etsy.Home.buttonViewYourAccount);
    }

//    For Test: updateAccountPreferences at AccountProfile
    public static void selectAccountSettingsButton() {
        Common.waitForElementToBeClickable(Locators.Etsy.Home.buttonAccountSettings);
        Common.clickElement(Locators.Etsy.Home.buttonAccountSettings);
    }

//    For Test:searchForAnything at Home
    public static void enterSearchObjectName(String searchObjectName) {
        Common.sendKeysToElement(Locators.Etsy.Home.inputSearchBox, searchObjectName);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Etsy.Home.buttonSearch);
    }

    public static String readSearchText() {
        return Common.getElementText(Locators.Etsy.Home.fieldSearchResults);
    }

//    For Test:addToCart at AddToCart
    public static void clickOnProduct() {
        Common.clickElement(Locators.Etsy.Home.buttonProduct);
    }
}
