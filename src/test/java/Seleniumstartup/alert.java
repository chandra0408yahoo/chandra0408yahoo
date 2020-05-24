package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement highElement=e_driver.findElement(By.id("buy"));
        highLightElement(e_driver,highElement);

        Thread.sleep(2000);
        highElement.click();
        e_driver.switchTo().alert().accept();

        WebElement K= e_driver.findElement(By.id("searchLocation"));
        highLightElement(e_driver,K);

                K.sendKeys("waterloooooo");
    }

    public static void highLightElement(WebDriver driver, WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }

        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

    }


}