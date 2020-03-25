package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Datepicker {

    private WebDriver driver;


    @Test
    public void SeleniumDatepicker() throws InterruptedException {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
      //click on icon

        driver.findElement(By.cssSelector(".k-icon.k-i-calendar")).click();
        //wait for element to appear
Thread.sleep(2000);

        WebElement dateWidget = driver.findElement(By.cssSelector(".k-content.k-month"));
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

        System.out.println(columns.get(6).getText());

        for (WebElement cell: columns) {
            //Select 13th Date
            if (cell.getText().equals("13")) {
                cell.findElement(By.linkText("13")).click();
                break;
            }

        }
}}