package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage{

    By shopButton = new By.ByCssSelector("div.elementor-button-wrapper a[href='https://training.qastorming.com/shop/']");
    By contactInfo = new By.ByCssSelector("h2.widget-title");
    By scrollToUp = new By.ByCssSelector("a[href=\"#\"");



    public HomePage(WebDriver webDriver) {
        super(webDriver);
        webDriver.get(baseURL);
    }

    public String getTitle()
    {
        return webDriver.getTitle();
    }

    public void clickFirstShopButton()
    {
        webDriver.findElements(shopButton).get(0).click();

    }

    public void scrollUpClick()
    {
        webDriver.findElements(scrollToUp).get(7).click();
    }

    public void ContactInfoText()
    {
        WebElement contact = webDriver.findElements(contactInfo).get(3);
        String contactInformation = contact.getText();
        //System.out.println(contactInformation);
        //Assertions.assertEquals("CONTACT INFO", contactInformation, "Hata!");
    }

    /*public void ContactInfoControl(int i) {
        webDriver.findElements(contactInfo).get(i).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(contactInfo));
    }
    */

}
