package pages.etsy;

import pages.Common;
import pages.Constants;
import pages.Locators;

public class AccountProfile {

//    For Test: createCollection at AccountProfile
    public static String generateRandomCollectionName() {
        return Common.generateRandomString(Constants.SOURCES, 10);
    }

    public static void closePopUpWindow() {
        Common.waitForElementToBeClickable(Locators.Etsy.AccountProfile.buttonClosePopUpWindow);
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
        Common.waitForElementToBeInvisible(Locators.Etsy.AccountProfile.fieldCreateCollectionWindow);
        return Common.getElementText(Locators.Etsy.AccountProfile.fieldCollections);
    }

//    For Test: updateAccountPreferences at AccountProfile
    public static void clickPreferencesTab() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonPreferences);
    }

    public static void selectCurrencyEuro() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonCurrencyEuro);
    }

    public static void clickOnReceivePostalMaleCheckbox() {
        Common.clickElement(Locators.Etsy.AccountProfile.inputPostalMalePreference);
    }

    public static void clickOnReceivePhoneCallsCheckbox() {
        Common.clickElement(Locators.Etsy.AccountProfile.inputPhoneCallsPreference);
    }

    public static void clickUpdatePreferencesButton() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonUpdatePreferences);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Etsy.AccountProfile.fieldMessage);
    }

//    For AfterMethod
    public static void signOut() {
        Common.clickElement(Locators.Etsy.AccountProfile.buttonAccountMenu);
        Common.waitForElementToBeClickable(Locators.Etsy.AccountProfile.buttonSignOut);
        Common.clickElement(Locators.Etsy.AccountProfile.buttonSignOut);
    }
}
