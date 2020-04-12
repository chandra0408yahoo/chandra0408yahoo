package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowsTest {
    private WebDriver driver;

    @Test
    public void SeleniumWindow() throws InterruptedException {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> it=s1.iterator();
        String firstpage=it.next();
        String secondpage=it.next();
        driver.switchTo().window(secondpage);
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/nav/section[1]/div/div/div[1]/a")).click();


    }
}