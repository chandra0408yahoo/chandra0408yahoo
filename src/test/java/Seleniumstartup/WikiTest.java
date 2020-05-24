package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class WikiTest {
    private WebDriver driver;

    @Test
    public void WikiTest() throws Exception {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://www.wikipedia.org/");
        driver.manage().window().maximize();

        driver.findElement(By.id("searchInput")).sendKeys("fish");
        driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
        String headertext = driver.findElement(By.id("firstHeading")).getText();
        assertThat(headertext, equalToIgnoringCase("fish"));



    /*   List<WebElement> li= driver.findElements(By.cssSelector("li[class^='interlanguage-link interwiki-']"));

       for(int i=0;i<li.size();i++){
           System.out.println(li.get(i).getText());
           if(li.get(i).getText().contains("Italiano")){
               li.get(i).click();
           }*/

        Thread.sleep(2000);
        List<WebElement> li= driver.findElements(By.cssSelector("li[class^='interlanguage-link'] a[class='interlanguage-link-target']"));

      //  WebElement k = driver.findElement(By.cssSelector("li[class^='interlanguage-link'] a[class='interlanguage-link-target']"));
//k.click();
        //safeJavaScriptClick(k);
        //  System.out.println(driver.findElement(By.cssSelector("li[class^='interlanguage-link interwiki-']")).getText());
         li.stream().filter(x->x.getText().contains("Italiano")).forEach(x->x.click());

          Thread.sleep(2000);

        // List<WebElement> li= driver.findElements(By.xpath("//div[@id='p-lang']//ul"));


 /*      System.out.println(li.size());
     Boolean xq=li.stream().anyMatch(x->x.getText().contains("Italiano"));
        System.out.println(xq);*/


        driver.quit();
    }
/*new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("checkoutLink")));
driver.findElement(By.id("checkoutLink")).click();*/

    public void safeJavaScriptClick(WebElement element) throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor)driver;

        executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        executor.executeScript("arguments[0].click();", element);
    }
}