package testbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.getdatafromconfig;

import java.time.Duration;

public class baseclass extends getdatafromconfig {
    public WebDriver driver;
    public Logger logger;
    String browserfortest=get_browser("browser");
    String linkforluanchportal=get_testlink("link");
    @BeforeClass

    public void launch()
    {

        if(browserfortest.equalsIgnoreCase("chrome"))
        {
            logger = LogManager.getLogger(this.getClass());
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(linkforluanchportal);
        } else if (browserfortest.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(linkforluanchportal);
        }else {
            driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(linkforluanchportal);
        }
    }
    @AfterClass
    public void tear_down(){
        driver.quit();
    }
}
