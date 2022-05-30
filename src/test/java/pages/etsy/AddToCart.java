package pages.etsy;

import pages.Common;
import pages.Locators;

public class AddToCart {

    public static String readMessage() {
        return Common.getElementText(Locators.Etsy.AddToCart.fieldCartMessage);
    }
}
