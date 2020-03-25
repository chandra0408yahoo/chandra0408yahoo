package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;

public class Selectt {


    private WebDriver driver;


    @Test
    public void Seleniumtest1() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.jobserve.com/gb/en/Job-Search/FindYourNextJob.aspx");

        WebElement ele=driver.findElement(By.id("selAge"));

        Select s= new Select(ele);
        s.selectByIndex(1);


    }
}
