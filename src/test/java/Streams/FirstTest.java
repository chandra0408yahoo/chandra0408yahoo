package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstTest {
    public static <Obj> void main(String args[]) throws IOException {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<String> list1 = Arrays.asList("Chandra", "Ammu", "Nammi", "family", "FOr");
        Stream<String> stream = Stream.of("Geeks", "FOr",
                "GEEKSQUIZ", "GeeksforGeeks");


       Boolean value= list.stream().anyMatch(x->x%2==0);
        System.out.println(value);




        //list1.stream().filter(x->!x.contains("Ammu"));


    }

}
