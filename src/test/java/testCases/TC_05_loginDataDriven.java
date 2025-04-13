package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.datadrivenpoc;
import testbase.baseclassDatadriven;
import utilities.DataProviders;

public class TC_05_loginDataDriven extends baseclassDatadriven {
    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void loginddt(String email, String pwd, String exp) {
       try {
           datadrivenpoc ddt = new datadrivenpoc(driver);
           ddt.click_myaccount();
           ddt.click_login();
           ddt.enter_email(email);
           ddt.enter_pwd(pwd);
           ddt.click_loginbutton();
           boolean targetpage = ddt.valaidate_page();
           if (exp.equalsIgnoreCase("valid")) {
               if (targetpage == true) {
                   Assert.assertTrue(true);
                   ddt.click_logout();
               } else {

                   Assert.assertTrue(false);
               }
           }
           if (exp.equalsIgnoreCase("invalid")) {
               if (targetpage == true) {
                   ddt.click_logout();
                   Assert.assertTrue(false);
               } else {
                   Assert.assertTrue(true);
               }
           }
       }catch (Exception e){
           Assert.fail("An exception occurred: " + e.getMessage());
       }
    }
}
