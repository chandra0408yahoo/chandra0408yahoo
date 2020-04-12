package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class scrollingtobottom {

    private WebDriver driver;


    @Test
    public void SeleniumScrollToBottom() {
        System.out.println("In test 1");
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        // To Accept SSL certificate
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capability);
        driver.get("https://www.marksandspencer.com/");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}