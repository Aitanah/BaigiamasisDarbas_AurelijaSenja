package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AccountProfile extends BaseTest {

    @BeforeMethod
    public void openPageAndSignIn() {
        pages.etsy.Home.open();
        pages.etsy.Home.clickToAcceptCookies();
        pages.etsy.Home.signIn();
    }

    @Test
    public void createCollection() {
        String expectedCollectionName = pages.etsy.AccountProfile.generateRandomCollectionName();

        pages.etsy.Home.clickAccountMenuButton();
        pages.etsy.Home.selectViewYourAccountButton();
        pages.etsy.AccountProfile.closePopUpWindow();
        pages.etsy.AccountProfile.clickCreateCollectionButton();
        pages.etsy.AccountProfile.enterCollectionName(expectedCollectionName);
        pages.etsy.AccountProfile.clickCreateCollectionButtonOnCreateCollectionWindow();

        String actualCollectionName = pages.etsy.AccountProfile.readCollectionName();

        Assert.assertTrue(actualCollectionName.contains(expectedCollectionName));
    }

    @Test
    public void updateAccountPreferences() {
        String expectedMessage = "Your changes have been saved.";

        pages.etsy.Home.clickAccountMenuButton();
        pages.etsy.Home.selectAccountSettingsButton();
        pages.etsy.AccountProfile.clickPreferencesTab();
        pages.etsy.AccountProfile.selectCurrencyEuro();
        pages.etsy.AccountProfile.clickOnReceivePostalMaleCheckbox();
        pages.etsy.AccountProfile.clickOnReceivePhoneCallsCheckbox();
        pages.etsy.AccountProfile.clickUpdatePreferencesButton();

        String actualMessage = pages.etsy.AccountProfile.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void signOut() {
        pages.etsy.AccountProfile.signOut();
    }
}
