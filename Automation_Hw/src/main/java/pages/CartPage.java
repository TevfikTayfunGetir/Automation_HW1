package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends BasePage{

    By updateCartButton = By.cssSelector("//button[@type='submit' and contains(., 'Update')]");
    By removeFromCartButton = By.cssSelector("a[href='https://training.qastorming.com/cart/?remove_item=eae27d77ca20db309e056e3d2dcd7d69&_wpnonce=dd15f618d5']");
    By quantityValue = By.cssSelector("//div[@class='quantity'] /input");
    By productList = By.cssSelector("tbody");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void updateCart()
    {
        webDriver.findElement(updateCartButton).click();
    }

    public void removeFromCart()
    {
        webDriver.findElement(By.xpath("a[href='https://training.qastorming.com/cart/?remove_item=eae27d77ca20db309e056e3d2dcd7d69&_wpnonce=dd15f618d5'")).click();
    }

    public void quantityUpdate()
    {
        webDriver.findElement(quantityValue).sendKeys("3");
    }

    public void productControl()
    {
        webDriver.findElements(productList).isEmpty();
    }




}
