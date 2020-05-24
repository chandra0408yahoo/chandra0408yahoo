package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class relativeLocators {
    private WebDriver driver;


    @Test
    public void Seleniumtest1() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



     /* String str=  driver.findElement(withTagName("li")
                .toLeftOf(By.id("pid6"))
                .below(By.id("pid1"))).getText();*/


        String str=  driver.findElement(withTagName("li")
                .toRightOf(By.id("pid1"))
                .above(By.id("pid6"))).getText();

        System.out.println(str);


/*
driver.get("https://www.swtestacademy.com");
        WebElement rightOfFirstArticle = driver.findElement(withTagName("article").toRightOf(By.xpath("(//article)[1]")));

        System.out.println("Right Of First Article Name: " + rightOfFirstArticle.findElement(By.cssSelector(".entry-title")).getText());
     //   highlightElement(rightOfFirstArticle);*/

    }


}