package Seleniumstartup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class readlinebyline {
    public static void main(String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/test/java/Seleniumstartup/"));
           /* for (String line : allLines) {
                System.out.println(line);
            }*/


            List<String> longnames = allLines.stream().skip(1).filter(x->x.contains("SG18HTN")).collect(Collectors.toList());

            List<String> x1  = Arrays.stream(longnames.get(0).split( "," )).collect(Collectors.toList());
            System.out.println(x1);

           /* System.out.println(longnames.get(0));
       String  []x1=    longnames.get(0).split(",");
            System.out.println(x1[0]);*/

          /*  allLines.stream().skip(1)
                    .forEach(System.out::println);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







/*
jsx-648862867

        jsx-648862867 */
