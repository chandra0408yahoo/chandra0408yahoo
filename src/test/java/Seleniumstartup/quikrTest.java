package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class quikrTest {


    private WebDriver driver;


    @Test
    public void SeleniumQuikr() {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("http://www.marksandspencer.com/");
        WebElement bigbox= driver.findElement(By.xpath("//div[@class='wide eighty']"));
        List<WebElement> smallbox=bigbox.findElements(By.tagName("ul"));
        System.out.println(smallbox.size());
        WebElement firstsb=smallbox.get(0);
        List<WebElement> fbe=firstsb.findElements(By.tagName("a"));
        System.out.println(fbe.get(0).getText());
        System.out.println(fbe.size());

        List<WebElement> smallbox1=driver.findElements(By.xpath("//div[@class='wide eighty']//li[1]//ul[1]//li"));
        System.out.println(smallbox1.size());
       // smallbox1.stream().filter(x->x.getText().equals("Delivery & collection")).forEach(element ->element.click());



        for(int i=0;i<smallbox1.size();i++){
            System.out.println(smallbox1.get(i).getText());
            if(smallbox1.get(i).getText().contains("Delivery & collection")){
                smallbox1.get(i).click();

            }

        }


     //   fbe.stream().filter(x->x.getText().);







/*
List<WebElement>data1_elements=data1.findElements(By.tagName("li"));
System.out.println(data1_elements.size());
//System.out.println(data1_elements.get(2).getText());

for(int i=0;i<data1_elements.size();i++){
System.out.println(data1_elements.get(i).getText());
}*/




    }
}