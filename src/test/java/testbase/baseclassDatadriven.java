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
import utilities.getdatafromconfig;

public class baseclassDatadriven extends getdatafromconfig {
    public WebDriver driver;
    public Logger logger;
    //String browserfortest=get_browser("browser");
    String linkforluanchportal = get_testlink1("link2");

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

