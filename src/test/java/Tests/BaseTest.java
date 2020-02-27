package Tests;

import Helpers.Enums.DriverType;
import Helpers.Managers.DriverManager;
import Helpers.Managers.DriverManagerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BaseTest {

    public static final Logger logger = LogManager.getLogger(BaseTest.class.getName());

    protected static WebDriver driver;
    protected static DriverManager driverManager;
    protected static WebDriverWait wait;

    protected static String browser = System.getProperty("browser", "CHROME").toUpperCase();

    public static void createDriver(){
        driverManager = DriverManagerFactory.getManager(DriverType.valueOf(browser));
        driver = driverManager.getDriver();
        wait = new WebDriverWait(driver, 4);
        logger.debug("setup WebDriver");
    }

    public static void closeDriver(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public String currentUrl(){
        return driver.getCurrentUrl();
    }

    public ArrayList<String> getBrowserTabs(){
        return new ArrayList<>(driver.getWindowHandles());
    }

    public void selectBrowserTab(int index){
        driver.switchTo().window(getBrowserTabs().get(index));
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

}
