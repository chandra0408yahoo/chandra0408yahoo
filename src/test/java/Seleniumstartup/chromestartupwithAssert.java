package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromestartupwithAssert {

    private WebDriver driver;




    @Test
    public void Seleniumtest1() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://google.com");
        String expectedPageTitle = "Google";
        Assert.assertEquals(driver.getTitle(),expectedPageTitle);
    }
}