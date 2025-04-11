package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.scroll;

import java.time.Duration;

public class mobile_poc extends base_objectclass {
    public mobile_poc(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'Mobiles')]")
    WebElement mobile;
    @FindBy(xpath = "//a[normalize-space()='Apple iPhone 16e (White, 256 GB)']")WebElement checkbox_apple;
    @FindBy(xpath = "//a[normalize-space()='Motorola G85 5G (Cobalt Blue, 128 GB)']")WebElement motorola;



    public void click_mobilelink()
    {
        mobile.click();
    }
    public void select_apple() throws InterruptedException {
        scroll.scrolltoelement(driver,checkbox_apple);
        Thread.sleep(5000);
        motorola.click();
    }

}
