package Seleniumstartup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readproperties {

    public static void main(String args[]) throws IOException {
        FileInputStream fis= new FileInputStream("/Users/chandrapuli/IdeaProjects/SamplJavaProject/src/test/java/Seleniumstartup/prop.properties");
        Properties prop = new Properties();

        //load properties file

            prop.load(fis);

        System.out.println(prop.getProperty("email"));



    }}
