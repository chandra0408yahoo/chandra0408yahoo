package Seleniumstartup;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class remoteGridTest {



    public WebDriver driver;
    public static String appURL = "http://www.google.com";




    @Test
    public void testGooglePageTitleInIEBrowser() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");
        //cap.setPlatform(Platform.MAC);
        cap.setPlatform(Platform.LINUX);

        System.setProperty("webdriver.chrome.driver","/Users/chandrapuli/seleniumgrid/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.merge(cap);


        driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), options);
        driver.manage().window().maximize();
        System.out.println("*** Navigation to Application ***");
        driver.navigate().to(appURL);
        String strPageTitle = driver.getTitle();
        System.out.println(strPageTitle);


    }}

  //  start hub

       /* java -jar /Users/chandrapuli/seleniumgrid/selenium-server-standalone-3.141.59.jar -role hub



// start node


  java -Dwebdriver.chrome.driver="/Users/chandrapuli/seleniumgrid/chromedriver" -jar /Users/chandrapuli/seleniumgrid/selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.115:4444/grid/register -port 5556
    }*/


/*// docker start selenium grid

    docker run -d -p 4446:4444 --name selenium-hub -P selenium/hub

        // docker start node

        docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug*/

