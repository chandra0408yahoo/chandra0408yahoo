package Seleniumstartup;

import jxl.read.biff.BiffException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class A1PracticeSel001 {

    private WebDriver driver;

    @Test
    public void SeleniumSelect() throws InterruptedException, IOException, BiffException, AWTException {

        File file=new File("C:\\Users\\Chandra\\Downloads");
        File[] files =file.listFiles();


    }
}
