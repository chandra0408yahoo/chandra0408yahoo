package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHoverover {

    private WebDriver driver;


    @Test
    public void Seleniumtest1() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.marksandspencer.com/");

        WebElement main= driver.findElement(By.id("SC_Level_1_586_menu"));

        WebElement subelement= driver.findElement(By.xpath("//div[@id='SC_Level_1_586']//a[contains(text(),'New in')]"));

        Actions action= new Actions(driver);
        action.moveToElement(main).moveToElement(subelement).click().build().perform();


    }
}