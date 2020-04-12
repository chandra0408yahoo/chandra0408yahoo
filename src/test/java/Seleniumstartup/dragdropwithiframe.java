package Seleniumstartup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragdropwithiframe {
    private WebDriver driver;


    @Test
    public void SeleniumDragDrop() {
        System.out.println("In test 1");
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://jqueryui.com/droppable/");
        //Wait for the frame to be available and switch to it
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

        WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
        WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
        dragAndDrop(Sourcelocator, Destinationlocator);
        String actualText = driver.findElement(By.cssSelector("#droppable>p")).getText();
        Assert.assertEquals(actualText, "Dropped!");




    }

    public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
        try {
            if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
                Actions action = new Actions(driver);
                action.dragAndDrop(sourceElement, destinationElement).build().perform();
            } else {
                System.out.println("Element was not displayed to drag");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
                    + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
        }
    }
}