package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage{

    By addToCartButton =  By.cssSelector("li.zakra-article a.button");
    By cartButton = By.cssSelector("li.menu-item a.cart-page-link");
    By cartControl = By.cssSelector("//span[@class='count']");
    By addedToCartMessage = new By.ByCssSelector("a.added_to_cart");
    //div[@class='quantity']

    public ShopPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickAddToCartButton()
    {
        webDriver.findElements(addToCartButton).get(0).click();
    }

    public void clickCartButton()
    {
        webDriver.findElements(cartButton).get(0).click();
    }

    public void cartControlButton()
    {

    }

    public void clickAddToCart(int i) {
        webDriver.findElements(addToCartButton).get(i).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedToCartMessage));
    }





}
