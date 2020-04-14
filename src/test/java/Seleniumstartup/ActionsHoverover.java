package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ActionsHoverover {

    private WebDriver driver;
    private  EventFiringWebDriver e_driver;
    private  WebEventListener eventListener;

    @Test
    public void Seleniumtest1() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        e_driver = new EventFiringWebDriver(driver);

        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();

        e_driver.register(eventListener);
        e_driver.get("https://www.marksandspencer.com/");



        WebElement main= e_driver.findElement(By.id("SC_Level_1_586_menu"));

        WebElement subelement= e_driver.findElement(By.xpath("//div[@id='SC_Level_1_586']//a[contains(text(),'New in')]"));

        Actions action= new Actions(e_driver);
      //right click   action.contextClick().build().perform();
        //double click action.doubleClick().build().perform();
        action.moveToElement(main).moveToElement(subelement).click().build().perform();


    }
}