package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class base_objectclass {
    WebDriver driver;
    public base_objectclass(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
