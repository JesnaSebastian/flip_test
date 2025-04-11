package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.mobile_poc;
import testbase.baseclass;

public class TC_03_mobile extends baseclass {
    @Test
    public void selectapple() throws InterruptedException {
        mobile_poc mp = new mobile_poc(driver);
        mp.click_mobilelink();
        Thread.sleep(5000);
        mp.select_apple();
        Thread.sleep(5000);

    }
}
