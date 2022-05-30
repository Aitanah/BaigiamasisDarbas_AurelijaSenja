package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import java.util.*;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void acceptCookies(By locator) {
        clickElement(locator);
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.WAIT_LONG);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeInvisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.WAIT_LONG);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static String generateRandomString(String characters, int length) {
        Random r = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(r.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static List<String> getElementTextListByLocator(By locator) {
        List<WebElement> elements = Common.getElements(locator);
        List<String> stringList = new ArrayList(Arrays.asList());
        for (WebElement element : elements) {
            stringList.add(element.getText());
        }
        return stringList;
    }

    public static Set<String> getCurrentWindowsHandles() {
        return Driver.getDriver().getWindowHandles();
    }

    public static String getCurrentWindowHandle() {
        return Driver.getDriver().getWindowHandle();
    }

    public static void switchToWindowByHandle(String handle) {
        Driver.getDriver().switchTo().window(handle);
    }

    public static void switchToNewWindowFromParentWindowByHandle(String currentTab) {
        Set<String> handles = Common.getCurrentWindowsHandles();
        for (String handle : handles) {
            if (!handle.equals(currentTab)) {
                Common.switchToWindowByHandle(handle);
            }
        }
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }
}