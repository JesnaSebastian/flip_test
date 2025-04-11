package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scroll {
      public static void scrolltoelement(WebDriver driver, WebElement element)
      {
          JavascriptExecutor js=(JavascriptExecutor) driver;
          js.executeScript("arguments[0].scrollIntoView(true);", element);
      }
}
