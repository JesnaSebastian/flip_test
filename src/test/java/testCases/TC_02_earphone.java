package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.earphone;
import testbase.baseclass;

public class TC_02_earphone extends baseclass {
    @Test
    public void click_earphonelink(){
        earphone ep=new earphone(driver);
        ep.click_earphonelink();
        String tile=driver.getTitle();
        Assert.assertEquals(tile,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Incorrect page");

    }
}
