package testCases;

import org.testng.annotations.Test;
import pageObjects.datadrivenpoc;
import testbase.baseclassDatadriven;

public class TC_04_datadriven extends baseclassDatadriven {
    @Test
    public void datadriventesting() throws InterruptedException {
        datadrivenpoc ddp=new datadrivenpoc(driver);
        ddp.click_myaccount();
        ddp.click_login();
        ddp.enter_email(get_email("email"));
        ddp.enter_pwd(get_pwd("password"));
        ddp.click_loginbutton();
        Thread.sleep(5000);
    }
}
