package tests.etsy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AccountProfile extends BaseTest {

    @BeforeMethod
    public void openPage() {
        pages.etsy.AccountProfile.open();
        pages.etsy.AccountProfile.clickToAcceptCookies();
        pages.etsy.AccountProfile.signIn();
    }

    @Test
    public void createCollection() {

    }
}
