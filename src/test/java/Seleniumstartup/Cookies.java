package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

    private WebDriver driver;

    @Test
    public void SeleniumCookies() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String URL = "http://www.flipcart.com";
        driver.navigate().to(URL);
        driver.manage().deleteAllCookies();

    }
}