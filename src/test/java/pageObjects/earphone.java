package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class earphone extends base_objectclass{
    public earphone(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[normalize-space()='Grab Now']")
    WebElement earphonelink;

    public void click_earphonelink()
    {
        earphonelink.click();
    }
}
