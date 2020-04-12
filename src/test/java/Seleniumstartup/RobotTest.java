package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class RobotTest {
    private WebDriver driver;

    @Test
    public void SeleniumRobot() throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.rightmove.co.uk/");


        Robot r = new Robot();


// r.keyPress(KeyEvent.VK_TAB);
// LEFT CLICK
//driver.findElement(By.linkText("Learn more")).click();
// Thread.sleep(2000);


r.mouseMove(772,411);
            Thread.sleep(4000);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
            Thread.sleep(2000);
           // driver.findElement(By.linkText("2-Step Verification")).click();
            driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("hello");

        Color k=r.getPixelColor(770, 337);
System.out.println(k);

System.out.println(r.getPixelColor(770,337));
         // RIGHT CLICK
           r.mousePress(InputEvent.BUTTON3_MASK);
            r.mouseRelease(InputEvent.BUTTON3_MASK);
            Thread.sleep(2000);

            // MIDDLE WHEEL CLICK
            r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            // SCROLL THE MOUSE WHEEL
            r.mouseWheel(100);
            Thread.sleep(2000);

            //scrollup
            r.mousePress(InputEvent.BUTTON3_MASK);
            r.mouseRelease(InputEvent.BUTTON3_MASK);
            r.mouseWheel(-50);
    }
}


