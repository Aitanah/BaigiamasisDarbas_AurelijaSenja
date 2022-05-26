package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Etsy {
        public static class AccountProfile {
//          For BeforeMethod
            public static By buttonAcceptCookies = By.xpath("//*[@id='gdpr-single-choice-overlay']/div/div[2]/div[2]/button");
            public static By buttonSignInHomePage = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[1]/button");
            public static By inputEmail = By.xpath("//*[@id='join_neu_email_field']");
            public static By inputPassword = By.xpath("//*[@id='join_neu_password_field']");
            public static By buttonSignInForm = By.xpath("//*[@id='join-neu-form']/div[1]/div/div[7]/div/button");
//          For Test - createCollection
            public static By frameAccountMenuButton = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[3]/div");
            public static By buttonAccountMenu = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[3]/div/button");
            public static By frameAccountMenu = By.xpath("(//*[@role='menu'])[2]");
            public static By buttonViewYourAccount = By.xpath("(//*[@role='menuitem'])[2]");
            public static By framePopUpWindow = By.xpath("//*[@class='wt-display-flex-xs']");
            public static By buttonClosePopUpWindow = By.xpath("(//*[@class='etsy-icon wt-icon--smaller'])[1]");
            public static By buttonCreateCollection = By.xpath("//*[@id='content']/div/div[3]/div/div/div/fieldset/div/div/div[1]/div/div/label/button");
            public static By inputCollectionName = By.xpath("(//*[@id='createCollectionForm']//input)[1]");
            public static By buttonCreateCollectionOnPopUpWindow = By.xpath("//*[@form='createCollectionForm']");
            public static By fieldCreatCollectionWindow = By.xpath("//*[@id='create-collection-overlay']");
            public static By fieldCollections = By.xpath("//*[@class='wt-body-max-width fit-min-width-to-content']");
        }

        public static class Home {

        }

        public static class Vintage {

        }
    }

}
