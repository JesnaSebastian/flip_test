package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainsearch_poc extends base_objectclass {
    public mainsearch_poc(WebDriver driver)
    {
        super(driver);
    }
@FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
    WebElement searchbox;

    public void enter_search(String value){
        searchbox.sendKeys(value);
    }
}
