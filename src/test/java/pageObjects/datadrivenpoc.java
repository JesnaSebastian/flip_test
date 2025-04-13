package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class datadrivenpoc extends base_objectclass {
    public datadrivenpoc(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myaccount;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement login;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement pwd;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginbutton;
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement pagename;

    public void click_myaccount() {
        myaccount.click();
    }

    public void click_login() {
        login.click();
    }

    public void enter_email(String email1) {
        email.sendKeys(email1);
    }

    public void enter_pwd(String pwd1) {
        pwd.sendKeys(pwd1);
    }

    public void click_loginbutton() {
        loginbutton.click();
    }

    public void valaidate_page() {
        try {
            boolean targetpage = pagename.isDisplayed();
            Assert.assertTrue(targetpage);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}

