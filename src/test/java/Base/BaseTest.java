package Base;

import Constants.Constants;
import com.thoughtworks.gauge.AfterScenario;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Constants.Constants.*;

/**
 * @author  Mustafa Burak Nayman
 * @version 1.0
 * @since   2021-07-25
*/

public class BaseTest {

    protected static WebDriver driver;

    @BeforeScenario
    public void setUp() {

        System.out.println("***********************************************");
        System.out.println("****************Test Basliyor******************");
        System.out.println("***********************************************");

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static WebDriver getWebDriver() { //

        return driver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.driver = webDriver;
    }

    @AfterScenario
    public void tearDown() {
        getWebDriver().quit();

    }
}

