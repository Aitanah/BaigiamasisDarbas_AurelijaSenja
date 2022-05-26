package pages.etsy;

import pages.Common;
import pages.Constants;
import pages.Locators;

public class AccountProfile {

    public static void open() {
        Common.openUrl("https://www.etsy.com");
    }

    public static void clickToAcceptCookies() {
        Common.acceptCookies(Locators.Etsy.AccountProfile.buttonAcceptCookies);
    }

    public static void signIn() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonSignInHomePage);
        Common.sendKeysToElement(Locators.Etsy.AccountProfile.inputEmail, Constants.EMAIL);
        Common.sendKeysToElement(Locators.Etsy.AccountProfile.inputPassword, Constants.PASSWORD);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonSignInForm);
    }

    public static String generateRandomCollectionName() {
        return Common.generateRandomString(Constants.SOURCES, 10);
    }
    public static void clickAccountMenuButton() {
        Common.waitForElementToBeClickable(Locators.Etsy.AccountProfile.frameAccountMenuButton);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonAccountMenu);
    }

    public static void clickViewYourAccountButton() {
        Common.waitForElementToBeClickable(Locators.Etsy.AccountProfile.frameAccountMenu);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonViewYourAccount);
    }

    public static void closePopUpWindow() {
        Common.waitForElementToBeClickable(Locators.Etsy.AccountProfile.framePopUpWindow);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonClosePopUpWindow);
    }

    public static void clickCreateCollectionButton() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonCreateCollection);
    }

    public static void enterCollectionName(String collectionName) {
        Common.sendKeysToElement(Locators.Etsy.AccountProfile.inputCollectionName, collectionName);
    }

    public static void clickCreateCollectionButtonOnCreateCollectionWindow() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonCreateCollectionOnPopUpWindow);
    }

    public static String readCollectionName() {
        Common.waitForElementToBeInvisible(Locators.Etsy.AccountProfile.fieldCreatCollectionWindow);
        return Common.getElementText(Locators.Etsy.AccountProfile.fieldCollections);
    }


    public static void signOut() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonAccountMenu);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonSignOut);
    }
}
