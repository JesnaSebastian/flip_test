package testbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.getdatafromconfig;

import java.time.Duration;

public class baseclass extends getdatafromconfig {
    public WebDriver driver;
    public Logger logger;
    //String browserfortest=get_browser("browser");
    String linkforluanchportal = get_testlink("link");

    @BeforeClass
    @Parameters("browser")
    public void launch(String browser) {
        logger = LogManager.getLogger(this.getClass());
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("invalid browser name");
                return;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(linkforluanchportal);
    }

    @AfterClass
    public void tear_down() {
        driver.quit();
    }
}


//if(browserfortest.equalsIgnoreCase("chrome"))
//{
//   logger = LogManager.getLogger(this.getClass());
//  driver=new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.manage().deleteAllCookies();
//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// driver.get(linkforluanchportal);
// } else if (browserfortest.equalsIgnoreCase("firefox")) {
// driver=new FirefoxDriver();
//  driver.manage().window().maximize();
//   driver.manage().deleteAllCookies();
//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//   driver.get(linkforluanchportal);
// }else {
//  driver=new EdgeDriver();
//  driver.manage().window().maximize();
// driver.manage().deleteAllCookies();
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// driver.get(linkforluanchportal);
// }


