package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartax {


    private WebDriver driver;


    @Test
    public void Seleniumcartax() throws InterruptedException {

        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://cartaxcheck.co.uk/");
driver.findElement(By.id("vrm-input")).sendKeys("SG18 HTN");
        driver.findElement(By.cssSelector("button.jsx-3653130054.inline.dual")).click();
        Thread.sleep(5000);
      //  WebElement k= driver.findElement(By.xpath("//a[@class='jsx-3366286007 dual']"));

        System.out.println(isElementPresent(By.xpath("//a[@class='jsx-3366286007 dual']")));

        Boolean k= isElementPresent(By.xpath("//a[@class='jsx-3366286007 dual']"));

        if(k){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //  Thread.sleep(2000);
       /* System.out.println( driver.findElement(By.cssSelector("#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(1) > dd")).getText());
        System.out.println(  driver.findElement(By.cssSelector("#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(2) > dd")).getText());
        System.out.println(   driver.findElement(By.cssSelector("#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(3) > dd")).getText());
        System.out.println(   driver.findElement(By.cssSelector("#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(4) > dd")).getText());
        System.out.println(    driver.findElement(By.cssSelector("#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(5) > dd")).getText());


*/

}
    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


}
