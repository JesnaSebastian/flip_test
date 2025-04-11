package testCases;

import org.testng.annotations.Test;
import pageObjects.mainsearch_poc;
import testbase.baseclass;

public class TC_01_commonsearch extends baseclass {
    @Test
    public void main_search() throws InterruptedException {
        mainsearch_poc mp=new mainsearch_poc(driver);
        mp.enter_search(getsearch_value("searchboxvalue"));
        Thread.sleep(5000);
    }
}
