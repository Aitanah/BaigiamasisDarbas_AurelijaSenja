package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Etsy {

        public static By buttonAcceptCookies = By.xpath("//*[@id='gdpr-single-choice-overlay']/div/div[2]/div[2]/button");

        public static class Home {

            //    For BeforeMethod at AccountProfile
            public static By buttonSignInHomePage = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[1]/button");
            public static By inputEmail = By.xpath("//*[@id='join_neu_email_field']");
            public static By inputPassword = By.xpath("//*[@id='join_neu_password_field']");
            public static By buttonSignInForm = By.xpath("//*[@id='join-neu-form']/div[1]/div/div[7]/div/button");

            //    For Test: createCollection at AccountProfile
            public static By buttonAccountMenu = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[3]/div/button");
            public static By buttonViewYourAccount = By.xpath("(//*[@role='menuitem'])[2]");

            //    For Test: updateAccountPreferences at AccountProfile
            public static By buttonAccountSettings = By.xpath("(//*[@role='menuitem'])[7]");

            //    For Test:searchForAnything at Home
            public static By inputSearchBox = By.xpath("//*[@id='global-enhancements-search-query']");
            public static By buttonSearch = By.xpath("//*[@type='submit' and @value='Search']");
            public static By fieldSearchResults = By.xpath("//*[contains(@class, 'display-block')]/div/div");

            //    For Test:addToCart at AddToCart
            public static By buttonProduct = By.xpath("//*[@class='height-placeholder']");
        }

        public static class AccountProfile {

            //    For Test: createCollection at AccountProfile
            public static By buttonClosePopUpWindow = By.xpath("(//*[@class='etsy-icon wt-icon--smaller'])[1]");
            public static By buttonCreateCollection = By.xpath("//*[@id='content']/div/div[3]/div/div/div/fieldset/div/div/div[1]/div/div/label/button");
            public static By inputCollectionName = By.xpath("(//*[@id='createCollectionForm']//input)[1]");
            public static By buttonCreateCollectionOnPopUpWindow = By.xpath("//*[@form='createCollectionForm']");
            public static By fieldCreateCollectionWindow = By.xpath("//*[@id='create-collection-overlay']");
            public static By fieldCollections = By.xpath("//*[@class='wt-body-max-width fit-min-width-to-content']");
            public static By buttonAccountMenu = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[3]/div/button");
            public static By buttonSignOut = By.xpath("(//*[@role='menuitem'])[9]");

            //    For Test: updateAccountPreferences at AccountProfile
            public static By buttonPreferences = By.xpath("//*[@id='settings']/div[2]/nav/ul/li[2]/a");
            public static By buttonCurrencyEuro = By.xpath("//*[@id='update-preferences-form']/fieldset[2]/div/div/ul/li[1]/ul/li[3]/label");
            public static By inputPostalMalePreference = By.xpath("//*[@id='preferences-receive_postal_mail']");
            public static By inputPhoneCallsPreference = By.xpath("//*[@id='preferences-receive_phone_calls']");
            public static By buttonUpdatePreferences = By.xpath("//*[@value='Update Preferences']");
            public static By fieldMessage = By.xpath("//*[@id='flash-message']");
        }

        public static class Vintage {
            public static By buttonSortBy = By.xpath("//*[@class='wt-menu__trigger__label']");
            public static By buttonLowestPrice = By.xpath("(//*[@role='menuitemradio'])[2]");
            public static By fieldPrices = By.xpath("//*[contains(@class, 'card__price')]/p[contains(@class,'text-title')]//span/span[2]");
        }

        public static class ClothingAndShoes {
            public static By buttonAllFilters = By.xpath("//*[@id='search-filter-button']");
            public static By inputBoxOnSale = By.xpath("//*[@for='special-offers-on-sale']");
            public static By buttonApply = By.xpath("(//*[contains(@class, 'wt-btn--primary')])[5]");
            public static By fieldProductText = By.xpath("//*[contains(@class, 'display-block')]/div/div");
        }

        public static class Listing {

            public static By selectSize = By.xpath("//*[@id='variation-selector-0']");
            public static By selectColor = By.xpath("//*[@id='variation-selector-1']");
            public static By fieldPersonalization = By.xpath("//*[@id='listing-page-personalization-textarea']");
            public static By buttonAddToCart = By.xpath("//*[@id='listing-page-cart']/div[3]/div[1]/div[2]/div/form/div/button");
        }

        public static class AddToCart {
            public static By fieldCartMessage = By.xpath("//*[@id='checkout']/div/div[2]/div/div/div[1]/h1");
        }
    }
}
