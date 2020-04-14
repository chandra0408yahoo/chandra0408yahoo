package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class alert {
    private WebDriver driver;
    private EventFiringWebDriver e_driver;
    private  WebEventListener eventListener;

    @Test
    public void SeleniumAlert() throws InterruptedException {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        e_driver = new EventFiringWebDriver(driver);

        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();

        e_driver.register(eventListener);
        e_driver.get("https://www.rightmove.co.uk/");

        e_driver.findElement(By.id("buy")).click();
        Thread.sleep(2000);
        e_driver.switchTo().alert().accept();

      //  driver.findElement(By.id("searchLocation")).sendKeys(Keys.TAB);
    }
}