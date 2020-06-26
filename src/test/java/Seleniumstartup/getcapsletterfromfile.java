package Seleniumstartup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getcapsletterfromfile {
    public static void main(String[] args) throws IOException {

        List<String> words = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get("src/test/java/Seleniumstartup/car_input.txt"));

        List<String> words1=new ArrayList<>();
        String joined2 = String.join(",", allLines );
       /* for (String line : allLines) {
            System.out.println(line);
        }
*/

      //  System.out.println(joined2);

     //   String dataStr = "This text was  SG18 HTN just made RANDOMLY BW57BOF to show what I MEANT.";



        Pattern pattern = Pattern.compile(" [A-Z]+[0-9]+[0-9]\\s+[A-Z]+[A-Z]+[A-Z]|[A-Z]+[0-9]+[0-9]+[A-Z]+[A-Z]+[A-Z]");

        Matcher matcher = pattern.matcher(joined2);
        while (matcher.find()) {
            words.add(matcher.group());
        }

        System.out.println(words);


        words.stream()
                .forEach(i -> {
                    if (i.contains(" ")) {
                        words1.add( i.replaceAll(" ",""));
                        System.out.println(i);
                    } else {
                        words1.add(i);
                    }
                });

        System.out.println(words1+"<<<");


     /*  for (int i=0;i<words.size();i++){
            if(words.get(i).contains(" ")){
                System.out.println(words.get(i));
                words1.add( words.get(i).replaceAll(" ",""));
            }else
            {
                words1.add(words.get(i));
            }
        }
        System.out.println(words1+"<<<");*/

    /* List<String>word=   words.stream().filter(x->x.contains(" "))
             .map(x->x.replaceAll("\\s+",""))
             .collect(Collectors.toList());


        System.out.println(word.get(0));*/

       /* try {
            List<String> allLines = Files.readAllLines(Paths.get("src/test/java/Seleniumstartup/car_output.txt"));
            allLines.stream().filter(x->x.)

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
