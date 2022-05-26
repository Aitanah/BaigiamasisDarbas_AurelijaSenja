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
}
