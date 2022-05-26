package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Etsy {
        public static class AccountProfile {
            public static By buttonAcceptCookies = By.xpath("//*[@id='gdpr-single-choice-overlay']/div/div[2]/div[2]/button");
            public static By buttonSignInHomePage = By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[1]/button");
            public static By inputEmail = By.xpath("//*[@id='join_neu_email_field']");
            public static By inputPassword = By.xpath("//*[@id='join_neu_password_field']");
            public static By buttonSignInForm = By.xpath("//*[@id='join-neu-form']/div[1]/div/div[7]/div/button");

        }

        public static class Home {

        }

        public static class Vintage {

        }
    }

}
