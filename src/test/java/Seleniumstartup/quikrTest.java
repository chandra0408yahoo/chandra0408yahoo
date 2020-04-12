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
        WebElement bigbox= driver.findElement(By.xpath("html/body/div[5]/div[3]/footer/div[3]/div"));
        List<WebElement> smallbox=bigbox.findElements(By.tagName("ul"));
        WebElement firstsb=smallbox.get(0);
        List<WebElement> fbe=firstsb.findElements(By.tagName("a"));
        System.out.println(fbe.get(0).getText());

        fbe.stream().filter(x->x.isDisplayed()).count();

        fbe.stream().filter(x->x.getText().equals("Where is my order?")).forEach(element ->element.click());;

        /*list.stream().filter(element -> element.getAttribute("value").matches("Female"))
                .forEach(element ->element.click());*/


/*    WebElement k=driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]"));

   List<WebElement>alldata=k.findElements(By.tagName("ul"));
                                                  ///html/body/footer/div[2]/div[1]/ul/li[1]
                                                    //  /html/body/footer/div[2]/div[1]/ul/li[1]/ul/li[1]/a


   System.out.println(alldata.size());
   WebElement data1=alldata.get(1);



List<WebElement>data1_elements=data1.findElements(By.tagName("li"));
System.out.println(data1_elements.size());
//System.out.println(data1_elements.get(2).getText());

for(int i=0;i<data1_elements.size();i++){
System.out.println(data1_elements.get(i).getText());
}
*/



    }
}