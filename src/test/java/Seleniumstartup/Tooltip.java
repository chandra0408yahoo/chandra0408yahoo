package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
    private WebDriver driver;


    @Test
    public void SeleniumToolTip() {

        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");

        WebElement str=  driver.findElement(By.cssSelector("iframe.demo-frame"));

        driver.switchTo().frame(str);
        WebElement element = driver.findElement(By.id("age"));
        System.out.println(element.getAttribute("title"));

    }
}