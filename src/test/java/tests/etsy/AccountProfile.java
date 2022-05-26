package tests.etsy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AccountProfile extends BaseTest {

    @BeforeMethod
    public void openPageAndSignIn() {
        pages.etsy.AccountProfile.open();
        pages.etsy.AccountProfile.clickToAcceptCookies();
        pages.etsy.AccountProfile.signIn();
    }

    @Test
    public void createCollection() {

        String expectedCollectionName = pages.etsy.AccountProfile.generateRandomCollectionName();

        pages.etsy.AccountProfile.clickAccountMenuButton();
        pages.etsy.AccountProfile.clickViewYourAccountButton();
        pages.etsy.AccountProfile.closePopUpWindow();
        pages.etsy.AccountProfile.clickCreateCollectionButton();
        pages.etsy.AccountProfile.enterCollectionName(expectedCollectionName);
        pages.etsy.AccountProfile.clickCreateCollectionButtonOnCreateCollectionWindow();
        String actualCollectionName = pages.etsy.AccountProfile.readCollectionName();

        Assert.assertTrue(actualCollectionName.contains(expectedCollectionName));
    }

    @AfterMethod
    public void signOut() {
        pages.etsy.AccountProfile.signOut();
    }
}
