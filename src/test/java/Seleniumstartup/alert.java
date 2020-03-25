package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    private WebDriver driver;


    @Test
    public void SeleniumTabTest() {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.rightmove.co.uk/");
        /*driver.findElement(By.id("buy")).click();
        driver.switchTo().alert().accept();*/

        driver.findElement(By.id("searchLocation")).sendKeys(Keys.TAB);
    }
}